package com.luan.gravity.module;

import com.google.inject.AbstractModule;
import com.luan.gravity.GravityPlugin;

public class GravityGuiceModule extends AbstractModule {

    private final GravityPlugin gravityPlugin;

    public GravityGuiceModule(GravityPlugin gravityPlugin) {
        this.gravityPlugin = gravityPlugin;
    }

    @Override
    protected void configure() {
        bind(GravityPlugin.class).toInstance(gravityPlugin);
    }
}