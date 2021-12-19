package org.lime.doublemint.Listener;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class JoinAndLeave implements Listener {

    @EventHandler
    public void onLeave(PlayerQuitEvent e){
        Player player = e.getPlayer();
        e.setQuitMessage(ChatColor.DARK_PURPLE + " " + ChatColor.ITALIC + player.getDisplayName() + " " +  "GoodBye");
    }
    @EventHandler
    public void onJoin(PlayerJoinEvent e){
        PlayerInteractEvent event;
        Player player = e.getPlayer();

        if (player.hasPlayedBefore()){
            e.setJoinMessage(ChatColor.GOLD + " " + ChatColor.ITALIC + player.getDisplayName() + " " + ChatColor.GREEN +  "Hi Again!");
        }else{
            e.setJoinMessage(ChatColor.MAGIC + " " + ChatColor.BOLD + player.getDisplayName() + " " + ChatColor.STRIKETHROUGH +  "Welcome to LimeEdits!");
        }
    }
}
