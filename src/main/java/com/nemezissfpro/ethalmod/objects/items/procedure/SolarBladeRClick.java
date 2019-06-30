package com.nemezissfpro.ethalmod.objects.items.procedure;


import com.nemezissfpro.ethalmod.objects.items.ItemBase;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class SolarBladeRClick 
{
	public SolarBladeRClick(ItemBase instance) {
		super();
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			return;
		}
		if (dependencies.get("world") == null) {
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		World world = (World) dependencies.get("world");
		if ((Math.random() < 1)) {
			world.setWorldTime(24000); 
		   ((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 100, 3));
		}
	}
}
