package com.agriculturalexpansion.init;

import com.agriculturalexpansion.extend.AEBlock;
import com.agriculturalexpansion.extend.AECrop;
import com.agriculturalexpansion.extend.AECrops.*;
import com.agriculturalexpansion.handler.ConfigurationFile;
import com.agriculturalexpansion.main.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class AEBlocks {
	
	/**
	 * Blocks
	 */
	public static Block sprout_block = new AEBlock("sprout_block", Material.GROUND, 0, 0, null, 0);
	
	/**
	 * Resource Crops
	 */
	public static Block resource_crop = new ResourceCrop("resource_crop");
		
	/**
	 * Vanilla Crops;
	 */
	public static Block coal_crop = new CoalCrop("coal_crop");
	public static Block iron_crop = new IronCrop("iron_crop");
	public static Block gold_crop = new GoldCrop("gold_crop");
	public static Block lapis_crop = new LapisCrop("lapis_crop");
	public static Block quartz_crop = new QuartzCrop("quartz_crop");
	public static Block redstone_crop = new RedstoneCrop("redstone_crop");
	public static Block diamond_crop = new DiamondCrop("diamond_crop");
	public static Block emerald_crop = new EmeraldCrop("emerald_crop");
	public static Block glowstone_crop = new GlowstoneCrop("glowstone_crop");

	/**
	 * Hostile Mobs Crops
	 */
	public static Block zombie_crop = new ZombieCrop("zombie_crop");
	public static Block creeper_crop = new CreeperCrop("creeper_crop");
	public static Block skeleton_crop = new SkeletonCrop("skeleton_crop");
	public static Block slime_crop = new SlimeCrop("slime_crop");
	public static Block spider_crop = new SpiderCrop("spider_crop");
	public static Block guardian_crop = new GuardianCrop("guardian_crop");
	public static Block ghast_crop = new GhastCrop("ghast_crop");
	public static Block wither_crop = new WitherCrop("wither_crop");
	public static Block blaze_crop = new BlazeCrop("blaze_crop");
	public static Block enderman_crop = new EndermanCrop("enderman_crop");
		
	/**
	 * Passive Mobs Crops
	 */
	public static Block squid_crop = new SquidCrop("squid_crop");
	public static Block cow_crop = new CowCrop("cow_crop");
	public static Block sheep_crop = new SheepCrop("sheep_crop");
	public static Block chicken_crop = new ChickenCrop("chicken_crop");
	public static Block pig_crop = new PigCrop("pig_crop");
	public static Block rabbit_crop = new RabbitCrop("rabbit_crop");
	
	/**
	 * Special Crops
	 */
	public static Block earth_crop = new EarthCrop("earth_crop");
	public static Block water_crop = new WaterCrop("water_crop");
	public static Block fire_crop = new FireCrop("fire_crop");
	public static Block experience_crop = new ExperienceCrop("experience_crop");
	public static Block dye_crop = new DyeCrop("dye_crop");
	public static Block nature_crop = new NatureCrop("nature_crop");
	public static Block nether_crop = new NetherCrop("nether_crop");
	
	/**
	 * OreDict Crops
	 */
	// Common Crops
	public static Block copper_crop = new CopperCrop("copper_crop");
	public static Block tin_crop = new TinCrop("tin_crop");
	public static Block silver_crop = new SilverCrop("silver_crop");
	public static Block lead_crop = new LeadCrop("lead_crop");
	public static Block nickel_crop = new NickelCrop("nickel_crop");
	public static Block platinum_crop = new PlatinumCrop("platinum_crop");
	public static Block aluminum_crop = new AluminumCrop("aluminum_crop");
	public static Block iridium_crop = new IridiumCrop("iridium_crop");
	public static Block titanium_crop = new TitaniumCrop("titanium_crop");
	public static Block tungsten_crop = new TungstenCrop("tungsten_crop");
	public static Block zinc_crop = new ZincCrop("zinc_crop");
	
	//TiCon Crops
	public static Block ardite_crop = new ArditeCrop("ardite_crop");
	public static Block cobalt_crop = new CobaltCrop("cobalt_crop");
	public static Block alubrass_crop = new AlubrassCrop("alubrass_crop");
	public static Block manyullyn_crop = new ManyullynCrop("manyullyn_crop");
	
	//Alloy Crops
	public static Block bronze_crop = new BronzeCrop("bronze_crop");
	public static Block steel_crop = new SteelCrop("steel_crop");
	public static Block invar_crop = new InvarCrop("invar_crop");
	public static Block electrum_crop = new ElectrumCrop("electrum_crop");
	public static Block brass_crop = new BrassCrop("brass_crop");
	
	//Gem Crops
	public static Block ruby_crop = new RubyCrop("ruby_crop");
	public static Block sapphire_crop = new SapphireCrop("sapphire_crop");
	public static Block amber_crop = new AmberCrop("amber_crop");
	public static Block malachite_crop = new MalachiteCrop("malachite_crop");
	public static Block peridot_crop = new PeridotCrop("peridot_crop");
	public static Block tanzanite_crop = new TanzaniteCrop("tanzanite_crop");
	public static Block topaz_crop = new TopazCrop("topaz_crop");
	
	//Other Crops
	public static Block apatite_crop = new ApatiteCrop("apatite_crop");
	public static Block rubber_crop = new RubberCrop("rubber_crop");
	
	public static void initBlocks() {
		
		GameRegistry.registerBlock((sprout_block), "sprout_block");
		
		GameRegistry.registerBlock((resource_crop), "resource_crop");
		
		GameRegistry.registerBlock((coal_crop), "coal_crop");
		GameRegistry.registerBlock((iron_crop), "iron_crop");
		GameRegistry.registerBlock((gold_crop), "gold_crop");
		GameRegistry.registerBlock((lapis_crop), "lapis_crop");
		GameRegistry.registerBlock((quartz_crop), "quartz_crop");
		GameRegistry.registerBlock((redstone_crop), "redstone_crop");
		GameRegistry.registerBlock((diamond_crop), "diamond_crop");
		GameRegistry.registerBlock((emerald_crop), "emerald_crop");
		GameRegistry.registerBlock((glowstone_crop), "glowstone_crop");
		
		GameRegistry.registerBlock((zombie_crop), "zombie_crop");
		GameRegistry.registerBlock((creeper_crop), "creeper_crop");
		GameRegistry.registerBlock((skeleton_crop), "skeleton_crop");
		GameRegistry.registerBlock((slime_crop), "slime_crop");
		GameRegistry.registerBlock((spider_crop), "spider_crop");
		GameRegistry.registerBlock((guardian_crop), "guardian_crop");
		GameRegistry.registerBlock((ghast_crop), "ghast_crop");
		GameRegistry.registerBlock((wither_crop), "wither_crop");
		GameRegistry.registerBlock((blaze_crop), "blaze_crop");
		GameRegistry.registerBlock((enderman_crop), "enderman_crop");
		
		GameRegistry.registerBlock((squid_crop), "squid_crop");
		GameRegistry.registerBlock((cow_crop), "cow_crop");
		GameRegistry.registerBlock((sheep_crop), "sheep_crop");
		GameRegistry.registerBlock((chicken_crop), "chicken_crop");
		GameRegistry.registerBlock((pig_crop), "pig_crop");
		GameRegistry.registerBlock((rabbit_crop), "rabbit_crop");
		
		GameRegistry.registerBlock((earth_crop), "earth_crop");
		GameRegistry.registerBlock((water_crop), "water_crop");
		GameRegistry.registerBlock((fire_crop), "fire_crop");
		GameRegistry.registerBlock((experience_crop), "experience_crop");
		GameRegistry.registerBlock((dye_crop), "dye_crop");
		GameRegistry.registerBlock((nature_crop), "nature_crop");
		GameRegistry.registerBlock((nether_crop), "nether_crop");
		
		GameRegistry.registerBlock((copper_crop), "copper_crop");
		GameRegistry.registerBlock((tin_crop), "tin_crop");
		GameRegistry.registerBlock((silver_crop), "silver_crop");
		GameRegistry.registerBlock((lead_crop), "lead_crop");
		GameRegistry.registerBlock((nickel_crop), "nickel_crop");
		GameRegistry.registerBlock((platinum_crop), "platinum_crop");
		GameRegistry.registerBlock((aluminum_crop), "aluminum_crop");
		GameRegistry.registerBlock((iridium_crop), "iridium_crop");
		GameRegistry.registerBlock((titanium_crop), "titanium_crop");
		GameRegistry.registerBlock((tungsten_crop), "tungsten_crop");
		GameRegistry.registerBlock((zinc_crop), "zinc_crop");
		
		GameRegistry.registerBlock((ardite_crop), "ardite_crop");
		GameRegistry.registerBlock((cobalt_crop), "cobalt_crop");
		GameRegistry.registerBlock((alubrass_crop), "alubrass_crop");
		GameRegistry.registerBlock((manyullyn_crop), "manyullyn_crop");
		
		GameRegistry.registerBlock((bronze_crop), "bronze_crop");
		GameRegistry.registerBlock((steel_crop), "steel_crop");
		GameRegistry.registerBlock((invar_crop), "invar_crop");
		GameRegistry.registerBlock((electrum_crop), "electrum_crop");
		GameRegistry.registerBlock((brass_crop), "brass_crop");
		
		GameRegistry.registerBlock((ruby_crop), "ruby_crop");
		GameRegistry.registerBlock((sapphire_crop), "sapphire_crop");
		GameRegistry.registerBlock((amber_crop), "amber_crop");
		GameRegistry.registerBlock((malachite_crop), "malachite_crop");
		GameRegistry.registerBlock((peridot_crop), "peridot_crop");
		GameRegistry.registerBlock((tanzanite_crop), "tanzanite_crop");
		GameRegistry.registerBlock((topaz_crop), "topaz_crop");
		
		GameRegistry.registerBlock((apatite_crop), "apatite_crop");
		GameRegistry.registerBlock((rubber_crop), "rubber_crop");
	}
	
	public static void initModels() {
		
		initModel(sprout_block);
		
		initModel(resource_crop);
		
		initModel(coal_crop);
		initModel(iron_crop);
		initModel(gold_crop);
		initModel(lapis_crop);
		initModel(quartz_crop);
		initModel(redstone_crop);
		initModel(diamond_crop);
		initModel(emerald_crop);
		initModel(glowstone_crop);
		
		initModel(zombie_crop);
		initModel(creeper_crop);
		initModel(skeleton_crop);
		initModel(slime_crop);
		initModel(spider_crop);
		initModel(guardian_crop);
		initModel(ghast_crop);
		initModel(wither_crop);
		initModel(blaze_crop);
		initModel(enderman_crop);
		
		initModel(squid_crop);
		initModel(cow_crop);
		initModel(sheep_crop);
		initModel(chicken_crop);
		initModel(pig_crop);
		initModel(rabbit_crop);
		
		initModel(earth_crop);
		initModel(water_crop);
		initModel(fire_crop);
		initModel(experience_crop);
		initModel(dye_crop);
		initModel(nature_crop);
		initModel(nether_crop);
		
		initModel(copper_crop);
		initModel(tin_crop);
		initModel(silver_crop);
		initModel(lead_crop);
		initModel(nickel_crop);
		initModel(platinum_crop);
		initModel(aluminum_crop);
		initModel(iridium_crop);
		initModel(titanium_crop);
		initModel(tungsten_crop);
		initModel(zinc_crop);
		
		initModel(ardite_crop);
		initModel(cobalt_crop);
		initModel(alubrass_crop);
		initModel(manyullyn_crop);
		
		initModel(bronze_crop);
		initModel(steel_crop);
		initModel(invar_crop);
		initModel(electrum_crop);
		initModel(brass_crop);
		
		initModel(ruby_crop);
		initModel(sapphire_crop);
		initModel(amber_crop);
		initModel(malachite_crop);
		initModel(peridot_crop);
		initModel(tanzanite_crop);
		initModel(topaz_crop);
		
		initModel(apatite_crop);
		initModel(rubber_crop);
	}
	
	public static void initModel(Block block) {
		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, 
				new ModelResourceLocation(Reference.MOD_ID + ":" + block.getUnlocalizedName().substring(5), "inventory"));
    }

}
