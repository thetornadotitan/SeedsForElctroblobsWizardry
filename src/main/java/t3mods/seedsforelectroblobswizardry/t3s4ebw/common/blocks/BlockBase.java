package t3mods.seedsforelectroblobswizardry.t3s4ebw.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import t3mods.seedsforelectroblobswizardry.t3s4ebw.MyMod;
import t3mods.seedsforelectroblobswizardry.t3s4ebw.common.items.ModItems;
import t3mods.seedsforelectroblobswizardry.t3s4ebw.util.IHasModel;

public class BlockBase extends Block implements IHasModel{

	public BlockBase(String name, Material materialIn) {
		super(materialIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MISC);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	@Override
	public void registerModels() {
		MyMod.proxy.registerItemRender(Item.getItemFromBlock(this), 0, "inventory");
	}
	
}
