package org.lime.doublemint.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

public class HologramCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {


            if(sender instanceof Player){
                Player player = (Player) sender;
                ArmorStand hologram = (ArmorStand) player.getWorld().spawnEntity(player.getLocation(), EntityType.ARMOR_STAND);
                hologram.setVisible(false);
                hologram.setCustomNameVisible(true);
                hologram.setCustomName(ChatColor.RED + "Hologram");
                hologram.setGravity(false);

            }


        return true;
    }
}
