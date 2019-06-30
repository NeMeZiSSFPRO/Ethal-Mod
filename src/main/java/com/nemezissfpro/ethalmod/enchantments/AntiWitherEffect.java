package com.nemezissfpro.ethalmod.enchantments;

import javax.swing.text.html.parser.Entity;

import com.nemezissfpro.ethalmod.init.ModBlocks;
import com.nemezissfpro.ethalmod.init.ModEnchantments;
import com.nemezissfpro.ethalmod.init.ModItems;
import com.nemezissfpro.ethalmod.util.Reference;

import akka.japi.Effect;
import ibxm.Player;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Enchantments;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;


@Mod.EventBusSubscriber(modid=Reference.MODID)
public class AntiWitherEffect extends Enchantment 
{
	public AntiWitherEffect() 
	{
		super(Rarity.RARE, EnumEnchantmentType.ARMOR_CHEST, new EntityEquipmentSlot[] {EntityEquipmentSlot.CHEST});
		this.setName("anti_wither_effect");
		this.setRegistryName(new ResourceLocation(Reference.MODID + ":anti_wither_effect"));
		
		ModEnchantments.ENCHANTMENTS.add(this);
		
	}
	
	@SubscribeEvent
    public static void onEntityHurt(LivingHurtEvent event)
    {
        if (event.getSource() == DamageSource.WITHER && EnchantmentHelper.getMaxEnchantmentLevel(ModEnchantments.ANTI_WITHER_EFFECT, (EntityLivingBase) event.getEntity())>0)
        {
        event.setCanceled(true);
        }
        
    }
	
	@Override
	public int getMinEnchantability(int enchantmentLevel) 
	{
		return 30 * enchantmentLevel;
	}
	
	@Override
	public int getMaxEnchantability(int enchantmentLevel) 
	{
		return this.getMaxEnchantability(enchantmentLevel) + 10;
	}
	
	@Override
	public int getMaxLevel() 
	{
		return 1;
	}
	
	@Override
	protected boolean canApplyTogether(Enchantment ench) 
	{
		return super.canApplyTogether(ench) && ench != Enchantments.PROTECTION;
	}
}
