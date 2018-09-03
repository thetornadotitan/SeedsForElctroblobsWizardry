package t3mods.seedsforelectroblobswizardry.t3s4ebw.proxies;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public interface IProxy {

	public void PreInit(FMLPreInitializationEvent event);
	public void Init(FMLInitializationEvent event);
	public void PostInit(FMLPostInitializationEvent event);
	public void registerItemRender(Item item, int meta, String id);
}
