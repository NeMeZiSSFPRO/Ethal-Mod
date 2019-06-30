package com.nemezissfpro.ethalmod.util.handlers;

import com.nemezissfpro.ethalmod.Main;
import com.nemezissfpro.ethalmod.init.ModBlocks;
import com.nemezissfpro.ethalmod.init.ModEnchantments;
import com.nemezissfpro.ethalmod.init.ModItems;
import com.nemezissfpro.ethalmod.objects.blocks.world.gen.WorldGenOres;

import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@EventBusSubscriber
public class RegistryHandler 
{
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
	}
	
	@SubscribeEvent
	public static void onEnchantmentRegister(RegistryEvent.Register<Enchantment> event)
	{
		event.getRegistry().registerAll(ModEnchantments.ENCHANTMENTS.toArray(new Enchantment[0]));
	}
	
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event)
	{
		event.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));
	}
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event)
	{
        for(Item item : ModItems.ITEMS) {
            
            Main.proxy.registerItemRenderer(item, 0, "inventory");
        }
        for(Block block : ModBlocks.BLOCKS) {
            
            Main.proxy.registerItemRenderer(Item.getItemFromBlock(block), 0, "inventory");
        }
	}
	
	public static void otherRegistries()
	{
		GameRegistry.registerWorldGenerator(new WorldGenOres(), 0);
	}
	
}