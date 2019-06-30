package com.nemezissfpro.ethalmod.objects.blocks.world.gen;

import java.util.Random;
import java.util.function.Predicate;

import com.nemezissfpro.ethalmod.init.ModBlocks;

import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenOres implements IWorldGenerator
{
	 @Override
	    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
		{
	        if(world.provider.getDimension()== 0) 
			{
	          generateOre(ModBlocks.OBSIDIAN_PONIUM_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 2, 6, random.nextInt(4) + 6, 5, BlockMatcher.forBlock(Blocks.STONE));
	          generateOre(ModBlocks.OBSIDIAN_AVENTURINE_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 6, 9, random.nextInt(4) + 4, 5, BlockMatcher.forBlock(Blocks.STONE));
	          
	        }
	        
			else if(world.provider.getDimension()== -1) 
			{
	           generateOre(ModBlocks.NETHERRACK_AVENTURINE_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 60, 200, random.nextInt(4) + 4, 5, BlockMatcher.forBlock(Blocks.NETHERRACK));
	           generateOre(ModBlocks.NETHERRACK_PONIUM_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 60, 200, random.nextInt(4) + 6, 5, BlockMatcher.forBlock(Blocks.NETHERRACK));
	           
	        } 
	        
			else if(world.provider.getDimension()== 1) 
			{
	        	generateOre(ModBlocks.ANGELITE_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 200, random.nextInt(4) + 4, 20, BlockMatcher.forBlock(Blocks.END_STONE));
	        	generateOre(ModBlocks.ENDSTONE_AVENTURINE_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 200, random.nextInt(4) + 1, 10, BlockMatcher.forBlock(Blocks.END_STONE));
	        	generateOre(ModBlocks.ENDSTONE_PONIUM_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 200, random.nextInt(4) + 1, 10, BlockMatcher.forBlock(Blocks.END_STONE));
	        	
	        }
	        
	    }
	
	private void generateOre(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances, BlockMatcher blockMatcher)
	{
		int deltaY = maxY - minY;
		
		for(int i = 0; i < chances; i++)
		{
			BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));
			
			WorldGenMinable generator = new WorldGenMinable(ore, size, blockMatcher);
			generator.generate(world, random, pos);
		}

	}
}
