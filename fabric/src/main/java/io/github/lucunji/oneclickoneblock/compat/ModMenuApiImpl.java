package io.github.lucunji.oneclickoneblock.compat;

import io.github.lucunji.oneclickoneblock.Configs;

import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;

public class ModMenuApiImpl implements ModMenuApi {

    @Override
    public ConfigScreenFactory<?> getModConfigScreenFactory() {
        return parent -> Configs.getConfigScreen(parent);
    }
}
