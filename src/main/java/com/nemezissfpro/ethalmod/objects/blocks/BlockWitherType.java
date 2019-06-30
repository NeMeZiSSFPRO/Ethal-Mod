package com.nemezissfpro.ethalmod.objects.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockWitherType extends BlockBase 
{
	public BlockWitherType(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(50.0F);
		setResistance(Float.MAX_VALUE);
		setHarvestLevel("pickaxe", 4);
		//setLightLevel(0.0F);
		//setLightOpacity(1);
		//setBlockUnbreakable();
		
	}
	
	@Override
    public boolean canEntityDestroy(IBlockState state, IBlockAccess world, BlockPos pos, Entity entity) 
    {
        if(!(entity instanceof EntityWither))
        {
            return false;
        }
        return false;
    }
}
