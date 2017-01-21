package com.minecraft.plugin;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class ExtremeSurvival extends JavaPlugin {

	public static String PLUGIN_NAME = "ExtremeSurvival";

	@Override
	public void onEnable() {

		getServer().getPluginManager().registerEvents(new ExtremeSurvivalListener(), this);
		// Flint Knife
		ItemStack item = new ItemStack(Material.WOOD_SWORD);

		ItemMeta meta = item.getItemMeta();

		meta.setDisplayName("§8Flint Knife");

		item.setItemMeta(meta);

		ShapedRecipe recipe = new ShapedRecipe(item);

		recipe.shape("DB", "CA");

		// A = String, B = Flint, C = Stick, D = Iron Ingot
		recipe.setIngredient('A', Material.STRING);
		recipe.setIngredient('B', Material.FLINT);
		recipe.setIngredient('C', Material.STICK);
		recipe.setIngredient('D', Material.IRON_INGOT);

		Bukkit.addRecipe(recipe);

		// Flint Mattock
		ItemStack item1 = new ItemStack(Material.WOOD_PICKAXE);

		ItemMeta meta1 = item1.getItemMeta();

		meta1.setDisplayName("§8Flint Mattock");

		item1.setItemMeta(meta1);

		ShapedRecipe recipe1 = new ShapedRecipe(item1);

		recipe1.shape("BA", "CB");

		// A = Wood, B = Flint, C = Stick
		recipe1.setIngredient('A', Material.WOOD);
		recipe1.setIngredient('B', Material.FLINT);
		recipe1.setIngredient('C', Material.STICK);

		Bukkit.addRecipe(recipe1);

		// Flint Hatchet
		ItemStack item2 = new ItemStack(Material.WOOD_AXE);

		ItemMeta meta2 = item2.getItemMeta();

		meta2.setDisplayName("§8Flint Hatchet");

		item2.setItemMeta(meta2);

		ShapedRecipe recipe2 = new ShapedRecipe(item2);

		recipe2.shape("AA", "B ");

		// A = Flint, B = Stick
		recipe2.setIngredient('A', Material.FLINT);
		recipe2.setIngredient('B', Material.STICK);

		Bukkit.addRecipe(recipe2);

		// Flint Spade
		ItemStack item3 = new ItemStack(Material.WOOD_SPADE);

		ItemMeta meta3 = item3.getItemMeta();

		meta3.setDisplayName("§8Flint Spade");

		item3.setItemMeta(meta3);

		ShapedRecipe recipe3 = new ShapedRecipe(item3);

		recipe3.shape("A ", "B ");

		// A = Flint, B = Stick
		recipe3.setIngredient('A', Material.FLINT);
		recipe3.setIngredient('B', Material.STICK);

		Bukkit.addRecipe(recipe3);

		// Fire Striker
		ItemStack item4 = new ItemStack(Material.FLINT_AND_STEEL);

		ItemMeta meta4 = item4.getItemMeta();

		meta4.setDisplayName("§6Fire Striker");

		item4.setItemMeta(meta4);

		ShapedRecipe recipe4 = new ShapedRecipe(item4);

		recipe4.shape("A ", " A");

		// A = Flint
		recipe4.setIngredient('A', Material.FLINT);

		Bukkit.addRecipe(recipe4);

		// Reinforced Leather Equipment (5-8)
		ItemStack item5 = new ItemStack(Material.CHAINMAIL_HELMET);

		ItemMeta meta5 = item5.getItemMeta();

		meta5.setDisplayName("§fReinforced Leather Helmet");

		item5.setItemMeta(meta5);

		ShapedRecipe recipe5 = new ShapedRecipe(item5);

		recipe5.shape(" A ", "BCB");

		// A = String, B = Iron Ingot, C = Leather Helmet
		recipe5.setIngredient('A', Material.STRING);
		recipe5.setIngredient('B', Material.IRON_INGOT);
		recipe5.setIngredient('C', Material.LEATHER_HELMET);

		Bukkit.addRecipe(recipe5);

		ItemStack item6 = new ItemStack(Material.CHAINMAIL_CHESTPLATE);

		ItemMeta meta6 = item6.getItemMeta();

		meta6.setDisplayName("§fReinforced Leather Chestplate");

		item6.setItemMeta(meta6);

		ShapedRecipe recipe6 = new ShapedRecipe(item6);

		recipe6.shape(" A ", "BCB");

		// A = String, B = Iron Ingot, C = Leather Chestplate
		recipe6.setIngredient('A', Material.STRING);
		recipe6.setIngredient('B', Material.IRON_INGOT);
		recipe6.setIngredient('C', Material.LEATHER_CHESTPLATE);

		Bukkit.addRecipe(recipe6);

		ItemStack item7 = new ItemStack(Material.CHAINMAIL_LEGGINGS);

		ItemMeta meta7 = item7.getItemMeta();

		meta7.setDisplayName("§fReinforced Leather Leggings");

		item7.setItemMeta(meta7);

		ShapedRecipe recipe7 = new ShapedRecipe(item7);

		recipe7.shape(" A ", "BCB");

		// A = String, B = Iron Ingot, C = Leather Leggings
		recipe7.setIngredient('A', Material.STRING);
		recipe7.setIngredient('B', Material.IRON_INGOT);
		recipe7.setIngredient('C', Material.LEATHER_LEGGINGS);

		Bukkit.addRecipe(recipe7);

		ItemStack item8 = new ItemStack(Material.CHAINMAIL_BOOTS);

		ItemMeta meta8 = item8.getItemMeta();

		meta8.setDisplayName("§fReinforced Leather Boots");

		item8.setItemMeta(meta8);

		ShapedRecipe recipe8 = new ShapedRecipe(item8);

		recipe8.shape(" A ", "BCB");

		// A = String, B = Iron Ingot, C = Leather Boots
		recipe8.setIngredient('A', Material.STRING);
		recipe8.setIngredient('B', Material.IRON_INGOT);
		recipe8.setIngredient('C', Material.LEATHER_BOOTS);

		Bukkit.addRecipe(recipe8);

		// Gunpowder Barrels
		ItemStack item9 = new ItemStack(Material.TNT);

		ItemMeta meta9 = item9.getItemMeta();

		meta9.setDisplayName("§8Gunpowder Barrel");

		item9.setItemMeta(meta9);

		ShapedRecipe recipe9 = new ShapedRecipe(item9);

		recipe9.shape("BAB", "BDB", "DCD");

		// A = String, B = Wood Plank, C = Wood Slab, D = Gunpowder
		recipe9.setIngredient('A', Material.STRING);
		recipe9.setIngredient('B', Material.WOOD);
		recipe9.setIngredient('C', Material.WOOD_STEP);
		recipe9.setIngredient('D', Material.SULPHUR);

		Bukkit.addRecipe(recipe9);
		
	}

}
