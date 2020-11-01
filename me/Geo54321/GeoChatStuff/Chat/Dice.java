package me.Geo54321.GeoChatStuff.Chat;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Random;

public class Dice implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Random rng = new Random();
        if(sender instanceof Player) {
            Player player = (Player) sender;
            int sides = 20; //Default d20
            int count = 1;  //Default 1 die
            try {
                if(args.length > 0) {
                    if (0 < Integer.parseInt(args[0]) && Integer.parseInt(args[0]) < 1001) //Must be a number between 1 and 1000
                        sides = Integer.parseInt(args[0]);
                    else
                        player.sendMessage("§6You must input a positive integer that is <= 1000 for the sides. Using the default 20 sides.");
                }
            }
            catch(Exception e) {
                player.sendMessage("§cYou must input integer values. Using the default d20.");
            }
            try {
                if(args.length > 1) {
                    if (0 < Integer.parseInt(args[1]) && Integer.parseInt(args[1]) < 11) // Must be a number between 1 and 10
                        count = Integer.parseInt(args[1]);
                    else
                        player.sendMessage("§6You must input a positive integer that is <= 10 for the number of dice. Using the default 1 die.");
                }
            }
            catch(Exception e) {
                player.sendMessage("§cYou must input integer values. Using the default d20.");
            }

            player.sendMessage("§5Rolling " + count + " d" + sides + "...§r");
            String[] values = new String[count];
            for(int g = 0; g < values.length; g++) {
                int num = rng.nextInt(sides)+1;
                if(num == sides)
                    values[g] = "§2" + Integer.toString(num) + "§r";    //Green if max value
                else if(num == 1)
                    values[g] = "§4" + Integer.toString(num) + "§r";    //Red if min value
                else
                    values[g] = "§9" + Integer.toString(num) + "§r";    //Gray elsewise
            }
            player.sendMessage(values);
        }
        return true;
    }
}

