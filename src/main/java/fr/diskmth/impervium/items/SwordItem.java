package fr.diskmth.impervium.items;

import fr.diskmth.impervium.init.ItemsInit;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

@SuppressWarnings("static-access")
public class SwordItem extends ItemSword {

	public static final ToolMaterial PLATINE = new EnumHelper().addToolMaterial("platine", 4, 1951, 1.0f, 13.0f, 15);
	public static final ToolMaterial IRIDIUM = new EnumHelper().addToolMaterial("IRIDIUM", 5, 2439, 1.0f, 19.0f, 15);
	public static final ToolMaterial IMPERVIUM = new EnumHelper().addToolMaterial("impervium", 6, 3049, 1.0f, 25.0f, 15);
	
	private String tyofSword = "";
	
	public SwordItem(ToolMaterial material, String name, String tyofSword) 
	{
		super(material);
		setRegistryName(name);
		setUnlocalizedName(name);
		this.tyofSword = tyofSword;
	}

    public boolean getIsRepairable(ItemStack input, ItemStack repair)
    {
    	if (tyofSword == "platine")
    	{
    		if(repair.getItem() == ItemsInit.PLATINE)
    		{
    			return true;
    		}
    	}	
    	
        if (tyofSword == "IRIDIUM")
        {
        	if(repair.getItem() == ItemsInit.IRIDIUM)
        	{
        		return true;
        	}
        }
        	
        if (tyofSword == "impervium")
        {
        	if(repair.getItem() == ItemsInit.IMPERVIUM)
        	{
        		return true;
        	}
    	}
        return false;
    }
}
