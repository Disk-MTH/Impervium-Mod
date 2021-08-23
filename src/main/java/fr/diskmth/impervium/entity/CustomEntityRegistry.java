package fr.diskmth.impervium.entity;

import fr.diskmth.impervium.entity.tnt.EntityPillerTNTExtraLargePrimed;
import fr.diskmth.impervium.entity.tnt.EntityPillerTNTLargePrimed;
import fr.diskmth.impervium.entity.tnt.EntityPillerTNTPrimed;
import fr.diskmth.impervium.entity.tnt.EntityCustomTNTExtraLargePrimed;
import fr.diskmth.impervium.entity.tnt.EntityCustomTNTLargePrimed;
import fr.diskmth.impervium.entity.tnt.EntityCustomTNTPrimed;
import fr.diskmth.impervium.utils.References;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class CustomEntityRegistry 
{
	public static void init()
	{
		EntityRegistry.registerModEntity(new ResourceLocation(References.MODID, "custom_tnt"), EntityCustomTNTPrimed.class, "entity_custom_tnt_primed", 1, References.MODID, 128, 1, true);
		EntityRegistry.registerModEntity(new ResourceLocation(References.MODID, "custom_tnt_large"), EntityCustomTNTLargePrimed.class, "entity_custom_tnt_large_primed", 2, References.MODID, 128, 1, true);
		EntityRegistry.registerModEntity(new ResourceLocation(References.MODID, "custom_tnt_extra_large"), EntityCustomTNTExtraLargePrimed.class, "entity_custom_tnt_extra_large_primed", 3, References.MODID, 128, 1, true);
		EntityRegistry.registerModEntity(new ResourceLocation(References.MODID, "piller_tnt"), EntityPillerTNTPrimed.class, "entity_piller_tnt_primed", 4, References.MODID, 128, 1, true);
		EntityRegistry.registerModEntity(new ResourceLocation(References.MODID, "piller_tnt_large"), EntityPillerTNTLargePrimed.class, "entity_piller_tnt_large_primed", 5, References.MODID, 128, 1, true);
		EntityRegistry.registerModEntity(new ResourceLocation(References.MODID, "piller_tnt_extra_large"), EntityPillerTNTExtraLargePrimed.class, "entity_piller_tnt_extra_large_primed", 6, References.MODID, 128, 1, true);
	}
}
