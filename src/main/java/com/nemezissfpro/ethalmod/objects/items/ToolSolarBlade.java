package com.nemezissfpro.ethalmod.objects.items;

import com.nemezissfpro.ethalmod.Main;
import com.nemezissfpro.ethalmod.init.ModItems;
import com.nemezissfpro.ethalmod.objects.items.procedure.SetMobFireProcedure;
import com.nemezissfpro.ethalmod.objects.items.procedure.SolarBladeRClick;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.world.World;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;

public class ToolSolarBlade extends ItemSword
{
	public ToolSolarBlade(String name, ToolMaterial material)
	{
		super(material);
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
	public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer entity, EnumHand hand) {
		ActionResult<ItemStack> retval = super.onItemRightClick(world, entity, hand);
		ItemStack itemstack = retval.getResult();
		double x = entity.posX;
		double y = entity.posY;
		double z = entity.posZ;
		{
			java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
			$_dependencies.put("entity", entity);
			$_dependencies.put("world", world);
			SolarBladeRClick.executeProcedure($_dependencies);
		}
		return retval;
	}

	
}
