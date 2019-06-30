package com.nemezissfpro.ethalmod.objects.items;

import com.nemezissfpro.ethalmod.Main;
import com.nemezissfpro.ethalmod.init.ModItems;
import com.nemezissfpro.ethalmod.objects.items.procedure.EclipseBladeMHit;
import com.nemezissfpro.ethalmod.objects.items.procedure.EclipseBladeRClick;
import com.nemezissfpro.ethalmod.objects.items.procedure.EclipseBladeRClickB;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;

public class ToolEclipseBlade extends ItemSword
{
	public ToolEclipseBlade(String name, ToolMaterial material)
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
			EclipseBladeMHit.executeProcedure($_dependencies);
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
			EclipseBladeRClick.executeProcedure($_dependencies);
		}
		return retval;
	}

	@Override
	public EnumActionResult onItemUse(EntityPlayer entity, World world, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX,
			float hitY, float hitZ) {
		EnumActionResult retval = super.onItemUse(entity, world, pos, hand, facing, hitX, hitY, hitZ);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		ItemStack itemstack = entity.getHeldItem(hand);
		{
			java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
			$_dependencies.put("entity", entity);
			$_dependencies.put("world", world);
			EclipseBladeRClickB.executeProcedure($_dependencies);
		}
		return retval;
	}
}
