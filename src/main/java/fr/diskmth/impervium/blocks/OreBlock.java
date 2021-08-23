package fr.diskmth.impervium.blocks;

import java.util.Random;

import fr.diskmth.impervium.init.BlocksInit;
import fr.diskmth.impervium.init.ItemsInit;
import net.minecraft.block.BlockOre;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class OreBlock extends BlockOre
{
	private boolean multipleDrop = false;
	private boolean isFortuneEnable = false;
	private boolean isExpDropEnable = false;
	private int minDrop;
	private int maxDrop;
	private int minExpDrop;
	private int maxExpDrop;
	
	public OreBlock (String name, float hardness, float resistance, int harvesLevel, SoundType sound)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setHardness(hardness);
		setResistance(resistance);
		setHarvestLevel("pickaxe", harvesLevel);
		setSoundType(sound);
	}
	
	@SuppressWarnings("static-access")
	public OreBlock (String name, float hardness, float resistance, int harvesLevel, SoundType sound, int minDrop, int maxDrop, boolean isFortuneEnable,  boolean isExpDropEnable, int minExpDrop, int maxExpDrop)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setHardness(hardness);
		setResistance(resistance);
		setHarvestLevel("pickaxe", harvesLevel);
		setSoundType(sound);
		this.multipleDrop = true;
		this.minDrop = minDrop;
		this.maxDrop = maxDrop;
		this.isFortuneEnable = isFortuneEnable;
		this.isExpDropEnable = isExpDropEnable;
		this.minExpDrop = minExpDrop;
		this.maxExpDrop = maxExpDrop;
	}
	
	public Item getItemDropped(IBlockState state, Random random, int fortune)
	{
		
		if (this == BlocksInit.IRIDIUM_ORE)
		{
			return ItemsInit.IRIDIUM;
		}
		
		if (this == BlocksInit.IMPERVIUM_ORE)
		{
			return ItemsInit.IMPERVIUM;
		}
		
		else
		{
			return Item.getItemFromBlock(this);
		}
		
	}
	
	@SuppressWarnings("static-access")
	public int quantityDropped(int fortune, Random random)
	{
		if (isFortuneEnable == true)
		{
			if (fortune > 0)
			{
				int j = random.nextInt(fortune + 2) - 1;
				
				if (j < 0)
				{
					j = 0;
				}
					return quantityDropped(random) * (j + 1);
			}
			
			else
			{
				return this.multipleDrop ? this.minDrop + random.nextInt(this.maxDrop - this.minDrop) : 1;
			}
		}
		
		else
		{
			return this.multipleDrop ? this.minDrop + random.nextInt(this.maxDrop - this.minDrop) : 1;
		}
	}
	
	@Override
	public ItemStack getSilkTouchDrop(IBlockState state) 
	{
			return super.getSilkTouchDrop(state);
	}
	
	@Override
	public int getExpDrop(IBlockState state, IBlockAccess world, BlockPos pos, int fortune)
	{
		if (isExpDropEnable)
		{
			Random rand = world instanceof World ? ((World)world).rand : new Random();
			
			if(this.getItemDropped(state, rand, fortune) != Item.getItemFromBlock(this))
			{
				
				if (this == BlocksInit.IRIDIUM_ORE)
				{
					return MathHelper.getInt(rand, minExpDrop, maxExpDrop);
				}
				
				if (this == BlocksInit.IMPERVIUM_ORE)
				{
					return MathHelper.getInt(rand, minExpDrop, maxExpDrop);
				}
			}
		}
		return 0;
	}
	
}
	
















