package com.nemezissfpro.ethalmod.objects.blocks;

import java.util.Random;

import com.nemezissfpro.ethalmod.init.ModItems;
import com.nemezissfpro.ethalmod.tabs.EthalItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockPoniumOreOver extends BlockBase 
{
	public BlockPoniumOreOver(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(20.0F);
		setResistance(Float.MAX_VALUE);
		setHarvestLevel("pickaxe", 4);
		//setLightLevel(0.0F);
		//setLightOpacity(1);
		//setBlockUnbreakable();	
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) 
	{
        return ModItems.PONIUM_GEM;
    }
	
	
	@Override
	public boolean canSilkHarvest(World world, BlockPos pos, IBlockState state, EntityPlayer player)
	{
		return true;
	}
}
