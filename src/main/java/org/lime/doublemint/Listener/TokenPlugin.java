package org.lime.doublemint.Listener;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;


public class TokenPlugin implements Listener {

    @EventHandler
    public void ClickEvent(InventoryClickEvent e){

        Player player = (Player) e.getWhoClicked();

        if(e.getView().getTitle().equalsIgnoreCase(ChatColor.GREEN + "Tokens")){


            e.setCancelled(true);
        }


    }

}
