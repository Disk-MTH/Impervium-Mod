package fr.diskmth.impervium.items;

import fr.diskmth.impervium.init.ItemsInit;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

@SuppressWarnings("static-access")
public class ShovelItem extends ItemSpade {

	public static final ToolMaterial PLATINE = new EnumHelper().addToolMaterial("platine", 4, 1951, 10.0f, 1.0f, 15);
	public static final ToolMaterial IRIDIUM = new EnumHelper().addToolMaterial("IRIDIUM", 5, 2439, 12.0f, 1.0f, 15);
	public static final ToolMaterial IMPERVIUM = new EnumHelper().addToolMaterial("impervium", 6, 3049, 14.0f, 1.0f, 15);
	
	private String tyofShovel = "";

	public ShovelItem (ToolMaterial material, String name, String tyofShovel) 
	{
		super(material);
		setRegistryName(name);
		setUnlocalizedName(name);
		this.tyofShovel = tyofShovel;
	}
	
    public boolean getIsRepairable(ItemStack input, ItemStack repair)
    {
    	if (tyofShovel == "platine")
    	{
    		if(repair.getItem() == ItemsInit.PLATINE)
    		{
    			return true;
    		}
    	}	
    	
        if (tyofShovel == "IRIDIUM")
        {
        	if(repair.getItem() == ItemsInit.IRIDIUM)
        	{
        		return true;
        	}
        }
        	
        if (tyofShovel == "impervium")
        {
        	if(repair.getItem() == ItemsInit.IMPERVIUM)
        	{
        		return true;
        	}
    	}
        return false;
    }
}
