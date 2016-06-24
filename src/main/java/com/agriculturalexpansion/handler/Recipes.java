package com.agriculturalexpansion.handler;

import java.util.List;

import com.agriculturalexpansion.init.AEBlocks;
import com.agriculturalexpansion.init.AEItems;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class Recipes {
	
	public static void init() {
		initRecipes();
		initSmelting();
		initOreDictionary();
	}
	
	public static ItemStack getItem(ItemStack ingot, String oreDict) {
		List<ItemStack> list = OreDictionary.getOres(oreDict);
		if(!list.isEmpty()) {
			ingot = list.get(0);
		}
		return ingot;
	}
	
	public static void initRecipes() {
		ItemStack item = null;
		
		/**
		 * List with items TO DO!
		 * brass, zinc, chrome, iridium, titanium, tungsten, manyullyn;
		 * peridot, topaz, tanzanite, malachite, amber, apatite;
		 * vibrant alloy, dark steel, soularium;
		 * rubber;
		 */
		
		/*
		GameRegistry.addRecipe(getItem(item, "ingotCopper"), new Object[]{"XXX", "XXX", "XXX", 'X', AEItems.copper_essence});
		GameRegistry.addRecipe(getItem(item, "ingotTin"), new Object[]{"XXX", "XXX", "XXX", 'X', AEItems.tin_essence});
		GameRegistry.addRecipe(getItem(item, "ingotTest"), new Object[]{"XXX", "XXX", "XXX", 'X', AEItems.ardite_essence});
		*/
		
		//Basic Crafting
		if (ConfigurationFile.enableSproutBlockCrafting == true) {
		GameRegistry.addShapedRecipe(new ItemStack(AEBlocks.sprout_block), new Object[] {"XXX", "XXX", "XXX",'X', AEItems.resource_sprout});
		}
		if (ConfigurationFile.reusableSproutsFromBlock == true) {
		GameRegistry.addShapelessRecipe(new ItemStack(AEItems.resource_sprout, 9), new Object[] {AEBlocks.sprout_block});
		}
		
		//Vanilla Resources
		GameRegistry.addShapedRecipe(new ItemStack(Items.COAL, 2), new Object[] {" X ", "X X", " X ", 'X', AEItems.coal_essence});
		GameRegistry.addShapedRecipe(new ItemStack(Items.COAL, 4), new Object[] {"XXX", "X X", "XXX", 'X', AEItems.coal_essence});
		
		GameRegistry.addShapedRecipe(new ItemStack(Items.IRON_INGOT, 2), new Object[] {" X ", "X X", " X ", 'X', AEItems.iron_essence});
		GameRegistry.addShapedRecipe(new ItemStack(Items.IRON_INGOT, 4), new Object[] {"XXX", "X X", "XXX", 'X', AEItems.iron_essence});
		
		GameRegistry.addShapedRecipe(new ItemStack(Items.GOLD_INGOT, 2), new Object[] {" X ", "X X", " X ", 'X', AEItems.gold_essence});
		GameRegistry.addShapedRecipe(new ItemStack(Items.GOLD_INGOT, 4), new Object[] {"XXX", "X X", "XXX", 'X', AEItems.gold_essence});
		
		GameRegistry.addShapedRecipe(new ItemStack(Items.DYE, 6, 4), new Object[] {" X ", "X X", " X ", 'X', AEItems.lapis_essence});
		GameRegistry.addShapedRecipe(new ItemStack(Items.DYE, 12, 4), new Object[] {"XXX", "X X", "XXX", 'X', AEItems.lapis_essence});
		
		GameRegistry.addShapedRecipe(new ItemStack(Items.QUARTZ, 3), new Object[] {" X ", "X X", " X ", 'X', AEItems.quartz_essence});
		GameRegistry.addShapedRecipe(new ItemStack(Items.QUARTZ, 6), new Object[] {"XXX", "X X", "XXX", 'X', AEItems.quartz_essence});
		
		GameRegistry.addShapedRecipe(new ItemStack(Items.REDSTONE, 4), new Object[] {" X ", "X X", " X ", 'X', AEItems.redstone_essence});
		GameRegistry.addShapedRecipe(new ItemStack(Items.REDSTONE, 8), new Object[] {"XXX", "X X", "XXX", 'X', AEItems.redstone_essence});
	
		GameRegistry.addShapedRecipe(new ItemStack(Items.DIAMOND, 1), new Object[] {" X ", "X X", " X ", 'X', AEItems.diamond_essence});
		GameRegistry.addShapedRecipe(new ItemStack(Items.DIAMOND, 2), new Object[] {"XXX", "X X", "XXX", 'X', AEItems.diamond_essence});
	
		GameRegistry.addShapedRecipe(new ItemStack(Items.EMERALD, 1), new Object[] {" X ", "X X", " X ", 'X', AEItems.emerald_essence});
		GameRegistry.addShapedRecipe(new ItemStack(Items.EMERALD, 2), new Object[] {"XXX", "X X", "XXX", 'X', AEItems.emerald_essence});
		
		GameRegistry.addShapedRecipe(new ItemStack(Items.GLOWSTONE_DUST, 4), new Object[] {" X ", "X X", " X ", 'X', AEItems.glowstone_essence});
		GameRegistry.addShapedRecipe(new ItemStack(Items.GLOWSTONE_DUST, 8), new Object[] {"XXX", "X X", "XXX", 'X', AEItems.glowstone_essence});
		
		//Hostile Mobs
		GameRegistry.addShapedRecipe(new ItemStack(Items.ROTTEN_FLESH, 3), new Object[]{"X X", " X ", "X X", 'X', AEItems.zombie_essence});
		
		GameRegistry.addShapedRecipe(new ItemStack(Items.GUNPOWDER, 2), new Object[]{"X X", " X ", "X X", 'X', AEItems.creeper_essence});
		
		GameRegistry.addShapedRecipe(new ItemStack(Items.BONE, 2), new Object[]{"X X", " X ", "X X", 'X', AEItems.skeleton_essence});
		GameRegistry.addShapedRecipe(new ItemStack(Items.ARROW, 3), new Object[]{"   ", "XXX", "   ", 'X', AEItems.skeleton_essence});
		
		GameRegistry.addShapedRecipe(new ItemStack(Items.SLIME_BALL, 2), new Object[]{"X X", " X ", "X X", 'X', AEItems.slime_essence});
		
		GameRegistry.addShapedRecipe(new ItemStack(Items.SPIDER_EYE, 2), new Object[]{"X X", " X ", "X X", 'X', AEItems.spider_essence});
		GameRegistry.addShapedRecipe(new ItemStack(Items.STRING, 3), new Object[]{" X ", "X X", " X ", 'X', AEItems.spider_essence});
		
		GameRegistry.addShapedRecipe(new ItemStack(Items.PRISMARINE_SHARD, 3), new Object[]{"X X", " X ", "X X", 'X', AEItems.guardian_essence});
		GameRegistry.addShapedRecipe(new ItemStack(Items.PRISMARINE_CRYSTALS, 3), new Object[]{" X ", "X X", " X ", 'X', AEItems.guardian_essence});
		GameRegistry.addShapedRecipe(new ItemStack(Items.FISH, 2), new Object[]{"   ", "XXX", "   ", 'X', AEItems.guardian_essence});
		
		GameRegistry.addShapedRecipe(new ItemStack(Items.GHAST_TEAR, 1), new Object[]{"X X", " X ", "X X", 'X', AEItems.ghast_essence});
		GameRegistry.addShapedRecipe(new ItemStack(Items.GUNPOWDER, 4), new Object[]{" X ", "X X", " X ", 'X', AEItems.ghast_essence});
		
		GameRegistry.addShapedRecipe(new ItemStack(Items.SKULL, 1, 1), new Object[]{"XXX", "XXX", "XXX", 'X', AEItems.wither_essence});
		
		GameRegistry.addShapedRecipe(new ItemStack(Items.BLAZE_ROD, 1), new Object[]{"X X", " X ", "X X", 'X', AEItems.blaze_essence});
		GameRegistry.addShapedRecipe(new ItemStack(Items.BLAZE_POWDER, 2), new Object[]{" X ", "X X", " X ", 'X', AEItems.blaze_essence});
		
		GameRegistry.addShapedRecipe(new ItemStack(Items.ENDER_PEARL, 1), new Object[]{"X X", " X ", "X X", 'X', AEItems.enderman_essence});
		
		//Passive Mobs
		GameRegistry.addShapedRecipe(new ItemStack(Items.DYE, 3, 0), new Object[]{"X X", " X ", "X X", 'X', AEItems.squid_essence});
		GameRegistry.addShapedRecipe(new ItemStack(Items.LEATHER, 2), new Object[]{" X ", "X X", " X ", 'X', AEItems.cow_essence});
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.WOOL, 2), new Object[]{" X ", "X X", " X ", 'X', AEItems.sheep_essence});
		GameRegistry.addShapedRecipe(new ItemStack(Items.FEATHER, 2), new Object[]{" X ", "X X", " X ", 'X', AEItems.chicken_essence});
		GameRegistry.addShapedRecipe(new ItemStack(Items.PORKCHOP, 2), new Object[]{" X ", "X X", " X ", 'X', AEItems.pig_essence});
		GameRegistry.addShapedRecipe(new ItemStack(Items.RABBIT_HIDE, 2), new Object[]{" X ", "X X", " X ", 'X', AEItems.rabbit_essence});
		GameRegistry.addShapedRecipe(new ItemStack(Items.RABBIT_FOOT, 1), new Object[]{"XXX", "XXX", "XXX", 'X', AEItems.rabbit_essence});
		
		//Other
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.DIRT, 2), new Object[]{" X ", "XXX", " X ", 'X', AEItems.earth_essence});
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.SAND, 2), new Object[]{" X ", "X X", " X ", 'X', AEItems.earth_essence});
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.GRAVEL, 2), new Object[]{"X X", " X ", "X X", 'X', AEItems.earth_essence});
		GameRegistry.addShapedRecipe(new ItemStack(Items.WATER_BUCKET), new Object[]{"XXX", "XYX", "XXX", 'X', AEItems.water_essence, 'Y', Items.BUCKET});
		GameRegistry.addShapedRecipe(new ItemStack(Items.LAVA_BUCKET), new Object[]{"XXX", "XYX", "XXX", 'X', AEItems.fire_essence, 'Y', Items.BUCKET});
		GameRegistry.addShapedRecipe(new ItemStack(Items.EXPERIENCE_BOTTLE, 4), new Object[]{" X ", "XXX", " X ", 'X', AEItems.experience_essence});
		GameRegistry.addShapelessRecipe(new ItemStack(Items.DYE, 2, 1), new Object[]{AEItems.dye_essence, new ItemStack(Items.DYE, 1, 1)});
		GameRegistry.addShapelessRecipe(new ItemStack(Items.DYE, 2, 2), new Object[]{AEItems.dye_essence, new ItemStack(Items.DYE, 1, 2)});
		GameRegistry.addShapelessRecipe(new ItemStack(Items.DYE, 2, 5), new Object[]{AEItems.dye_essence, new ItemStack(Items.DYE, 1, 5)});
		GameRegistry.addShapelessRecipe(new ItemStack(Items.DYE, 2, 6), new Object[]{AEItems.dye_essence, new ItemStack(Items.DYE, 1, 6)});
		GameRegistry.addShapelessRecipe(new ItemStack(Items.DYE, 2, 7), new Object[]{AEItems.dye_essence, new ItemStack(Items.DYE, 1, 7)});
		GameRegistry.addShapelessRecipe(new ItemStack(Items.DYE, 2, 8), new Object[]{AEItems.dye_essence, new ItemStack(Items.DYE, 1, 8)});
		GameRegistry.addShapelessRecipe(new ItemStack(Items.DYE, 2, 11), new Object[]{AEItems.dye_essence, new ItemStack(Items.DYE, 1, 11)});
		GameRegistry.addShapelessRecipe(new ItemStack(Items.DYE, 2, 13), new Object[]{AEItems.dye_essence, new ItemStack(Items.DYE, 1, 13)});
		GameRegistry.addShapelessRecipe(new ItemStack(Items.DYE, 2, 14), new Object[]{AEItems.dye_essence, new ItemStack(Items.DYE, 1, 14)});
		
		//OreDicionary
		//Basic
		if(getItem(item, "ingotCopper") != null) {
			GameRegistry.addRecipe(getItem(item, "ingotCopper"), new Object[]{" X ", "X X", " X ", 'X', AEItems.copper_essence});
		}
		if(getItem(item, "ingotTin") != null) {
			GameRegistry.addRecipe(getItem(item, "ingotTin"), new Object[]{" X ", "X X", " X ", 'X', AEItems.tin_essence});
		}
		if(getItem(item, "ingotSilver") != null) {
			GameRegistry.addRecipe(getItem(item, "ingotSilver"), new Object[]{" X ", "X X", " X ", 'X', AEItems.silver_essence});
		}
		if(getItem(item, "ingotLead") != null) {
			GameRegistry.addRecipe(getItem(item, "ingotLead"), new Object[]{" X ", "X X", " X ", 'X', AEItems.lead_essence});
		}
		if(getItem(item, "ingotNickel") != null) {
			GameRegistry.addRecipe(getItem(item, "ingotNickel"), new Object[]{" X ", "X X", " X ", 'X', AEItems.nickel_essence});
		}
		if(getItem(item, "ingotPlatinum") != null) {
			GameRegistry.addRecipe(getItem(item, "ingotPlatinum"), new Object[]{" X ", "X X", " X ", 'X', AEItems.platinum_essence});
		}
    	if(getItem(item, "ingotAluminum") != null) {
    		GameRegistry.addRecipe(getItem(item, "ingotAluminum"), new Object[]{" X ", "X X", " X ", 'X', AEItems.aluminum_essence});
    	}
		
		//TiCon
    	if(getItem(item, "ingotArdite") != null) {
    		GameRegistry.addRecipe(getItem(item, "ingotArdite"), new Object[]{" X ", "X X", " X ", 'X', AEItems.ardite_essence});
    	}
		if(getItem(item, "ingotCobalt") != null) {
			GameRegistry.addRecipe(getItem(item, "ingotCobalt"), new Object[]{" X ", "X X", " X ", 'X', AEItems.cobalt_essence});
		}
		if(getItem(item, "ingotAlubrass") != null) {
			GameRegistry.addRecipe(getItem(item, "ingotAlubrass"), new Object[]{" X ", "X X", " X ", 'X', AEItems.alubrass_essence});
		}
		
		//Alloy
		if(getItem(item, "ingotBronze") != null) {
			GameRegistry.addRecipe(getItem(item, "ingotBronze"), new Object[]{" X ", "X X", " X ", 'X', AEItems.bronze_essence});
		}
		if(getItem(item, "ingotSteel") != null) {
			GameRegistry.addRecipe(getItem(item, "ingotSteel"), new Object[]{" X ", "X X", " X ", 'X', AEItems.steel_essence});
		}
		if(getItem(item, "ingotInvar") != null) {
			GameRegistry.addRecipe(getItem(item, "ingotInvar"), new Object[]{" X ", "X X", " X ", 'X', AEItems.invar_essence});
		}
		if(getItem(item, "ingotElectrum") != null) {
			GameRegistry.addRecipe(getItem(item, "ingotElectrum"), new Object[]{" X ", "X X", " X ", 'X', AEItems.electrum_essence});
		}
		
		//Gem
		if(getItem(item, "gemRuby") != null) {
			GameRegistry.addRecipe(getItem(item, "gemRuby"), new Object[]{" X ", "X X", " X ", 'X', AEItems.ruby_essence});	
		}
		if(getItem(item, "gemSapphire") != null) {
			GameRegistry.addRecipe(getItem(item, "gemSapphire"), new Object[]{" X ", "X X", " X ", 'X', AEItems.sapphire_essence});
		}
		
		//Uses for mob chunks
		GameRegistry.addShapedRecipe(new ItemStack(Items.GUNPOWDER, 1), new Object[]{"   ", "XXX", "   ", 'X', AEItems.creeper_chunk});
		GameRegistry.addShapedRecipe(new ItemStack(Items.BONE, 1), new Object[]{"   ", "XXX", "   ", 'X', AEItems.skeleton_chunk});
		GameRegistry.addShapedRecipe(new ItemStack(Items.SLIME_BALL, 1), new Object[]{"   ", "XXX", "   ", 'X', AEItems.slime_chunk});
		
		//Seed Crafting
		//Vanilla Resources
		GameRegistry.addShapelessRecipe(new ItemStack(AEItems.resource_seed), new Object[] {new ItemStack(Items.DYE, 1, 15), Items.WHEAT_SEEDS, Items.WATER_BUCKET, Items.APPLE});
		
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.coal_sprout), new Object[] {" X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', Items.COAL});
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.iron_sprout), new Object[] {" X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', Items.IRON_INGOT});
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.gold_sprout), new Object[] {" X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', Items.GOLD_INGOT});
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.lapis_sprout), new Object[] {" X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', (new ItemStack(Items.DYE, 1, 4))});
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.quartz_sprout), new Object[] {" X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', Items.QUARTZ});
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.redstone_sprout), new Object[] {" X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', Items.REDSTONE});
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.diamond_sprout), new Object[] {" X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', Items.DIAMOND});
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.emerald_sprout), new Object[] {" X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', Items.EMERALD});
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.glowstone_sprout), new Object[] {" X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', Items.GLOWSTONE_DUST});
		
		//Hostile Mobs
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.zombie_sprout), new Object[] {" X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', AEItems.zombie_chunk});
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.creeper_sprout), new Object[] {" X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', AEItems.creeper_chunk});
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.skeleton_sprout), new Object[] {" X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', AEItems.skeleton_chunk});
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.slime_sprout), new Object[] {" X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', AEItems.slime_chunk});
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.spider_sprout), new Object[] {" X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', AEItems.spider_chunk});
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.guardian_sprout), new Object[] {" X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', AEItems.guardian_chunk});
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.ghast_sprout), new Object[] {" X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', AEItems.ghast_chunk});
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.wither_sprout), new Object[] {" X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', AEItems.wither_chunk});
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.blaze_sprout), new Object[] {" X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', AEItems.blaze_chunk});
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.enderman_sprout), new Object[] {" X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', AEItems.enderman_chunk});
		
		//Passive Mobs
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.squid_sprout), new Object[] {" X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', AEItems.squid_chunk});
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.cow_sprout), new Object[] {" X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', AEItems.cow_chunk});
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.sheep_sprout), new Object[] {" X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', AEItems.sheep_chunk});
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.chicken_sprout), new Object[] {" X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', AEItems.chicken_chunk});
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.pig_sprout), new Object[] {" X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', AEItems.pig_chunk});
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.rabbit_sprout), new Object[] {" X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', AEItems.rabbit_chunk});
		
		//Other
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.earth_sprout), new Object[] {" X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', Blocks.GRASS});
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.water_sprout), new Object[] {" X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', Items.WATER_BUCKET});
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.fire_sprout), new Object[] {" X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', Items.LAVA_BUCKET});
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.experience_sprout), new Object[] {" X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', Items.EXPERIENCE_BOTTLE});
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.dye_sprout), new Object[] {" X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', new ItemStack(Items.DYE, 1, 1)});
		
		//OreDictionary 
		//Basic
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(AEItems.copper_sprout), new Object[] {" X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', "ingotCopper"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(AEItems.tin_sprout), new Object[] {" X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', "ingotTin"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(AEItems.silver_sprout), new Object[] {" X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', "ingotSilver"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(AEItems.lead_sprout), new Object[] {" X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', "ingotLead"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(AEItems.nickel_sprout), new Object[] {" X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', "ingotNickel"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(AEItems.platinum_sprout), new Object[] {" X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', "ingotPlatinum"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(AEItems.aluminum_sprout), new Object[] {" X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', "ingotAluminum"}));
		
		//TiCon
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(AEItems.ardite_sprout), new Object[] {" X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', "ingotArdite"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(AEItems.cobalt_sprout), new Object[] {" X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', "ingotCobalt"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(AEItems.alubrass_sprout), new Object[] {" X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', "ingotAlubrass"}));
		
		//Alloy
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(AEItems.bronze_sprout), new Object[] {" X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', "ingotBronze"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(AEItems.steel_sprout), new Object[] {" X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', "ingotSteel"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(AEItems.invar_sprout), new Object[] {" X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', "ingotInvar"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(AEItems.electrum_sprout), new Object[] {" X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', "ingotElectrum"}));
		
		//Gems
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(AEItems.ruby_sprout), new Object[] {" X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', "gemRuby"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(AEItems.sapphire_sprout), new Object[] {" X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', "gemSapphire"}));
	}
	
	public static void initSmelting() {
		
		GameRegistry.addSmelting(AEItems.zombie_chunk, new ItemStack(AEItems.cooked_mob_chunk, 1), 10.0F);
		GameRegistry.addSmelting(AEItems.spider_chunk, new ItemStack(AEItems.cooked_mob_chunk, 1), 10.0F);
		GameRegistry.addSmelting(AEItems.guardian_chunk, new ItemStack(AEItems.cooked_mob_chunk, 1), 10.0F);
		
		GameRegistry.addSmelting(AEItems.squid_chunk, new ItemStack(AEItems.cooked_mob_chunk, 1), 10.0F);
		GameRegistry.addSmelting(AEItems.cow_chunk, new ItemStack(Items.COOKED_BEEF, 1), 10.0F);
		GameRegistry.addSmelting(AEItems.sheep_chunk, new ItemStack(Items.COOKED_MUTTON, 1), 10.0F);
		GameRegistry.addSmelting(AEItems.chicken_chunk, new ItemStack(Items.COOKED_CHICKEN, 1), 10.0F);
		GameRegistry.addSmelting(AEItems.pig_chunk, new ItemStack(Items.COOKED_PORKCHOP, 1), 10.0F);
		GameRegistry.addSmelting(AEItems.rabbit_chunk, new ItemStack(Items.COOKED_RABBIT, 1), 10.0F);
		
	}
	
	public static void initOreDictionary() {
		
		OreDictionary.registerOre("seed", new ItemStack(AEItems.resource_seed));
		
	}
	
	/** Ore Dictionary Recipes Examples
	//Output OreDictionary Recipe
	ItemStack copper = null;
	
	List<ItemStack> ingots = OreDictionary.getOres("ingotCopper");
	if(!ingots.isEmpty()) {
		copper = ingots.get(0);
	}
	
	if(copper != null) {
		copper = copper.copy();
		copper.stackSize = 1;
		GameRegistry.addRecipe(copper, new Object[]{"XXX", "XXX", "XXX", 'X', AEItems.iron_essence});
	}
	
	// Input OreDictionary Recipe
	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(AEBlocks.sprout_block), new Object[]{"XXX", "XXX", "XXX", 'X', "ingotInvar"}));
	*/

}