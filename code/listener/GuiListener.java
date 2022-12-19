package listener;

import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import gui.JukeGUI;
import gui.MysticalMusicGUI;
import gui.SecretMusicGUI;

public class GuiListener implements Listener {
	@EventHandler
	public void onInvClick(InventoryClickEvent event) {
		if (event.getCurrentItem() == null)
			return;

		// MainMenu:
		if (event.getView().getTitle() == "Jukebag") {
			Player player = (Player) event.getWhoClicked();
			event.setCancelled(true);

			if (event.getCurrentItem().getItemMeta().hasLocalizedName()) {
				switch (event.getCurrentItem().getItemMeta().getLocalizedName()) {
				case "close":
					player.closeInventory();
					break;
				case "stop":
					player.stopAllSounds();
					player.sendMessage("All sounds are stoped!");
					break;
				case "creepy":
					new MysticalMusicGUI().openGui(player);
					break;
				case "secret":
					new SecretMusicGUI().openGui(player);
					break;
				case "settings":
					new SecretMusicGUI().openGui(player);
					break;

				case "cat":
					player.playSound(player, Sound.MUSIC_DISC_CAT, 1.0f, 1.0f);
					break;
				case "13":
					player.playSound(player, Sound.MUSIC_DISC_13, 1.0f, 1.0f);
					break;
				case "blocks":
					player.playSound(player, Sound.MUSIC_DISC_BLOCKS, 1.0f, 1.0f);
					break;
				case "chirp":
					player.playSound(player, Sound.MUSIC_DISC_CHIRP, 1.0f, 1.0f);
					break;
				case "far":
					player.playSound(player, Sound.MUSIC_DISC_FAR, 1.0f, 1.0f);
					break;
				case "mall":
					player.playSound(player, Sound.MUSIC_DISC_MALL, 1.0f, 1.0f);
					break;
				case "mellohi":
					player.playSound(player, Sound.MUSIC_DISC_MELLOHI, 1.0f, 1.0f);
					break;
				case "stal":
					player.playSound(player, Sound.MUSIC_DISC_STAL, 1.0f, 1.0f);
					break;
				case "strad":
					player.playSound(player, Sound.MUSIC_DISC_STRAD, 1.0f, 1.0f);
					break;
				case "ward":
					player.playSound(player, Sound.MUSIC_DISC_WARD, 1.0f, 1.0f);
					break;
				case "wait":
					player.playSound(player, Sound.MUSIC_DISC_STRAD, 1.0f, 1.0f);
					break;
				case "otherside":
					player.playSound(player, Sound.MUSIC_DISC_OTHERSIDE, 1.0f, 1.0f);
					break;
				}
			}
		}

		if (event.getView().getTitle() == "creepy-music") {
			Player player = (Player) event.getWhoClicked();
			event.setCancelled(true);

			if (event.getCurrentItem().getItemMeta().hasLocalizedName()) {
				switch (event.getCurrentItem().getItemMeta().getLocalizedName()) {
				case "back":
					new JukeGUI().OpenGUI(player);
					break;
				case "stop":
					player.stopAllSounds();
					player.sendMessage("All sounds are stoped!");
					break;

				case "11":
					player.playSound(player, Sound.MUSIC_DISC_11, 1.0f, 1.0f);
					break;
				case "pigstep":
					player.playSound(player, Sound.MUSIC_DISC_PIGSTEP, 1.0f, 1.0f);
					break;
				}
			}
		}

		if (event.getView().getTitle() == "secret-music") {
			Player player = (Player) event.getWhoClicked();
			event.setCancelled(true);

			if (event.getCurrentItem().getItemMeta().hasLocalizedName()) {
				switch (event.getCurrentItem().getItemMeta().getLocalizedName()) {
				case "back":
					new JukeGUI().OpenGUI(player);
					break;
				case "stop":
					player.stopAllSounds();
					player.sendMessage("All sounds are stoped!");
					break;

				case "home":
					player.playSound(player, Sound.MUSIC_MENU, 1.0f, 1.0f);
					break;
				case "game":
					player.playSound(player, Sound.MUSIC_GAME, 1.0f, 1.0f);
					break;
				case "credits":
					player.playSound(player, Sound.MUSIC_CREDITS, 1.0f, 1.0f);
					break;
				case "creativ":
					player.playSound(player, Sound.MUSIC_CREATIVE, 1.0f, 1.0f);
					break;
				case "end":
					player.playSound(player, Sound.MUSIC_END, 1.0f, 1.0f);
					break;
				}
			}
		}
	}
}
