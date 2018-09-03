package t3mods.seedsforelectroblobswizardry.t3s4ebw.proxies;

import org.apache.logging.log4j.Logger;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ServerProxy implements IProxy{

	private static Logger logger;
	
	@Override
	public void PreInit(FMLPreInitializationEvent event) {
		logger = event.getModLog();
		logger.info("Pre-Init Called on server", this);
	}

	@Override
	public void Init(FMLInitializationEvent event) {
		
	}

	@Override
	public void PostInit(FMLPostInitializationEvent event) {
		
	}

	@Override
	public void registerItemRender(Item item, int meta, String id) {
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), id));
	}

}
