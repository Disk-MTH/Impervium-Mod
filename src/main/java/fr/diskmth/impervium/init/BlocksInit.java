package fr.diskmth.impervium.init;

import fr.diskmth.impervium.blocks.BasicBlock;
import fr.diskmth.impervium.blocks.OreBlock;
import fr.diskmth.impervium.blocks.XRayBlock;
import fr.diskmth.impervium.blocks.tnt.PillerTNTBlock;
import fr.diskmth.impervium.blocks.tnt.PillerTNTExtraLargeBlock;
import fr.diskmth.impervium.blocks.tnt.PillerTNTLargeBlock;
import fr.diskmth.impervium.blocks.tnt.CustomTNTBlock;
import fr.diskmth.impervium.blocks.tnt.CustomTNTLargeBlock;
import fr.diskmth.impervium.utils.References;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = References.MODID)
public class BlocksInit 
{	
	/*
	 * Declaration des blocs
	 */
	
	//platine
	public static Block PLATINE_BLOCK;
	public static Block PLATINE_ORE;
	//iridium
	public static Block IRIDIUM_BLOCK;
	public static Block IRIDIUM_ORE;
	//impervium
	public static Block IMPERVIUM_BLOCK;
	public static Block IMPERVIUM_ORE;
	//other
	public static Block X_RAY_BLOCK;
	//pillage
	public static Block CUSTOM_TNT;
	public static Block CUSTOM_TNT_LARGE;
	public static Block CUSTOM_TNT_EXTRA_LARGE;
	public static Block PILLER_TNT;
	public static Block PILLER_TNT_LARGE;
	public static Block PILLER_TNT_EXTRA_LARGE;
	
	/*
	 * Initialisation des blocs avec leurs parametres
	 */
	public static void init()
	{
		//platine
		PLATINE_BLOCK = new BasicBlock("platine_block", Material.IRON, 5.0F, 10.0F, SoundType.METAL);
		PLATINE_ORE = new OreBlock("platine_ore", 3.0F, 5.0F, 3, SoundType.STONE);
		//iridium
		IRIDIUM_BLOCK = new BasicBlock("iridium_block", Material.IRON, 5.0F, 10.0F, SoundType.METAL);
		IRIDIUM_ORE = new OreBlock("iridium_ore", 3.0F, 5.0F, 3, SoundType.STONE, 1, 2, true, true, 5, 10);
		//impervium
		IMPERVIUM_BLOCK = new BasicBlock("impervium_block", Material.IRON, 5.0F, 10.0F, SoundType.METAL);
		IMPERVIUM_ORE = new OreBlock("impervium_ore", 3.0F, 5.0F, 3, SoundType.STONE, 1, 2, false, true, 10, 15);
		//other
		X_RAY_BLOCK = new XRayBlock("x_ray_block", Material.ROCK);
		//pillage
		CUSTOM_TNT = new CustomTNTBlock("custom_tnt", Material.TNT, SoundType.SAND);
		CUSTOM_TNT_LARGE = new CustomTNTLargeBlock("custom_tnt_large", Material.TNT, SoundType.SAND);
		CUSTOM_TNT_EXTRA_LARGE = new CustomTNTLargeBlock("custom_tnt_extra_large", Material.TNT, SoundType.SAND);
		PILLER_TNT = new PillerTNTBlock("piller_tnt", Material.TNT, SoundType.SAND);
		PILLER_TNT_LARGE = new PillerTNTLargeBlock("piller_tnt_large", Material.TNT, SoundType.SAND);
		PILLER_TNT_EXTRA_LARGE = new PillerTNTExtraLargeBlock("piller_tnt_extra_large", Material.TNT, SoundType.SAND);
	}
	
	
	/*
	 * Enregistrement des blocs
	 */
	@SubscribeEvent
	public static void registerblock(RegistryEvent.Register<Block> event)
	{
		event.getRegistry().registerAll(/*platine*/PLATINE_BLOCK, PLATINE_ORE,/*iridium*/IRIDIUM_BLOCK, IRIDIUM_ORE,/*impervium*/IMPERVIUM_BLOCK, IMPERVIUM_ORE,/*other*/X_RAY_BLOCK,/*tnt*/CUSTOM_TNT, CUSTOM_TNT_LARGE, CUSTOM_TNT_EXTRA_LARGE, PILLER_TNT, PILLER_TNT_LARGE, PILLER_TNT_EXTRA_LARGE);
	}
	
	
	/*
	 * Enregistrement des items lies aux blocs
	 */
	@SubscribeEvent
	public static void registerItemBlocks(RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll(
				
				//platine
				new ItemBlock(PLATINE_BLOCK).setRegistryName(PLATINE_BLOCK.getRegistryName()),
				new ItemBlock(PLATINE_ORE).setRegistryName(PLATINE_ORE.getRegistryName()),
				//iridium
				new ItemBlock(IRIDIUM_BLOCK).setRegistryName(IRIDIUM_BLOCK.getRegistryName()),
				new ItemBlock(IRIDIUM_ORE).setRegistryName(IRIDIUM_ORE.getRegistryName()),
				//impervium
				new ItemBlock(IMPERVIUM_BLOCK).setRegistryName(IMPERVIUM_BLOCK.getRegistryName()),
				new ItemBlock(IMPERVIUM_ORE).setRegistryName(IMPERVIUM_ORE.getRegistryName()),
				//other
				new ItemBlock(X_RAY_BLOCK).setRegistryName(X_RAY_BLOCK.getRegistryName()),
				//pillage
				new ItemBlock(CUSTOM_TNT).setRegistryName(CUSTOM_TNT.getRegistryName()),
				new ItemBlock(CUSTOM_TNT_LARGE).setRegistryName(CUSTOM_TNT_LARGE.getRegistryName()),
				new ItemBlock(CUSTOM_TNT_EXTRA_LARGE).setRegistryName(CUSTOM_TNT_EXTRA_LARGE.getRegistryName()),
				new ItemBlock(PILLER_TNT).setRegistryName(PILLER_TNT.getRegistryName()),
				new ItemBlock(PILLER_TNT_LARGE).setRegistryName(PILLER_TNT_LARGE.getRegistryName()),
				new ItemBlock(PILLER_TNT_EXTRA_LARGE).setRegistryName(PILLER_TNT_EXTRA_LARGE.getRegistryName())
				);
	}
	
	
	/*
	 * Rendu des items lies aux blocs
	 */
	@SubscribeEvent
	public static void registerRenders(ModelRegistryEvent event)
	{
		//platine
		registerRender(Item.getItemFromBlock(PLATINE_BLOCK));
		registerRender(Item.getItemFromBlock(PLATINE_ORE));
		//iridium
		registerRender(Item.getItemFromBlock(IRIDIUM_BLOCK));
		registerRender(Item.getItemFromBlock(IRIDIUM_ORE));
		//impervium
		registerRender(Item.getItemFromBlock(IMPERVIUM_BLOCK));
		registerRender(Item.getItemFromBlock(IMPERVIUM_ORE));
		//other
		registerRender(Item.getItemFromBlock(X_RAY_BLOCK));
		//pillage
		registerRender(Item.getItemFromBlock(CUSTOM_TNT));
		registerRender(Item.getItemFromBlock(CUSTOM_TNT_LARGE));
		registerRender(Item.getItemFromBlock(CUSTOM_TNT_EXTRA_LARGE));
		registerRender(Item.getItemFromBlock(PILLER_TNT));
		registerRender(Item.getItemFromBlock(PILLER_TNT_LARGE));
		registerRender(Item.getItemFromBlock(PILLER_TNT_EXTRA_LARGE));
	}
	
	
	/*
	 * Ne pas toucher
	 */
	private static void registerRender(Item item)
	{
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}














