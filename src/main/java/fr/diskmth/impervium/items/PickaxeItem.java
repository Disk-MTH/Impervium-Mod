package fr.diskmth.impervium.items;

import fr.diskmth.impervium.init.ItemsInit;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

@SuppressWarnings("static-access")
public class PickaxeItem extends ItemPickaxe {
	
	public static final ToolMaterial PLATINE = new EnumHelper().addToolMaterial("platine", 4, 1951, 10.0f, 1.0f, 15);
	public static final ToolMaterial IRIDIUM = new EnumHelper().addToolMaterial("IRIDIUM", 5, 2439, 12.0f, 1.0f, 15);
	public static final ToolMaterial IMPERVIUM = new EnumHelper().addToolMaterial("impervium", 6, 3049, 14.0f, 1.0f, 15);
	
	private String tyofPickaxe = "";

	public PickaxeItem (ToolMaterial material, String name, String tyofPickaxe) 
	{
		super(material);
		setRegistryName(name);
		setUnlocalizedName(name);
		this.tyofPickaxe = tyofPickaxe;
	}
	
    public boolean getIsRepairable(ItemStack input, ItemStack repair)
    {
    	if (tyofPickaxe == "platine")
    	{
    		if(repair.getItem() == ItemsInit.PLATINE)
    		{
    			return true;
    		}
    	}	
    	
        if (tyofPickaxe == "IRIDIUM")
        {
        	if(repair.getItem() == ItemsInit.IRIDIUM)
        	{
        		return true;
        	}
        }
        	
        if (tyofPickaxe == "impervium")
        {
        	if(repair.getItem() == ItemsInit.IMPERVIUM)
        	{
        		return true;
        	}
    	}
        return false;
    }
}