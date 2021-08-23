package fr.diskmth.impervium.potions;

import fr.diskmth.impervium.utils.References;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class CustomEffect extends Potion 
{	
	private String typeOfPotion = "";
	
	public CustomEffect(String name, boolean isBadEffectIn, int liquidColorIn, String typeOfPotion) 
	{
		super(isBadEffectIn, liquidColorIn);
		setPotionName(name);
		setRegistryName(new ResourceLocation(References.MODID + ":" + name));
		this.typeOfPotion = typeOfPotion;
	}
	
	@Override
	public boolean hasStatusIcon() 
	{
		return false;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void renderHUDEffect(int x, int y, PotionEffect effect, Minecraft mc, float alpha)
	{
		if (typeOfPotion == "feather_falling_effect")
		{
			mc.renderEngine.bindTexture(new ResourceLocation(References.MODID + ":textures/gui/feather_falling_icon.png"));
			Gui.drawModalRectWithCustomSizedTexture(x + 3, y + 3, 0, 0, 18, 18, 18, 18);
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void renderInventoryEffect(int x, int y, PotionEffect effect, Minecraft mc)
	{
		if (typeOfPotion == "feather_falling_effect")
		{
			mc.renderEngine.bindTexture(new ResourceLocation(References.MODID + ":textures/gui/feather_falling_icon.png"));
			Gui.drawModalRectWithCustomSizedTexture(x + 6, y + 7, 0, 0, 18, 18, 18, 18);
		}
	}
}
