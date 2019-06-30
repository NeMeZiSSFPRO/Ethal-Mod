package com.nemezissfpro.ethalmod.objects.items;

import com.nemezissfpro.ethalmod.Main;
import com.nemezissfpro.ethalmod.init.ModItems;
import com.nemezissfpro.ethalmod.objects.items.procedure.FelrinItemCreTool;
import com.nemezissfpro.ethalmod.objects.items.procedure.SetMobFireProcedure;

import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item.ToolMaterial;

public class ToolFelrinAxe extends ItemAxe
{
	public ToolFelrinAxe(String name, ToolMaterial material)
	{
		super(material, 6.0F, -3.2F);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.ethaltools);
		
		ModItems.ITEMS.add(this);
	}
	
	public void registerModels() 
	{	
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
	
	@Override
	public boolean hitEntity(ItemStack itemstack, EntityLivingBase entity, EntityLivingBase entity2) {
		super.hitEntity(itemstack, entity, entity2);
		double x = entity.posX;
		double y = entity.posY;
		double z = entity.posZ;
		World world = entity.world;
		{
			java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
			$_dependencies.put("entity", entity);
			SetMobFireProcedure.executeProcedure($_dependencies);
		}
		return true;
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
			FelrinItemCreTool.executeProcedure($_dependencies);
		}
	}

}
