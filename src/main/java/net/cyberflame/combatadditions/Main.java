package net.cyberflame.combatadditions;

import net.cyberflame.combatadditions.listeners.EntityDamageByEntityListener;
import net.cyberflame.combatadditions.listeners.PlayerInteractAtEntityListener;
import net.cyberflame.combatadditions.listeners.PlayerInteractListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin
{
    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new PlayerInteractListener(), this);
        Bukkit.getPluginManager().registerEvents(new PlayerInteractAtEntityListener(), this);
        Bukkit.getPluginManager().registerEvents(new EntityDamageByEntityListener(), this);
    }

}
