package us.getfluxed.crank.proxy;

/**
 * Created by Jared on 8/6/2016.
 */
public class ClientProxy extends CommonProxy {

    @Override
    public void registerRenderers() {
        super.registerRenderers();
		 CBlocks.init();
    }

    @Override
    public void registerEvents() {
        super.registerEvents();
    }
}
