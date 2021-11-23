package net.cyberflame.combatadditions.listeners;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class PlayerInteractListener implements Listener
{
    @EventHandler
    public void onPlayerInteract(final PlayerInteractEvent event)
    {
        final Player player = event.getPlayer();
        ItemStack itemStack = player.getItemInHand();
        if (itemStack.getType() == Material.MUSHROOM_SOUP)
            {
                if (!(player.getHealth() == 20.0))
                    {
                        event.setCancelled(true);
                        double newHealth = Math.min(player.getHealth() + 6.0, player.getMaxHealth());
                        player.setHealth(newHealth);
                        itemStack.setType(Material.BOWL);
                    }
            }
    }
}
