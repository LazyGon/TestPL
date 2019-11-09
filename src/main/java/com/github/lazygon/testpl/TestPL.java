package com.github.lazygon.testpl;

import org.bukkit.Bukkit;
import org.bukkit.event.HandlerList;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class TestPL extends JavaPlugin {

    private static TestPL instance;

    @Override
    public void onEnable() {
        new TestListener();
    }

    @Override
    public void onDisable() {
        HandlerList.unregisterAll((Plugin) this);
        Bukkit.getScheduler().cancelTasks(this);
    }

    public static TestPL getInstance() {
        if (instance == null) {
            instance = (TestPL) Bukkit.getPluginManager().getPlugin("TestPL");
        }

        return instance;
    }
}
