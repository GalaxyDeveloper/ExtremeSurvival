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
	        	
	        }
   
	        
}
