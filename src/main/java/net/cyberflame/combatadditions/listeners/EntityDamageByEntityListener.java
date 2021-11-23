package net.cyberflame.combatadditions.listeners;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.inventory.ItemStack;

public class EntityDamageByEntityListener implements Listener
{
    @EventHandler(ignoreCancelled = true)
    public void onEntityDamageByEntity(final EntityDamageByEntityEvent event)
    {
        if (event.getDamager() instanceof Player)
        {
            final Player attacker = (Player) event.getDamager();
            final ItemStack attackItem = attacker.getItemInHand();
            final Material attackItemMaterial = attackItem.getType();
            if (attackItemMaterial == Material.WOOD_HOE || attackItemMaterial == Material.GOLD_HOE
                || attackItemMaterial == Material.STONE_HOE || attackItemMaterial == Material.IRON_HOE
                || attackItemMaterial == Material.DIAMOND_HOE)
                {

                    short attackItemDurability = attackItem.getDurability();
                    final int maxUses = attackItemMaterial.getMaxDurability();
                    int durability = maxUses + 1 - attackItemDurability;

                    attacker.getInventory().getItemInHand().setDurability((short) (attackItemDurability + 1));
                    if (attackItemDurability >= maxUses) attacker.setItemInHand(new ItemStack(Material.AIR));
                }
        }
    }
}
