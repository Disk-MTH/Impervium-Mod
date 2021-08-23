package fr.diskmth.impervium.items;

import fr.diskmth.impervium.init.PotionsInit;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class StickItem extends Item
{
	private String typeOfstick = "";
	
	public StickItem (String name, String typeOfstick, int MaxDamage)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setMaxStackSize(1);
		this.typeOfstick = typeOfstick;
		setMaxDamage(MaxDamage);
	}
	
	@SubscribeEvent
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) 
	{
		if (typeOfstick == "heal")
		{	
			if (playerIn.getHealth() >= 16)
			{
				playerIn.sendMessage(new TextComponentTranslation("healstick.tomuchhealth"));
			}
			else 
			{
				ItemStack stack = playerIn.getHeldItem(EnumHand.MAIN_HAND);
				if(!worldIn.isRemote)
				{
					playerIn.addPotionEffect(new PotionEffect(MobEffects.INSTANT_HEALTH, 1, 2));
					stack.damageItem(1, playerIn);
					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
				}
				else
				{
					return new ActionResult<ItemStack>(EnumActionResult.PASS, playerIn.getHeldItem(handIn));
				}
			}
		}
		
		/*================================================================================================================*/
		
		if (typeOfstick == "speed")
		{	
			try
			{
				if (playerIn.getActivePotionEffect(Potion.getPotionById(1)).getDuration() >= 60)
				{
					playerIn.sendMessage(new TextComponentTranslation("speedstick.tomuchtimeleft"));
				}
				else
				{
					ItemStack stack = playerIn.getHeldItem(EnumHand.MAIN_HAND);
					if(!worldIn.isRemote)
					{
						playerIn.addPotionEffect(new PotionEffect(MobEffects.SPEED, 3600, 1));
						stack.damageItem(1, playerIn);
						return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
					}
					else
					{
						return new ActionResult<ItemStack>(EnumActionResult.PASS, playerIn.getHeldItem(handIn));
					}
				}
			}
			catch (NullPointerException e)
			{
					ItemStack stack = playerIn.getHeldItem(EnumHand.MAIN_HAND);
					if(!worldIn.isRemote)
					{
						playerIn.addPotionEffect(new PotionEffect(MobEffects.SPEED, 3600, 1));
						stack.damageItem(1, playerIn);
						return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
					}
					else
					{
						return new ActionResult<ItemStack>(EnumActionResult.PASS, playerIn.getHeldItem(handIn));
					}
			}
		}
		
		/*================================================================================================================*/
		
		if (typeOfstick == "strenght")
		{
			try
			{
				if (playerIn.getActivePotionEffect(Potion.getPotionById(5)).getDuration() >= 60)
				{
					playerIn.sendMessage(new TextComponentTranslation("strenghtstick.tomuchtimeleft"));
				}
				else
				{
					ItemStack stack = playerIn.getHeldItem(EnumHand.MAIN_HAND);
					if(!worldIn.isRemote)
					{
						playerIn.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 3600, 1));
						stack.damageItem(1, playerIn);
						return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
					}
					else
					{
						return new ActionResult<ItemStack>(EnumActionResult.PASS, playerIn.getHeldItem(handIn));
					}
				}
			}
			catch (NullPointerException e)
			{
				ItemStack stack = playerIn.getHeldItem(EnumHand.MAIN_HAND);
				if(!worldIn.isRemote)
				{
					playerIn.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 3600, 1));
					stack.damageItem(1, playerIn);
					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
				}
				else
				{
					return new ActionResult<ItemStack>(EnumActionResult.PASS, playerIn.getHeldItem(handIn));
				}
			}
		}
		
		/*================================================================================================================*/
		
		if (typeOfstick == "haste")
		{
			try
			{
				if (playerIn.getActivePotionEffect(Potion.getPotionById(3)).getDuration() >= 60)
				{
					playerIn.sendMessage(new TextComponentTranslation("hastestick.tomuchtimeleft"));
				}
				else
				{
					ItemStack stack = playerIn.getHeldItem(EnumHand.MAIN_HAND);
					if(!worldIn.isRemote)
					{
						playerIn.addPotionEffect(new PotionEffect(MobEffects.HASTE, 3600, 1));
						stack.damageItem(1, playerIn);
						return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
					}
					else
					{
						return new ActionResult<ItemStack>(EnumActionResult.PASS, playerIn.getHeldItem(handIn));
					}
				}
			}
			catch (NullPointerException e)
			{
				ItemStack stack = playerIn.getHeldItem(EnumHand.MAIN_HAND);
				if(!worldIn.isRemote)
				{
					playerIn.addPotionEffect(new PotionEffect(MobEffects.HASTE, 3600, 1));
					stack.damageItem(1, playerIn);
					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
				}
				else
				{
					return new ActionResult<ItemStack>(EnumActionResult.PASS, playerIn.getHeldItem(handIn));
				}
			}
		}
		
		/*================================================================================================================*/
		
		if (typeOfstick == "feather_falling")
		{
			try 
			{
				if (playerIn.getActivePotionEffect(PotionsInit.FEATHER_FALLING_EFFECT).getDuration() >= 60)
				{
					playerIn.sendMessage(new TextComponentTranslation("featherfallingstick.tomuchtimeleft"));
				}
				else
				{
					ItemStack stack = playerIn.getHeldItem(EnumHand.MAIN_HAND);
					if(!worldIn.isRemote)
					{
						playerIn.addPotionEffect(new PotionEffect(PotionsInit.FEATHER_FALLING_EFFECT, 3600));
						stack.damageItem(1, playerIn);
						return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
					}
					else
					{
					return new ActionResult<ItemStack>(EnumActionResult.PASS, playerIn.getHeldItem(handIn));
					}
				}
			}
			catch (NullPointerException e)
			{
				ItemStack stack = playerIn.getHeldItem(EnumHand.MAIN_HAND);
				if(!worldIn.isRemote)
				{
					playerIn.addPotionEffect(new PotionEffect(PotionsInit.FEATHER_FALLING_EFFECT, 3600));
					stack.damageItem(1, playerIn);
					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
				}
				else
				{
				return new ActionResult<ItemStack>(EnumActionResult.PASS, playerIn.getHeldItem(handIn));
				}
			}
		}
		
		return new ActionResult<ItemStack>(EnumActionResult.PASS, playerIn.getHeldItem(handIn));
	}
	
	
	
}
