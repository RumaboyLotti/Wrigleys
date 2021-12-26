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

import static org.lime.doublemint.Commands.TokenEnumerated.Diamond_Sword;
import static org.lime.doublemint.Commands.TokenEnumerated.Golden_Sword;

public class TokenCommand implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player ){
            Player player = (Player) sender;

            Inventory gui = Bukkit.createInventory(player, 9, ChatColor.GREEN + "Tokens");

            ItemStack  Close = new ItemStack(Material.SLIME_BALL);
            ItemStack TokenShop = new ItemStack(Material.BEACON);
            ItemStack ArrowTrails = new ItemStack(Material.SPECTRAL_ARROW);
            ItemStack DeathEffect = new ItemStack(Material.CREEPER_HEAD);

            ItemMeta Close_meta = Close.getItemMeta();
            Close_meta.setDisplayName(ChatColor.GOLD + "Close");
            ArrayList<String> Close_lore = new ArrayList<>();
            Close_lore.add(ChatColor.ITALIC + "Close Gui");
            Close_meta.setLore(Close_lore);
            Close.setItemMeta(Close_meta);


            ItemMeta ArrowTrails_meta = ArrowTrails.getItemMeta();
            ArrowTrails_meta.setDisplayName(ChatColor.DARK_PURPLE + "ArrowTrails");
            ArrayList<String> ArrowTrails_lore = new ArrayList<>();
            ArrowTrails_lore.add(ChatColor.YELLOW + "Open Arrow Trails");
            ArrowTrails_meta.setLore(ArrowTrails_lore);
            ArrowTrails.setItemMeta(ArrowTrails_meta);


            ItemMeta DeathEffect_meta = DeathEffect.getItemMeta();
            DeathEffect_meta.setDisplayName(ChatColor.DARK_RED + "DeathEffect");
            ArrayList<String> DeathEffect_lore = new ArrayList<>();
            DeathEffect_lore.add(ChatColor.GRAY + "Open Death Effects ");
            DeathEffect_meta.setLore(DeathEffect_lore);
            DeathEffect.setItemMeta(DeathEffect_meta);



            ItemMeta TokenShop_meta = TokenShop.getItemMeta();
            TokenShop_meta.setDisplayName(ChatColor.DARK_GREEN + "TokenShop");
            ArrayList<String> TokenShop_lore = new ArrayList<>();
            TokenShop_lore.add(ChatColor.AQUA + "Open Token Shop");
            TokenShop_meta.setLore(TokenShop_lore);
            TokenShop.setItemMeta(TokenShop_meta);


            ItemStack[] menu_items ={Close, DeathEffect, TokenShop, ArrowTrails};
            gui.setContents(menu_items);
            player.openInventory(gui);


        }



        return true;
    }
}
