package gui;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import builder.ItemBuilder;

public class JukeGUI {
	Inventory inventory = Bukkit.createInventory(null, 3 * 9, "Jukebag");

	public void OpenGUI(Player p) {
		inventory.setItem(0, new ItemBuilder(Material.MUSIC_DISC_CAT).setDisplayname("CAT-C418")
				.setLore("Click to hear!").setLocalizedName("cat").build());
		inventory.setItem(1, new ItemBuilder(Material.MUSIC_DISC_13).setDisplayname("13-C418").setLore("Click to hear!")
				.setLocalizedName("13").build());
		inventory.setItem(2, new ItemBuilder(Material.MUSIC_DISC_BLOCKS).setDisplayname("BLOCKS-C418")
				.setLore("Click to hear!").setLocalizedName("blocks").build());
		inventory.setItem(3, new ItemBuilder(Material.MUSIC_DISC_CHIRP).setDisplayname("CHIRP-C418")
				.setLore("Click to hear!").setLocalizedName("chirp").build());
		inventory.setItem(4, new ItemBuilder(Material.MUSIC_DISC_FAR).setDisplayname("FAR-C418")
				.setLore("Click to hear!").setLocalizedName("far").build());
		inventory.setItem(5, new ItemBuilder(Material.MUSIC_DISC_MALL).setDisplayname("MALL-C418")
				.setLore("Click to hear!").setLocalizedName("mall").build());
		inventory.setItem(6, new ItemBuilder(Material.MUSIC_DISC_MELLOHI).setDisplayname("MELLOHI-C418")
				.setLore("Click to hear!").setLocalizedName("mellohi").build());
		inventory.setItem(7, new ItemBuilder(Material.MUSIC_DISC_STAL).setDisplayname("STAL-C418")
				.setLore("Click to hear!").setLocalizedName("stal").build());
		inventory.setItem(8, new ItemBuilder(Material.MUSIC_DISC_STRAD).setDisplayname("STRAD-C418")
				.setLore("Click to hear!").setLocalizedName("strad").build());
		inventory.setItem(12, new ItemBuilder(Material.MUSIC_DISC_WARD).setDisplayname("WARD-C418")
				.setLore("Click to hear!").setLocalizedName("ward").build());
		inventory.setItem(13, new ItemBuilder(Material.MUSIC_DISC_WAIT).setDisplayname("WAIT-C418")
				.setLore("Click to hear!").setLocalizedName("wait").build());
		inventory.setItem(14, new ItemBuilder(Material.MUSIC_DISC_OTHERSIDE).setDisplayname("OTHERSIDE-Lena Raine")
				.setLore("Click to hear!").setLocalizedName("otherside").build());

		inventory.setItem(18, new ItemBuilder(Material.ENDER_CHEST).setDisplayname("creepy-music")
				.setLore("Click to open!").setLocalizedName("creepy").build());
		inventory.setItem(19, new ItemBuilder(Material.COMMAND_BLOCK).setDisplayname("secret-music")
				.setLore("Click to open!").setLocalizedName("secret").build());
		inventory.setItem(22, new ItemBuilder(Material.RED_STAINED_GLASS_PANE).setDisplayname("stop-sounds")
				.setLore("Click to stop!").setLocalizedName("stop").build());
		inventory.setItem(26,
				new ItemBuilder(Material.ARROW).setDisplayname("Schließen").setLocalizedName("close").build());
		setGray(inventory);
		p.openInventory(inventory);
	}

	public void setGray(Inventory inventory) {
		inventory.setItem(9,
				new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE).setDisplayname(" ").setLocalizedName("none").build());
		inventory.setItem(10,
				new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE).setDisplayname(" ").setLocalizedName("none").build());
		inventory.setItem(11,
				new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE).setDisplayname(" ").setLocalizedName("none").build());

		inventory.setItem(20,
				new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE).setDisplayname(" ").setLocalizedName("none").build());
		inventory.setItem(21,
				new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE).setDisplayname(" ").setLocalizedName("none").build());
		inventory.setItem(23,
				new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE).setDisplayname(" ").setLocalizedName("none").build());
		inventory.setItem(24,
				new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE).setDisplayname(" ").setLocalizedName("none").build());
		inventory.setItem(25,
				new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE).setDisplayname(" ").setLocalizedName("none").build());

		inventory.setItem(15,
				new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE).setDisplayname(" ").setLocalizedName("none").build());
		inventory.setItem(16,
				new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE).setDisplayname(" ").setLocalizedName("none").build());
		inventory.setItem(17,
				new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE).setDisplayname(" ").setLocalizedName("none").build());
	}
}
