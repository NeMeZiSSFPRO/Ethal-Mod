package com.nemezissfpro.ethalmod.objects.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockBeaconType extends BlockBase
{
	public BlockBeaconType(String name, Material material) 
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
	@Override
	public boolean isBeaconBase(IBlockAccess worldObj, BlockPos pos, BlockPos beacon) {
		return true;
	}

}
