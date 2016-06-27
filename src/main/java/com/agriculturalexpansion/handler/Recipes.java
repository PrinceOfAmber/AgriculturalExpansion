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
	
	public static ItemStack getItem(String oreDict, boolean stack, int stackSize) {
		ItemStack item = null;
		List<ItemStack> list = OreDictionary.getOres(oreDict);
		if(!list.isEmpty()) {
			item = list.get(0);
			if(stack == true) {
				item.stackSize = stackSize;
			}
		}
		return item;
	}
	
	public static void initRecipes() {
		
		/**
		 * List with items TO DO!
		 * brass, zinc, chrome, titanium, tungsten, manyullyn;
		 * peridot, topaz, tanzanite, malachite, amber;
		 * apatite, rubber;
		 */
		
		//Basic Crafting
		if (ConfigurationFile.enableSproutBlockCrafting == true) {
		GameRegistry.addShapedRecipe(new ItemStack(AEBlocks.sprout_block), "XXX", "XXX", "XXX",'X', AEItems.resource_sprout);
		}
		if (ConfigurationFile.reusableSproutsFromBlock == true) {
		GameRegistry.addShapelessRecipe(new ItemStack(AEItems.resource_sprout, 9), AEBlocks.sprout_block);
		}
		
		//Vanilla Resources
		GameRegistry.addShapedRecipe(new ItemStack(Items.COAL, 2), " X ", "X X", " X ", 'X', AEItems.coal_essence);
		GameRegistry.addShapedRecipe(new ItemStack(Items.COAL, 4), "XXX", "X X", "XXX", 'X', AEItems.coal_essence);
		
		GameRegistry.addShapedRecipe(new ItemStack(Items.IRON_INGOT, 2), " X ", "X X", " X ", 'X', AEItems.iron_essence);
		GameRegistry.addShapedRecipe(new ItemStack(Items.IRON_INGOT, 4), "XXX", "X X", "XXX", 'X', AEItems.iron_essence);
		
		GameRegistry.addShapedRecipe(new ItemStack(Items.GOLD_INGOT, 2), " X ", "X X", " X ", 'X', AEItems.gold_essence);
		GameRegistry.addShapedRecipe(new ItemStack(Items.GOLD_INGOT, 4), "XXX", "X X", "XXX", 'X', AEItems.gold_essence);
		
		GameRegistry.addShapedRecipe(new ItemStack(Items.DYE, 6, 4), " X ", "X X", " X ", 'X', AEItems.lapis_essence);
		GameRegistry.addShapedRecipe(new ItemStack(Items.DYE, 12, 4), "XXX", "X X", "XXX", 'X', AEItems.lapis_essence);
		
		GameRegistry.addShapedRecipe(new ItemStack(Items.QUARTZ, 3), " X ", "X X", " X ", 'X', AEItems.quartz_essence);
		GameRegistry.addShapedRecipe(new ItemStack(Items.QUARTZ, 6), "XXX", "X X", "XXX", 'X', AEItems.quartz_essence);
		
		GameRegistry.addShapedRecipe(new ItemStack(Items.REDSTONE, 4), " X ", "X X", " X ", 'X', AEItems.redstone_essence);
		GameRegistry.addShapedRecipe(new ItemStack(Items.REDSTONE, 8), "XXX", "X X", "XXX", 'X', AEItems.redstone_essence);
	
		GameRegistry.addShapedRecipe(new ItemStack(Items.DIAMOND, 1), " X ", "X X", " X ", 'X', AEItems.diamond_essence);
		GameRegistry.addShapedRecipe(new ItemStack(Items.DIAMOND, 2), "XXX", "X X", "XXX", 'X', AEItems.diamond_essence);
	
		GameRegistry.addShapedRecipe(new ItemStack(Items.EMERALD, 1), " X ", "X X", " X ", 'X', AEItems.emerald_essence);
		GameRegistry.addShapedRecipe(new ItemStack(Items.EMERALD, 2), "XXX", "X X", "XXX", 'X', AEItems.emerald_essence);
		
		GameRegistry.addShapedRecipe(new ItemStack(Items.GLOWSTONE_DUST, 4), " X ", "X X", " X ", 'X', AEItems.glowstone_essence);
		GameRegistry.addShapedRecipe(new ItemStack(Items.GLOWSTONE_DUST, 8), "XXX", "X X", "XXX", 'X', AEItems.glowstone_essence);
		
		//Hostile Mobs
		GameRegistry.addShapedRecipe(new ItemStack(Items.ROTTEN_FLESH, 3), "X X", " X ", "X X", 'X', AEItems.zombie_essence);
		
		GameRegistry.addShapedRecipe(new ItemStack(Items.GUNPOWDER, 2), "X X", " X ", "X X", 'X', AEItems.creeper_essence);
		
		GameRegistry.addShapedRecipe(new ItemStack(Items.BONE, 2), "X X", " X ", "X X", 'X', AEItems.skeleton_essence);
		GameRegistry.addShapedRecipe(new ItemStack(Items.ARROW, 3), "   ", "XXX", "   ", 'X', AEItems.skeleton_essence);
		
		GameRegistry.addShapedRecipe(new ItemStack(Items.SLIME_BALL, 2), "X X", " X ", "X X", 'X', AEItems.slime_essence);
		
		GameRegistry.addShapedRecipe(new ItemStack(Items.SPIDER_EYE, 2), "X X", " X ", "X X", 'X', AEItems.spider_essence);
		GameRegistry.addShapedRecipe(new ItemStack(Items.STRING, 3), " X ", "X X", " X ", 'X', AEItems.spider_essence);
		
		GameRegistry.addShapedRecipe(new ItemStack(Items.PRISMARINE_SHARD, 3), "X X", " X ", "X X", 'X', AEItems.guardian_essence);
		GameRegistry.addShapedRecipe(new ItemStack(Items.PRISMARINE_CRYSTALS, 3), " X ", "X X", " X ", 'X', AEItems.guardian_essence);
		GameRegistry.addShapedRecipe(new ItemStack(Items.FISH, 2), "   ", "XXX", "   ", 'X', AEItems.guardian_essence);
		
		GameRegistry.addShapedRecipe(new ItemStack(Items.GHAST_TEAR, 1), "X X", " X ", "X X", 'X', AEItems.ghast_essence);
		GameRegistry.addShapedRecipe(new ItemStack(Items.GUNPOWDER, 4), " X ", "X X", " X ", 'X', AEItems.ghast_essence);
		
		GameRegistry.addShapedRecipe(new ItemStack(Items.SKULL, 1, 1), "XXX", "XXX", "XXX", 'X', AEItems.wither_essence);
		
		GameRegistry.addShapedRecipe(new ItemStack(Items.BLAZE_ROD, 1), "X X", " X ", "X X", 'X', AEItems.blaze_essence);
		GameRegistry.addShapedRecipe(new ItemStack(Items.BLAZE_POWDER, 2), " X ", "X X", " X ", 'X', AEItems.blaze_essence);
		
		GameRegistry.addShapedRecipe(new ItemStack(Items.ENDER_PEARL, 1), "X X", " X ", "X X", 'X', AEItems.enderman_essence);
		
		//Passive Mobs
		GameRegistry.addShapedRecipe(new ItemStack(Items.DYE, 3, 0), "X X", " X ", "X X", 'X', AEItems.squid_essence);
		GameRegistry.addShapedRecipe(new ItemStack(Items.LEATHER, 2), " X ", "X X", " X ", 'X', AEItems.cow_essence);
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.WOOL, 2), " X ", "X X", " X ", 'X', AEItems.sheep_essence);
		GameRegistry.addShapedRecipe(new ItemStack(Items.FEATHER, 2), " X ", "X X", " X ", 'X', AEItems.chicken_essence);
		GameRegistry.addShapedRecipe(new ItemStack(Items.PORKCHOP, 2), " X ", "X X", " X ", 'X', AEItems.pig_essence);
		GameRegistry.addShapedRecipe(new ItemStack(Items.RABBIT_HIDE, 2), " X ", "X X", " X ", 'X', AEItems.rabbit_essence);
		GameRegistry.addShapedRecipe(new ItemStack(Items.RABBIT_FOOT, 1), "XXX", "XXX", "XXX", 'X', AEItems.rabbit_essence);
		
		//Other
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.DIRT, 2), " X ", "XXX", " X ", 'X', AEItems.earth_essence);
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.SAND, 2), " X ", "X X", " X ", 'X', AEItems.earth_essence);
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.GRAVEL, 2), "X X", " X ", "X X", 'X', AEItems.earth_essence);
		GameRegistry.addShapedRecipe(new ItemStack(Items.WATER_BUCKET), "XXX", "XYX", "XXX", 'X', AEItems.water_essence, 'Y', Items.BUCKET);
		GameRegistry.addShapedRecipe(new ItemStack(Items.LAVA_BUCKET), "XXX", "XYX", "XXX", 'X', AEItems.fire_essence, 'Y', Items.BUCKET);
		GameRegistry.addShapedRecipe(new ItemStack(Items.EXPERIENCE_BOTTLE, 4), " X ", "XXX", " X ", 'X', AEItems.experience_essence);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.DYE, 2, 1), AEItems.dye_essence, new ItemStack(Items.DYE, 1, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.DYE, 2, 2), AEItems.dye_essence, new ItemStack(Items.DYE, 1, 2));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.DYE, 2, 5), AEItems.dye_essence, new ItemStack(Items.DYE, 1, 5));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.DYE, 2, 6), AEItems.dye_essence, new ItemStack(Items.DYE, 1, 6));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.DYE, 2, 7), AEItems.dye_essence, new ItemStack(Items.DYE, 1, 7));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.DYE, 2, 8), AEItems.dye_essence, new ItemStack(Items.DYE, 1, 8));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.DYE, 2, 11), AEItems.dye_essence, new ItemStack(Items.DYE, 1, 11));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.DYE, 2, 13), AEItems.dye_essence, new ItemStack(Items.DYE, 1, 13));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.DYE, 2, 14), AEItems.dye_essence, new ItemStack(Items.DYE, 1, 14));
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.LEAVES, 2), " X ", "XXX", " X ", 'X', AEItems.nature_essence);
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.NETHERRACK, 2), " X ", "XXX", " X ", 'X', AEItems.nether_essence);
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.SOUL_SAND, 2), "XXX", "XXX", "XXX", 'X', AEItems.nether_essence);
		
		//OreDicionary
		//Basic
		if(getItem("ingotCopper", false, 0) != null) {
			GameRegistry.addRecipe(getItem("ingotCopper", true, 2), " X ", "X X", " X ", 'X', AEItems.copper_essence);
		}
		if(getItem("ingotTin", false, 0) != null) {
			GameRegistry.addRecipe(getItem("ingotTin", true, 2), " X ", "X X", " X ", 'X', AEItems.tin_essence);
		}
		if(getItem("ingotSilver", false, 0) != null) {
			GameRegistry.addRecipe(getItem("ingotSilver", true, 2), " X ", "X X", " X ", 'X', AEItems.silver_essence);
		}
		if(getItem("ingotLead", false, 0) != null) {
			GameRegistry.addRecipe(getItem("ingotLead", true, 2), " X ", "X X", " X ", 'X', AEItems.lead_essence);
		}
		if(getItem("ingotNickel", false, 0) != null) {
			GameRegistry.addRecipe(getItem("ingotNickel", true, 1), " X ", "X X", " X ", 'X', AEItems.nickel_essence);
		}
		if(getItem("ingotPlatinum", false, 0) != null) {
			GameRegistry.addRecipe(getItem("ingotPlatinum", true, 1), " X ", "X X", " X ", 'X', AEItems.platinum_essence);
		}
    	if(getItem("ingotAluminum", false, 0) != null) {
    		GameRegistry.addRecipe(getItem("ingotAluminum", true, 1), " X ", "X X", " X ", 'X', AEItems.aluminum_essence);
    	}
    	if(getItem("ingotIridium", false, 0) != null) {
    		GameRegistry.addRecipe(getItem("ingotIridium", true, 1), " X ", "X X", " X ", 'X', AEItems.iridium_essence);
    	}
    	if(getItem("ingotTitanium", false, 0) != null) {
    		GameRegistry.addRecipe(getItem("ingotTitanium", true, 1), " X ", "X X", " X ", 'X', AEItems.titanium_essence);
    	}
    	if(getItem("ingotTungsten", false, 0) != null) {
    		GameRegistry.addRecipe(getItem("ingotTungsten", true, 2), " X ", "X X", " X ", 'X', AEItems.tungsten_essence);
    	}
    	if(getItem("ingotZinc", false, 0) != null) {
    		GameRegistry.addRecipe(getItem("ingotZinc", true, 2), " X ", "X X", " X ", 'X', AEItems.zinc_essence);
    	}
		
		//TiCon
    	if(getItem("ingotArdite", false, 0) != null) {
    		GameRegistry.addRecipe(getItem("ingotArdite", true, 1), " X ", "X X", " X ", 'X', AEItems.ardite_essence);
    	}
		if(getItem("ingotCobalt", false, 0) != null) {
			GameRegistry.addRecipe(getItem("ingotCobalt", true, 1), " X ", "X X", " X ", 'X', AEItems.cobalt_essence);
		}
		if(getItem("ingotAlubrass", false, 0) != null) {
			GameRegistry.addRecipe(getItem("ingotAlubrass", true, 2), " X ", "X X", " X ", 'X', AEItems.alubrass_essence);
		}
		if(getItem("ingotManyullyn", false, 0) != null) {
			GameRegistry.addRecipe(getItem("ingotManyullyn", true, 1), " X ", "X X", " X ", 'X', AEItems.manyullyn_essence);
		}
		
		//Alloy
		if(getItem("ingotBronze", false, 0) != null) {
			GameRegistry.addRecipe(getItem("ingotBronze", true, 2), " X ", "X X", " X ", 'X', AEItems.bronze_essence);
		}
		if(getItem("ingotSteel", false, 0) != null) {
			GameRegistry.addRecipe(getItem("ingotSteel", true, 1), " X ", "X X", " X ", 'X', AEItems.steel_essence);
		}
		if(getItem("ingotInvar", false, 0) != null) {
			GameRegistry.addRecipe(getItem("ingotInvar", true, 1), " X ", "X X", " X ", 'X', AEItems.invar_essence);
		}
		if(getItem("ingotElectrum", false, 0) != null) {
			GameRegistry.addRecipe(getItem("ingotElectrum", true, 1), " X ", "X X", " X ", 'X', AEItems.electrum_essence);
		}
		if(getItem("ingotBrass", false, 0) != null) {
			GameRegistry.addRecipe(getItem("ingotBrass", true, 2), " X ", "X X", " X ", 'X', AEItems.brass_essence);
		}
		
		//Gem
		if(getItem("gemRuby", false, 0) != null) {
			GameRegistry.addRecipe(getItem("gemRuby", true, 1), " X ", "X X", " X ", 'X', AEItems.ruby_essence);	
		}
		if(getItem("gemSapphire", false, 0) != null) {
			GameRegistry.addRecipe(getItem("gemSapphire", true, 1), " X ", "X X", " X ", 'X', AEItems.sapphire_essence);
		}
		if(getItem("gemAmber", false, 0) != null) {
			GameRegistry.addRecipe(getItem("gemAmber", true, 1), " X ", "X X", " X ", 'X', AEItems.amber_essence);
		}
		if(getItem("gemMalachite", false, 0) != null) {
			GameRegistry.addRecipe(getItem("gemMalachite", true, 1), " X ", "X X", " X ", 'X', AEItems.malachite_essence);
		}
		if(getItem("gemPeridot", false, 0) != null) {
			GameRegistry.addRecipe(getItem("gemPeridot", true, 1), " X ", "X X", " X ", 'X', AEItems.peridot_essence);
		}
		if(getItem("gemTanzanite", false, 0) != null) {
			GameRegistry.addRecipe(getItem("gemTanzanite", true, 1), " X ", "X X", " X ", 'X', AEItems.tanzanite_essence);
		}
		if(getItem("gemTopaz", false, 0) != null) {
			GameRegistry.addRecipe(getItem("gemTopaz", true, 1), " X ", "X X", " X ", 'X', AEItems.topaz_essence);
		}
		
		//Other
		if(getItem("gemApatite", false, 0) != null) {
			GameRegistry.addRecipe(getItem("gemApatite", true, 8), " X ", "X X", " X ", 'X', AEItems.apatite_essence);
		}
		if(getItem("materialRubber", false, 0) != null) {
			GameRegistry.addRecipe(getItem("materialRubber", true, 2), " X ", "X X", " X ", 'X', AEItems.rubber_essence);
		}
		
		//Uses for mob chunks
		GameRegistry.addShapedRecipe(new ItemStack(Items.GUNPOWDER, 1), "   ", "XXX", "   ", 'X', AEItems.creeper_chunk);
		GameRegistry.addShapedRecipe(new ItemStack(Items.BONE, 1), "   ", "XXX", "   ", 'X', AEItems.skeleton_chunk);
		GameRegistry.addShapedRecipe(new ItemStack(Items.SLIME_BALL, 1), "   ", "XXX", "   ", 'X', AEItems.slime_chunk);
		
		//Seed Crafting
		//Vanilla Resources
		GameRegistry.addShapelessRecipe(new ItemStack(AEItems.resource_seed), new ItemStack(Items.DYE, 1, 15), Items.WHEAT_SEEDS, Items.WATER_BUCKET, Items.APPLE);
		
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.coal_sprout), " X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', Items.COAL);
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.iron_sprout), " X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', Items.IRON_INGOT);
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.gold_sprout), " X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', Items.GOLD_INGOT);
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.lapis_sprout), " X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', (new ItemStack(Items.DYE, 1, 4)));
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.quartz_sprout), " X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', Items.QUARTZ);
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.redstone_sprout), " X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', Items.REDSTONE);
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.diamond_sprout), " X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', Items.DIAMOND);
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.emerald_sprout), " X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', Items.EMERALD);
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.glowstone_sprout), " X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', Items.GLOWSTONE_DUST);
		
		//Hostile Mobs
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.zombie_sprout), " X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', AEItems.zombie_chunk);
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.creeper_sprout), " X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', AEItems.creeper_chunk);
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.skeleton_sprout), " X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', AEItems.skeleton_chunk);
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.slime_sprout), " X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', AEItems.slime_chunk);
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.spider_sprout), " X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', AEItems.spider_chunk);
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.guardian_sprout), " X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', AEItems.guardian_chunk);
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.ghast_sprout), " X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', AEItems.ghast_chunk);
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.wither_sprout), " X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', AEItems.wither_chunk);
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.blaze_sprout), " X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', AEItems.blaze_chunk);
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.enderman_sprout), " X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', AEItems.enderman_chunk);
		
		//Passive Mobs
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.squid_sprout), " X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', AEItems.squid_chunk);
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.cow_sprout), " X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', AEItems.cow_chunk);
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.sheep_sprout), " X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', AEItems.sheep_chunk);
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.chicken_sprout), " X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', AEItems.chicken_chunk);
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.pig_sprout), " X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', AEItems.pig_chunk);
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.rabbit_sprout), " X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', AEItems.rabbit_chunk);
		
		//Other
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.earth_sprout), " X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', Blocks.GRASS);
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.water_sprout), " X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', Items.WATER_BUCKET);
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.fire_sprout), " X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', Items.LAVA_BUCKET);
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.experience_sprout), " X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', Items.EXPERIENCE_BOTTLE);
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.dye_sprout), " X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', new ItemStack(Items.DYE, 1, 1));
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.nature_sprout), " X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', Blocks.LEAVES);
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.nether_sprout), " X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', Items.MAGMA_CREAM);
		
		String[] item = {"ingotCopper", "ingotTin", "ingotSilver", "ingotLead", "ingotNickel", "ingotPlatinum", "ingotAluminum", "ingotIridium", "ingotTitanium", "ingotTungsten", "ingotZinc",
				"ingotArdite", "ingotCobalt", "ingotAlubrass", "ingotManyullyn",
				"ingotBronze", "ingotSteel", "ingotInvar", "ingotElectrum", "ingotBrass",
				"gemRuby", "gemSapphire", "gemAmber", "gemMalachite", "gemPeridot", "gemTanzanite", "gemTopaz",
				"gemApatite", "materialRubber"};
		//OreDictionary 
		//Basic
		//for(int i = 0; i < item.length; i++) {
			//getItem(item[i], true, 1);
		//}
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(AEItems.copper_sprout), " X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', "ingotCopper"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(AEItems.tin_sprout), " X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', "ingotTin"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(AEItems.silver_sprout), " X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', "ingotSilver"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(AEItems.lead_sprout), " X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', "ingotLead"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(AEItems.nickel_sprout), " X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', "ingotNickel"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(AEItems.platinum_sprout), " X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', "ingotPlatinum"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(AEItems.aluminum_sprout), " X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', "ingotAluminum"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(AEItems.iridium_sprout), " X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', "ingotIridium"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(AEItems.titanium_sprout), " X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', "ingotTitanium"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(AEItems.tungsten_sprout), " X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', "ingotTungsten"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(AEItems.zinc_sprout), " X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', "ingotZinc"));
		
		//TiCon
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(AEItems.ardite_sprout), " X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', "ingotArdite"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(AEItems.cobalt_sprout), " X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', "ingotCobalt"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(AEItems.alubrass_sprout), " X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', "ingotAlubrass"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(AEItems.manyullyn_sprout), " X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', "ingotManyullyn"));
		
		//Alloy
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(AEItems.bronze_sprout), " X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', "ingotBronze"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(AEItems.steel_sprout), " X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', "ingotSteel"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(AEItems.invar_sprout), " X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', "ingotInvar"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(AEItems.electrum_sprout), " X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', "ingotElectrum"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(AEItems.brass_sprout), " X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', "ingotBrass"));
		
		//Gems
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(AEItems.ruby_sprout), " X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', "gemRuby"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(AEItems.sapphire_sprout), " X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', "gemSapphire"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(AEItems.amber_sprout), " X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', "gemAmber"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(AEItems.malachite_sprout), " X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', "gemMalachite"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(AEItems.peridot_sprout), " X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', "gemPeridot"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(AEItems.tanzanite_sprout), " X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', "gemTanzanite"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(AEItems.topaz_sprout), " X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', "gemTopaz"));
		
		//Other
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(AEItems.apatite_sprout), " X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', "gemApatite"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(AEItems.rubber_sprout), " X ", "XYX", " X ", 'X', AEItems.resource_sprout, 'Y', "materialRubber"));
		
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