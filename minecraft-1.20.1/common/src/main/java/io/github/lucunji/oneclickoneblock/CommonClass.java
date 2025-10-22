package io.github.lucunji.oneclickoneblock;

import io.github.lucunji.oneclickoneblock.mixin.MultiPlayerGameModeAccessor;
import io.github.lucunji.oneclickoneblock.platform.Services;
import net.minecraft.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;

public class CommonClass {

    public static boolean disableKeyStatePrev = false;

    public static void init() {
        disableKeyStatePrev = Services.INPUTS.isDisableDelayPressed();
        Services.PLATFORM.registerClientTickEndEvent(CommonClass::postClientTick);

        Constants.LOG.info("CommonClass initialized");
    }

    public static void postClientTick() {
        var disableKeyStateCurr = Services.INPUTS.isDisableDelayPressed();

        if (disableKeyStateCurr != disableKeyStatePrev) {
            if (Services.CONFIGS.shouldNotifyOnDisablingDelay()) {
                var mc = Minecraft.getInstance();
                if (mc.player != null) {
                    mc.player.displayClientMessage(
                        disableKeyStateCurr
                            ? Component.translatable(
                            "oneclickoneblock.message.delay_disabled")
                            : Component.translatable(
                                "oneclickoneblock.message.delay_enabled"),
                        true
                    );
                }
            }

            disableKeyStatePrev = disableKeyStateCurr;
        }
    }

    public static void handleBeforeStartAttackReturn(boolean returnVal) {
        if (returnVal) {
            if (!Services.INPUTS.isDisableDelayPressed()) {
                var mc = Minecraft.getInstance();

                if (Services.CONFIGS.isFirstTimeTrigger()) {
                    if (mc.player != null) {
                        mc.player.sendSystemMessage(Component.translatable(
                                "oneclickoneblock.message.first_time_trigger")
                            .withStyle(ChatFormatting.YELLOW));

                        Services.CONFIGS.setFirstTimeTrigger(false);
                    }
                }

                var gm = (MultiPlayerGameModeAccessor) mc.gameMode;
                if (gm != null) {
                    gm.setDestroyDelay(Services.CONFIGS.getDelayTicks());
                } else {
                    Constants.LOG.error("Minecraft.getInstance().gameMode should not be null!");
                }
            }
        }
    }

}
