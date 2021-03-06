package org.lime.doublemint.Listener;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerShearEntityEvent;

public class SheepShear implements Listener {
    @EventHandler
    public void onSheepShear(PlayerShearEntityEvent e){
        Player player = e.getPlayer();
        if (e.getEntity().getType() == EntityType.SHEEP){
            player.sendMessage("This is a sheep. You can't do that.");
            e.setCancelled(true); //cancel the event. Provided by Cancellable interface
        }else{
            player.sendMessage("This is not a sheep.");
        }
    }
}
