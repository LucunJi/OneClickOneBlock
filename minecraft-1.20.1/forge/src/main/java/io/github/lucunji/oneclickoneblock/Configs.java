package io.github.lucunji.oneclickoneblock;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.ConfigValue;

import org.apache.commons.lang3.tuple.Pair;

public class Configs {
    public static final Configs INSTANCE;
    public static final ForgeConfigSpec CONFIG_SPEC;

    static {
        Pair<Configs, ForgeConfigSpec> pair = new ForgeConfigSpec.Builder().configure(Configs::new);
        INSTANCE = pair.getLeft();
        CONFIG_SPEC = pair.getRight();
    }

    public final ConfigValue<Integer> delayTicks;
    public final ConfigValue<Boolean> firstTimeTrigger;
    public final ConfigValue<Boolean> notifyOnDisablingDelay;

    private Configs(ForgeConfigSpec.Builder builder) {
        // Inclusive at both ends, but actually comparing doubles, not int
        delayTicks = builder
                .translation("oneclickoneblock.configuration.delay_ticks")
                .comment("oneclickoneblock.configuration.delay_ticks.tooltip")
                .defineInRange(
                        "delay_ticks",
                        Constants.Configs.DELAY_TICKS_DEFAULT,
                        Constants.Configs.DELAY_TICKS_MIN,
                        Constants.Configs.DELAY_TICKS_MAX);
        firstTimeTrigger = builder
            .translation("oneclickoneblock.configuration.first_time_trigger")
            .comment("oneclickoneblock.configuration.first_time_trigger.tooltip")
            .define("first_time_trigger", true);
        notifyOnDisablingDelay = builder
            .translation("oneclickoneblock.configuration.notify_on_disabling_delay")
            .comment("oneclickoneblock.configuration.notify_on_disabling_delay.tooltip")
            .define("notify_on_disabling_delay", true);
    }
}
