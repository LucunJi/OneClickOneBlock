package io.github.lucunji.oneclickoneblock;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModContainer;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.config.ModConfig.Type;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Constants.MOD_ID)
public class OneClickOneBlock {

    public OneClickOneBlock() {
        CommonClass.init();
        ModLoadingContext.get().registerConfig(Type.COMMON, Configs.CONFIG_SPEC);
    }
}
