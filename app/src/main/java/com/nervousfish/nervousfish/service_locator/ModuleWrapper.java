package com.nervousfish.nervousfish.service_locator;

import com.nervousfish.nervousfish.modules.IModule;
import com.nervousfish.nervousfish.modules.constants.IConstants;

/**
 * Wraps a module and provides a package-private method to retrieve it so that only the service_locator classes can access the module.
 */

public final class ModuleWrapper<T extends IModule> {
    private final T module;

    public ModuleWrapper(final T module) {
        this.module = module;
    }

    T get() {
        return this.module;
    }

}
