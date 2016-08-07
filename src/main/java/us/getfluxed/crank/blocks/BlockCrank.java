package us.getfluxed.crank.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ITickable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import javax.annotation.Nullable;

/**
 * Created by Jared on 8/6/2016.
 */
public class BlockCrank extends Block {

    public static final PropertyInteger STAGE = PropertyInteger.create("stage", 0, 3);

    private int tickCount;

    public BlockCrank(int tickCount) {
        super(Material.IRON);
        this.setDefaultState(this.blockState.getBaseState().withProperty(STAGE, 0));
        this.tickCount = tickCount;

    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean isFullCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean isFullBlock(IBlockState state) {
        return false;
    }

    @Override
    public boolean isFullyOpaque(IBlockState state) {
        return false;
    }

    @Override
    public boolean shouldSideBeRendered(IBlockState blockState, IBlockAccess blockAccess, BlockPos pos, EnumFacing side) {
        return true;
    }

    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, new IProperty[]{STAGE});
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty(STAGE, meta);
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        return state.getValue(STAGE);
    }

    @Override
    public boolean canPlaceBlockAt(World worldIn, BlockPos pos) {
        return !worldIn.isAirBlock(pos.down()) && worldIn.getTileEntity(pos.down()) instanceof ITickable;
    }

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, @Nullable ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ) {
        worldIn.setBlockState(pos, getDefaultState().withProperty(STAGE, cycle(state.getValue(STAGE))), 3);
        worldIn.setBlockState(pos, getDefaultState().withProperty(STAGE, cycle(state.getValue(STAGE))), 3);
        if (worldIn.getTileEntity(pos.down()) instanceof ITickable) {
            for (int i = 0; i < tickCount; i++)
                ((ITickable) worldIn.getTileEntity(pos.down())).update();

        }
        return true;
    }

    private int cycle(int stage) {
        return (stage + 1 < 4 ? stage + 1 : 0);
    }
}
