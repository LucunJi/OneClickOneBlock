package io.github.lucunji.oneclickoneblock.mixin;

import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import io.github.lucunji.oneclickoneblock.NFConfigs;

@Mixin(Minecraft.class)
public class MixinMinecraft {
    @Inject(method = "startAttack", at = @At("RETURN"))
    private void beforeStartAttackReturn(CallbackInfoReturnable<Boolean> cir) {
        if (cir.getReturnValueZ()) {
            ((MultiPlayerGameModeAccessor) Minecraft.getInstance().gameMode)
                    .setDestroyDelay(NFConfigs.INSTANCE.delayTicks.get());
        }
    }
}
