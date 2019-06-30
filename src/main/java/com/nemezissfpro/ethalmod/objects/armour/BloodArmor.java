package com.nemezissfpro.ethalmod.objects.armour;

import com.nemezissfpro.ethalmod.Main;
import com.nemezissfpro.ethalmod.init.ModItems;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class BloodArmor extends ItemArmor
{

	public BloodArmor(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) 
	{
		super(materialIn, renderIndexIn, equipmentSlotIn);
		{
			setUnlocalizedName(name);
			setRegistryName(name);
			setCreativeTab(Main.ethaltools);
			setMaxDamage(1200);
			
			ModItems.ITEMS.add(this);
		}
	}
	
}
