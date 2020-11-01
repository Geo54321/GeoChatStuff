package me.Geo54321.GeoChatStuff.Chat;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Pong implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player) {
            Player player = (Player) sender;
            Bukkit.broadcastMessage("§e" + player.getDisplayName() + " likes cute Asian boys.§r");
        }
        return true;
    }
}
