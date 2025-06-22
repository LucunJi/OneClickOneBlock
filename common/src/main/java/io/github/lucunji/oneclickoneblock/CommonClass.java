package io.github.lucunji.oneclickoneblock;

import io.github.lucunji.oneclickoneblock.mixin.MultiPlayerGameModeAccessor;
import io.github.lucunji.oneclickoneblock.platform.Services;
import net.minecraft.client.Minecraft;

public class CommonClass {

    public static void init() {}

    public static void handleBeforeStartAttackReturn(boolean returnVal) {
        if (returnVal) {
            if (!Services.INPUTS.isDisableDelayPressed()) {
                var mc = Minecraft.getInstance();
                var gm = (MultiPlayerGameModeAccessor) mc.gameMode;
                gm.setDestroyDelay(Services.CONFIGS.getDelayTicks());
            }
        }
    }
}
