package me.scifi.soup.listener;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class SoupListener implements Listener {

    @EventHandler
    public void onSoup(PlayerInteractEvent event) {
        final Player player = event.getPlayer();
        final ItemStack stack = player.getItemInHand();

        if (!event.getAction().name().contains("RIGHT") || stack == null || !stack.getType().equals(Material.MUSHROOM_SOUP)) {
            return;
        }

        player.getItemInHand().setType(Material.BOWL);
        player.setHealth(Math.min(20.0F, player.getHealth() + 6.5F));
    }
}
