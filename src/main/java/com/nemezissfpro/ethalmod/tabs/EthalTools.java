package com.nemezissfpro.ethalmod.tabs;

import com.nemezissfpro.ethalmod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class EthalTools extends CreativeTabs
{
	public EthalTools(String label) { super("ethaltools");
	this.setBackgroundImageName("ethalmod.png"); }
    public ItemStack getTabIconItem() { return new ItemStack(ModItems.BLOOD_BLADE); }
}
