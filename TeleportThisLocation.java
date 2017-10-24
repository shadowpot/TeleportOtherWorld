package jp.teleport.teleporttootherworld;

import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

public class TeleportThisLocation extends BukkitRunnable {

	Player p;
	int x;
	int y;
	int z;

	public TeleportThisLocation(Player p, int x, int y, int z) {
		this.p = p;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	@Override
	public void run() {
		p.chat("/tp " + x + " " + y + " " + z);
		p.setGameMode(GameMode.CREATIVE);
		cancel();
	}

}
