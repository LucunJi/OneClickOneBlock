package io.github.lucunji.oneclickoneblock.platform;

import io.github.lucunji.oneclickoneblock.platform.services.IPlatformHelper;
import net.neoforged.neoforge.client.event.ClientTickEvent;
import net.neoforged.neoforge.common.NeoForge;

public class NeoForgePlatformHelper implements IPlatformHelper {
    @Override
    public void registerClientTickEndEvent(Runnable handler) {
        NeoForge.EVENT_BUS.addListener((ClientTickEvent.Post event) -> handler.run());
    }
}