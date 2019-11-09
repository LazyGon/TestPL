package com.github.okocraft.testpl;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class TestListener implements Listener {

    private static final TestPL PLUGIN = TestPL.getInstance();

    TestListener() {
        Bukkit.getPluginManager().registerEvents(this, PLUGIN);
    }

    @EventHandler
    public void onTest(PlayerInteractEvent event) {
        event.getPlayer().sendMessage("test: 1");
        event.getPlayer().sendMessage("test: 2");

        Bukkit.getScheduler().scheduleSyncDelayedTask(PLUGIN, new Runnable(){
            
            @Override
            public void run() {
                event.getPlayer().sendMessage("test: 3");
            }
        });

        event.getPlayer().sendMessage("test: 4");
        event.getPlayer().sendMessage("test: 5");
        event.getPlayer().sendMessage("test: 6");
    }
}