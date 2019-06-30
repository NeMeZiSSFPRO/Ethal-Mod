package com.nemezissfpro.ethalmod.objects.armour;

import com.nemezissfpro.ethalmod.Main;
import com.nemezissfpro.ethalmod.init.ModItems;
import com.nemezissfpro.ethalmod.objects.armour.models.CustomWitherArmor;
import com.nemezissfpro.ethalmod.objects.armour.procedure.FelrinBootsCre;
import com.nemezissfpro.ethalmod.objects.armour.procedure.WitherArmorCre;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.item.ItemArmor.ArmorMaterial;

public class WitherArmor extends ItemArmor
{
	public WitherArmor(String name, ArmorMaterial materialIn, EntityEquipmentSlot equipmentSlotIn) 
	{
		    super(materialIn, 1, equipmentSlotIn);
			setUnlocalizedName(name);
			setRegistryName(name);
			setCreativeTab(Main.ethaltools);
			setMaxDamage(2000);
			setMaxStackSize(1);
			
			ModItems.ITEMS.add(this);
		
	}
	
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
	
	@Override
	public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, EntityEquipmentSlot armorSlot, ModelBiped _default) 
	{
		if(itemStack != ItemStack.EMPTY)
		{
			if(itemStack.getItem() instanceof ItemArmor)
			{
				CustomWitherArmor model = new CustomWitherArmor();
				
				model.bipedHead.showModel = armorSlot == EntityEquipmentSlot.HEAD;
				model.bipedBody.showModel = (armorSlot == EntityEquipmentSlot.CHEST) || (armorSlot == EntityEquipmentSlot.CHEST);
				model.bipedRightArm.showModel = armorSlot == EntityEquipmentSlot.CHEST;
				model.bipedLeftArm.showModel = armorSlot == EntityEquipmentSlot.CHEST;
				model.bipedRightLeg.showModel = (armorSlot == EntityEquipmentSlot.LEGS);
				model.bipedLeftLeg.showModel = (armorSlot == EntityEquipmentSlot.LEGS);
				
				
				model.isSneak = _default.isSneak;
                model.isRiding = _default.isRiding;
                model.isChild = _default.isChild;
                model.rightArmPose = _default.rightArmPose;
                model.leftArmPose = _default.leftArmPose;

                return model;
				
			}
		}
		return null;
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
			WitherArmorCre.executeProcedure($_dependencies);
		}
	}
	
}
