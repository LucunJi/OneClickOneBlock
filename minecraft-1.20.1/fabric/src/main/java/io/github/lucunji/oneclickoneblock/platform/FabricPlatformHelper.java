package io.github.lucunji.oneclickoneblock.platform;

import io.github.lucunji.oneclickoneblock.platform.services.IPlatformHelper;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;

public class FabricPlatformHelper implements IPlatformHelper {
    @Override
    public void registerClientTickEndEvent(Runnable handler) {
        ClientTickEvents.END_CLIENT_TICK.register(client -> handler.run());
    }
}
