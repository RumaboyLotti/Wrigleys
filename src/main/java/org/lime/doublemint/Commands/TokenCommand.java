package org.lime.doublemint.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class ChestCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player player){
            Inventory vault = Bukkit.createInventory(player, 9, ChatColor.DARK_GREEN + "Your Vault");

            Material type;
            ItemStack item = new ItemStack(Material.BAMBOO, 1);
            vault.setItem(2, item);
            vault.addItem(item);
            ItemMeta meta = new item.getItemMeta();
            meta.setDisplayName(ChatColor.DARK_RED + "Shop");
            meta.setUnbreakable(true);
            ArrayList <String> lore = new ArrayList<>();
            lore.add(ChatColor.STRIKETHROUGH + "" + "Open the Token Shop");
            meta.setLore(lore);

            ItemStack item2 = new ItemStack(Material.ARROW, 1);
            ItemStack[] items = {item, item2 };
            ItemStack[] items2 = vault.getContents();
            ItemMeta meta2 = new item2.getItemMeta();
            meta.setDisplayName(ChatColor.BLACK + "Arrow Trails");
            meta.setUnbreakable(true);
            ArrayList <String> lore2 = new ArrayList<>();
            lore2.add(ChatColor.STRIKETHROUGH + "" + "Open the Arrow Trail Shop");
            meta.setLore(lore2);



            vault.setContents(items);




            player.openInventory(vault);
        }else{
            System.out.println("You must be a player to use this command");
        }

        return true;
    }
}
