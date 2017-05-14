package nuke.planar.proxy;

import net.minecraft.creativetab.*;
import net.minecraftforge.fml.common.event.*;
import nuke.planar.*;
import nuke.planar.reg.*;
import nuke.planar.tab.*;

public class CommonProxy {

	public static CreativeTabs PLANAR_TAB;

	public void preInit( FMLPreInitializationEvent e ) {
		PLANAR_TAB = new CreativeTab(References.MODID);
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
