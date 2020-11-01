package me.Geo54321.GeoChatStuff;

import me.Geo54321.GeoChatStuff.Chat.*;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    FileConfiguration config = getConfig();

    @Override
    public void onEnable() {
        this.saveDefaultConfig();
        this.loadDefaultConfigFile();

        this.getCommand("dice").setExecutor(new Dice());
        this.getCommand("dicks").setExecutor(new Dicks());
        this.getCommand("geo").setExecutor(new Geo());
        this.getCommand("heart").setExecutor(new Heart());
        this.getCommand("liz").setExecutor(new Liz(getConfig().getBoolean("options.reeee-sound")));
        this.getCommand("lolsloth").setExecutor(new LOLSloth());
        this.getCommand("pong").setExecutor(new Pong());
        this.getCommand("war").setExecutor(new War());
    }

    @Override
    public void onDisable() {

    }

    private void loadDefaultConfigFile() {
        config.options().header("GeoChatStuff Config File");
        config.addDefault("options.reeee-sound",true);

        config.options().copyDefaults(true);
        saveConfig();
        reloadConfig();
    }
}
