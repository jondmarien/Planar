package nuke.planar.item;

import net.minecraft.client.renderer.block.model.*;
import net.minecraft.entity.*;
import net.minecraft.entity.player.*;
import net.minecraft.item.*;
import net.minecraft.world.*;
import net.minecraftforge.client.model.*;
import net.minecraftforge.fml.common.registry.*;
import nuke.planar.*;

public class PlanarItemBase extends Item implements IModeledItem {
	/**
	 * Basic Item
	 * @param name name of item in the code
	 * @param addToTab true or false, add to tab or not
	 */
	public PlanarItemBase(String name, boolean addToTab) {
		super();
		setUnlocalizedName(name);
		this.setRegistryName(Planar.prependModID(name));
		if (addToTab) setCreativeTab(Planar.planar);
		GameRegistry.register(this);
	}

	public void onUpdate( ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected ) {
		if (entityIn instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) entityIn;
		}
	}

	@Override
	public void initModel() {
		ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName().toString()));
	}
}