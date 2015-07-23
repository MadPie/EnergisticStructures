package DezzorDude.AEStruct.mod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

import DezzorDude.AEStruct.init;


@Mod(modid = DezzorMod.MODID, version = DezzorMod.VERSION)
public class DezzorMod
{
    public static final String MODID = "Dezzormod";
    public static final String VERSION = "1.0";
    
    @EventHandler
    public void preinit(FMLPreInitializationEvent event)
    {
		
    	init.ini();
    	
    }
}
