package com.nemezissfpro.ethalmod.objects.items.procedure;



import com.nemezissfpro.ethalmod.objects.items.ItemBase;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;

public class EnchEndBladeMHit 
{
	public EnchEndBladeMHit(ItemBase instance) {
		super();
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.setFire(15);
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.WEAKNESS, 100, 2, (false), (false)));
		if (entity instanceof EntityLivingBase)
		((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.NAUSEA, 100, 2, (false), (false)));
	}

}
