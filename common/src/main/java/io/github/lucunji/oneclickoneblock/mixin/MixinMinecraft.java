package io.github.lucunji.oneclickoneblock.mixin;

import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import static io.github.lucunji.oneclickoneblock.CommonClass.handleBeforeStartAttackReturn;

@Mixin(Minecraft.class)
public class MixinMinecraft {
    @Inject(method = "startAttack", at = @At("RETURN"))
    private void beforeStartAttackReturn(CallbackInfoReturnable<Boolean> cir) {
        handleBeforeStartAttackReturn(cir.getReturnValueZ());
    }
}
