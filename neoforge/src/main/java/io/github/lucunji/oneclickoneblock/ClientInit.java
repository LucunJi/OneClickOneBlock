package io.github.lucunji.oneclickoneblock;

import org.lwjgl.glfw.GLFW;

import com.mojang.blaze3d.platform.InputConstants;

import net.minecraft.client.KeyMapping;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RegisterKeyMappingsEvent;
import net.neoforged.neoforge.client.settings.KeyConflictContext;
import net.neoforged.neoforge.common.util.Lazy;

@EventBusSubscriber(value=Dist.CLIENT, bus=EventBusSubscriber.Bus.MOD)
public class ClientInit {

    public static final Lazy<KeyMapping> DISABLE_DELAY = Lazy.of(() -> new KeyMapping(
                "key." + Constants.MOD_ID + ".disable_delay",
                KeyConflictContext.IN_GAME,
                InputConstants.Type.KEYSYM,
                InputConstants.UNKNOWN.getValue(),
                "key.categories." + Constants.MOD_ID
    ));

    @SubscribeEvent
    public static void registerBindings(RegisterKeyMappingsEvent event) {
        event.register(DISABLE_DELAY.get());
    }
}
