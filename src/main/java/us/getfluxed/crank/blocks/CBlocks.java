package us.getfluxed.crank.blocks;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import us.getfluxed.crank.reference.Reference;

import static us.getfluxed.crank.reference.Reference.tab;

/**
 * Created by Jared on 8/6/2016.
 */
public class CBlocks {

    public static BlockCrank CRANK_WOOD = new BlockCrank(2);
    public static BlockCrank CRANK_STONE = new BlockCrank(4);
    public static BlockCrank CRANK_IRON = new BlockCrank(6);
    public static BlockCrank CRANK_GOLD = new BlockCrank(8);
    public static BlockCrank CRANK_DIAMOND = new BlockCrank(10);


    public static void preInit() {
        register(CRANK_WOOD, "crank_wood");
        register(CRANK_STONE, "crank_stone");
        register(CRANK_IRON, "crank_iron");
        register(CRANK_GOLD, "crank_gold");
        register(CRANK_DIAMOND, "crank_diamond");

    }

    public static void init() {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(CRANK_WOOD), stack -> new ModelResourceLocation(Reference.MODID + ":crank_wood", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(CRANK_STONE), stack -> new ModelResourceLocation(Reference.MODID + ":crank_stone", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(CRANK_IRON), stack -> new ModelResourceLocation(Reference.MODID + ":crank_iron", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(CRANK_GOLD), stack -> new ModelResourceLocation(Reference.MODID + ":crank_gold", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(CRANK_DIAMOND), stack -> new ModelResourceLocation(Reference.MODID + ":crank_diamond", "inventory"));

    }

    private static void register(Block block, String key) {
        block.setUnlocalizedName(key).setCreativeTab(tab);
        GameRegistry.register(block, new ResourceLocation(Reference.MODID + ":" + key));
        GameRegistry.register(new ItemBlock(block), new ResourceLocation(Reference.MODID + ":" + key));
    }

}
