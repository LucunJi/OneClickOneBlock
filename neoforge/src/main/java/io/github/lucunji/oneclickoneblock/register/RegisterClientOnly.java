package io.github.lucunji.oneclickoneblock.register;

import io.github.lucunji.oneclickoneblock.Constants;

import com.mojang.blaze3d.platform.InputConstants;

import net.minecraft.client.KeyMapping;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RegisterKeyMappingsEvent;
import net.neoforged.neoforge.client.settings.KeyConflictContext;
import net.neoforged.neoforge.common.util.Lazy;

@EventBusSubscriber(value = Dist.CLIENT)
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
