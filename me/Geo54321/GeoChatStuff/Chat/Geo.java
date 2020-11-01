package me.Geo54321.GeoChatStuff.Chat;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Geo implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Bukkit.broadcastMessage("§2#BlameGeo!§r");
        return true;
    }
}
