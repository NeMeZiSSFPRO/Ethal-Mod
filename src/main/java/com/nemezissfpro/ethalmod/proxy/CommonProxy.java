package com.nemezissfpro.ethalmod.proxy;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy 
{
	public void registerItemRenderer(Item item, int meta, String id) {}
	
	public void registerVariantRenderer(Item item, int meta, String filename, String id) {}

}
