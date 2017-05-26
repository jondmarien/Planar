package nuke.planar.common;

import java.io.*;

import net.minecraftforge.common.config.*;
import net.minecraftforge.fml.client.event.*;
import net.minecraftforge.fml.common.eventhandler.*;
import nuke.planar.client.util.*;

public class Config {
	public static Configuration cfg;
	
	public static int test;
	
	private final static String CATEGORY_MISC = "misc";
	
	public static void initConfig(File file){
		if(cfg == null){
			cfg = new Configuration(file);
			loadConfig();
		}
	}
	
	public static void loadConfig(){		
		
		cfg.addCustomCategoryComment(CATEGORY_MISC, "All options having to do with testing.");
		
		test = cfg.getInt("test", CATEGORY_MISC, 9, 0, 255, "Test Configuration.");
		
		if(cfg.hasChanged()){
			cfg.save();
		}
	}
	
	@SubscribeEvent
	public void whenConfigChanged(ConfigChangedEvent.OnConfigChangedEvent e){
		if(e.getModID().equalsIgnoreCase(References.MODID)){
			loadConfig();
		}
	}
}