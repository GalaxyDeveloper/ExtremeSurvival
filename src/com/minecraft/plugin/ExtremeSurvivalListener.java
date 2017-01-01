package com.minecraft.plugin;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.FallingBlock;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockDamageEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scheduler.BukkitScheduler;

public class ExtremeSurvivalListener implements Listener {

	// Gravity 1
	@EventHandler
	public void onBlockPlace(BlockPlaceEvent e) {
		Block block = e.getBlock();
		World world = e.getPlayer().getWorld();
		if (block.getType() == Material.COBBLESTONE) {
			gravity(block, world);
		}
		if (block.getType() == Material.DIRT) {
			gravity(block, world);
		}
		if (block.getType() == Material.GRASS) {
			gravity(block, world);
		}
	}
	
	// Gravity 2
	@EventHandler
	public void onBlockFloating(BlockBreakEvent e) {
		Block block = e.getBlock();
		World world = e.getPlayer().getWorld();
		Location location = block.getLocation();
		Block aboveBlock = world.getBlockAt(new Location(world, location.getX(), location.getY() + 1, location.getZ()));
		Bukkit.getServer().broadcastMessage("breaked block is: " + block.getType() + " above is: " + aboveBlock.getType());
		if (aboveBlock.getType() == Material.COBBLESTONE ||
			aboveBlock.getType() == Material.DIRT ||
			aboveBlock.getType() == Material.GRASS) {
			Plugin plugin = Bukkit.getServer().getPluginManager().getPlugin(ExtremeSurvival.PLUGIN_NAME);
			BukkitRunnable bukkitRunnble = new BukkitRunnable() {
				
				@Override
				public void run() {
					gravity(aboveBlock, world);	
				}
			};
			bukkitRunnble.runTask(plugin);
			
		}
	}

	private void gravity(Block block, World world) {
		if (isUnderBlockAIR(block, world)) {
			Bukkit.getServer().broadcastMessage("under is AIR");
			Location location = block.getLocation();
			Location newLocation = new Location(world, location.getX() +0.5, location.getY(), location.getZ() +0.5);
			FallingBlock fb = block.getWorld().spawnFallingBlock(newLocation, block.getType(), block.getData());			
			block.setType(Material.AIR);

		}
	}

	private boolean isUnderBlockAIR(Block block, World world) {
		Location bLocation = block.getLocation();
		Location bUnderLocation = new Location(bLocation.getWorld(), bLocation.getX(), bLocation.getY() - 1, bLocation.getZ());
		
		Block bUnder = world.getBlockAt(bUnderLocation);
		
		return bUnder.getType() == Material.AIR;
	}

	// Stone To Cobblestone
	@EventHandler
	public void onBlockDamage(BlockDamageEvent e) {
		Player player = e.getPlayer();
		World world = player.getWorld();
		Block block = e.getBlock();
		if (e.getItemInHand().getType().toString().toLowerCase().contains("pickaxe")
				&& e.getBlock().getType() == Material.STONE) {

			if (Math.random() < 0.4d) {
				e.getBlock().setType(Material.COBBLESTONE);
				world.playSound(player.getLocation(), Sound.BLOCK_STONE_BREAK, 10, 1);
				gravity(block, world);
			}
		}
	}
}
