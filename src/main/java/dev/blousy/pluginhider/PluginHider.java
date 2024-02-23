package dev.blousy.pluginhider;

import dev.blousy.pluginhider.commands.HidePlugin;
import dev.blousy.pluginhider.listeners.OverrideDefault;
import org.bukkit.plugin.java.JavaPlugin;

public final class PluginHider extends JavaPlugin {
    private HidePlugin pluginHider;
    @Override
    public void onEnable() {
        pluginHider = new HidePlugin(this);

        getServer().getPluginManager().registerEvents(new OverrideDefault(), this);
    }

    public HidePlugin getPluginHider() {
        return pluginHider;
    }
}
