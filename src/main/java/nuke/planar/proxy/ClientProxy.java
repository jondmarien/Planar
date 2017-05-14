package nuke.planar.proxy;

import net.minecraftforge.fml.common.event.*;
import nuke.planar.reg.*;

public class ClientProxy extends CommonProxy {
	@Override
	public void preInit( FMLPreInitializationEvent e ) {
		super.preInit(e);
		//KeybindHandler.init();
		PlanarContent.regRenders();
	}

	@Override
	public void init( FMLInitializationEvent e ) {
		super.init(e);

	}

	@Override
	public void postInit( FMLPostInitializationEvent e ) {
		super.postInit(e);
	}
}