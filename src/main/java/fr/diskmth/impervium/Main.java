package fr.diskmth.impervium;

import fr.diskmth.impervium.entity.CustomEntityRegistry;
import fr.diskmth.impervium.init.BlocksInit;
import fr.diskmth.impervium.init.CreativeTabInit;
import fr.diskmth.impervium.init.ItemsInit;
import fr.diskmth.impervium.init.PotionsInit;
import fr.diskmth.impervium.init.RecipesInit;
import fr.diskmth.impervium.utils.CommonProxy;
import fr.diskmth.impervium.utils.References;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = References.MODID, name = References.NAME, version = References.VERSION)
public class Main 
{
	@SidedProxy(clientSide = References.CLIENT, serverSide = References.COMMON)
	public static CommonProxy proxy;
	
	public static org.apache.logging.log4j.Logger logger;
	
	@EventHandler
	public static void preInit (FMLPreInitializationEvent e) throws Exception 
	{
		if(e.getSide().isClient())
		{
			if(Minecraft.getMinecraft().mcDataDir.getPath().equals("."))
			{
				// on fait rien car on est sur eclipse
			}
			else if(!Minecraft.getMinecraft().mcDataDir.getPath().contains(".minecraft"))
			{
				throw(new Exception("Mauvais launcher détecté, veuillez passé par le launcher officiel d'Impervium : https://impervium.ml"));
			}
		}
		
		/*if(e.getSide().isClient())
		{
			if(!Minecraft.getMinecraft().mcDataDir.getPath().contains(".Impervium"))
			{
				throw(new Exception("Mauvais launcher détecté, veuillez passé par le launcher officiel d'Impervium : https://impervium.ml"));
			}
		}*/
		
		logger = e.getModLog();
		proxy.preInit();
		CreativeTabInit.init();
		BlocksInit.init();
		PotionsInit.init();
		ItemsInit.init();
	}
	
	@EventHandler
	public static void init (FMLInitializationEvent e) 
	{
		RecipesInit.init();
		CustomEntityRegistry.init();
	}

	@EventHandler
	public static void postInit (FMLPostInitializationEvent e) 
	{	

	}
}
