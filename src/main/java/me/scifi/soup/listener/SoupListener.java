package me.scifi.soup.listener;

import me.scifi.soup.Soup;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class SoupListener implements Listener {

    private final Soup plugin = Soup.getPlugin();

    @EventHandler
    public void onSoup(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        ItemStack stack = player.getItemInHand();

        if (!event.getAction().name().contains("RIGHT")) {
            return;
        }

        if (stack == null || !stack.getType().equals(Material.MUSHROOM_SOUP)) {
            return;
        }

        player.getItemInHand().setType(Material.BOWL);

        if (player.getHealth() + 6.5F > 20) {
            player.setHealth(player.getMaxHealth());
        }

        else {
            player.setHealth(player.getHealth() + 6.5F);
        }

    }

}
