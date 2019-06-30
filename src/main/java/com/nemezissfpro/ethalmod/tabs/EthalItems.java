package com.nemezissfpro.ethalmod.tabs;

import com.nemezissfpro.ethalmod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class EthalItems extends CreativeTabs
{
	public EthalItems(String label) { super("ethalitems");
	this.setBackgroundImageName("ethalmod.png"); }
    public ItemStack getTabIconItem() { return new ItemStack(ModItems.BLOOD_EYE); }
}
