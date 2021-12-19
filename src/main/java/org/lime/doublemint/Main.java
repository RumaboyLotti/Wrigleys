package org.lime.doublemint;

import org.bukkit.plugin.java.JavaPlugin;
import org.lime.doublemint.Commands.ChestCommand;
import org.lime.doublemint.Commands.FeedCommand;
import org.lime.doublemint.Listener.EnchantBottle;
import org.lime.doublemint.Listener.JoinAndLeave;
import org.lime.doublemint.Listener.SheepShear;




public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Welcome TO Wrigley's -RumaboyLotti");
        getConfig().options().copyDefaults();
        saveDefaultConfig();
        //Need to look more into registering Commands for better practice
        getCommand("Feed").setExecutor(new FeedCommand());
        getCommand("Chest").setExecutor(new ChestCommand());


        //Setup Config
        getConfig().options().copyDefaults();
        saveDefaultConfig();
        getServer().getPluginManager().registerEvents(new EnchantBottle(), this);
        getServer().getPluginManager().registerEvents(new SheepShear(), this);
        getServer().getPluginManager().registerEvents(new JoinAndLeave(), this);

        }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("GoodBye");
    }
}
