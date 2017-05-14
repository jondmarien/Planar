package nuke.planar;

import net.minecraft.creativetab.*;
import net.minecraft.init.*;
import net.minecraft.item.*;
import net.minecraftforge.fml.common.*;
import net.minecraftforge.fml.common.Mod.*;
import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.fml.relauncher.*;
import nuke.planar.proxy.*;

@Mod(modid = References.MODID, name = References.NAME, version = References.VERSION, clientSideOnly = false, serverSideOnly = false)
public class Planar {

	@Instance(References.MODID)
	public static Planar instance;

	@SidedProxy(clientSide = References.CLIENT_PROXY_CLASS, serverSide = References.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;

	@EventHandler
	public void preInit( FMLPreInitializationEvent e ) {
		this.proxy.preInit(e);
	}

	@EventHandler
	public void init( FMLInitializationEvent e ) {
		this.proxy.init(e);
	}

	@EventHandler
	public void postInit( FMLPostInitializationEvent e ) {
		this.proxy.postInit(e);
	}

	public static CreativeTabs planar = new CreativeTabs("planar") {
		@Override
		public String getTabLabel() {
			return "planar";
		}

		@Override
		@SideOnly(Side.CLIENT)
		public ItemStack getTabIconItem() {
			return new ItemStack(Items.APPLE);
		}
	};

	public static String prependModID( String name ) {
		return References.MODID + ":" + name;
	}

	public static String prependModIDCapacity( String name ) {
		return References.MODID + ":" + name + "Capacity";
	}
}