package com.agriculturalexpansion.init;

import com.agriculturalexpansion.extend.AEFood;
import com.agriculturalexpansion.extend.AEItem;
import com.agriculturalexpansion.extend.AESeed;
import com.agriculturalexpansion.main.Reference;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class AEItems {
	
	/**
	 * Items
	 */
	public static Item resource_sprout = new AEItem("resource_sprout");
	
	/**
	 * Vanilla Essence
	 */
	public static Item coal_essence = new AEItem("coal_essence");
	public static Item iron_essence = new AEItem("iron_essence");
	public static Item gold_essence = new AEItem("gold_essence");
	public static Item lapis_essence = new AEItem("lapis_essence");
	public static Item quartz_essence = new AEItem("quartz_essence");
	public static Item redstone_essence = new AEItem("redstone_essence");
	public static Item diamond_essence = new AEItem("diamond_essence");
	public static Item emerald_essence = new AEItem("emerald_essence");
	public static Item glowstone_essence = new AEItem("glowstone_essence");

	/**
	 * Hostile Mobs Essence
	 */
	public static Item zombie_essence = new AEItem("zombie_essence");
	public static Item creeper_essence = new AEItem("creeper_essence");
	public static Item skeleton_essence = new AEItem("skeleton_essence");
	public static Item slime_essence = new AEItem("slime_essence");
	public static Item spider_essence = new AEItem("spider_essence");
	public static Item guardian_essence = new AEItem("guardian_essence");
	public static Item ghast_essence = new AEItem("ghast_essence");
	public static Item wither_essence = new AEItem("wither_essence");
	public static Item blaze_essence = new AEItem("blaze_essence");
	public static Item enderman_essence = new AEItem("enderman_essence");

	/**
	 * Passive Mobs Essence
	 */
	public static Item squid_essence = new AEItem("squid_essence");
	public static Item cow_essence = new AEItem("cow_essence");
	public static Item sheep_essence = new AEItem("sheep_essence");
	public static Item chicken_essence = new AEItem("chicken_essence");
	public static Item pig_essence = new AEItem("pig_essence");
	public static Item rabbit_essence = new AEItem("rabbit_essence");
	
	/**
	 * Special Essence
	 */
	public static Item earth_essence = new AEItem("earth_essence");
	public static Item water_essence = new AEItem("water_essence");
	public static Item fire_essence = new AEItem("fire_essence");
	public static Item experience_essence = new AEItem("experience_essence");
	public static Item dye_essence = new AEItem("dye_essence");
	public static Item nature_essence = new AEItem("nature_essence");
	public static Item nether_essence = new AEItem("nether_essence");
	
	/**
	 * OreDict Essence
	 */
	//Common Essence
	public static Item copper_essence = new AEItem("copper_essence");
	public static Item tin_essence = new AEItem("tin_essence");
	public static Item silver_essence = new AEItem("silver_essence");
	public static Item lead_essence = new AEItem("lead_essence");
	public static Item nickel_essence = new AEItem("nickel_essence");
	public static Item platinum_essence = new AEItem("platinum_essence");
	public static Item aluminum_essence = new AEItem("aluminum_essence");
	public static Item iridium_essence = new AEItem("iridium_essence");
	public static Item titanium_essence = new AEItem("titanium_essence");
	public static Item tungsten_essence = new AEItem("tungsten_essence");
	public static Item zinc_essence = new AEItem("zinc_essence");

	//TiCon Essence
	public static Item ardite_essence = new AEItem("ardite_essence");
	public static Item cobalt_essence = new AEItem("cobalt_essence");
	public static Item alubrass_essence = new AEItem("alubrass_essence");
	public static Item manyullyn_essence = new AEItem("manyullyn_essence");
	
	//Alloy Essence
	public static Item bronze_essence = new AEItem("bronze_essence");
	public static Item steel_essence = new AEItem("steel_essence");
	public static Item invar_essence = new AEItem("invar_essence");
	public static Item electrum_essence = new AEItem("electrum_essence");
	public static Item brass_essence = new AEItem("brass_essence");
	
	//Gem Essence
	public static Item ruby_essence = new AEItem("ruby_essence");
	public static Item sapphire_essence = new AEItem("sapphire_essence");
	public static Item amber_essence = new AEItem("amber_essence");
	public static Item malachite_essence = new AEItem("malachite_essence");
	public static Item peridot_essence = new AEItem("peridot_essence");
	public static Item tanzanite_essence = new AEItem("tanzanite_essence");
	public static Item topaz_essence = new AEItem("topaz_essence");
	
	//Other Essence
	public static Item apatite_essence = new AEItem("apatite_essence");
	public static Item rubber_essence = new AEItem("rubber_essence");
	
	/**
	 * Hostile Mobs Chunks
	 */
	public static Item zombie_chunk = new AEItem("zombie_chunk");
	public static Item creeper_chunk = new AEItem("creeper_chunk");
	public static Item skeleton_chunk = new AEItem("skeleton_chunk");
	public static Item slime_chunk = new AEItem("slime_chunk");
	public static Item spider_chunk = new AEItem("spider_chunk");
	public static Item guardian_chunk = new AEItem("guardian_chunk");
	public static Item ghast_chunk = new AEItem("ghast_chunk");
	public static Item wither_chunk = new AEItem("wither_chunk");
	public static Item blaze_chunk = new AEItem("blaze_chunk");
	public static Item enderman_chunk = new AEItem("enderman_chunk");
	
	/**
	 * Passive Mobs Chunks
	 */
	public static Item squid_chunk = new AEItem("squid_chunk");
	public static Item cow_chunk = new AEItem("cow_chunk");
	public static Item sheep_chunk = new AEItem("sheep_chunk");
	public static Item chicken_chunk = new AEItem("chicken_chunk");
	public static Item pig_chunk = new AEItem("pig_chunk");
	public static Item rabbit_chunk = new AEItem("rabbit_chunk");
	
	/**
	 * Food
	 */
	public static Item cooked_mob_chunk = new AEFood("cooked_mob_chunk", 7, 8, true);
	
	/**
	 * Seeds
	 */
	public static Item resource_seed = new AESeed("resource_seed", AEBlocks.resource_crop, Blocks.FARMLAND);
	
	/**
	 * Vanilla Sprouts
	 */
	public static Item coal_sprout = new AESeed("coal_sprout", AEBlocks.coal_crop, Blocks.FARMLAND);
	public static Item iron_sprout = new AESeed("iron_sprout", AEBlocks.iron_crop, Blocks.FARMLAND);
	public static Item gold_sprout = new AESeed("gold_sprout", AEBlocks.gold_crop, Blocks.FARMLAND);
	public static Item lapis_sprout = new AESeed("lapis_sprout", AEBlocks.lapis_crop, Blocks.FARMLAND);
	public static Item quartz_sprout = new AESeed("quartz_sprout", AEBlocks.quartz_crop, Blocks.FARMLAND);
	public static Item redstone_sprout = new AESeed("redstone_sprout", AEBlocks.redstone_crop, Blocks.FARMLAND);
	public static Item diamond_sprout = new AESeed("diamond_sprout", AEBlocks.diamond_crop, Blocks.FARMLAND);
	public static Item emerald_sprout = new AESeed("emerald_sprout", AEBlocks.emerald_crop, Blocks.FARMLAND);
	public static Item glowstone_sprout = new AESeed("glowstone_sprout", AEBlocks.glowstone_crop, Blocks.FARMLAND);
	
	/**
	 * Hostile Mobs Sprouts
	 */
	public static Item zombie_sprout = new AESeed("zombie_sprout", AEBlocks.zombie_crop, Blocks.FARMLAND);
	public static Item creeper_sprout = new AESeed("creeper_sprout", AEBlocks.creeper_crop, Blocks.FARMLAND);
	public static Item skeleton_sprout = new AESeed("skeleton_sprout", AEBlocks.skeleton_crop, Blocks.FARMLAND);
	public static Item slime_sprout = new AESeed("slime_sprout", AEBlocks.slime_crop, Blocks.FARMLAND);
	public static Item spider_sprout = new AESeed("spider_sprout", AEBlocks.spider_crop, Blocks.FARMLAND);
	public static Item guardian_sprout = new AESeed("guardian_sprout", AEBlocks.guardian_crop, Blocks.FARMLAND);
	public static Item ghast_sprout = new AESeed("ghast_sprout", AEBlocks.ghast_crop, Blocks.FARMLAND);
	public static Item wither_sprout = new AESeed("wither_sprout", AEBlocks.wither_crop, Blocks.FARMLAND);
	public static Item blaze_sprout = new AESeed("blaze_sprout", AEBlocks.blaze_crop, Blocks.FARMLAND);
	public static Item enderman_sprout = new AESeed("enderman_sprout", AEBlocks.enderman_crop, Blocks.FARMLAND);
	
	/**
	 * Passive Mobs Sprouts
	 */
	public static Item squid_sprout = new AESeed("squid_sprout", AEBlocks.squid_crop, Blocks.FARMLAND);
	public static Item cow_sprout = new AESeed("cow_sprout", AEBlocks.cow_crop, Blocks.FARMLAND);
	public static Item sheep_sprout = new AESeed("sheep_sprout", AEBlocks.sheep_crop, Blocks.FARMLAND);
	public static Item chicken_sprout = new AESeed("chicken_sprout", AEBlocks.chicken_crop, Blocks.FARMLAND);
	public static Item pig_sprout = new AESeed("pig_sprout", AEBlocks.pig_crop, Blocks.FARMLAND);
	public static Item rabbit_sprout = new AESeed("rabbit_sprout", AEBlocks.rabbit_crop, Blocks.FARMLAND);
	
	/**
	 * Special Sprouts
	 */
	public static Item earth_sprout = new AESeed("earth_sprout", AEBlocks.earth_crop, Blocks.FARMLAND);
	public static Item water_sprout = new AESeed("water_sprout", AEBlocks.water_crop, Blocks.FARMLAND);
	public static Item fire_sprout = new AESeed("fire_sprout", AEBlocks.fire_crop, Blocks.FARMLAND);
	public static Item experience_sprout = new AESeed("experience_sprout", AEBlocks.experience_crop, Blocks.FARMLAND);
	public static Item dye_sprout = new AESeed("dye_sprout", AEBlocks.dye_crop, Blocks.FARMLAND);
	public static Item nature_sprout = new AESeed("nature_sprout", AEBlocks.nature_crop, Blocks.FARMLAND);
	public static Item nether_sprout = new AESeed("nether_sprout", AEBlocks.nether_crop, Blocks.FARMLAND);
	
	/**
	 * OreDictionary Essence
	 */
	//Common Sprouts
	public static Item copper_sprout = new AESeed("copper_sprout", AEBlocks.copper_crop, Blocks.FARMLAND);
	public static Item tin_sprout = new AESeed("tin_sprout", AEBlocks.tin_crop, Blocks.FARMLAND);
	public static Item silver_sprout = new AESeed("silver_sprout", AEBlocks.silver_crop, Blocks.FARMLAND);
	public static Item lead_sprout = new AESeed("lead_sprout", AEBlocks.lead_crop, Blocks.FARMLAND);
	public static Item nickel_sprout = new AESeed("nickel_sprout", AEBlocks.nickel_crop, Blocks.FARMLAND);
	public static Item platinum_sprout = new AESeed("platinum_sprout", AEBlocks.platinum_crop, Blocks.FARMLAND);
	public static Item aluminum_sprout = new AESeed("aluminum_sprout", AEBlocks.aluminum_crop, Blocks.FARMLAND);
	public static Item iridium_sprout = new AESeed("iridium_sprout", AEBlocks.iridium_crop, Blocks.FARMLAND);
	public static Item titanium_sprout = new AESeed("titanium_sprout", AEBlocks.titanium_crop, Blocks.FARMLAND);
	public static Item tungsten_sprout = new AESeed("tungsten_sprout", AEBlocks.tungsten_crop, Blocks.FARMLAND);
	public static Item zinc_sprout = new AESeed("zinc_sprout", AEBlocks.zinc_crop, Blocks.FARMLAND);

	//TiCon Sprouts
	public static Item ardite_sprout = new AESeed("ardite_sprout", AEBlocks.ardite_crop, Blocks.FARMLAND);
	public static Item cobalt_sprout = new AESeed("cobalt_sprout", AEBlocks.cobalt_crop, Blocks.FARMLAND);
	public static Item alubrass_sprout = new AESeed("alubrass_sprout", AEBlocks.alubrass_crop, Blocks.FARMLAND);
	public static Item manyullyn_sprout = new AESeed("manyullyn_sprout", AEBlocks.manyullyn_crop, Blocks.FARMLAND);
		
	//Alloy Sprouts
	public static Item bronze_sprout = new AESeed("bronze_sprout", AEBlocks.bronze_crop, Blocks.FARMLAND);
	public static Item steel_sprout = new AESeed("steel_sprout", AEBlocks.steel_crop, Blocks.FARMLAND);
	public static Item invar_sprout = new AESeed("invar_sprout", AEBlocks.invar_crop, Blocks.FARMLAND);
	public static Item electrum_sprout = new AESeed("electrum_sprout", AEBlocks.electrum_crop, Blocks.FARMLAND);
	public static Item brass_sprout = new AESeed("brass_sprout", AEBlocks.brass_crop, Blocks.FARMLAND);
		
	//Gem Sprouts
	public static Item ruby_sprout = new AESeed("ruby_sprout", AEBlocks.ruby_crop, Blocks.FARMLAND);
	public static Item sapphire_sprout = new AESeed("sapphire_sprout", AEBlocks.sapphire_crop, Blocks.FARMLAND);
	public static Item amber_sprout = new AESeed("amber_sprout", AEBlocks.amber_crop, Blocks.FARMLAND);
	public static Item malachite_sprout = new AESeed("malachite_sprout", AEBlocks.malachite_crop, Blocks.FARMLAND);
	public static Item peridot_sprout = new AESeed("peridot_sprout", AEBlocks.peridot_crop, Blocks.FARMLAND);
	public static Item tanzanite_sprout = new AESeed("tanzanite_sprout", AEBlocks.tanzanite_crop, Blocks.FARMLAND);
	public static Item topaz_sprout = new AESeed("topaz_sprout", AEBlocks.topaz_crop, Blocks.FARMLAND);
	
	//Other Sprouts
	public static Item apatite_sprout = new AESeed("apatite_sprout", AEBlocks.apatite_crop, Blocks.FARMLAND);
	public static Item rubber_sprout = new AESeed("rubber_sprout", AEBlocks.rubber_crop, Blocks.FARMLAND);
	
	public static void initItems() {
		
		GameRegistry.registerItem((resource_sprout), "resource_sprout");
		
		GameRegistry.registerItem((coal_essence), "coal_essence");
		GameRegistry.registerItem((iron_essence), "iron_essence");
		GameRegistry.registerItem((gold_essence), "gold_essence");
		GameRegistry.registerItem((lapis_essence), "lapis_essence");
		GameRegistry.registerItem((quartz_essence), "quartz_essence");
		GameRegistry.registerItem((redstone_essence), "redstone_essence");
		GameRegistry.registerItem((diamond_essence), "diamond_essence");
		GameRegistry.registerItem((emerald_essence), "emerald_essence");
		GameRegistry.registerItem((glowstone_essence), "glowstone_essence");
		
		GameRegistry.registerItem((zombie_essence), "zombie_essence");
		GameRegistry.registerItem((creeper_essence), "creeper_essence");
		GameRegistry.registerItem((skeleton_essence), "skeleton_essence");
		GameRegistry.registerItem((slime_essence), "slime_essence");
		GameRegistry.registerItem((spider_essence), "spider_essence");
		GameRegistry.registerItem((guardian_essence), "guardian_essence");
		GameRegistry.registerItem((ghast_essence), "ghast_essence");
		GameRegistry.registerItem((wither_essence), "wither_essence");
		GameRegistry.registerItem((blaze_essence), "blaze_essence");
		GameRegistry.registerItem((enderman_essence), "enderman_essence");
		
		GameRegistry.registerItem((squid_essence), "squid_essence");
		GameRegistry.registerItem((cow_essence), "cow_essence");
		GameRegistry.registerItem((sheep_essence), "sheep_essence");
		GameRegistry.registerItem((chicken_essence), "chicken_essence");
		GameRegistry.registerItem((pig_essence), "pig_essence");
		GameRegistry.registerItem((rabbit_essence), "rabbit_essence");
		
		GameRegistry.registerItem((earth_essence), "earth_essence");
		GameRegistry.registerItem((water_essence), "water_essence");
		GameRegistry.registerItem((fire_essence), "fire_essence");
		GameRegistry.registerItem((experience_essence), "experience_essence");
		GameRegistry.registerItem((dye_essence), "dye_essence");
		GameRegistry.registerItem((nature_essence), "nature_essence");
		GameRegistry.registerItem((nether_essence), "nether_essence");
		
		GameRegistry.registerItem((copper_essence), "copper_essence");
		GameRegistry.registerItem((tin_essence), "tin_essence");
		GameRegistry.registerItem((silver_essence), "silver_essence");
		GameRegistry.registerItem((lead_essence), "lead_essence");
		GameRegistry.registerItem((nickel_essence), "nickel_essence");
		GameRegistry.registerItem((platinum_essence), "platinum_essence");
		GameRegistry.registerItem((aluminum_essence), "aluminum_essence");
		GameRegistry.registerItem((iridium_essence), "iridium_essence");
		GameRegistry.registerItem((titanium_essence), "titanium_essence");
		GameRegistry.registerItem((tungsten_essence), "tungsten_essence");
		GameRegistry.registerItem((zinc_essence), "zinc_essence");
		
		GameRegistry.registerItem((ardite_essence), "ardite_essence");
		GameRegistry.registerItem((cobalt_essence), "cobalt_essence");
		GameRegistry.registerItem((alubrass_essence), "alubrass_essence");
		GameRegistry.registerItem((manyullyn_essence), "manyullyn_essence");
		
		GameRegistry.registerItem((bronze_essence), "bronze_essence");
		GameRegistry.registerItem((steel_essence), "steel_essence");
		GameRegistry.registerItem((invar_essence), "invar_essence");
		GameRegistry.registerItem((electrum_essence), "electrum_essence");
		GameRegistry.registerItem((brass_essence), "brass_essence");
		
		GameRegistry.registerItem((ruby_essence), "ruby_essence");
		GameRegistry.registerItem((sapphire_essence), "sapphire_essence");
		GameRegistry.registerItem((amber_essence), "amber_essence");
		GameRegistry.registerItem((malachite_essence), "malachite_essence");
		GameRegistry.registerItem((peridot_essence), "peridot_essence");
		GameRegistry.registerItem((tanzanite_essence), "tanzanite_essence");
		GameRegistry.registerItem((topaz_essence), "topaz_essence");
		
		GameRegistry.registerItem((apatite_essence), "apatite_essence");
		GameRegistry.registerItem((rubber_essence), "rubber_essence");
		
		GameRegistry.registerItem((zombie_chunk), "zombie_chunk");
		GameRegistry.registerItem((creeper_chunk), "creeper_chunk");
		GameRegistry.registerItem((skeleton_chunk), "skeleton_chunk");
		GameRegistry.registerItem((slime_chunk), "slime_chunk");
		GameRegistry.registerItem((spider_chunk), "spider_chunk");
		GameRegistry.registerItem((guardian_chunk), "guardian_chunk");
		GameRegistry.registerItem((ghast_chunk), "ghast_chunk");
		GameRegistry.registerItem((wither_chunk), "wither_chunk");
		GameRegistry.registerItem((blaze_chunk), "blaze_chunk");
		GameRegistry.registerItem((enderman_chunk), "enderman_chunk");
		
		GameRegistry.registerItem((squid_chunk), "squid_chunk");
		GameRegistry.registerItem((cow_chunk), "cow_chunk");
		GameRegistry.registerItem((sheep_chunk), "sheep_chunk");
		GameRegistry.registerItem((chicken_chunk), "chicken_chunk");
		GameRegistry.registerItem((pig_chunk), "pig_chunk");
		GameRegistry.registerItem((rabbit_chunk), "rabbit_chunk");
		
		GameRegistry.registerItem((cooked_mob_chunk), "cooked_mob_chunk");
		
		GameRegistry.registerItem((resource_seed), "resource_seed");
		
		GameRegistry.registerItem((coal_sprout), "coal_sprout");
		GameRegistry.registerItem((iron_sprout), "iron_sprout");
		GameRegistry.registerItem((gold_sprout), "gold_sprout");
		GameRegistry.registerItem((lapis_sprout), "lapis_sprout");
		GameRegistry.registerItem((quartz_sprout), "quartz_sprout");
		GameRegistry.registerItem((redstone_sprout), "redstone_sprout");
		GameRegistry.registerItem((diamond_sprout), "diamond_sprout");
		GameRegistry.registerItem((emerald_sprout), "emerald_sprout");
		GameRegistry.registerItem((glowstone_sprout), "glowstone_sprout");
		
		GameRegistry.registerItem((zombie_sprout), "zombie_sprout");
		GameRegistry.registerItem((creeper_sprout), "creeper_sprout");
		GameRegistry.registerItem((skeleton_sprout), "skeleton_sprout");
		GameRegistry.registerItem((slime_sprout), "slime_sprout");
		GameRegistry.registerItem((spider_sprout), "spider_sprout");
		GameRegistry.registerItem((guardian_sprout), "guardian_sprout");
		GameRegistry.registerItem((ghast_sprout), "ghast_sprout");
		GameRegistry.registerItem((wither_sprout), "wither_sprout");
		GameRegistry.registerItem((blaze_sprout), "blaze_sprout");
		GameRegistry.registerItem((enderman_sprout), "enderman_sprout");
		
		GameRegistry.registerItem((squid_sprout), "squid_sprout");
		GameRegistry.registerItem((cow_sprout), "cow_sprout");
		GameRegistry.registerItem((sheep_sprout), "sheep_sprout");
		GameRegistry.registerItem((chicken_sprout), "chicken_sprout");
		GameRegistry.registerItem((pig_sprout), "pig_sprout");
		GameRegistry.registerItem((rabbit_sprout), "rabbit_sprout");
		
		GameRegistry.registerItem((earth_sprout), "earth_sprout");
		GameRegistry.registerItem((water_sprout), "water_sprout");
		GameRegistry.registerItem((fire_sprout), "fire_sprout");
		GameRegistry.registerItem((experience_sprout), "experience_sprout");
		GameRegistry.registerItem((dye_sprout), "dye_sprout");
		GameRegistry.registerItem((nature_sprout), "nature_sprout");
		GameRegistry.registerItem((nether_sprout), "nether_sprout");
		
		GameRegistry.registerItem((copper_sprout), "copper_sprout");
		GameRegistry.registerItem((tin_sprout), "tin_sprout");
		GameRegistry.registerItem((silver_sprout), "silver_sprout");
		GameRegistry.registerItem((lead_sprout), "lead_sprout");
		GameRegistry.registerItem((nickel_sprout), "nickel_sprout");
		GameRegistry.registerItem((platinum_sprout), "platinum_sprout");
		GameRegistry.registerItem((aluminum_sprout), "aluminum_sprout");
		GameRegistry.registerItem((iridium_sprout), "iridium_sprout");
		GameRegistry.registerItem((titanium_sprout), "titanium_sprout");
		GameRegistry.registerItem((tungsten_sprout), "tungsten_sprout");
		GameRegistry.registerItem((zinc_sprout), "zinc_sprout");
				
		GameRegistry.registerItem((ardite_sprout), "ardite_sprout");
		GameRegistry.registerItem((cobalt_sprout), "cobalt_sprout");
		GameRegistry.registerItem((alubrass_sprout), "alubrass_sprout");
		GameRegistry.registerItem((manyullyn_sprout), "manyullyn_sprout");
			
		GameRegistry.registerItem((bronze_sprout), "bronze_sprout");
		GameRegistry.registerItem((steel_sprout), "steel_sprout");
		GameRegistry.registerItem((invar_sprout), "invar_sprout");
		GameRegistry.registerItem((electrum_sprout), "electrum_sprout");
		GameRegistry.registerItem((brass_sprout), "brass_sprout");
				
		GameRegistry.registerItem((ruby_sprout), "ruby_sprout");
		GameRegistry.registerItem((sapphire_sprout), "sapphire_sprout");
		GameRegistry.registerItem((amber_sprout), "amber_sprout");
		GameRegistry.registerItem((malachite_sprout), "malachite_sprout");
		GameRegistry.registerItem((peridot_sprout), "peridot_sprout");
		GameRegistry.registerItem((tanzanite_sprout), "tanzanite_sprout");
		GameRegistry.registerItem((topaz_sprout), "topaz_sprout");
		
		GameRegistry.registerItem((apatite_sprout), "apatite_sprout");
		GameRegistry.registerItem((rubber_sprout), "rubber_sprout");
	}
	
	public static void initModels() {
		
		initModel(resource_sprout);
		
		initModel(coal_essence);
		initModel(iron_essence);
		initModel(gold_essence);
		initModel(lapis_essence);
		initModel(quartz_essence);
		initModel(redstone_essence);
		initModel(diamond_essence);
		initModel(emerald_essence);
		initModel(glowstone_essence);
		
		initModel(zombie_essence);
		initModel(creeper_essence);
		initModel(skeleton_essence);
		initModel(slime_essence);
		initModel(spider_essence);
		initModel(guardian_essence);
		initModel(ghast_essence);
		initModel(wither_essence);
		initModel(blaze_essence);
		initModel(enderman_essence);
		
		initModel(squid_essence);
		initModel(cow_essence);
		initModel(sheep_essence);
		initModel(chicken_essence);
		initModel(pig_essence);
		initModel(rabbit_essence);
		
		initModel(earth_essence);
		initModel(water_essence);
		initModel(fire_essence);
		initModel(experience_essence);
		initModel(dye_essence);
		initModel(nature_essence);
		initModel(nether_essence);
		
		initModel(copper_essence);
		initModel(tin_essence);
		initModel(silver_essence);
		initModel(lead_essence);
		initModel(nickel_essence);
		initModel(platinum_essence);
		initModel(aluminum_essence);
		initModel(iridium_essence);
		initModel(titanium_essence);
		initModel(tungsten_essence);
		initModel(zinc_essence);
		
		initModel(ardite_essence);
		initModel(cobalt_essence);
		initModel(alubrass_essence);
		initModel(manyullyn_essence);
		
		initModel(bronze_essence);
		initModel(steel_essence);
		initModel(invar_essence);
		initModel(electrum_essence);
		initModel(brass_essence);
		
		initModel(ruby_essence);
		initModel(sapphire_essence);
		initModel(amber_essence);
		initModel(malachite_essence);
		initModel(peridot_essence);
		initModel(tanzanite_essence);
		initModel(topaz_essence);
		
		initModel(apatite_essence);
		initModel(rubber_essence);
		
		initModel(zombie_chunk);
		initModel(creeper_chunk);
		initModel(skeleton_chunk);
		initModel(slime_chunk);
		initModel(spider_chunk);
		initModel(guardian_chunk);
		initModel(ghast_chunk);
		initModel(wither_chunk);
		initModel(blaze_chunk);
		initModel(enderman_chunk);
		
		initModel(squid_chunk);
		initModel(cow_chunk);
		initModel(sheep_chunk);
		initModel(chicken_chunk);
		initModel(pig_chunk);
		initModel(rabbit_chunk);
		
		initModel(cooked_mob_chunk);
		
		initModel(resource_seed);
		
		initModel(coal_sprout);
		initModel(iron_sprout);
		initModel(gold_sprout);
		initModel(lapis_sprout);
		initModel(quartz_sprout);
		initModel(redstone_sprout);
		initModel(diamond_sprout);
		initModel(emerald_sprout);
		initModel(glowstone_sprout);
		
		initModel(zombie_sprout);
		initModel(creeper_sprout);
		initModel(skeleton_sprout);
		initModel(slime_sprout);
		initModel(spider_sprout);
		initModel(guardian_sprout);
		initModel(ghast_sprout);
		initModel(wither_sprout);
		initModel(blaze_sprout);
		initModel(enderman_sprout);
		
		initModel(squid_sprout);
		initModel(cow_sprout);
		initModel(sheep_sprout);
		initModel(chicken_sprout);
		initModel(pig_sprout);
		initModel(rabbit_sprout);
		
		initModel(earth_sprout);
		initModel(water_sprout);
		initModel(fire_sprout);
		initModel(experience_sprout);
		initModel(dye_sprout);
		initModel(nature_sprout);
		initModel(nether_sprout);
		
		initModel(copper_sprout);
		initModel(tin_sprout);
		initModel(silver_sprout);
		initModel(lead_sprout);
		initModel(nickel_sprout);
		initModel(platinum_sprout);
		initModel(aluminum_sprout);
		initModel(iridium_sprout);
		initModel(titanium_sprout);
		initModel(tungsten_sprout);
		initModel(zinc_sprout);
		
		initModel(ardite_sprout);
		initModel(cobalt_sprout);
		initModel(alubrass_sprout);
		initModel(manyullyn_sprout);
		
		initModel(bronze_sprout);
		initModel(steel_sprout);
		initModel(invar_sprout);
		initModel(electrum_sprout);
		initModel(brass_sprout);
		
		initModel(ruby_sprout);
		initModel(sapphire_sprout);
		initModel(amber_sprout);
		initModel(malachite_sprout);
		initModel(peridot_sprout);
		initModel(tanzanite_sprout);
		initModel(topaz_sprout);
		
		initModel(apatite_sprout);
		initModel(rubber_sprout);
	}
	
	public static void initModel(Item item) {
		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0,
				new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
		
	}
	
}
