package io.github.lucunji.oneclickoneblock.platform;

import io.github.lucunji.oneclickoneblock.platform.services.IPlatformHelper;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;

public class ForgePlatformHelper implements IPlatformHelper {
    @Override
    public void registerClientTickEndEvent(Runnable handler) {
        MinecraftForge.EVENT_BUS.addListener((TickEvent.ClientTickEvent event) -> {
            if (event.phase == TickEvent.Phase.END) {
                handler.run();
            }
        });
    }
}
