package us.getfluxed.crank;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLLoadCompleteEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import us.getfluxed.crank.blocks.CBlocks;
import us.getfluxed.crank.proxy.CommonProxy;

import static us.getfluxed.crank.reference.Reference.*;

/**
 * Created by Jared on 8/6/2016.
 */
@Mod(modid = MODID, name = NAME, version = VERSION)
public class Crank {

    @Mod.Instance(MODID)
    public static Crank INSTANCE;

    @SidedProxy(clientSide = "us.getfluxed.crank.proxy.ClientProxy", serverSide = "us.getfluxed.crank.proxy.CommonProxy")
    public static CommonProxy PROXY;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        CBlocks.preInit();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        CBlocks.init();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {

    }


    @Mod.EventHandler
    public void loadComplete(FMLLoadCompleteEvent e) {

    }
}
