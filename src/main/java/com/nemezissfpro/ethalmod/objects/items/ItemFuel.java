package com.nemezissfpro.ethalmod.objects.items;

import com.nemezissfpro.ethalmod.Main;

import net.minecraft.item.ItemStack;

public class ItemFuel extends ItemBase
{
	public ItemFuel(String name) {
		super(name);
	}
	
	
	@Override
	public int getItemBurnTime(ItemStack itemStack)
	{
		return 5000;
	}
}

