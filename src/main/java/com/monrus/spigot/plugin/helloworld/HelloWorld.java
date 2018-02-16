package com.monrus.spigot.plugin.helloworld;
import org.bukkit.plugin.java.JavaPlugin;
public class HelloWorld extends JavaPlugin {
    @Override
    public void onLoad() {
        super.onLoad();
        getLogger().info("Hello! World?");
    }
    @Override
    public void onDisable() {
        super.onDisable();
        getLogger().info("Good bye! World?");
        getLogger().warning("Uwaga! World?");
    }
    @Override
    public void onEnable() {
        super.onEnable();
        getLogger().info("Again! World?");
        this.getCommand("kit").setExecutor(new CommandKit());
        this.getCommand("labegin").setExecutor(new CommandLabirintBegin());
        this.getCommand("laend").setExecutor(new CommandLabirintEnd());
    }
    public static void main(String [ ] args) {
    }
}
