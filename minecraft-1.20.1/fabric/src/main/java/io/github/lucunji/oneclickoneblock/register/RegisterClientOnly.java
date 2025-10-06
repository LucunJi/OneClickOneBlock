package io.github.lucunji.oneclickoneblock.register;

import io.github.lucunji.oneclickoneblock.Constants;
import io.github.lucunji.oneclickoneblock.Configs;

import com.mojang.blaze3d.platform.InputConstants;

import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.KeyMapping;

public class RegisterClientOnly {

    public static final KeyMapping DISABLE_DELAY = KeyBindingHelper.registerKeyBinding(new KeyMapping(
            Constants.KeyMappings.DISABLE_DELAY,
            InputConstants.Type.KEYSYM,
            InputConstants.UNKNOWN.getValue(),
            Constants.KeyMappings.CATEGORY));

    public static void registerAll() {
        Configs.registerConfigs();
    }
}
