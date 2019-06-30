package com.nemezissfpro.ethalmod.objects.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockStoneType extends BlockBase 
{
	public BlockStoneType(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(5.0F);
		setResistance(Float.MAX_VALUE);
		setHarvestLevel("pickaxe", 2);
		//setLightLevel(0.0F);
		//setLightOpacity(1);
		//setBlockUnbreakable();
		
	}
}
