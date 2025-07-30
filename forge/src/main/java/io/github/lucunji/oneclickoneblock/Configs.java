package io.github.lucunji.oneclickoneblock;

import io.github.lucunji.oneclickoneblock.Constants;

import net.minecraftforge.forge.common.ForgeConfigSpec;
import org.apache.commons.lang3.tuple.Pair;

import static net.minecraftforge.forge.common.ForgeConfigSpec.ConfigValue;

public class Configs {
    public static final Configs INSTANCE;
    public static final ForgeConfigSpec CONFIG_SPEC;

    static {
        Pair<Configs, ForgeConfigSpec> pair = new ForgeConfigSpec.Builder().configure(Configs::new);
        INSTANCE = pair.getLeft();
        CONFIG_SPEC = pair.getRight();
    }

    public final ConfigValue<Integer> delayTicks;

    private Configs(ForgeConfigSpec.Builder builder) {
        // Inclusive at both ends, but actually comparing doubles, not int
        delayTicks = builder.defineInRange(
                "delay_ticks",
                Constants.Configs.DELAY_TICKS_DEFAULT,
                Constants.Configs.DELAY_TICKS_MIN,
                Constants.Configs.DELAY_TICKS_MAX);
    }
}
