package com.nemezissfpro.ethalmod.objects.armour;

import com.nemezissfpro.ethalmod.init.ModItems;
import com.nemezissfpro.ethalmod.objects.armour.procedure.SouliteBootsCre;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.world.World;

public class EnchantedSouliteBoots extends ItemArmor
{
	public EnchantedSouliteBoots(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) 
	{
		super(materialIn, renderIndexIn, equipmentSlotIn);
		{
			setUnlocalizedName(name);
			setRegistryName(name);
			setCreativeTab(null);
			setMaxDamage(600);
			
			ModItems.ITEMS.add(this);
		}
	}
	
	@Override
	public void onCreated(ItemStack itemstack, World world, EntityPlayer entity) {
		super.onCreated(itemstack, world, entity);
		double x = entity.posX;
		double y = entity.posY;
		double z = entity.posZ;
		{
			java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
			$_dependencies.put("itemstack", itemstack);
			SouliteBootsCre.executeProcedure($_dependencies);
		}
	}
}
