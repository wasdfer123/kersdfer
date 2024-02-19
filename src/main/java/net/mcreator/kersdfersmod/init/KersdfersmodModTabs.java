
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.kersdfersmod.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.kersdfersmod.KersdfersmodMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class KersdfersmodModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, KersdfersmodMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(KersdfersmodModItems.NETHERIAMOND_SWORD.get());
			tabData.accept(KersdfersmodModItems.NETHERIAMOND_ARMOR_HELMET.get());
			tabData.accept(KersdfersmodModItems.NETHERIAMOND_ARMOR_CHESTPLATE.get());
			tabData.accept(KersdfersmodModItems.NETHERIAMOND_ARMOR_LEGGINGS.get());
			tabData.accept(KersdfersmodModItems.NETHERIAMOND_ARMOR_BOOTS.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(KersdfersmodModItems.NETHERIAMOND_INGOT.get());
			tabData.accept(KersdfersmodModItems.NETHERIAMOND_ALLOY.get());
			tabData.accept(KersdfersmodModItems.NETHER_GOLD.get());
			tabData.accept(KersdfersmodModItems.NETHER_GOLD_ALLOY.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(KersdfersmodModItems.NETHERIAMOND_PICKAXE.get());
			tabData.accept(KersdfersmodModItems.NETHERIAMOND_SHOVEL.get());
			tabData.accept(KersdfersmodModItems.NETHERIAMOND_AXE.get());
			tabData.accept(KersdfersmodModItems.NETHERIAMOND_HOE.get());
		}
	}
}
