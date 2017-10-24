package jp.teleport.teleporttootherworld;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;

public class Teleport extends JavaPlugin {

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player p = (Player) sender;
		int x = (int) p.getLocation().getX() + 4096;
		int y = (int) p.getLocation().getY();
		int z = (int) p.getLocation().getZ() + 4096;
		if(label.equalsIgnoreCase("teleporttoworld")) {
			p.chat("/mvtp world");
			new TeleportThisLocation(p, x, y, z).runTaskTimer(this, 20, 20);
			return true;
		}
		sender.sendMessage(ChatColor.RED + "/teleportto");
		return true;
	}

}
