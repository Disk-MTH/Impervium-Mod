package fr.diskmth.impervium.init;

import fr.diskmth.impervium.creativetabs.CreativeTab;
import net.minecraft.creativetab.CreativeTabs;

public class CreativeTabInit 
{
	public static CreativeTabs IMPERVIUM_TAB;
	
	public static void init() 
	{
		IMPERVIUM_TAB = new CreativeTab("impervium");
	}
}


