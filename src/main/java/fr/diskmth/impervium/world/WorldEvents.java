package fr.diskmth.impervium.world;

import fr.diskmth.impervium.init.PotionsInit;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;

@EventBusSubscriber
public class WorldEvents 
{		
	@SubscribeEvent
	public static void featherFallingActive(PlayerTickEvent event)
	{	
		if (event.player.isPotionActive(PotionsInit.FEATHER_FALLING_EFFECT)) 
		{
			event.player.fallDistance = 0;
		}
	}
}
