package Main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import command.JukeCommand;
import listener.GuiListener;

public class main extends JavaPlugin {
	@Override
	public void onEnable() {
		Bukkit.getPluginManager().registerEvents(new GuiListener(), this);
		setCommand();
	}

	public void setCommand() {
		getCommand("jukebag").setExecutor(new JukeCommand());
	}
}
