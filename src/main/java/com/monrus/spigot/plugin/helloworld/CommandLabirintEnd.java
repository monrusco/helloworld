package com.monrus.spigot.plugin.helloworld;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class CommandLabirintEnd implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Bukkit.broadcastMessage("Лабиринт закончен!");
        if (sender instanceof Player) {
            Player player = (Player) sender;
            player.setGameMode(GameMode.SURVIVAL);
        }
        // If the player (or console) uses our command correct, we can return true
        return true;
    }
}
