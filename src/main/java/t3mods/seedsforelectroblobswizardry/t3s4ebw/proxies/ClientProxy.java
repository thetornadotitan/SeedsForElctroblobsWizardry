package t3mods.seedsforelectroblobswizardry.t3s4ebw.proxies;

import org.apache.logging.log4j.Logger;

import ca.weblite.objc.Message;
import jline.internal.Log;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import t3mods.seedsforelectroblobswizardry.t3s4ebw.common.items.ModItems;

public class ClientProxy implements IProxy {

	private static Logger logger;
	
	@Override
	public void PreInit(FMLPreInitializationEvent event) {
		logger = event.getModLog();
	}

	@Override
	public void Init(FMLInitializationEvent event) {
		
	}

	@Override
	public void PostInit(FMLPostInitializationEvent event) {
		
	}

	@Override
	public void registerItemRender(Item item, int meta, String id) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), id));
		
	}
	
}
