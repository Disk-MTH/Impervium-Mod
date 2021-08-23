package fr.diskmth.impervium.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BasicBlock extends Block
{
	public BasicBlock(String name, Material material, float hardness, float resistance, SoundType sound)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setHardness(hardness);;
		setResistance(resistance);
		setSoundType(sound);
	}
}
