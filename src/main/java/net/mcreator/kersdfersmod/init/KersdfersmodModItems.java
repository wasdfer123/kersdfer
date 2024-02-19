
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.kersdfersmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.kersdfersmod.item.PoopoocacaItem;
import net.mcreator.kersdfersmod.item.NetheriamondSwordItem;
import net.mcreator.kersdfersmod.item.NetheriamondIngotItem;
import net.mcreator.kersdfersmod.KersdfersmodMod;

public class KersdfersmodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, KersdfersmodMod.MODID);
	public static final RegistryObject<Item> NETHERIAMOND_INGOT = REGISTRY.register("netheriamond_ingot", () -> new NetheriamondIngotItem());
	public static final RegistryObject<Item> POOPOOCACA = REGISTRY.register("poopoocaca", () -> new PoopoocacaItem());
	public static final RegistryObject<Item> NETHERIAMOND_SWORD = REGISTRY.register("netheriamond_sword", () -> new NetheriamondSwordItem());
}
