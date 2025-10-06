package io.github.lucunji.oneclickoneblock;

import io.github.lucunji.oneclickoneblock.Constants;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.serializer.Toml4jConfigSerializer;
import net.minecraft.client.gui.screens.Screen;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;

@Config(name = Constants.MOD_ID)
public class Configs implements ConfigData {

    @ConfigEntry.BoundedDiscrete(min = Constants.Configs.DELAY_TICKS_MIN, max = Constants.Configs.DELAY_TICKS_MAX)
    public int delayTicks = Constants.Configs.DELAY_TICKS_DEFAULT;

    public static void registerConfigs() {
        AutoConfig.register(Configs.class, Toml4jConfigSerializer::new);
    }

    public static Configs getConfigs() {
        return AutoConfig.getConfigHolder(Configs.class).getConfig();
    }

    public static Screen getConfigScreen(Screen parent) {
        return AutoConfig.getConfigScreen(Configs.class, parent).get();
    }

    @Override
    public void validatePostLoad() throws ConfigData.ValidationException {
        if (this.delayTicks < Constants.Configs.DELAY_TICKS_MIN
                || this.delayTicks > Constants.Configs.DELAY_TICKS_MAX) {
            Constants.LOG.warn(
                    "Config value '{}' of '{}' is invalid, reset to default.",
                    this.delayTicks, "delayTicks");
        }
    }
}
