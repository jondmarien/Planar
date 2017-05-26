package nuke.planar.core;

import net.minecraft.creativetab.*;
import net.minecraftforge.fml.common.event.*;
import nuke.planar.common.*;

public class CommonProxy {

	public static CreativeTabs PLANAR_TAB;

	public void preInit( FMLPreInitializationEvent e ) {
		Content.init();
		//ModRecipes.init();
	}

	public void init( FMLInitializationEvent e ) {
		//TEContent.registerTEs();
	}

	public void postInit( FMLPostInitializationEvent e ) {
		//NetworkRegistry.INSTANCE.registerGuiHandler(Planar.instance, new GuiHandler());
	}
}
