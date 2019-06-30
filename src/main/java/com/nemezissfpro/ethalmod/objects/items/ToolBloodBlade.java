package com.nemezissfpro.ethalmod.objects.items;

import com.nemezissfpro.ethalmod.Main;
import com.nemezissfpro.ethalmod.init.ModItems;
import com.nemezissfpro.ethalmod.objects.items.procedure.BloodBladeMHit;
import com.nemezissfpro.ethalmod.objects.items.procedure.BloodBladeRClick;

import net.minecraft.item.ItemSword;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;

public class ToolBloodBlade extends ItemSword
{
	public ToolBloodBlade(String name, ToolMaterial material)
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
	public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer entity, EnumHand hand) {
		ActionResult<ItemStack> retval = super.onItemRightClick(world, entity, hand);
		ItemStack itemstack = retval.getResult();
		double x = entity.posX;
		double y = entity.posY;
		double z = entity.posZ;
		{
			java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
			$_dependencies.put("entity", entity);
			BloodBladeRClick.executeProcedure($_dependencies);
		}
		return retval;
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
			BloodBladeMHit.executeProcedure($_dependencies);
		}
		return true;
	}

	
}
