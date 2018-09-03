package t3mods.seedsforelectroblobswizardry.t3s4ebw.common.items;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import t3mods.seedsforelectroblobswizardry.t3s4ebw.MyMod;
import t3mods.seedsforelectroblobswizardry.t3s4ebw.common.blocks.ModBlocks;
import t3mods.seedsforelectroblobswizardry.t3s4ebw.util.IHasModel;

public class MagicSeed extends ItemSeeds implements IHasModel {

	public MagicSeed(String name) {
		super(ModBlocks.CRYSTAL_CROP, Blocks.FARMLAND);
		setUnlocalizedName(name);
		setRegistryName(name);
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		MyMod.proxy.registerItemRender(this, 0, "inventory");
	}
	
}
