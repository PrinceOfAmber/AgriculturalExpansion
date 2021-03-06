package com.agriculturalexpansion.extend;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.agriculturalexpansion.handler.ConfigurationFile;
import com.agriculturalexpansion.init.AEItems;

import net.minecraft.block.BlockCrops;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;



public class AECrop extends BlockCrops {
	
    public AECrop(String name) {
    	super();
    	this.setUnlocalizedName(name);
        this.setCreativeTab((CreativeTabs)null);
        this.setHardness(0.0F);
        this.setSoundType(SoundType.PLANT);
    }
    	
    public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, IBlockState state) {
    	return ConfigurationFile.canUseBonemeal;
    }
    
    protected boolean canSustainBush(IBlockState state) {
        return state.getBlock() == Blocks.FARMLAND;
    }
    
    @Override
    public List<ItemStack> getDrops(IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
        List<ItemStack> drops = new ArrayList<ItemStack>();

        int age = state.getValue(AGE);
        Random rand = ((World) world).rand;

        int essence = 0;
        int seeds = 1;

        if (age == 7) {
            //33% chance to get an extra seed
            if (rand.nextInt(3) == 0){
                seeds++;
            }

            //10% chance to get a second essence
            if (rand.nextInt(10) == 0) {
            	essence = 2;
            } else {
            	essence = 1;
            }
        }

        drops.add(new ItemStack(this.getSeed(), seeds, 0));
        drops.add(new ItemStack(this.getCrop(), essence, 0));
        return drops;
    }   
    
}