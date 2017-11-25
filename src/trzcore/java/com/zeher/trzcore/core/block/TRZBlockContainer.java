package com.zeher.trzcore.core.block;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class TRZBlockContainer extends BlockContainer {

	public TRZBlockContainer(String name, Material material, String tool, int harvest, int hardness, int resistance, CreativeTabs tab) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
		setHarvestLevel(tool, harvest);
		setHardness(hardness);
		setResistance(resistance);
	}

	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		return null;
	}

}
