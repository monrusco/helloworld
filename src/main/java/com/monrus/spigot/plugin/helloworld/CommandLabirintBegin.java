package com.monrus.spigot.plugin.helloworld;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
public class CommandLabirintBegin implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            player.setGameMode(GameMode.ADVENTURE);
            sender.sendMessage("Прохождение лабиринта началось!");
            double x = player.getLocation().getX();
        }
        // If the player (or console) uses our command correct, we can return true
        return true;
    }
}
