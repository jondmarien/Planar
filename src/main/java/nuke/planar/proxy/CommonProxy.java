package nuke.planar.proxy;

import net.minecraftforge.fml.common.event.*;
import nuke.planar.reg.*;

public class CommonProxy {

	public void preInit( FMLPreInitializationEvent e ) {
		PlanarContent.init();
		//ModRecipes.init(); 
	}

	public void init( FMLInitializationEvent e ) {
		//TEContent.registerTEs();
	}

	public void postInit( FMLPostInitializationEvent e ) {
		//NetworkRegistry.INSTANCE.registerGuiHandler(Planar.instance, new GuiHandler());
	}
}
