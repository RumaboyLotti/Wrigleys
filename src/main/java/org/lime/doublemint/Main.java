package org.lime.doublemint;

import org.bukkit.plugin.java.JavaPlugin;
import org.lime.doublemint.Commands.*;
import org.lime.doublemint.Listener.EnchantBottle;
import org.lime.doublemint.Listener.JoinAndLeave;
import org.lime.doublemint.Listener.SheepShear;
import org.lime.doublemint.Listener.TokenPlugin;


public final class  Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Welcome TO Wrigley's -RumaboyLotti");


        //Setup Config
        //File management
        ConfigFile.setup();
        ConfigFile.get().addDefault("Taco", "Rice");
        ConfigFile.get().options().copyDefaults(true);
        ConfigFile.save();

        getConfig().options().copyDefaults();
        saveDefaultConfig();

        //Need to look more into registering Commands for better practice
        //how to register commands
        getCommand("Feed").setExecutor(new FeedCommand());
        getCommand("Token").setExecutor(new TokenCommand());
        getCommand("hologram").setExecutor(new HologramCommand());
        getCommand("sign").setExecutor(new Sign());
        getCommand("sign2").setExecutor(new Sign());

        //Registering Events
        getServer().getPluginManager().registerEvents(new EnchantBottle(), this);
        getServer().getPluginManager().registerEvents(new SheepShear(), this);
        getServer().getPluginManager().registerEvents(new JoinAndLeave(), this);
        getServer().getPluginManager().registerEvents(new TokenPlugin(), this);

        }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("GoodBye");
    }
}
