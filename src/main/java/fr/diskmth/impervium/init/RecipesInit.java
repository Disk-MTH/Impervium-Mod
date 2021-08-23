package fr.diskmth.impervium.init;

import net.minecraft.init.Items;
import net.minecraft.init.PotionTypes;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipesInit 
{
	/*
	 * Enregistrement d'une recette de cuisson dans un four
	 */
	public static void init()
	{
		//furnace
		//ore
		GameRegistry.addSmelting(BlocksInit.PLATINE_ORE, new ItemStack(ItemsInit.PLATINE, 1), 5.0F);
		GameRegistry.addSmelting(BlocksInit.IRIDIUM_ORE, new ItemStack(ItemsInit.IRIDIUM, 1), 10.0F);
		GameRegistry.addSmelting(BlocksInit.IMPERVIUM_ORE, new ItemStack(ItemsInit.IMPERVIUM, 1), 15.0F);
		//fish
		GameRegistry.addSmelting(ItemsInit.FLYING_FISH, new ItemStack(ItemsInit.FLYING_FISH_FEATHER, 2), 5.0F);
		//brewing
		//feather_falling
		PotionHelper.addMix(PotionTypes.AWKWARD, ItemsInit.FLYING_FISH_FEATHER, PotionsInit.FEATHER_FALLING);
		PotionHelper.addMix(PotionsInit.FEATHER_FALLING, Items.REDSTONE, PotionsInit.LONG_FEATHER_FALLING);
		//haste
		PotionHelper.addMix(PotionTypes.AWKWARD, Items.RABBIT_HIDE, PotionsInit.HASTE);
		PotionHelper.addMix(PotionsInit.HASTE, Items.REDSTONE, PotionsInit.LONG_HASTE);
		PotionHelper.addMix(PotionsInit.HASTE, Items.GLOWSTONE_DUST, PotionsInit.STRONG_HASTE);
		//blindness
		PotionHelper.addMix(PotionTypes.NIGHT_VISION, Items.FERMENTED_SPIDER_EYE, PotionsInit.BLINDNESS);
		PotionHelper.addMix(PotionsInit.BLINDNESS, Items.REDSTONE, PotionsInit.LONG_BLINDNESS);
		PotionHelper.addMix(PotionTypes.LONG_NIGHT_VISION, Items.FERMENTED_SPIDER_EYE, PotionsInit.LONG_BLINDNESS);
	}
}