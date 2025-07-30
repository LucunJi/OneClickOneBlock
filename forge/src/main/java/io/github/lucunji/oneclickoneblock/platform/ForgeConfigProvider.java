package io.github.lucunji.oneclickoneblock.platform;

import io.github.lucunji.oneclickoneblock.Configs;
import io.github.lucunji.oneclickoneblock.platform.services.IConfigProvider;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.loading.FMLLoader;

public class ForgeConfigProvider implements IConfigProvider {
    @Override
    public int getDelayTicks() {
        return Configs.INSTANCE.delayTicks.get();
    }
}
