package fr.diskmth.impervium.init;

import fr.diskmth.impervium.items.ArmorItem;
import fr.diskmth.impervium.items.AxeItem;
import fr.diskmth.impervium.items.BasicItem;
import fr.diskmth.impervium.items.PickaxeItem;
import fr.diskmth.impervium.items.ShovelItem;
import fr.diskmth.impervium.items.StickItem;
import fr.diskmth.impervium.items.SwordItem;
import fr.diskmth.impervium.utils.References;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = References.MODID)
public class ItemsInit 
{
	/*
	 * Declaration des items
	 */
	/*--------------------items--------------------*/
	//minerai
	public static Item PLATINE;
	public static Item IRIDIUM;
	public static Item IMPERVIUM;
	//sticks
	public static Item NEUTRAL_STICK;
	public static Item HEAL_STICK;
	public static Item SPEED_STICK;
	public static Item STRENGHT_STICK;
	public static Item HASTE_STICK;
	public static Item FEATHER_FALLING_STICK;
	//fish
	public static Item FLYING_FISH;
	//brewing
	public static Item FLYING_FISH_FEATHER;
	//pillage
	public static Item PLATINE_GUNPOWDER;
	public static Item IRIDIUM_GUNPOWDER;
	public static Item IMPERVIUM_GUNPOWDER;
	public static Item PLATINE_COMPRESSED_GUNPOWDER;
	public static Item IRIDIUM_COMPRESSED_GUNPOWDER;
	public static Item IMPERVIUM_COMPRESSED_GUNPOWDER;
	/*--------------------tools--------------------*/
	//platine
	public static ItemSword PLATINE_SWORD;
	public static ItemPickaxe PLATINE_PICKAXE;
	public static AxeItem PLATINE_AXE;
	public static ItemSpade PLATINE_SHOVEL;
	//iridium
	public static ItemSword IRIDIUM_SWORD;
	public static ItemPickaxe IRIDIUM_PICKAXE;
	public static AxeItem IRIDIUM_AXE;
	public static ItemSpade IRIDIUM_SHOVEL;
	//impervium
	public static ItemSword IMPERVIUM_SWORD;
	public static ItemPickaxe IMPERVIUM_PICKAXE;
	public static AxeItem IMPERVIUM_AXE;
	public static ItemSpade IMPERVIUM_SHOVEL;
	/*--------------------armors--------------------*/
	//platine
	public static ItemArmor PLATINE_HELMET;
	public static ItemArmor PLATINE_CHESTPLATE;
	public static ItemArmor PLATINE_LEGGING;
	public static ItemArmor PLATINE_BOOTS;
	//iridium
	public static ItemArmor IRIDIUM_HELMET;
	public static ItemArmor IRIDIUM_CHESTPLATE;
	public static ItemArmor IRIDIUM_LEGGING;
	public static ItemArmor IRIDIUM_BOOTS;
	//impervium
	public static ItemArmor IMPERVIUM_HELMET;
	public static ItemArmor IMPERVIUM_CHESTPLATE;
	public static ItemArmor IMPERVIUM_LEGGING;
	public static ItemArmor IMPERVIUM_BOOTS;
	
	
	/*
	 * Initialisation des items
	 */
	public static void init ()
	{
		/*--------------------items--------------------*/
		//minerai
		PLATINE = new BasicItem("platine");
		IRIDIUM = new BasicItem("iridium");
		IMPERVIUM = new BasicItem("impervium");
		//sticks
		NEUTRAL_STICK = new BasicItem("neutral_stick");
		HEAL_STICK = new StickItem("heal_stick", "heal", 2);
		SPEED_STICK = new StickItem("speed_stick", "speed", 2);
		STRENGHT_STICK = new StickItem("strenght_stick", "strenght", 2);
		HASTE_STICK = new StickItem("haste_stick", "haste", 2);
		FEATHER_FALLING_STICK = new StickItem("feather_falling_stick", "feather_falling", 2);
		//fish
		FLYING_FISH = new BasicItem("flying_fish");
		//brewing
		FLYING_FISH_FEATHER = new BasicItem("flying_fish_feather");
		//pillage
		PLATINE_GUNPOWDER = new BasicItem("platine_gunpowder");
		IRIDIUM_GUNPOWDER = new BasicItem("iridium_gunpowder");
		IMPERVIUM_GUNPOWDER = new BasicItem("impervium_gunpowder");
		PLATINE_COMPRESSED_GUNPOWDER = new BasicItem("platine_compressed_gunpowder");
		IRIDIUM_COMPRESSED_GUNPOWDER = new BasicItem("iridium_compressed_gunpowder");
		IMPERVIUM_COMPRESSED_GUNPOWDER = new BasicItem("impervium_compressed_gunpowder");
		/*--------------------tools--------------------*/
		//platine
		PLATINE_SWORD = new SwordItem(SwordItem.PLATINE, "platine_sword", "platine");
		PLATINE_PICKAXE = new PickaxeItem(PickaxeItem.PLATINE, "platine_pickaxe", "platine");
		PLATINE_AXE = new AxeItem(AxeItem.PLATINE, "platine_axe", "platine");
		PLATINE_SHOVEL = new ShovelItem(ShovelItem.PLATINE, "platine_shovel", "platine");
		//iridium
		IRIDIUM_SWORD = new SwordItem(SwordItem.IRIDIUM, "iridium_sword", "iridium");
		IRIDIUM_PICKAXE = new PickaxeItem(PickaxeItem.IRIDIUM, "iridium_pickaxe", "iridium");
		IRIDIUM_AXE = new AxeItem(AxeItem.IRIDIUM, "iridium_axe", "iridium");
		IRIDIUM_SHOVEL = new ShovelItem(ShovelItem.IRIDIUM, "iridium_shovel", "iridium");
		//impervium
		IMPERVIUM_SWORD = new SwordItem(SwordItem.IMPERVIUM, "impervium_sword", "impervium");
		IMPERVIUM_PICKAXE = new PickaxeItem(PickaxeItem.IMPERVIUM, "impervium_pickaxe", "impervium");
		IMPERVIUM_AXE = new AxeItem(AxeItem.IMPERVIUM, "impervium_axe", "impervium");
		IMPERVIUM_SHOVEL = new ShovelItem(ShovelItem.IMPERVIUM, "impervium_shovel", "impervium");
		/*--------------------armors--------------------*/
		//platine
		PLATINE_HELMET = new ArmorItem("platine_helmet", ArmorItem.PLATINE, 1, EntityEquipmentSlot.HEAD, "platine");
		PLATINE_CHESTPLATE = new ArmorItem("platine_chestplate", ArmorItem.PLATINE, 1, EntityEquipmentSlot.CHEST, "platine");
		PLATINE_LEGGING = new ArmorItem("platine_legging", ArmorItem.PLATINE, 2, EntityEquipmentSlot.LEGS, "platine");
		PLATINE_BOOTS = new ArmorItem("platine_boots", ArmorItem.PLATINE, 1, EntityEquipmentSlot.FEET, "platine");
		//iridium
		IRIDIUM_HELMET = new ArmorItem("iridium_helmet", ArmorItem.IRIDIUM, 1, EntityEquipmentSlot.HEAD, "iridium");
		IRIDIUM_CHESTPLATE = new ArmorItem("iridium_chestplate", ArmorItem.IRIDIUM, 1, EntityEquipmentSlot.CHEST, "iridium");
		IRIDIUM_LEGGING = new ArmorItem("iridium_legging", ArmorItem.IRIDIUM, 2, EntityEquipmentSlot.LEGS, "iridium");
		IRIDIUM_BOOTS = new ArmorItem("iridium_boots", ArmorItem.IRIDIUM, 1, EntityEquipmentSlot.FEET, "iridium");
		//impervium
		IMPERVIUM_HELMET = new ArmorItem("impervium_helmet", ArmorItem.IMPERVIUM, 1, EntityEquipmentSlot.HEAD, "impervium");
		IMPERVIUM_CHESTPLATE = new ArmorItem("impervium_chestplate", ArmorItem.IMPERVIUM, 1, EntityEquipmentSlot.CHEST, "impervium");
		IMPERVIUM_LEGGING = new ArmorItem("impervium_legging", ArmorItem.IMPERVIUM, 2, EntityEquipmentSlot.LEGS, "impervium");
		IMPERVIUM_BOOTS = new ArmorItem("impervium_boots", ArmorItem.IMPERVIUM, 1, EntityEquipmentSlot.FEET, "impervium");
	}
	
	
	/*
	 * Enregistrement des items
	 */
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event)
	{
		/*--------------------items--------------------*/
		//minerai
		event.getRegistry().registerAll(PLATINE);
		event.getRegistry().registerAll(IRIDIUM);
		event.getRegistry().registerAll(IMPERVIUM);
		//sticks
		event.getRegistry().registerAll(NEUTRAL_STICK);
		event.getRegistry().registerAll(HEAL_STICK);
		event.getRegistry().registerAll(SPEED_STICK);
		event.getRegistry().registerAll(STRENGHT_STICK);
		event.getRegistry().registerAll(HASTE_STICK);
		event.getRegistry().registerAll(FEATHER_FALLING_STICK);
		//fish
		event.getRegistry().registerAll(FLYING_FISH);
		//brewing
		event.getRegistry().registerAll(FLYING_FISH_FEATHER);
		//pillage
		event.getRegistry().registerAll(PLATINE_GUNPOWDER);
		event.getRegistry().registerAll(IRIDIUM_GUNPOWDER);
		event.getRegistry().registerAll(IMPERVIUM_GUNPOWDER);
		event.getRegistry().registerAll(PLATINE_COMPRESSED_GUNPOWDER);
		event.getRegistry().registerAll(IRIDIUM_COMPRESSED_GUNPOWDER);
		event.getRegistry().registerAll(IMPERVIUM_COMPRESSED_GUNPOWDER);
		/*--------------------tools--------------------*/
		//platine
		event.getRegistry().registerAll(PLATINE_SWORD);
		event.getRegistry().registerAll(PLATINE_PICKAXE);
		event.getRegistry().registerAll(PLATINE_AXE);
		event.getRegistry().registerAll(PLATINE_SHOVEL);
		//iridium
		event.getRegistry().registerAll(IRIDIUM_SWORD);
		event.getRegistry().registerAll(IRIDIUM_PICKAXE);
		event.getRegistry().registerAll(IRIDIUM_AXE);
		event.getRegistry().registerAll(IRIDIUM_SHOVEL);
		//impervium
		event.getRegistry().registerAll(IMPERVIUM_SWORD);
		event.getRegistry().registerAll(IMPERVIUM_PICKAXE);
		event.getRegistry().registerAll(IMPERVIUM_AXE);
		event.getRegistry().registerAll(IMPERVIUM_SHOVEL);
		/*--------------------armors--------------------*/
		//platine
		event.getRegistry().registerAll(PLATINE_HELMET);
		event.getRegistry().registerAll(PLATINE_CHESTPLATE);
		event.getRegistry().registerAll(PLATINE_LEGGING);
		event.getRegistry().registerAll(PLATINE_BOOTS);
		//iridium
		event.getRegistry().registerAll(IRIDIUM_HELMET);
		event.getRegistry().registerAll(IRIDIUM_CHESTPLATE);
		event.getRegistry().registerAll(IRIDIUM_LEGGING);
		event.getRegistry().registerAll(IRIDIUM_BOOTS);
		//impervium
		event.getRegistry().registerAll(IMPERVIUM_HELMET);
		event.getRegistry().registerAll(IMPERVIUM_CHESTPLATE);
		event.getRegistry().registerAll(IMPERVIUM_LEGGING);
		event.getRegistry().registerAll(IMPERVIUM_BOOTS);
	}
	
	
	/*
	 * Enregistrement du rendu des items
	 */
	@SubscribeEvent
	public static void registerRenders(ModelRegistryEvent event)
	{
		/*--------------------items--------------------*/
		//minerai
		registerRender(PLATINE);
		registerRender(IRIDIUM);
		registerRender(IMPERVIUM);
		//sticks
		registerRender(NEUTRAL_STICK);
		registerRender(SPEED_STICK);
		registerRender(HEAL_STICK);
		registerRender(STRENGHT_STICK);
		registerRender(HASTE_STICK);
		registerRender(FEATHER_FALLING_STICK);
		//fish
		registerRender(FLYING_FISH);
		//brewing
		registerRender(FLYING_FISH_FEATHER);
		//pillage
		registerRender(PLATINE_GUNPOWDER);
		registerRender(IRIDIUM_GUNPOWDER);
		registerRender(IMPERVIUM_GUNPOWDER);
		registerRender(PLATINE_COMPRESSED_GUNPOWDER);
		registerRender(IRIDIUM_COMPRESSED_GUNPOWDER);
		registerRender(IMPERVIUM_COMPRESSED_GUNPOWDER);
		/*--------------------tools--------------------*/
		//platine
		registerRender(PLATINE_SWORD);
		registerRender(PLATINE_PICKAXE);
		registerRender(PLATINE_AXE);
		registerRender(PLATINE_SHOVEL);
		//iridium
		registerRender(IRIDIUM_SWORD);
		registerRender(IRIDIUM_PICKAXE);
		registerRender(IRIDIUM_AXE);
		registerRender(IRIDIUM_SHOVEL);
		//impervium
		registerRender(IMPERVIUM_SWORD);
		registerRender(IMPERVIUM_PICKAXE);
		registerRender(IMPERVIUM_AXE);
		registerRender(IMPERVIUM_SHOVEL);
		/*--------------------armors--------------------*/
		//platine
		registerRender(PLATINE_HELMET);
		registerRender(PLATINE_CHESTPLATE);
		registerRender(PLATINE_LEGGING);
		registerRender(PLATINE_BOOTS);
		//iridium
		registerRender(IRIDIUM_HELMET);
		registerRender(IRIDIUM_CHESTPLATE);
		registerRender(IRIDIUM_LEGGING);
		registerRender(IRIDIUM_BOOTS);
		//impervium
		registerRender(IMPERVIUM_HELMET);
		registerRender(IMPERVIUM_CHESTPLATE);
		registerRender(IMPERVIUM_LEGGING);
		registerRender(IMPERVIUM_BOOTS);
	}
	
	/*
	 * Ne pas toucher
	 */
	private static void registerRender(Item item)
	{
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
