package com.nemezissfpro.ethalmod.objects.items;

import com.nemezissfpro.ethalmod.Main;
import com.nemezissfpro.ethalmod.init.ModItems;
import com.nemezissfpro.ethalmod.objects.items.procedure.SlowMobHit;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.world.World;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

public class ToolSouliteAxe extends ItemAxe 
{
	public ToolSouliteAxe(String name, ToolMaterial material)
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
			SlowMobHit.executeProcedure($_dependencies);
		}
		return true;
	}
	
}
