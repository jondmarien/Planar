package nuke.planar.core;

import net.minecraft.creativetab.*;
import net.minecraft.item.*;
import net.minecraftforge.common.*;
import net.minecraftforge.fml.common.*;
import net.minecraftforge.fml.common.Mod.*;
import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.fml.relauncher.*;
import nuke.planar.client.util.*;
import nuke.planar.common.*;

@Mod(modid = References.MODID, name = References.NAME, version = References.VERSION, clientSideOnly = false, serverSideOnly = false)
public class Planar {

	@Instance(References.MODID)
	public static Planar instance;

	@SidedProxy(clientSide = References.CLIENT_PROXY_CLASS, serverSide = References.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;

	@EventHandler
	public void preInit( FMLPreInitializationEvent e ) {
		MinecraftForge.EVENT_BUS.register(new Config());
		Config.initConfig(e.getSuggestedConfigurationFile());
		References.LOGGER.info("Config is loaded!");
		this.proxy.preInit(e);
	}

	@EventHandler
	public void init( FMLInitializationEvent e ) {
		this.proxy.init(e);
	}

	@EventHandler
	public void postInit( FMLPostInitializationEvent e ) {
		References.LOGGER.info("Planar has loaded!");
		this.proxy.postInit(e);
	}

	public static CreativeTabs planarTab = new CreativeTabs("planar.general") {
		@Override
		public String getTabLabel() {
			return "planar.general";
		}

		@Override
		@SideOnly(Side.CLIENT)
		public ItemStack getTabIconItem() {
			return new ItemStack(Content.goggles);
		}
	};

	public static String prependModID( String name ) {
		return References.MODID + ":" + name;
	}

	public static String prependModIDCapacity( String name ) {
		return References.MODID + ":" + name + "Capacity";
	}
}