package com.luan.gravity;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.luan.gravity.command.GravityCommand;
import com.luan.gravity.controller.GravityController;
import com.luan.gravity.module.GravityGuiceModule;
import org.bukkit.plugin.java.JavaPlugin;

public final class GravityPlugin extends JavaPlugin {

    private Injector injector;

    @Override
    public void onEnable() {
        // Plugin startup logic

        try {
            injector = Guice.createInjector(new GravityGuiceModule(this));
            injector.injectMembers(this);
            injector.getInstance(GravityController.class).setup();
        } catch (Exception exception) {
            exception.printStackTrace();
        }

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
