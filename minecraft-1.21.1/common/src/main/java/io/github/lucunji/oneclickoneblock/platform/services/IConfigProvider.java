package io.github.lucunji.oneclickoneblock.platform.services;

public interface IConfigProvider {
    int getDelayTicks();

    boolean isFirstTimeTrigger();
    void setFirstTimeTrigger(boolean newVal);

    boolean shouldNotifyOnDisablingDelay();
}
