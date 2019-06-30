package com.nemezissfpro.ethalmod.objects.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockRedstoneType extends BlockBase 
{

	public BlockRedstoneType(String name, Material material) 
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
	
	@Override
    public boolean canProvidePower(IBlockState state) 
    {
        return true; 
    }
	

    public int getWeakPower(IBlockState blockState, IBlockAccess blockAccess, BlockPos pos, EnumFacing side) 
	{
		return lightOpacity;
       
    }

	    public int getStrongPower(IBlockState blockState, IBlockAccess blockAccess, BlockPos pos, EnumFacing side) 
	    {
			return lightOpacity;
	        
	    }
    
	
}
