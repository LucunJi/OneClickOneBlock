package io.github.lucunji.oneclickoneblock.platform;

import io.github.lucunji.oneclickoneblock.Constants;
import io.github.lucunji.oneclickoneblock.platform.services.*;

import java.util.ServiceLoader;

public class Services {

    public static final IPlatformHelper PLATFORM = load(IPlatformHelper.class);
    public static final IConfigProvider CONFIGS = load(IConfigProvider.class);
    public static final IClientInputProvider INPUTS = load(IClientInputProvider.class);

    public static <T> T load(Class<T> clazz) {
        final T loadedService = ServiceLoader
                .load(clazz)
                .findFirst()
                .orElseThrow(() -> new NullPointerException(
                        "Failed to load service for " + clazz.getName()));
        return loadedService;
    }
}
