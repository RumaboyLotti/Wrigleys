package org.lime.doublemint.Commands;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;


//classes
public class ConfigFile {

    //variables
    private static File file;
    private static FileConfiguration customFile;


    public static void setup () {
        file = new File(Bukkit.getServer().getPluginManager().getPlugin("DoubleMint").getDataFolder(), "customconfig.yml");


        if (!file.exists()){
            try{
                file.createNewFile();
            }catch (IOException e){
                //fill
            }
        }
        // basic creation of the file
        customFile = YamlConfiguration.loadConfiguration(file);
    }

    public static FileConfiguration get(){
        return customFile;
    }
    //Methods
    public static void save() {
        try {
            customFile.save(file);
        } catch (IOException e) {
            System.out.println("Couldn't save File");
        }
    }
    //methods
    public static void reload(){
        customFile = YamlConfiguration.loadConfiguration(file);
    }

}
