package us.getfluxed.crank.reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import us.getfluxed.crank.blocks.CBlocks;

/**
 * Created by Jared on 8/6/2016.
 */
public class Reference {

    public static final String MODID = "crank";
    public static final String NAME = "Crank";
    public static final String VERSION = "1.0.0";

    public static final CreativeTabs tab = new CreativeTabs("Crank!") {
        @Override
        public Item getTabIconItem() {
            return Item.getItemFromBlock(CBlocks.CRANK_WOOD);
        }
    };

}
