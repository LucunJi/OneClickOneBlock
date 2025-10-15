package io.github.lucunji.oneclickoneblock;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;
import net.neoforged.neoforge.client.gui.ConfigurationScreen;

@Mod(Constants.MOD_ID)
public class OneClickOneBlock {

    public OneClickOneBlock(IEventBus eventBus, ModContainer container) {
        // Use NeoForge to bootstrap the Common mod.
        CommonClass.init();
        container.registerConfig(ModConfig.Type.CLIENT, Configs.CONFIG_SPEC);
        container.registerExtensionPoint(
            IConfigScreenFactory.class,
            (container_, screen) -> new ConfigurationScreen(
                container_,
                screen,
                (context, key, element) -> key.equals(
                    "first_time_trigger") ? null : element
            )
        );
    }
}
