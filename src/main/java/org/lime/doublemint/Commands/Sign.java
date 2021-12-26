package org.lime.doublemint.Commands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Sign  implements CommandExecutor {




    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player p) {
            p.getWorld().getBlockAt(p.getLocation()).setType(Material.CRIMSON_SIGN);

            org.bukkit.block.Sign sign1 = (org.bukkit.block.Sign) p.getWorld().getBlockAt(p.getLocation()).getState();
            sign1.setLine(0, ChatColor.BLUE + "Nice Cock");
            sign1.setGlowingText(true);
            sign1.isGlowingText();

            sign1.update();

        }
        return true;
    }


        }


