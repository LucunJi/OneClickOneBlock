package io.github.lucunji.oneclickoneblock.platform;

import io.github.lucunji.oneclickoneblock.platform.services.IClientInputProvider;
import io.github.lucunji.oneclickoneblock.register.RegisterClientOnly;

public class NeoForgeClientInputProvider implements IClientInputProvider {

    @Override
    public boolean isDisableDelayPressed() {
        return RegisterClientOnly.DISABLE_DELAY.get().isDown();
    }

}
