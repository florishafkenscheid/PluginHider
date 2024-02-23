package dev.blousy.pluginhider;

import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public abstract class Command implements CommandExecutor  {
    protected PluginHider main;
    public Command(PluginHider main, String name) {
        this.main = main;
        main.getCommand(name).setExecutor(this);
    }
    protected abstract void execute(Player player, String[] args);

    @Override
    public boolean onCommand(@NotNull CommandSender sender, org.bukkit.command.@NotNull Command cmd, @NotNull String name, @NotNull String[] args) {
        if (sender instanceof Player ) execute((Player) sender, args);
        return true;
    }
}