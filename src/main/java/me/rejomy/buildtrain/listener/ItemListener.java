package me.rejomy.buildtrain.listener;

import me.rejomy.buildtrain.Main;
import me.rejomy.buildtrain.island.Island;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;

public class ItemListener implements Listener {
    @EventHandler(ignoreCancelled = true)
    public void onDrop(PlayerDropItemEvent event) {
        Player player = event.getPlayer();
        Island island = Main.getInstance().USERS.get(player).island;

        if (island != null) {
            event.setCancelled(true);
        }
    }
}
