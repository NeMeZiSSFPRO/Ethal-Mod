package com.nemezissfpro.ethalmod;

import com.nemezissfpro.ethalmod.objects.blocks.world.gen.WorldGenOres;
import com.nemezissfpro.ethalmod.proxy.CommonProxy;
import com.nemezissfpro.ethalmod.tabs.EthalBlocks;
import com.nemezissfpro.ethalmod.tabs.EthalItems;
import com.nemezissfpro.ethalmod.tabs.EthalTools;
import com.nemezissfpro.ethalmod.util.Reference;
import com.nemezissfpro.ethalmod.util.handlers.RegistryHandler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;


@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Main {
	
	@Instance
	public static Main instance;
	
	public static final CreativeTabs ethalitems = new EthalItems("ethalitems");
	public static final CreativeTabs ethalblocks = new EthalBlocks("ethalblocks");
	public static final CreativeTabs ethaltools = new EthalTools("ethaltools");
	
	
	@SidedProxy(clientSide = Reference.CLIENTPROXY, serverSide = Reference.COMMONPROXY)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event)
	{
		RegistryHandler.otherRegistries();
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
	}
	
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event)
	{
	}

}
