package us.getfluxed.crank.blocks;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import us.getfluxed.crank.reference.Reference;

/**
 * Created by Jared on 8/6/2016.
 */
public class CBlocks {

    public static BlockCrank CRANK = new BlockCrank();

    public static void preInit() {
        register(CRANK, "crank");
    }

    public static void init() {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(CRANK), 0, new ModelResourceLocation(Reference.MODID + ":crank_one"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(CRANK), 1, new ModelResourceLocation(Reference.MODID + ":crank_two"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(CRANK), 2, new ModelResourceLocation(Reference.MODID + ":crank_three"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(CRANK), 3, new ModelResourceLocation(Reference.MODID + ":crank_four"));

    }

    private static void register(Block block, String key) {
        block.setUnlocalizedName(key);
        GameRegistry.register(block, new ResourceLocation(Reference.MODID + ":" + key));
        GameRegistry.register(new ItemBlock(block), new ResourceLocation(Reference.MODID + ":" + key));
    }

}
