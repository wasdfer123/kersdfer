
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.kersdfersmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.kersdfersmod.item.NetheriamondSwordItem;
import net.mcreator.kersdfersmod.item.NetheriamondShovelItem;
import net.mcreator.kersdfersmod.item.NetheriamondPickaxeItem;
import net.mcreator.kersdfersmod.item.NetheriamondIngotItem;
import net.mcreator.kersdfersmod.item.NetheriamondHoeItem;
import net.mcreator.kersdfersmod.item.NetheriamondAxeItem;
import net.mcreator.kersdfersmod.item.NetheriamondArmorItem;
import net.mcreator.kersdfersmod.item.NetheriamondAlloyItem;
import net.mcreator.kersdfersmod.KersdfersmodMod;

public class KersdfersmodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, KersdfersmodMod.MODID);
	public static final RegistryObject<Item> NETHERIAMOND_INGOT = REGISTRY.register("netheriamond_ingot", () -> new NetheriamondIngotItem());
	public static final RegistryObject<Item> NETHERIAMOND_SWORD = REGISTRY.register("netheriamond_sword", () -> new NetheriamondSwordItem());
	public static final RegistryObject<Item> NETHERIAMOND_ALLOY = REGISTRY.register("netheriamond_alloy", () -> new NetheriamondAlloyItem());
	public static final RegistryObject<Item> NETHERIAMOND_PICKAXE = REGISTRY.register("netheriamond_pickaxe", () -> new NetheriamondPickaxeItem());
	public static final RegistryObject<Item> NETHERIAMOND_ARMOR_HELMET = REGISTRY.register("netheriamond_armor_helmet", () -> new NetheriamondArmorItem.Helmet());
	public static final RegistryObject<Item> NETHERIAMOND_ARMOR_CHESTPLATE = REGISTRY.register("netheriamond_armor_chestplate", () -> new NetheriamondArmorItem.Chestplate());
	public static final RegistryObject<Item> NETHERIAMOND_ARMOR_LEGGINGS = REGISTRY.register("netheriamond_armor_leggings", () -> new NetheriamondArmorItem.Leggings());
	public static final RegistryObject<Item> NETHERIAMOND_ARMOR_BOOTS = REGISTRY.register("netheriamond_armor_boots", () -> new NetheriamondArmorItem.Boots());
	public static final RegistryObject<Item> NETHERIAMOND_SHOVEL = REGISTRY.register("netheriamond_shovel", () -> new NetheriamondShovelItem());
	public static final RegistryObject<Item> NETHERIAMOND_AXE = REGISTRY.register("netheriamond_axe", () -> new NetheriamondAxeItem());
	public static final RegistryObject<Item> NETHERIAMOND_HOE = REGISTRY.register("netheriamond_hoe", () -> new NetheriamondHoeItem());
}
