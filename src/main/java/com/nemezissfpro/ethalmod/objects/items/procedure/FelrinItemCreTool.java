package com.nemezissfpro.ethalmod.objects.items.procedure;



import com.nemezissfpro.ethalmod.objects.items.ItemBase;

import net.minecraft.init.Enchantments;
import net.minecraft.item.ItemStack;

public class FelrinItemCreTool 
{
	public FelrinItemCreTool (ItemBase instance) {
		super();
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			return;
		}
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		if ((Math.random() < 0.2)) {
			itemstack.addEnchantment(Enchantments.VANISHING_CURSE, 1);
		}
		if ((Math.random() < 0.05)) {
			itemstack.addEnchantment(Enchantments.VANISHING_CURSE, 1);
			itemstack.addEnchantment(Enchantments.MENDING, 1);
		}
	}

}
