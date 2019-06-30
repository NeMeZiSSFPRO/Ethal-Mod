package com.nemezissfpro.ethalmod.init;

import java.util.ArrayList;
import java.util.List;

import com.nemezissfpro.ethalmod.objects.armour.ArmourBase;
import com.nemezissfpro.ethalmod.objects.armour.BloodArmor;
import com.nemezissfpro.ethalmod.objects.armour.BoneArmor;
import com.nemezissfpro.ethalmod.objects.armour.EnchantedFelrinBoots;
import com.nemezissfpro.ethalmod.objects.armour.EnchantedSouliteBoots;
import com.nemezissfpro.ethalmod.objects.armour.FelrinArmor;
import com.nemezissfpro.ethalmod.objects.armour.FlintArmor;
import com.nemezissfpro.ethalmod.objects.armour.SouliteArmor;
import com.nemezissfpro.ethalmod.objects.armour.WitherArmor;
import com.nemezissfpro.ethalmod.objects.items.ItemBase;
import com.nemezissfpro.ethalmod.objects.items.ItemFuel;
import com.nemezissfpro.ethalmod.objects.items.ItemGlow;
import com.nemezissfpro.ethalmod.objects.items.ToolBloodBlade;
import com.nemezissfpro.ethalmod.objects.items.ToolDragonBlade;
import com.nemezissfpro.ethalmod.objects.items.ToolEclipseBlade;
import com.nemezissfpro.ethalmod.objects.items.ToolEnchantedEnderBlade;
import com.nemezissfpro.ethalmod.objects.items.ToolEnderBlade;
import com.nemezissfpro.ethalmod.objects.items.ToolFelrinAxe;
import com.nemezissfpro.ethalmod.objects.items.ToolFelrinBlade;
import com.nemezissfpro.ethalmod.objects.items.ToolFelrinHoe;
import com.nemezissfpro.ethalmod.objects.items.ToolFelrinPickaxe;
import com.nemezissfpro.ethalmod.objects.items.ToolFelrinSpade;
import com.nemezissfpro.ethalmod.objects.items.ToolLunarBlade;
import com.nemezissfpro.ethalmod.objects.items.ToolQuartzBlade;
import com.nemezissfpro.ethalmod.objects.items.ToolSimpleBlade;
import com.nemezissfpro.ethalmod.objects.items.ToolSolarBlade;
import com.nemezissfpro.ethalmod.objects.items.ToolSouliteAxe;
import com.nemezissfpro.ethalmod.objects.items.ToolSouliteBlade;
import com.nemezissfpro.ethalmod.objects.items.ToolSouliteHoe;
import com.nemezissfpro.ethalmod.objects.items.ToolSoulitePickaxe;
import com.nemezissfpro.ethalmod.objects.items.ToolSouliteSpade;
import com.nemezissfpro.ethalmod.objects.items.ToolWitherBlade;
import com.nemezissfpro.ethalmod.objects.items.ToolZombieArm;
import com.nemezissfpro.ethalmod.objects.items.WitherStaff;
import com.nemezissfpro.ethalmod.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials set
	public static final ToolMaterial MATERIAL_FELRIN_BLADE = EnumHelper.addToolMaterial("material_felrin_blade", 4, 1900, 8.0F, 18.0F, 10);
	public static final ToolMaterial MATERIAL_FELRIN_TOOL = EnumHelper.addToolMaterial("material_felrin_tool", 4, 1900, 8.0F, 1.0F, 10);
	public static final ToolMaterial MATERIAL_SOULITE_BLADE = EnumHelper.addToolMaterial("material_soulite_blade", 4, 2100, 8.0F, 18.0F, 10);
	public static final ToolMaterial MATERIAL_SOULITE_TOOL = EnumHelper.addToolMaterial("material_soulite_tool", 4, 2100, 8.0F, 1.0F, 10);
	//Materials simple
	public static final ToolMaterial MATERIAL_GOLDEN_BLADE = EnumHelper.addToolMaterial("material_golden_blade", 4, 190, 8.0F, 7.0F, 10);
	public static final ToolMaterial MATERIAL_DIAMOND_BLADE = EnumHelper.addToolMaterial("material_diamond_blade", 4, 2000, 8.0F, 15.0F, 10);
	public static final ToolMaterial MATERIAL_IRON_BLADE = EnumHelper.addToolMaterial("material_iron_blade", 4, 700, 8.0F, 10.0F, 10);
	public static final ToolMaterial MATERIAL_STONE_BLADE = EnumHelper.addToolMaterial("material_stone_blade", 4, 250, 8.0F, 6.0F, 10);
	public static final ToolMaterial MATERIAL_SKULL_BLADE = EnumHelper.addToolMaterial("material_skull_blade", 4, 1000, 8.0F, 11.0F, 10);
	public static final ToolMaterial MATERIAL_WOOD_BLADE = EnumHelper.addToolMaterial("material_wood_blade", 4, 200, 8.0F, 5.0F, 10);
	//Materials complex
	public static final ToolMaterial MATERIAL_BLOOD_BLADE = EnumHelper.addToolMaterial("material_blood_blade", 4, 3000, 8.0F, 24.0F, 10);
	public static final ToolMaterial MATERIAL_DRAGON_BLADE = EnumHelper.addToolMaterial("material_dragon_blade", 4, 4000, 8.0F, 42.0F, 10);
	public static final ToolMaterial MATERIAL_ECLIPSE_BLADE = EnumHelper.addToolMaterial("material_eclipse_blade", 4, 3500, 8.0F, 24.0F, 10);
	public static final ToolMaterial MATERIAL_ENCHANTED_ENDER_BLADE = EnumHelper.addToolMaterial("material_enchanted_ender_blade", 4, 3000, 8.0F, 26.0F, 10);
	public static final ToolMaterial MATERIAL_ENDER_BLADE = EnumHelper.addToolMaterial("material_ender_blade", 4, 1900, 8.0F, 16.0F, 10);
	public static final ToolMaterial MATERIAL_LANDS_BLADE = EnumHelper.addToolMaterial("material_lands_blade", 4, 2400, 8.0F, 22.0F, 10);
	public static final ToolMaterial MATERIAL_QUARTZ_BLADE = EnumHelper.addToolMaterial("material_quartz_blade", 4, 1700, 8.0F, 12.0F, 10);
	public static final ToolMaterial MATERIAL_ZOMBIE_ARM = EnumHelper.addToolMaterial("material_zombie_arm", 4, 200, 8.0F, 7.0F, 10);
	public static final ToolMaterial MATERIAL_WITHER_BLADE = EnumHelper.addToolMaterial("material_wither_blade", 4, 2500, 8.0F, 22.0F, 10);
	
	//Material Armour
	public static final ArmorMaterial BLOOD_ARMOUR = EnumHelper.addArmorMaterial("blood_armor", Reference.MODID + ":blood",  33, new int[]{3, 5, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
	public static final ArmorMaterial FELRIN_ARMOUR = EnumHelper.addArmorMaterial("felrin_armor", Reference.MODID + ":felrin",  27, new int[]{3, 4, 7, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 2.0F);
	public static final ArmorMaterial SOULITE_ARMOUR = EnumHelper.addArmorMaterial("soulite_armor", Reference.MODID + ":soulite",  27, new int[]{3, 4, 7, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static final ArmorMaterial FLINT_ARMOUR = EnumHelper.addArmorMaterial("flint_armor", Reference.MODID + ":flint", 15, new int[]{2, 5, 6, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial BONE_ARMOUR = EnumHelper.addArmorMaterial("bone_armour", Reference.MODID + ":bone", 15, new int[]{3, 5, 6, 3}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial WITHER_ARMOUR = EnumHelper.addArmorMaterial("wither_armour", Reference.MODID + ":wither", 40, new int[]{5, 7, 10, 3}, 9, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);




	
	//Tools set
	public static final ItemSword FELRIN_BALDE = new ToolFelrinBlade("felrin_blade", MATERIAL_FELRIN_BLADE);
	public static final ItemSpade FELRIN_SHOVEL = new ToolFelrinSpade("felrin_shovel", MATERIAL_FELRIN_TOOL);
	public static final ItemPickaxe FELRIN_PICKAXE = new ToolFelrinPickaxe("felrin_pickaxe", MATERIAL_FELRIN_TOOL);
	public static final ItemAxe FELRIN_AXE = new ToolFelrinAxe("felrin_axe", MATERIAL_FELRIN_TOOL);
	public static final ItemHoe FELRIN_HOE = new ToolFelrinHoe("felrin_hoe", MATERIAL_FELRIN_TOOL);
	
	public static final ItemSword SOULITE_BALDE = new ToolSouliteBlade("soulite_blade", MATERIAL_SOULITE_BLADE);
	public static final ItemSpade SOULITE_SHOVEL = new ToolSouliteSpade("soulite_shovel", MATERIAL_SOULITE_TOOL);
	public static final ItemPickaxe SOULITE_PICKAXE = new ToolSoulitePickaxe("soulite_pickaxe", MATERIAL_SOULITE_TOOL);
	public static final ItemAxe SOULITE_AXE = new ToolSouliteAxe("soulite_axe", MATERIAL_SOULITE_TOOL);
	public static final ItemHoe SOULITE_HOE = new ToolSouliteHoe("soulite_hoe", MATERIAL_SOULITE_TOOL);
	
	//Tools simple
	public static final ItemSword GOLDEN_BLADE = new ToolSimpleBlade("golden_blade", MATERIAL_GOLDEN_BLADE);
	public static final ItemSword DIAMOND_BLADE = new ToolSimpleBlade("diamond_blade", MATERIAL_DIAMOND_BLADE);
	public static final ItemSword IRON_BLADE = new ToolSimpleBlade("iron_blade", MATERIAL_IRON_BLADE);
	public static final ItemSword STONE_BLADE = new ToolSimpleBlade("stone_blade", MATERIAL_STONE_BLADE);
	public static final ItemSword SKULL_BLADE = new ToolSimpleBlade("skull_blade", MATERIAL_SKULL_BLADE);
	public static final ItemSword WOOD_BLADE = new ToolSimpleBlade("wood_blade", MATERIAL_WOOD_BLADE);
	
	//Tools complex
	public static final ItemSword BLOOD_BLADE = new ToolBloodBlade("blood_blade", MATERIAL_BLOOD_BLADE);
	public static final ItemSword DRAGON_BLADE = new ToolDragonBlade("dragon_blade", MATERIAL_DRAGON_BLADE);
	public static final ItemSword ECLIPSE_BLADE = new ToolEclipseBlade("eclipse_blade", MATERIAL_ECLIPSE_BLADE);
	public static final ItemSword ENCHANTED_ENDER_BLADE = new ToolEnchantedEnderBlade("enchanted_ender_blade", MATERIAL_ENCHANTED_ENDER_BLADE);
	public static final ItemSword ENDER_BLADE = new ToolEnderBlade("ender_blade", MATERIAL_ENDER_BLADE);
	public static final ItemSword LUNAR_BLADE = new ToolLunarBlade("lunar_blade", MATERIAL_LANDS_BLADE);
	public static final ItemSword SOLAR_BLADE = new ToolSolarBlade("solar_blade", MATERIAL_LANDS_BLADE);
	public static final ItemSword QUARTZ_BLADE = new ToolQuartzBlade("quartz_blade", MATERIAL_QUARTZ_BLADE);
	public static final ItemSword ZOMBIE_ARM = new ToolZombieArm("zombie_arm", MATERIAL_ZOMBIE_ARM);
	public static final ItemSword WITHER_BLADE = new ToolWitherBlade("wither_blade", MATERIAL_WITHER_BLADE);
	
	//Staffs
    public static final Item WITHER_STAFF = new WitherStaff("wither_staff");
    
    
    //Armors
    public static final Item BLOOD_HELMET = new BloodArmor("blood_helmet", BLOOD_ARMOUR, 1, EntityEquipmentSlot.HEAD);
    public static final Item BLOOD_CHESTPLATE = new BloodArmor("blood_chestplate", BLOOD_ARMOUR, 1, EntityEquipmentSlot.CHEST);
    public static final Item BLOOD_LEGGINGS = new BloodArmor("blood_leggings", BLOOD_ARMOUR, 2, EntityEquipmentSlot.LEGS);
    public static final Item BLOOD_BOOTS = new BloodArmor("blood_boots", BLOOD_ARMOUR, 1, EntityEquipmentSlot.FEET);
    
    public static final Item FELRIN_HELMET = new FelrinArmor("felrin_helmet", FELRIN_ARMOUR, 1, EntityEquipmentSlot.HEAD);
    public static final Item FELRIN_CHESTPLATE = new FelrinArmor("felrin_chestplate", FELRIN_ARMOUR, 1, EntityEquipmentSlot.CHEST);
    public static final Item FELRIN_LEGGINGS = new FelrinArmor("felrin_leggings", FELRIN_ARMOUR, 2, EntityEquipmentSlot.LEGS);
    public static final Item FELRIN_BOOTS = new FelrinArmor("felrin_boots", FELRIN_ARMOUR, 1, EntityEquipmentSlot.FEET);
    public static final Item ENCHANTED_FELRIN_BOOTS = new EnchantedFelrinBoots("enchanted_felrin_boots", FELRIN_ARMOUR, 1, EntityEquipmentSlot.FEET);
    
    public static final Item SOULITE_HELMET = new SouliteArmor("soulite_helmet", SOULITE_ARMOUR, 1, EntityEquipmentSlot.HEAD);
    public static final Item SOULITE_CHESTPLATE = new SouliteArmor("soulite_chestplate", SOULITE_ARMOUR, 1, EntityEquipmentSlot.CHEST);
    public static final Item SOULITE_LEGGINGS = new SouliteArmor("soulite_leggings", SOULITE_ARMOUR, 2, EntityEquipmentSlot.LEGS);
    public static final Item SOULITE_BOOTS = new SouliteArmor("soulite_boots", SOULITE_ARMOUR, 1, EntityEquipmentSlot.FEET);
    public static final Item ENCHANTED_SOULITE_BOOTS = new EnchantedSouliteBoots("enchanted_soulite_boots", SOULITE_ARMOUR, 1, EntityEquipmentSlot.FEET);
    
    public static final Item FLINT_HELMET = new FlintArmor("flint_helmet", FLINT_ARMOUR, 1, EntityEquipmentSlot.HEAD);
    public static final Item FLINT_CHESTPLATE = new FlintArmor("flint_chestplate", FLINT_ARMOUR, 1, EntityEquipmentSlot.CHEST);
    public static final Item FLINT_LEGGINGS = new FlintArmor("flint_leggings", FLINT_ARMOUR, 2, EntityEquipmentSlot.LEGS);
    public static final Item FLINT_BOOTS = new FlintArmor("flint_boots", FLINT_ARMOUR, 1, EntityEquipmentSlot.FEET);
    
    public static final Item BONE_HELMET = new BoneArmor("bone_helmet", BONE_ARMOUR, EntityEquipmentSlot.HEAD);
    public static final Item BONE_CHESTPLATE = new BoneArmor("bone_chestplate", BONE_ARMOUR, EntityEquipmentSlot.CHEST);
    public static final Item BONE_LEGGINGS = new BoneArmor("bone_leggings", BONE_ARMOUR, EntityEquipmentSlot.LEGS);
    public static final Item BONE_BOOTS = new BoneArmor("bone_boots", BONE_ARMOUR, EntityEquipmentSlot.FEET);
    
    public static final Item WITHER_HELMET = new WitherArmor("wither_helmet", WITHER_ARMOUR, EntityEquipmentSlot.HEAD);
    public static final Item WITHER_CHESTPLATE = new WitherArmor("wither_chestplate", WITHER_ARMOUR, EntityEquipmentSlot.CHEST);
    public static final Item WITHER_LEGGINGS = new WitherArmor("wither_leggings", WITHER_ARMOUR, EntityEquipmentSlot.LEGS);
    public static final Item WITHER_BOOTS = new WitherArmor("wither_boots", WITHER_ARMOUR, EntityEquipmentSlot.FEET);


	
	
	//Items
	public static final Item AIR_STAR = new ItemBase("air_star");
	public static final Item BLAZE_STICK = new ItemBase("blaze_stick");
	public static final Item BLOOD_EYE = new ItemGlow("blood_eye");
	public static final Item BLOOD_DROP = new ItemBase("blood_drop");
	public static final Item BLOOD_EXTRACTOR = new ItemBase("blood_extractor");
	public static final Item BLOOD_INGOT = new ItemBase("blood_ingot");
	public static final Item BLOOD_INGOT_ALLOY = new ItemBase("blood_ingot_alloy");
	public static final Item CORRUPTED_SYRINGE = new ItemBase("corrupted_syringe");
	public static final Item CRUSHED_ENDER_PEARL = new ItemBase("crushed_ender_pearl");
	public static final Item CRUSHED_NETHER_STAR = new ItemGlow("crushed_nether_star");
	public static final Item CRUSHED_OBSIDIAN = new ItemBase("crushed_obsidian");
	public static final Item CRUSHER_BASE_HAMMER = new ItemBase("crusher_base_hammer");
	public static final Item DIAMOND_DUST = new ItemBase("diamond_dust");
	public static final Item EARTH_STAR = new ItemBase("earth_star");
	public static final Item EMERALD_DUST = new ItemBase("emerald_dust");
	public static final Item EMPTY_SYRINGE = new ItemBase("empty_syringe");
	public static final Item ENDER_MORTAR_AND_PESTLE = new ItemBase("ender_mortar_and_pestle");
	public static final Item ENDER_OBSIDIAN_ALLOY = new ItemBase("ender_obsidian_alloy");
	public static final Item ENDER_OBSIDIAN_INGOT = new ItemBase("ender_obsidian_ingot");
	public static final Item ENDER_OBSIDIAN_HAMMER = new ItemBase("ender_obsidian_hammer");
	public static final Item ENDER_PEARL_DUST = new ItemBase("ender_pearl_dust");
	public static final Item ENDER_STAR = new ItemGlow("ender_star");
	public static final Item ENDER_STICK = new ItemBase("ender_stick");
	public static final Item EQUILIBRIUM_STAR = new ItemGlow("equilibrium_star");
	public static final Item FELRIN_DUST = new ItemBase("felrin_dust");
	public static final Item FELRIN_INGOT = new ItemBase("felrin_ingot");
	public static final Item FELRIN_NUGGET = new ItemBase("felrin_nugget");
	public static final Item FIRE_STAR = new ItemBase("fire_star");
	public static final Item FLINT_INGOT = new ItemBase("flint_ingot");
	public static final Item GRANITE_MORTAR_AND_PESTLE = new ItemBase("granite_mortar_and_pestle");
	public static final Item GRANITE_STICK = new ItemBase("granite_stick");
	public static final Item IRON_STICK = new ItemBase("iron_stick");
	public static final Item LUNAR_GEM = new ItemGlow("lunar_gem");
	public static final Item NETHER_STAR_DUST = new ItemGlow("nether_star_dust");
	public static final Item OBSIDIAN_DUST = new ItemBase("obsidian_dust");
	public static final Item SOLAR_GEM = new ItemGlow("solar_gem");
	public static final Item SOULITE_INGOT = new ItemGlow("soulite_ingot");
	public static final Item SOULITE_STICK = new ItemBase("soulite_stick");
	public static final Item STICKY_WITHER_MEAL = new ItemBase("sticky_wither_meal");
	public static final Item STONE_MORTAR_AND_PESTLE = new ItemBase("stone_mortar_and_pestle");
	public static final Item WATER_STAR = new ItemBase("water_star");
	public static final Item WITHER_BRICK_INGOT = new ItemBase("wither_brick_ingot");
	public static final Item WITHER_CLAY = new ItemBase("wither_clay");
	public static final Item WITHER_SKULL_DUST = new ItemBase("wither_skull_dust");
	public static final Item WITHER_STICK = new ItemBase("wither_stick");
	public static final Item WITHERED_BONE = new ItemBase("withered_bone");
	public static final Item WITHERED_STAR_DUST = new ItemGlow("withered_star_dust");
	public static final Item WOOD_STICK = new ItemBase("wood_stick");
	public static final Item PONIUM_GEM = new ItemBase("ponium_gem");
	public static final Item ANGELITE_GEM = new ItemBase("angelite_gem");
	public static final Item AVENTURINE_GEM = new ItemBase("aventurine_gem");
	public static final Item RESIN = new ItemFuel("resin");
	public static final Item AMBER_GEM = new ItemBase("amber_gem");
}
