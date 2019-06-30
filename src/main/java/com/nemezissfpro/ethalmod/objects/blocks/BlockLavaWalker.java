package com.nemezissfpro.ethalmod.objects.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockMagma;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;

public class BlockLavaWalker extends BlockBase
{
	
	public static final PropertyInteger AGE = PropertyInteger.create("age", 0, 3);

	public BlockLavaWalker(String name, Material material) 
	{
		super(name, material);
		setDefaultState(this.blockState.getBaseState().withProperty(AGE, Integer.valueOf(0)));
		setSoundType(SoundType.STONE);
		setHardness(5.0F);
		setResistance(Float.MAX_VALUE);
		setHarvestLevel("pickaxe", 2);
		//setLightLevel(0.0F);
		//setLightOpacity(1);
		//setBlockUnbreakable();
		
	}
	
	protected void turnIntoLava(World worldIn, BlockPos pos) {
		worldIn.setBlockState(pos, Blocks.LAVA.getDefaultState());
		worldIn.notifyNeighborsOfStateChange(pos, Blocks.LAVA, false);
	}
	
	public CreativeTabs getCreativeTabToDisplayOn() {
		return null;
	}
	

	public int getMetaFromState(IBlockState state) 
	{
		return ((Integer) state.getValue(AGE)).intValue();
	}
	
	   public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
	    {
	        if ((rand.nextInt(3) == 0 || this.countNeighbors(worldIn, pos) < 4))
	        {
	            this.slightlyMelt(worldIn, pos, state, rand, true);
	        }
	        else
	        {
	            worldIn.scheduleUpdate(pos, this, MathHelper.getInt(rand, 20, 40));
	        }
	        BlockPos blockpos = pos.up();
	        IBlockState iblockstate = worldIn.getBlockState(blockpos);
	 
	        if (iblockstate.getBlock() == Blocks.WATER || iblockstate.getBlock() == Blocks.FLOWING_WATER)
	        {
	            worldIn.setBlockToAir(blockpos);
	            worldIn.playSound((EntityPlayer)null, pos, SoundEvents.BLOCK_FIRE_EXTINGUISH, SoundCategory.BLOCKS, 0.5F, 2.6F + (worldIn.rand.nextFloat() - worldIn.rand.nextFloat()) * 0.8F);
	 
	            if (worldIn instanceof WorldServer)
	            {
	                ((WorldServer)worldIn).spawnParticle(EnumParticleTypes.SMOKE_LARGE, (double)blockpos.getX() + 0.5D, (double)blockpos.getY() + 0.25D, (double)blockpos.getZ() + 0.5D, 8, 0.5D, 0.25D, 0.5D, 0.0D);
	            }
	        }
	       
	    }
	
	protected void slightlyMelt(World worldIn, BlockPos pos, IBlockState state, Random rand,
			boolean p_185681_5_) {
		int i = ((Integer) state.getValue(AGE)).intValue();

		if (i < 3) {
			  worldIn.setBlockState(pos, state.withProperty(AGE, Integer.valueOf(i + 1)), 2);
	            worldIn.scheduleUpdate(pos, this, MathHelper.getInt(rand, 20, 40));
		} else {
			this.turnIntoLava(worldIn, pos);

			if (p_185681_5_) {
				for (EnumFacing enumfacing : EnumFacing.values()) {
					BlockPos blockpos = pos.offset(enumfacing);
					IBlockState iblockstate = worldIn.getBlockState(blockpos);
					if (iblockstate.getBlock() == this)
						this.slightlyMelt(worldIn, blockpos, iblockstate, rand, false);
				}
			}
		}
	}
	

	public IBlockState getStateFromMeta(int meta) 
	{
		return this.getDefaultState().withProperty(AGE, Integer.valueOf(MathHelper.clamp(meta, 0, 3)));
	}
	
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, new IProperty[] {AGE});
	}
	
	
	public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos)
    {
        if (blockIn == this)
        {
            int i = this.countNeighbors(worldIn, pos);
 
            if (i < 2)
            {
                this.turnIntoLava(worldIn, pos);
            }
        }
    }
	

	private int countNeighbors(World world, BlockPos pos) {
		int i = 0;

		for (EnumFacing enumfacing : EnumFacing.values()) {
			if (world.getBlockState(pos.offset(enumfacing)).getBlock() == this) {
				++i;
				if (i >= 4)
					return i;
			}
		}

		return i;
	}
	
}
