package nuke.planar.core;

import net.minecraftforge.fml.common.event.*;
import nuke.planar.common.*;

public class ClientProxy extends CommonProxy {
	@Override
	public void preInit( FMLPreInitializationEvent e ) {
		super.preInit(e);
		//KeybindHandler.init();
		Content.regRenders();
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