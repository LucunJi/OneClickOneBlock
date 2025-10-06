package io.github.lucunji.oneclickoneblock;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Constants {

    public static final String MOD_ID = "oneclickoneblock";
    public static final String MOD_NAME = "OneClickOneBlock";
    public static final Logger LOG = LoggerFactory.getLogger(MOD_NAME);

    public static class KeyMappings {
        public static final String CATEGORY = "key.categories." + MOD_ID;
        public static final String DISABLE_DELAY = "key." + MOD_ID + ".disable_delay";
    }

    public static class Configs {
        public static final int DELAY_TICKS_DEFAULT = 4;
        public static final int DELAY_TICKS_MIN = 0;
        public static final int DELAY_TICKS_MAX = 20;
    }
}
