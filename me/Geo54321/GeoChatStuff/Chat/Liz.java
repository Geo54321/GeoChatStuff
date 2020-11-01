package me.Geo54321.GeoChatStuff.Chat;

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public class Liz implements CommandExecutor {
    boolean doSound;
    public Liz(boolean doSound) {
        this.doSound = doSound;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof ConsoleCommandSender) {
            REEEEEEEEEEEEEEEEE("all");
        }
        else if(sender instanceof Player) {
            Player player = (Player) sender;
            if(args.length > 0) {
                if(player.hasPermission("GeoChatStuff.staff.liz")) {
                    if(args[0].equals("all") || args[0].equals("@a")) {
                        REEEEEEEEEEEEEEEEE("all");
                    }
                    else {
                        if(!REEEEEEEEEEEEEEEEE(args[0])) {
                            player.sendMessage("§cTarget not found");
                        }
                    }
                }
                else {
                    player.sendMessage("§cSorry, you don't have permission to §eREEEEE §cothers.");
                }
            }
            else
                REEEEEEEEEEEEEEEEE(player.getDisplayName());
        }
        return true;
    }

    public boolean REEEEEEEEEEEEEEEEE(String target) {
        if(target.equals("all")) {
            Bukkit.broadcastMessage("§eREEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE");
            if(doSound) {
                for (Player player : Bukkit.getOnlinePlayers()) {
                    player.playSound(player.getLocation(), Sound.ENTITY_GHAST_HURT, 1, 1);
                }
            }
            return true;
        }
        else {
            for(Player player : Bukkit.getOnlinePlayers()) {
                if(player.getDisplayName().equals(target)) {
                    player.sendMessage("§eREEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE");
                    if(doSound) {
                        player.playSound(player.getLocation(), Sound.ENTITY_GHAST_HURT, 1, 1);
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
