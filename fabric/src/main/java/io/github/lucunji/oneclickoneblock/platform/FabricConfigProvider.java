package io.github.lucunji.oneclickoneblock.platform;

import io.github.lucunji.oneclickoneblock.Configs;
import io.github.lucunji.oneclickoneblock.platform.services.IConfigProvider;

public class FabricConfigProvider implements IConfigProvider {
    @Override
    public int getDelayTicks() {
        return Configs.getConfigs().delayTicks;
    }
}
