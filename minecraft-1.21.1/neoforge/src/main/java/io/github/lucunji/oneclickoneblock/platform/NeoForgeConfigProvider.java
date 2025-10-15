package io.github.lucunji.oneclickoneblock.platform;

import io.github.lucunji.oneclickoneblock.Configs;
import io.github.lucunji.oneclickoneblock.platform.services.IConfigProvider;

public class NeoForgeConfigProvider implements IConfigProvider {
    @Override
    public int getDelayTicks() {
        return Configs.INSTANCE.delayTicks.get();
    }

    @Override
    public boolean isFirstTimeTrigger() {
        return Configs.INSTANCE.firstTimeTrigger.get();
    }

    @Override
    public void setFirstTimeTrigger(boolean newVal) {
        Configs.INSTANCE.firstTimeTrigger.set(newVal);
        Configs.INSTANCE.firstTimeTrigger.save();
    }

    @Override
    public boolean shouldNotifyOnDisablingDelay() {
        return Configs.INSTANCE.notifyOnDisablingDelay.get();
    }
}
