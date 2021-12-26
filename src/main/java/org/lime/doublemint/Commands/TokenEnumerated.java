package org.lime.doublemint.Commands;

import org.bukkit.Material;

import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
enum  TokenEnumerated  {

        // Materials to be called upon by outside Methods
        // can be used im effective gui & other chances of writing code
        Golden_Sword(Material.GOLDEN_SWORD,  "King Arthur's Sword",  1),
        Diamond_Sword(Material.DIAMOND_SWORD, "Diamond Sword of Destiny", 1);
        //however, many you want

        // describing variables to assign cleaner codes
        private final ItemStack item;
        private final String displayName;
        private final ItemMeta meta;

        TokenEnumerated(Material material, String displayName, int amount) {
            ItemStack item = new ItemStack(material, amount);
            ItemMeta itemMeta = item.getItemMeta();
            itemMeta.setDisplayName(displayName);
            item.setItemMeta(itemMeta);
            this.item = item;
            this.displayName = displayName;
            this.meta = itemMeta;
        }
// declaring methods so when they are used in outside classes they return the proper values
// be careful of naming parameters when writing
        public String getDisplayName() {
            return displayName;
        }

        public ItemStack getItemStack() {
            return item;
        }

        public ItemMeta getitemMeta() {
            return meta;
        }

    }

//Then you could call something like...
//TokenEnumerated.Golden_Sword.setItemMeta()
//to compare the metadata

//If you are using the enums in another class you can import them statically to prevent having to use "Items." as a prefix.



