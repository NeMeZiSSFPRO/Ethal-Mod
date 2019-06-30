package com.nemezissfpro.ethalmod.enchantments;

import java.rmi.registry.Registry;
import java.util.HashMap;
import java.util.Map;

import com.nemezissfpro.ethalmod.init.ModBlocks;
import com.nemezissfpro.ethalmod.init.ModEnchantments;
import com.nemezissfpro.ethalmod.util.Reference;

import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.init.Enchantments;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantment.Rarity;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;


@Mod.EventBusSubscriber(modid=Reference.MODID)
public class LavaWalking extends Enchantment
{
	public LavaWalking() 
	{
		super(Rarity.RARE, EnumEnchantmentType.ARMOR_FEET, new EntityEquipmentSlot[] {EntityEquipmentSlot.FEET});
		this.setName("lava_walking");
		this.setRegistryName(new ResourceLocation(Reference.MODID + ":lava_walking"));
		
		ModEnchantments.ENCHANTMENTS.add(this);
	}
	
	@Override
	public int getMaxLevel() {
		return 1;
	}

	@Override
	public int getMinEnchantability(int enchantmentLevel) {
		return enchantmentLevel * 10;
	}

	@Override
	public int getMaxEnchantability(int enchantmentLevel) {
		return this.getMinEnchantability(enchantmentLevel) + 10;
	}
	
	@Override
	protected boolean canApplyTogether(Enchantment ench) 
	{
		return super.canApplyTogether(ench) && ench != Enchantments.FROST_WALKER;
	}
	
    public static void walkOnLava(EntityLivingBase living, World worldIn, BlockPos pos, int level)
    {
            if (living.onGround)
            {
                float f = (float)Math.min(16, 2 + level);
                BlockPos.MutableBlockPos blockpos = new BlockPos.MutableBlockPos(0, 0, 0);
 
                for (BlockPos.MutableBlockPos blockpos1 : BlockPos.getAllInBoxMutable(pos.add((double)(-f), -1.0D, (double)(-f)), pos.add((double)f, -1.0D, (double)f)))
                {
                    if (blockpos1.distanceSqToCenter(living.posX, living.posY, living.posZ) <= (double)(f * f))
                    {
                        blockpos.setPos(blockpos1.getX(), blockpos1.getY() + 1, blockpos1.getZ());
                        IBlockState iblockstate = worldIn.getBlockState(blockpos);
 
                        if (iblockstate.getMaterial() == Material.AIR)
                        {
                            IBlockState iblockstate1 = worldIn.getBlockState(blockpos1);
 
                            if (iblockstate1.getMaterial() == Material.LAVA && (iblockstate1.getBlock() == Blocks.LAVA || iblockstate1.getBlock() == Blocks.FLOWING_LAVA) && ((Integer)iblockstate1.getValue(BlockLiquid.LEVEL)).intValue() == 0 && worldIn.mayPlace(ModBlocks.LAVA_WALKER_BLOCK, blockpos1, false, EnumFacing.DOWN, (Entity)null))
                            {
                                worldIn.setBlockState(blockpos1, ModBlocks.LAVA_WALKER_BLOCK.getDefaultState());
                                worldIn.scheduleUpdate(blockpos1.toImmutable(), ModBlocks.LAVA_WALKER_BLOCK, MathHelper.getInt(living.getRNG(), 60, 120));
                                //living.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, (int) 60, (int) 0));
                               
                            }
                        }
                    }
                }
            }
        }
       
       

	
	@SubscribeEvent
	public static void onLavaWalk(LivingEvent.LivingUpdateEvent event) {
		EntityLivingBase entity = event.getEntityLiving();
		int enchLevel = EnchantmentHelper.getMaxEnchantmentLevel(ModEnchantments.LAVA_WALKING,
				entity);
		if (enchLevel != 0 && !entity.getEntityWorld().isRemote && enchLevel > 0 && hasMoved(entity))
			walkOnLava(entity, entity.getEntityWorld(), new BlockPos(entity), enchLevel);
	}

	private static Map<Integer, Double> PREV_X = new HashMap<>();
	private static Map<Integer, Double> PREV_Z = new HashMap<>();

	private static boolean hasMoved(EntityLivingBase living) {
		int id = living.getEntityId();
		double currX = living.posX;
		double currZ = living.posZ;
		if (!PREV_X.containsKey(id) || !PREV_Z.containsKey(id)) {
			PREV_X.put(id, currX);
			PREV_Z.put(id, currZ);
			return false;
		}
		double prevX = PREV_X.get(id);
		double prevZ = PREV_Z.get(id);
		PREV_X.put(id, currX);
		PREV_Z.put(id, currZ);
		return Math.abs(currX - prevX) > 0.0001 || Math.abs(currZ - prevZ) > 0.0001;
	}
	
}
