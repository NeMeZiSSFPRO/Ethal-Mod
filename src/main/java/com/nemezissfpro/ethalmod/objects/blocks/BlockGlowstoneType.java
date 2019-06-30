package com.nemezissfpro.ethalmod.objects.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockGlowstoneType extends BlockBase
{
	public BlockGlowstoneType(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.GLASS);
		setHardness(5.0F);
		setResistance(Float.MAX_VALUE);
		setHarvestLevel("pickaxe", 2);
		setLightLevel(16/16F);
		setLightOpacity(1);
		//setBlockUnbreakable();
		
	}
}
