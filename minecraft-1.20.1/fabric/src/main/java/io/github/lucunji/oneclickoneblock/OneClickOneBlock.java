package io.github.lucunji.oneclickoneblock;

import io.github.lucunji.oneclickoneblock.register.RegisterClientOnly;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;

public class OneClickOneBlock implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        CommonClass.init();
        RegisterClientOnly.registerAll();
    }
}
