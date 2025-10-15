package io.github.lucunji.oneclickoneblock;

import net.neoforged.neoforge.common.ModConfigSpec;
import org.apache.commons.lang3.tuple.Pair;

import static net.neoforged.neoforge.common.ModConfigSpec.ConfigValue;

public class Configs {
    public static final Configs INSTANCE;
    public static final ModConfigSpec CONFIG_SPEC;

    static {
        Pair<Configs, ModConfigSpec> pair = new ModConfigSpec.Builder().configure(Configs::new);
        INSTANCE = pair.getLeft();
        CONFIG_SPEC = pair.getRight();
    }

    public final ConfigValue<Integer> delayTicks;
    public final ConfigValue<Boolean> firstTimeTrigger;
    public final ConfigValue<Boolean> notifyOnDisablingDelay;

    private Configs(ModConfigSpec.Builder builder) {
        // Inclusive at both ends, but actually comparing doubles, not int
        delayTicks = builder.defineInRange(
                "delay_ticks",
                Constants.Configs.DELAY_TICKS_DEFAULT,
                Constants.Configs.DELAY_TICKS_MIN,
                Constants.Configs.DELAY_TICKS_MAX);
        firstTimeTrigger = builder.define("first_time_trigger", true);
        notifyOnDisablingDelay = builder.define("notify_on_disabling_delay", true);
    }
}
