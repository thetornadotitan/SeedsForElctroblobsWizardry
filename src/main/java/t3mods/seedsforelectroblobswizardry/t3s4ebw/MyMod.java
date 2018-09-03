package t3mods.seedsforelectroblobswizardry.t3s4ebw;

import org.apache.logging.log4j.Logger;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import t3mods.seedsforelectroblobswizardry.t3s4ebw.proxies.IProxy;

@Mod(modid = MyMod.MODID, name = MyMod.NAME, version = MyMod.VERSION, acceptedMinecraftVersions = MyMod.ACCEPTED_VERSIONS, dependencies = MyMod.DEPS)
public class MyMod
{
    public static final String MODID = "t3s4ebw";
    public static final String NAME = "Seeds For Electroblob's Wizardry";
    public static final String VERSION = "1.0";
    public static final String ACCEPTED_VERSIONS = "1.12.2";
    public static final String DEPS = "required-after:ebwizardry@[4.1.1,]";

    private static Logger logger;
    
    @SidedProxy(clientSide = "t3mods.seedsforelectroblobswizardry.t3s4ebw.proxies.ClientProxy", serverSide = "t3mods.seedsforelectroblobswizardry.t3s4ebw.proxies.ServerProxy")
    public static IProxy proxy;
    
    @EventHandler
    public void PreInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        proxy.PreInit(event);
    }

    @EventHandler
    public void Init(FMLInitializationEvent event)
    {
        // some example code
        proxy.Init(event);
    }
    
    @EventHandler
    public void PostInit(FMLPostInitializationEvent event)
    {
    	proxy.PostInit(event);
    }
}
