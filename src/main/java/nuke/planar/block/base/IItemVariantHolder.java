package nuke.planar.block.base;

import net.minecraft.client.renderer.*;
import nuke.planar.item.base.*;

/**
 * All following code is borrowed from Pahimar's EE3 source located here:
 * https://github.com/pahimar/Equivalent-Exchange/blob/master/src/main/java/com/pahimar/ee/item/base/IItemVariantHolder.java
 * @author Pahimar
 * @param <T>
 */
public interface IItemVariantHolder<T extends PlanarItemBase> {
	T getItem();

	String[] getVariants();

	default ItemMeshDefinition getCustomMeshDefinition() {
		return null;
	}
}