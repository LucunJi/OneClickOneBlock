package io.github.lucunji.oneclickoneblock;

import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig.Type;

@Mod(Constants.MOD_ID)
public class OneClickOneBlock {

    public OneClickOneBlock() {
        CommonClass.init();
        //noinspection removal
        ModLoadingContext.get().registerConfig(Type.COMMON, Configs.CONFIG_SPEC);
    }
}
