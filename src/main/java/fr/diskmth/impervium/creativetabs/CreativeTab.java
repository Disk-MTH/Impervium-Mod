package fr.diskmth.impervium.creativetabs;

import fr.diskmth.impervium.init.BlocksInit;
import fr.diskmth.impervium.init.ItemsInit;
import fr.diskmth.impervium.init.PotionsInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionUtils;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class CreativeTab extends CreativeTabs
{	
	public CreativeTab(String name) 
	{
		super(name);
		this.setNoTitle();
		this.setBackgroundImageName(name + ".png");
	}

	@SideOnly(Side.CLIENT)
	@Override
	public ItemStack getTabIconItem() 
	{
			return new ItemStack(ItemsInit.IMPERVIUM);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public boolean hasSearchBar ()
	{
		return false;
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void displayAllRelevantItems(NonNullList<ItemStack> list) 
	{
		super.displayAllRelevantItems(list);
		
		//platine
	    list.add(new ItemStack(ItemsInit.PLATINE));
	    list.add(new ItemStack(BlocksInit.PLATINE_BLOCK));
	    list.add(new ItemStack(BlocksInit.PLATINE_ORE));
	    list.add(new ItemStack(ItemsInit.PLATINE_SWORD));
	    list.add(new ItemStack(ItemsInit.PLATINE_PICKAXE));
	    list.add(new ItemStack(ItemsInit.PLATINE_AXE));
	    list.add(new ItemStack(ItemsInit.PLATINE_SHOVEL));
	    list.add(new ItemStack(ItemsInit.PLATINE_HELMET));
	    list.add(new ItemStack(ItemsInit.PLATINE_CHESTPLATE));
	    list.add(new ItemStack(ItemsInit.PLATINE_LEGGING));
	    list.add(new ItemStack(ItemsInit.PLATINE_BOOTS));
	    //iridium
	    list.add(new ItemStack(ItemsInit.IRIDIUM));
	    list.add(new ItemStack(BlocksInit.IRIDIUM_BLOCK));
	    list.add(new ItemStack(BlocksInit.IRIDIUM_ORE));
	    list.add(new ItemStack(ItemsInit.IRIDIUM_SWORD));
	    list.add(new ItemStack(ItemsInit.IRIDIUM_PICKAXE));
	    list.add(new ItemStack(ItemsInit.IRIDIUM_AXE));
	    list.add(new ItemStack(ItemsInit.IRIDIUM_SHOVEL));
	    list.add(new ItemStack(ItemsInit.IRIDIUM_HELMET));
	    list.add(new ItemStack(ItemsInit.IRIDIUM_CHESTPLATE));
	    list.add(new ItemStack(ItemsInit.IRIDIUM_LEGGING));
	    list.add(new ItemStack(ItemsInit.IRIDIUM_BOOTS));
	    //impervium
	    list.add(new ItemStack(ItemsInit.IMPERVIUM));
	    list.add(new ItemStack(BlocksInit.IMPERVIUM_BLOCK));
	    list.add(new ItemStack(BlocksInit.IMPERVIUM_ORE));
	    list.add(new ItemStack(ItemsInit.IMPERVIUM_SWORD));
	    list.add(new ItemStack(ItemsInit.IMPERVIUM_PICKAXE));
	    list.add(new ItemStack(ItemsInit.IMPERVIUM_AXE));
	    list.add(new ItemStack(ItemsInit.IMPERVIUM_SHOVEL));
	    list.add(new ItemStack(ItemsInit.IMPERVIUM_HELMET));
	    list.add(new ItemStack(ItemsInit.IMPERVIUM_CHESTPLATE));
	    list.add(new ItemStack(ItemsInit.IMPERVIUM_LEGGING));
	    list.add(new ItemStack(ItemsInit.IMPERVIUM_BOOTS));
	    //sticks
	    list.add(new ItemStack(ItemsInit.NEUTRAL_STICK));
	    list.add(new ItemStack(ItemsInit.HEAL_STICK));
	    list.add(new ItemStack(ItemsInit.SPEED_STICK));
	    list.add(new ItemStack(ItemsInit.STRENGHT_STICK));
	    list.add(new ItemStack(ItemsInit.HASTE_STICK));
	    list.add(new ItemStack(ItemsInit.FEATHER_FALLING_STICK));
	    //other
	    list.add(new ItemStack(BlocksInit.X_RAY_BLOCK));
	    //pillage
	    list.add(new ItemStack(ItemsInit.PLATINE_GUNPOWDER));
	    list.add(new ItemStack(ItemsInit.IRIDIUM_GUNPOWDER));
	    list.add(new ItemStack(ItemsInit.IMPERVIUM_GUNPOWDER));
	    list.add(new ItemStack(ItemsInit.PLATINE_COMPRESSED_GUNPOWDER));
	    list.add(new ItemStack(ItemsInit.IRIDIUM_COMPRESSED_GUNPOWDER));
	    list.add(new ItemStack(ItemsInit.IMPERVIUM_COMPRESSED_GUNPOWDER));
	    list.add(new ItemStack(BlocksInit.CUSTOM_TNT));
	    list.add(new ItemStack(BlocksInit.CUSTOM_TNT_LARGE));
	    list.add(new ItemStack(BlocksInit.CUSTOM_TNT_EXTRA_LARGE));
	    list.add(new ItemStack(BlocksInit.PILLER_TNT));
	    list.add(new ItemStack(BlocksInit.PILLER_TNT_LARGE));
	    list.add(new ItemStack(BlocksInit.PILLER_TNT_EXTRA_LARGE));
	    //fish
	    list.add(new ItemStack(ItemsInit.FLYING_FISH));
	    //brewing
	    list.add(new ItemStack(ItemsInit.FLYING_FISH_FEATHER));
	    list.add(PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionsInit.FEATHER_FALLING));
	    list.add(PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionsInit.LONG_FEATHER_FALLING));
	    list.add(PotionUtils.addPotionToItemStack(new ItemStack(Items.SPLASH_POTION), PotionsInit.FEATHER_FALLING));
	    list.add(PotionUtils.addPotionToItemStack(new ItemStack(Items.SPLASH_POTION), PotionsInit.LONG_FEATHER_FALLING));
	    list.add(PotionUtils.addPotionToItemStack(new ItemStack(Items.LINGERING_POTION), PotionsInit.FEATHER_FALLING));
	    list.add(PotionUtils.addPotionToItemStack(new ItemStack(Items.LINGERING_POTION), PotionsInit.LONG_FEATHER_FALLING));
	    list.add(PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionsInit.HASTE));
	    list.add(PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionsInit.LONG_HASTE));
	    list.add(PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionsInit.STRONG_HASTE));
	    list.add(PotionUtils.addPotionToItemStack(new ItemStack(Items.SPLASH_POTION), PotionsInit.HASTE));
	    list.add(PotionUtils.addPotionToItemStack(new ItemStack(Items.SPLASH_POTION), PotionsInit.LONG_HASTE));
	    list.add(PotionUtils.addPotionToItemStack(new ItemStack(Items.SPLASH_POTION), PotionsInit.STRONG_HASTE));
	    list.add(PotionUtils.addPotionToItemStack(new ItemStack(Items.LINGERING_POTION), PotionsInit.HASTE));
	    list.add(PotionUtils.addPotionToItemStack(new ItemStack(Items.LINGERING_POTION), PotionsInit.LONG_HASTE));
	    list.add(PotionUtils.addPotionToItemStack(new ItemStack(Items.LINGERING_POTION), PotionsInit.STRONG_HASTE));
	    list.add(PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionsInit.BLINDNESS));
	    list.add(PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionsInit.LONG_BLINDNESS));
	    list.add(PotionUtils.addPotionToItemStack(new ItemStack(Items.SPLASH_POTION), PotionsInit.BLINDNESS));
	    list.add(PotionUtils.addPotionToItemStack(new ItemStack(Items.SPLASH_POTION), PotionsInit.LONG_BLINDNESS));
	    list.add(PotionUtils.addPotionToItemStack(new ItemStack(Items.LINGERING_POTION), PotionsInit.BLINDNESS));
	    list.add(PotionUtils.addPotionToItemStack(new ItemStack(Items.LINGERING_POTION), PotionsInit.LONG_BLINDNESS));
	}
}