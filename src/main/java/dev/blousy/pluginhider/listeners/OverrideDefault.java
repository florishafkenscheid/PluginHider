package dev.blousy.pluginhider.listeners;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class OverrideDefault implements Listener {
    @EventHandler(priority = EventPriority.NORMAL, ignoreCancelled = true)
    public void onPluginsRun(PlayerCommandPreprocessEvent event) {
        if (!event.getPlayer().isOp()) {
            String cmd = event.getMessage();
            if (cmd.startsWith("/pl") || cmd.startsWith("/plugins")) {
                event.setCancelled(true);
                Bukkit.dispatchCommand(event.getPlayer(), "pluginhider:plugins");
            }
        }
    }
}
