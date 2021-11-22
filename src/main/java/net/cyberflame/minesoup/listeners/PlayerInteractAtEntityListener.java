package net.cyberflame.minesoup.listeners;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;
import org.bukkit.inventory.ItemStack;

public class PlayerInteractAtEntityListener implements Listener
{
    @EventHandler
    public void onPlayerInteractAtEntity(PlayerInteractAtEntityEvent event)
    {
        Player player = event.getPlayer();
        ItemStack itemStack = player.getItemInHand();
        if (itemStack.getType() == Material.MUSHROOM_SOUP)
            {
                if (player.getHealth() == 20.0) return;
                else
                    {
                        event.setCancelled(true);
                        double newHealth = Math.min(player.getHealth() + 7.0, player.getMaxHealth());
                        player.setHealth(newHealth);
                        itemStack.setType(Material.BOWL);
                    }
            }
    }
}
