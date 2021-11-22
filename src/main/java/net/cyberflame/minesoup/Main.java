package net.cyberflame.minesoup;

import net.cyberflame.minesoup.listeners.PlayerInteractListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin
{

    @Override
    public void onEnable() {
        getLogger().info("MinesSoup enabled!");
        Bukkit.getPluginManager().registerEvents(new PlayerInteractListener(), this);
        Bukkit.getPluginManager().registerEvents(new PlayerInteractListener(), this);
    }

    @Override
    public void onDisable() {
        getLogger().info("MineSoup disabled!");
    }

}
