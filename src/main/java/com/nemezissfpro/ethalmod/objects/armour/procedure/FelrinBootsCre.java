package com.nemezissfpro.ethalmod.objects.armour.procedure;

import com.nemezissfpro.ethalmod.init.ModEnchantments;
import com.nemezissfpro.ethalmod.objects.items.ItemBase;

import net.minecraft.init.Enchantments;
import net.minecraft.item.ItemStack;

public class FelrinBootsCre 
{
	public FelrinBootsCre(ItemBase instance) {
		super();
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			return;
		}
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		if ((Math.random() < 1)) {
			itemstack.addEnchantment(ModEnchantments.LAVA_WALKING, 1);
		}

	}
}
