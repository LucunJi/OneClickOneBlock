package io.github.lucunji.oneclickoneblock;

import net.minecraftforge.bus.api.IEventBus;
import net.minecraftforge.fml.ModContainer;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
// import net.minecraftforge.forge.client.gui.IConfigScreenFactory;
// import net.minecraftforge.forge.client.gui.ConfigurationScreen;

@Mod(Constants.MOD_ID)
public class OneClickOneBlock {

    public OneClickOneBlock(IEventBus eventBus, ModContainer container) {
        CommonClass.init();
        container.registerConfig(ModConfig.Type.CLIENT, Configs.CONFIG_SPEC);
        // container.registerExtensionPoint(IConfigScreenFactory.class, ConfigurationScreen::new);
    }
}
