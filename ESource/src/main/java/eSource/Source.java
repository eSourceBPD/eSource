package eSource;

import org.bukkit.plugin.java.JavaPlugin;

public final class Source extends JavaPlugin{

	@Override
	public void onEnable() {
		// TODO Insert logic to be performed when the plugin is enabled
		getLogger().info("onEnable has been invoked!");
	}
	
	@Override
	public void onDisable() {
		// TODO Insert logic to be performed when the plugin disables 
		getLogger().info("onDisable has been invoked!");
	}
}
