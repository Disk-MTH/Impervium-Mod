package fr.diskmth.impervium.items;

import java.util.Set;

import com.google.common.collect.Sets;

import fr.diskmth.impervium.init.ItemsInit;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraftforge.common.util.EnumHelper;

@SuppressWarnings("static-access")
public class AxeItem extends ItemTool {
	
	public static final ToolMaterial PLATINE = new EnumHelper().addToolMaterial("platine", 4, 1951, 10.0f, 1.0f, 15);
	public static final ToolMaterial IRIDIUM = new EnumHelper().addToolMaterial("IRIDIUM", 5, 2439, 12.0f, 1.0f, 15);
	public static final ToolMaterial IMPERVIUM = new EnumHelper().addToolMaterial("impervium", 6, 3049, 14.0f, 1.0f, 15);
	
	private String tyofAxe = "";
	
    private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN, Blocks.MELON_BLOCK, Blocks.LADDER, Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE);

	public AxeItem (ToolMaterial material, String name, String tyofAxe) 
	{
		super(material, EFFECTIVE_ON);
		setRegistryName(name);
		setUnlocalizedName(name);
		this.tyofAxe = tyofAxe;
	}
	
    public float getStrVsBlock(ItemStack stack, IBlockState state)
    {
        Material material = state.getMaterial();
        return material != Material.WOOD && material != Material.PLANTS && material != Material.VINE ? 1 : this.toolMaterial.getEfficiency();
    }
    
    public boolean getIsRepairable(ItemStack input, ItemStack repair)
    {
    	if (tyofAxe == "platine")
    	{
    		if(repair.getItem() == ItemsInit.PLATINE)
    		{
    			return true;
    		}
    	}	
    	
        if (tyofAxe == "IRIDIUM")
        {
        	if(repair.getItem() == ItemsInit.IRIDIUM)
        	{
        		return true;
        	}
        }
        	
        if (tyofAxe == "impervium")
        {
        	if(repair.getItem() == ItemsInit.IMPERVIUM)
        	{
        		return true;
        	}
    	}
        return false;
    }
}
