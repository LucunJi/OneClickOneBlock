package io.github.lucunji.oneclickoneblock.platform;

import io.github.lucunji.oneclickoneblock.Configs;
import io.github.lucunji.oneclickoneblock.platform.services.IConfigProvider;

public class FabricConfigProvider implements IConfigProvider {
    @Override
    public int getDelayTicks() {
        return Configs.getConfigs().delayTicks;
    }

    @Override
    public boolean isFirstTimeTrigger() {
        return Configs.getConfigs().firstTimeTrigger;
    }

    @Override
    public void setFirstTimeTrigger(boolean newVal) {
        Configs.getConfigs().firstTimeTrigger = newVal;
        Configs.getConfigs().save();
    }

    @Override
    public boolean shouldNotifyOnDisablingDelay() {
        return Configs.getConfigs().notifyOnDisablingDelay;
    }
}
