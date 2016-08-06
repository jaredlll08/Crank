package us.getfluxed.crank.blocks;

import net.minecraft.block.Block;
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


    public static void preInit() {
        register(CRANK_WOOD, "crank_wood");
        register(CRANK_STONE, "crank_stone");
        register(CRANK_IRON, "crank_iron");

    }

    public static void init() {
//        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(CRANK_WOOD), 0, new ModelResourceLocation(Reference.MODID + ":crank_one", "inventory"));
//        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(CRANK_WOOD), 2, new ModelResourceLocation(Reference.MODID + ":crank_three", "inventory"));
//        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(CRANK_WOOD), 3, new ModelResourceLocation(Reference.MODID + ":crank_four", "inventory"));
//
//        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(CRANK_STONE), 0, new ModelResourceLocation(Reference.MODID + ":crank_one", "inventory"));
//        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(CRANK_STONE), 1, new ModelResourceLocation(Reference.MODID + ":crank_two", "inventory"));
//        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(CRANK_STONE), 2, new ModelResourceLocation(Reference.MODID + ":crank_three", "inventory"));
//        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(CRANK_STONE), 3, new ModelResourceLocation(Reference.MODID + ":crank_four", "inventory"));
//
//        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(CRANK_IRON), 0, new ModelResourceLocation(Reference.MODID + ":crank_one", "inventory"));
//        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(CRANK_IRON), 1, new ModelResourceLocation(Reference.MODID + ":crank_two", "inventory"));
//        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(CRANK_IRON), 2, new ModelResourceLocation(Reference.MODID + ":crank_three", "inventory"));
//        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(CRANK_IRON), 3, new ModelResourceLocation(Reference.MODID + ":crank_four", "inventory"));
    }

    private static void register(Block block, String key) {
        block.setUnlocalizedName(key).setCreativeTab(tab);
        GameRegistry.register(block, new ResourceLocation(Reference.MODID + ":" + key));
        GameRegistry.register(new ItemBlock(block), new ResourceLocation(Reference.MODID + ":" + key));
    }

}
