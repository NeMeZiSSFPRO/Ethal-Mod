package com.nemezissfpro.ethalmod.objects.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockIronType extends BlockBase 
{

	public BlockIronType(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(5.0F);
		setResistance(Float.MAX_VALUE);
		setHarvestLevel("pickaxe", 2);
		//setLightLevel(0.0F);
		//setLightOpacity(1);
		//setBlockUnbreakable();
		
	}
}
