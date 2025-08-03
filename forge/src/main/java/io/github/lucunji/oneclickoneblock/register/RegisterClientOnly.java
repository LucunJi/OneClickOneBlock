package io.github.lucunji.oneclickoneblock.register;

import io.github.lucunji.oneclickoneblock.Constants;

import com.mojang.blaze3d.platform.InputConstants;

import net.minecraft.client.KeyMapping;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.client.settings.KeyConflictContext;
import net.minecraftforge.common.util.Lazy;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber(value = Dist.CLIENT, bus = EventBusSubscriber.Bus.MOD)
public class RegisterClientOnly {

    public static final Lazy<KeyMapping> DISABLE_DELAY = Lazy.of(() -> new KeyMapping(
            Constants.KeyMappings.DISABLE_DELAY,
            KeyConflictContext.IN_GAME,
            InputConstants.Type.KEYSYM,
            InputConstants.UNKNOWN.getValue(),
            Constants.KeyMappings.CATEGORY));

    @SubscribeEvent
    public static void registerBindings(RegisterKeyMappingsEvent event) {
        event.register(DISABLE_DELAY.get());
    }
}
