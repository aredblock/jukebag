package gui;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import builder.ItemBuilder;

public class SecretMusicGUI {
	Inventory inventory = Bukkit.createInventory(null, 3 * 9, "secret-music");

	public void openGui(Player p) {
		inventory.setItem(11, new ItemBuilder(Material.GRASS_BLOCK).setDisplayname("Homemenu-Music")
				.setLocalizedName("home").build());
		inventory.setItem(12,
				new ItemBuilder(Material.WOODEN_PICKAXE).setDisplayname("Game-Music").setLocalizedName("game").build());
		inventory.setItem(13, new ItemBuilder(Material.IRON_BLOCK).setDisplayname("Creativ-Music")
				.setLocalizedName("creativ").build());
		inventory.setItem(14,
				new ItemBuilder(Material.END_STONE).setDisplayname("End-Music").setLocalizedName("end").build());
		inventory.setItem(15,
				new ItemBuilder(Material.PAPER).setDisplayname("Credits-Music").setLocalizedName("credits").build());

		inventory.setItem(22, new ItemBuilder(Material.RED_STAINED_GLASS_PANE).setDisplayname("stop-sounds")
				.setLore("Click to stop!").setLocalizedName("stop").build());
		inventory.setItem(26, new ItemBuilder(Material.ARROW).setDisplayname("Back").setLocalizedName("back").build());
		setGray(inventory);
		p.openInventory(inventory);
	}

	public void setGray(Inventory inventory) {
		inventory.setItem(0,
				new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE).setDisplayname(" ").setLocalizedName("none").build());
		inventory.setItem(1,
				new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE).setDisplayname(" ").setLocalizedName("none").build());
		inventory.setItem(2,
				new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE).setDisplayname(" ").setLocalizedName("none").build());
		inventory.setItem(3,
				new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE).setDisplayname(" ").setLocalizedName("none").build());
		inventory.setItem(4,
				new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE).setDisplayname(" ").setLocalizedName("none").build());
		inventory.setItem(5,
				new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE).setDisplayname(" ").setLocalizedName("none").build());
		inventory.setItem(6,
				new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE).setDisplayname(" ").setLocalizedName("none").build());
		inventory.setItem(7,
				new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE).setDisplayname(" ").setLocalizedName("none").build());
		inventory.setItem(8,
				new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE).setDisplayname(" ").setLocalizedName("none").build());
		inventory.setItem(9,
				new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE).setDisplayname(" ").setLocalizedName("none").build());
		inventory.setItem(10,
				new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE).setDisplayname(" ").setLocalizedName("none").build());

		inventory.setItem(18,
				new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE).setDisplayname(" ").setLocalizedName("none").build());
		inventory.setItem(19,
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

		inventory.setItem(16,
				new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE).setDisplayname(" ").setLocalizedName("none").build());
		inventory.setItem(17,
				new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE).setDisplayname(" ").setLocalizedName("none").build());
	}
}
