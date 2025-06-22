package io.github.lucunji.oneclickoneblock.platform;

import io.github.lucunji.oneclickoneblock.platform.services.IClientInputProvider;
import io.github.lucunji.oneclickoneblock.register.RegisterClientOnly;
import net.neoforged.fml.ModList;
import net.neoforged.fml.loading.FMLLoader;

public class NeoForgeClientInputProvider implements IClientInputProvider {

    @Override
    public boolean isDisableDelayPressed() {
        return RegisterClientOnly.DISABLE_DELAY.get().isDown();
    }

}
