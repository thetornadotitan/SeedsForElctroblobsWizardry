package t3mods.seedsforelectroblobswizardry.t3s4ebw.common.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import t3mods.seedsforelectroblobswizardry.t3s4ebw.MyMod;
import t3mods.seedsforelectroblobswizardry.t3s4ebw.util.IHasModel;

public class ItemBase extends Item implements IHasModel{
	
	public ItemBase (String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MISC);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		MyMod.proxy.registerItemRender(this, 0, "inventory");
	}
	
}
