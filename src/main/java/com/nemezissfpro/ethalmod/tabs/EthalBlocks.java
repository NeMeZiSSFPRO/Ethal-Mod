package com.nemezissfpro.ethalmod.tabs;

import com.nemezissfpro.ethalmod.init.ModBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class EthalBlocks extends CreativeTabs
{
	public EthalBlocks(String label) {  super("ethalblocks");
	this.setBackgroundImageName("ethalmod.png");}
    public ItemStack getTabIconItem() { return new ItemStack(Item.getItemFromBlock(ModBlocks.BLOOD_BLOCK)); }
}
