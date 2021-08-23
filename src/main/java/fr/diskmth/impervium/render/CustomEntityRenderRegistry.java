package fr.diskmth.impervium.render;

import fr.diskmth.impervium.entity.tnt.EntityCustomTNTExtraLargePrimed;
import fr.diskmth.impervium.entity.tnt.EntityCustomTNTLargePrimed;
import fr.diskmth.impervium.entity.tnt.EntityCustomTNTPrimed;
import fr.diskmth.impervium.entity.tnt.EntityPillerTNTExtraLargePrimed;
import fr.diskmth.impervium.entity.tnt.EntityPillerTNTLargePrimed;
import fr.diskmth.impervium.entity.tnt.EntityPillerTNTPrimed;
import fr.diskmth.impervium.render.tnt.RenderCustomTNTExtraLargePrimed;
import fr.diskmth.impervium.render.tnt.RenderCustomTNTLargePrimed;
import fr.diskmth.impervium.render.tnt.RenderCustomTNTPrimed;
import fr.diskmth.impervium.render.tnt.RenderPillerTNTExtraLargePrimed;
import fr.diskmth.impervium.render.tnt.RenderPillerTNTLargePrimed;
import fr.diskmth.impervium.render.tnt.RenderPillerTNTPrimed;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class CustomEntityRenderRegistry 
{
	@SuppressWarnings("deprecation")
	public static void init() 
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityCustomTNTPrimed.class, new RenderCustomTNTPrimed(Minecraft.getMinecraft().getRenderManager()));
		RenderingRegistry.registerEntityRenderingHandler(EntityCustomTNTLargePrimed.class, new RenderCustomTNTLargePrimed(Minecraft.getMinecraft().getRenderManager()));
		RenderingRegistry.registerEntityRenderingHandler(EntityCustomTNTExtraLargePrimed.class, new RenderCustomTNTExtraLargePrimed(Minecraft.getMinecraft().getRenderManager()));
		RenderingRegistry.registerEntityRenderingHandler(EntityPillerTNTPrimed.class, new RenderPillerTNTPrimed(Minecraft.getMinecraft().getRenderManager()));
		RenderingRegistry.registerEntityRenderingHandler(EntityPillerTNTLargePrimed.class, new RenderPillerTNTLargePrimed(Minecraft.getMinecraft().getRenderManager()));
		RenderingRegistry.registerEntityRenderingHandler(EntityPillerTNTExtraLargePrimed.class, new RenderPillerTNTExtraLargePrimed(Minecraft.getMinecraft().getRenderManager()));
	}
}
