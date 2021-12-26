package org.lime.doublemint.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FeedCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player p){
            if(p.hasPermission("wrigleys.feed")) {
                p.setFoodLevel(20);
            }else{
                p.sendMessage("You do not have the required permission");
            }
        p.sendMessage(ChatColor.DARK_GRAY + "" + "Delicious");
            }

        return true;
    }
}
