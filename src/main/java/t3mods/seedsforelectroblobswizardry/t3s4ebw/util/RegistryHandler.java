package t3mods.seedsforelectroblobswizardry.t3s4ebw.util;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import t3mods.seedsforelectroblobswizardry.t3s4ebw.common.blocks.BlockBase;
import t3mods.seedsforelectroblobswizardry.t3s4ebw.common.blocks.CrystalCrop;
import t3mods.seedsforelectroblobswizardry.t3s4ebw.common.blocks.ModBlocks;
import t3mods.seedsforelectroblobswizardry.t3s4ebw.common.items.ItemBase;
import t3mods.seedsforelectroblobswizardry.t3s4ebw.common.items.MagicSeed;
import t3mods.seedsforelectroblobswizardry.t3s4ebw.common.items.ModItems;

@EventBusSubscriber
public class RegistryHandler {
	
	public static void PrepareBlocks() {
		ModBlocks.CRYSTAL_CROP = new CrystalCrop("crystal_crop");
	}
	
	public static void PrepareItems() {
		ModItems.CRYSTAL_FLOWER_REF = ForgeRegistries.ITEMS.getValue(new ResourceLocation("ebwizardry:crystal_flower"));
		ModItems.MAGIC_SEED = new MagicSeed("magic_seed");
	}
	
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event) {
		PrepareBlocks();
		event.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));
	}
	
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event) {
		PrepareItems();
		event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
	}
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event) {
		for (Block b :  ModBlocks.BLOCKS) {
			if(b instanceof IHasModel) {
				((IHasModel) b).registerModels();
			}
		}
		for (Item i :  ModItems.ITEMS) {
			if(i instanceof IHasModel) {
				((IHasModel) i).registerModels();
			}
		}
	}
	
}
