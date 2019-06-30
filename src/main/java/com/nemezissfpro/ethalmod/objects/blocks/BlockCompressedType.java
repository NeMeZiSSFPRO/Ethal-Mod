package com.nemezissfpro.ethalmod.objects.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockCompressedType extends BlockBase
{
	public BlockCompressedType(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(50.0F);
		setResistance(Float.MAX_VALUE);
		setHarvestLevel("pickaxe", 3);
		//setLightLevel(0.0F);
		//setLightOpacity(1);
		//setBlockUnbreakable();
		
	}
}
