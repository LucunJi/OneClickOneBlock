package io.github.lucunji.oneclickoneblock.platform;

import io.github.lucunji.oneclickoneblock.Configs;
import io.github.lucunji.oneclickoneblock.platform.services.IConfigProvider;
import net.neoforged.fml.ModList;
import net.neoforged.fml.loading.FMLLoader;

public class NeoForgeConfigProvider implements IConfigProvider {
    @Override
    public int getDelayTicks() {
        return Configs.INSTANCE.delayTicks.get();
    }
}
