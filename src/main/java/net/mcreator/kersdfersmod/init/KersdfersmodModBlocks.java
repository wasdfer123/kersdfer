
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.kersdfersmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.kersdfersmod.block.PoopoocacaPortalBlock;
import net.mcreator.kersdfersmod.KersdfersmodMod;

public class KersdfersmodModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, KersdfersmodMod.MODID);
	public static final RegistryObject<Block> POOPOOCACA_PORTAL = REGISTRY.register("poopoocaca_portal", () -> new PoopoocacaPortalBlock());
}
