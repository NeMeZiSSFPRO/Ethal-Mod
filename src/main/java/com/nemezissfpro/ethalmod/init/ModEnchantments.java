package com.nemezissfpro.ethalmod.init;

import java.util.ArrayList;
import java.util.List;

import com.nemezissfpro.ethalmod.enchantments.AntiWitherEffect;
import com.nemezissfpro.ethalmod.enchantments.LavaWalking;
import com.nemezissfpro.ethalmod.enchantments.WaterWalker;
import com.nemezissfpro.ethalmod.util.Reference;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantment.Rarity;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;


@Mod.EventBusSubscriber(modid=Reference.MODID)
public class ModEnchantments 
{
	public static final List<Enchantment> ENCHANTMENTS = new ArrayList<Enchantment>();
	
	public static final Enchantment ANTI_WITHER_EFFECT = new AntiWitherEffect();
	public static final LavaWalking LAVA_WALKING = new LavaWalking();
	public static final WaterWalker WATER_WALKER = new WaterWalker();

	@SubscribeEvent
	public static void antiWitherEffectFunction(LivingUpdateEvent event)
	{
		EntityLivingBase  living = event.getEntityLiving();
		int level = EnchantmentHelper.getMaxEnchantmentLevel(ANTI_WITHER_EFFECT, living);
		BlockPos pos = living.getPosition();
		World world = event.getEntity().world;
	}
	
	@SubscribeEvent
	public static void lavaWalking(LivingUpdateEvent event)
	{
		EntityLivingBase  living = event.getEntityLiving();
		int level = EnchantmentHelper.getMaxEnchantmentLevel(LAVA_WALKING, living);
		BlockPos pos = living.getPosition();
		World world = event.getEntity().world;
	}
	@SubscribeEvent
	public static void waterWalker(LivingUpdateEvent event)
	{
		EntityLivingBase  living = event.getEntityLiving();
		int level = EnchantmentHelper.getMaxEnchantmentLevel(WATER_WALKER, living);
		BlockPos pos = living.getPosition();
		World world = event.getEntity().world;
	}
}
