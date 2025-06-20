package io.github.lucunji.oneclickoneblock;

import net.neoforged.neoforge.common.ModConfigSpec;
import org.apache.commons.lang3.tuple.Pair;

import static net.neoforged.neoforge.common.ModConfigSpec.ConfigValue;

public class NFConfigs {
    public static final NFConfigs INSTANCE;
    public static final ModConfigSpec CONFIG_SPEC;

    static {
        Pair<NFConfigs, ModConfigSpec> pair = 
            new ModConfigSpec.Builder().configure(NFConfigs::new);
        INSTANCE = pair.getLeft();
        CONFIG_SPEC = pair.getRight();
    }

    public final ConfigValue<Integer> delayTicks;

    private NFConfigs(ModConfigSpec.Builder builder) {
        // Inclusive at both ends, but actually comparing doubles, not int
        delayTicks = builder.defineInRange("delay_ticks", 4, 0, 20);
    }
}
