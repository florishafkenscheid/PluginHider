package dev.blousy.pluginhider.commands;

import dev.blousy.pluginhider.Command;
import dev.blousy.pluginhider.PluginHider;
import org.bukkit.entity.Player;

import static dev.blousy.pluginhider.methods.Utils.msgPlayer;

public class HidePlugin extends Command {
    public HidePlugin(PluginHider main) {
        super(main, "plugins");
    }

    @Override
    protected void execute(Player player, String[] args) {
        msgPlayer(player, "&cAll custom coded by blousy ;)");
    }
}
