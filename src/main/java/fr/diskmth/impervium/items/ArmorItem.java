package fr.diskmth.impervium.items;

import fr.diskmth.impervium.init.ItemsInit;
import fr.diskmth.impervium.utils.References;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;

@SuppressWarnings("static-access")
public class ArmorItem extends ItemArmor {
	
	public static final ArmorMaterial PLATINE = new EnumHelper().addArmorMaterial("platine", References.MODID + ":platine", 150, new int[] {4, 7, 9, 4}, 15, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0f);
	public static final ArmorMaterial IRIDIUM = new EnumHelper().addArmorMaterial("IRIDIUM", References.MODID + ":IRIDIUM", 150, new int[] {5, 8, 10, 5}, 15, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0f);
	public static final ArmorMaterial IMPERVIUM = new EnumHelper().addArmorMaterial("impervium", References.MODID + ":impervium", 150, new int[] {6, 9, 11, 6}, 15, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0f);
	
	private String tyofArmor = "";
	
	public ArmorItem(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn, String tyofArmor) 
	{	
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		this.tyofArmor = "";
	}
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		
		super.onArmorTick(world, player, itemStack);
	}
	
    public boolean getIsRepairable(ItemStack input, ItemStack repair)
    {
    	if (tyofArmor == "platine")
    	{
    		if(repair.getItem() == ItemsInit.PLATINE)
    		{
    			return true;
    		}
    	}	
    	
        if (tyofArmor == "IRIDIUM")
        {
        	if(repair.getItem() == ItemsInit.IRIDIUM)
        	{
        		return true;
        	}
        }
        	
        if (tyofArmor == "impervium")
        {
        	if(repair.getItem() == ItemsInit.IMPERVIUM)
        	{
        		return true;
        	}
    	}
        return false;
    }
}