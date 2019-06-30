package com.nemezissfpro.ethalmod.objects.items.procedure;



import com.nemezissfpro.ethalmod.objects.items.ItemBase;

import net.minecraft.entity.Entity;

public class EnderBladeMHit 
{
	public EnderBladeMHit(ItemBase instance) {
		super();
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.setFire(5);
	}

}
