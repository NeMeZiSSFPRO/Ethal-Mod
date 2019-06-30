package com.nemezissfpro.ethalmod.objects.items.procedure;


import com.nemezissfpro.ethalmod.objects.items.ItemBase;

import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class HoeFandS3x3 
{
	public HoeFandS3x3(ItemBase instance) {
		super();
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			return;
		}
		if (dependencies.get("y") == null) {
			return;
		}
		if (dependencies.get("z") == null) {
			return;
		}
		if (dependencies.get("world") == null) {
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.GRASS.getDefaultState().getBlock()) || ((world
				.getBlockState(new BlockPos( x, y, z))).getBlock() == Blocks.DIRT.getDefaultState().getBlock()))) {
			if ((((world.getBlockState(new BlockPos(x, y, z)).getBlock().getHarvestLevel(world.getBlockState(new BlockPos(x,
					y, z)))) > -1) && ((world.getBlockState(new BlockPos(x, y, z)).getBlock().getHarvestLevel(world
					.getBlockState(new BlockPos(x, y, z)))) < 4))) {
				world.setBlockState(new BlockPos(x, y, z), Blocks.FARMLAND.getDefaultState(), 3);
			}
			if ((((world.getBlockState(new BlockPos((x + 1), y, z)).getBlock().getHarvestLevel(world.getBlockState(new BlockPos(
					(x + 1),y, z)))) > -1) && ((world.getBlockState(new BlockPos((x + 1), y, z)).getBlock()
					.getHarvestLevel(world.getBlockState(new BlockPos((x + 1), y, z)))) < 4))) {
				world.setBlockState(new BlockPos((x + 1), y, z), Blocks.FARMLAND.getDefaultState(), 3);
			}
			if ((((world.getBlockState(new BlockPos(x, y, (z + 1))).getBlock().getHarvestLevel(world.getBlockState(new BlockPos(
					(int) x, (int) y, (int) (z + 1))))) > -1) && ((world.getBlockState(new BlockPos(x, y, (z + 1))).getBlock()
					.getHarvestLevel(world.getBlockState(new BlockPos(x, y, (z + 1))))) < 4))) {
				world.setBlockState(new BlockPos(x, y, (z + 1)), Blocks.FARMLAND.getDefaultState(), 3);
			}
			if ((((world.getBlockState(new BlockPos(x, y, (z - 1))).getBlock().getHarvestLevel(world.getBlockState(new BlockPos(
					x, y, (z - 1))))) > -1) && ((world.getBlockState(new BlockPos(x, y, (z - 1))).getBlock()
					.getHarvestLevel(world.getBlockState(new BlockPos(x, y, (z - 1))))) < 4))) {
				world.setBlockState(new BlockPos(x, y, (z - 1)), Blocks.FARMLAND.getDefaultState(), 3);
			}
			if ((((world.getBlockState(new BlockPos((x - 1), y, z)).getBlock().getHarvestLevel(world.getBlockState(new BlockPos(
				    (x - 1), y, z)))) > -1) && ((world.getBlockState(new BlockPos((x - 1), y, z)).getBlock()
					.getHarvestLevel(world.getBlockState(new BlockPos((x - 1), y, z)))) < 4))) {
				world.setBlockState(new BlockPos((x - 1), y, z), Blocks.FARMLAND.getDefaultState(), 3);
			}
			if ((((world.getBlockState(new BlockPos(x, y, (z + 1))).getBlock().getHarvestLevel(world.getBlockState(new BlockPos(
					x, y, (z + 1))))) > -1) && ((world.getBlockState(new BlockPos(x, y, (z + 1))).getBlock()
					.getHarvestLevel(world.getBlockState(new BlockPos(x, y, (z + 1))))) < 4))) {
				world.setBlockState(new BlockPos(x, y, (z + 1)), Blocks.FARMLAND.getDefaultState(), 3);
			}
			if ((((world.getBlockState(new BlockPos((x + 1), y, (z + 1))).getBlock().getHarvestLevel(world
					.getBlockState(new BlockPos((x + 1), y, (z + 1))))) > -1) && ((world.getBlockState(
					new BlockPos((x + 1), y, (z + 1))).getBlock().getHarvestLevel(world.getBlockState(new BlockPos((x + 1),
					y, (z + 1))))) < 4))) {
				world.setBlockState(new BlockPos((x + 1), y, (z + 1)), Blocks.FARMLAND.getDefaultState(), 3);
			}
			if ((((world.getBlockState(new BlockPos((x - 1), y, (z - 1))).getBlock().getHarvestLevel(world
					.getBlockState(new BlockPos((x - 1), y, (z - 1))))) > -1) && ((world.getBlockState(
					new BlockPos((x - 1), y, (z - 1))).getBlock().getHarvestLevel(world.getBlockState(new BlockPos((x - 1),
					y, (z - 1))))) < 4))) {
				world.setBlockState(new BlockPos((x - 1), y, (z - 1)), Blocks.FARMLAND.getDefaultState(), 3);
			}
			if ((((world.getBlockState(new BlockPos((x - 1), y, (z + 1))).getBlock().getHarvestLevel(world
					.getBlockState(new BlockPos((x - 1), y, (z + 1))))) > -1) && ((world.getBlockState(
					new BlockPos((x - 1), y, (z + 1))).getBlock().getHarvestLevel(world.getBlockState(new BlockPos((x - 1),
					y, (z + 1))))) < 4))) {
				world.setBlockState(new BlockPos((x - 1), y, (z + 1)), Blocks.FARMLAND.getDefaultState(), 3);
			}
			if ((((world.getBlockState(new BlockPos((x + 1), y, (z - 1))).getBlock().getHarvestLevel(world
					.getBlockState(new BlockPos((x + 1), y, (z - 1))))) > -1) && ((world.getBlockState(
					new BlockPos((x + 1), y, (z - 1))).getBlock().getHarvestLevel(world.getBlockState(new BlockPos((x + 1),
					y, (z - 1))))) < 4))) {
				world.setBlockState(new BlockPos((x + 1), y, (z - 1)), Blocks.FARMLAND.getDefaultState(), 3);
			}
		}
	}

}
