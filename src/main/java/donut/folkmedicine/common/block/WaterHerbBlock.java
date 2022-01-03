package donut.folkmedicine.common.block;

import net.minecraft.block.*;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;
import java.util.Random;

public class WaterHerbBlock extends BushBlock implements IGrowable, ILiquidContainer, net.minecraftforge.common.IForgeShearable {
    protected static final VoxelShape SHAPE = Block.box(2.0D, 0.0D, 2.0D, 14.0D, 12.0D, 14.0D);


    protected WaterHerbBlock(Properties properties) {
        super(properties);
    }

    @Override
    public VoxelShape getShape(BlockState p_220053_1_, IBlockReader p_220053_2_, BlockPos p_220053_3_, ISelectionContext p_220053_4_) {
        return SHAPE;
    }

    @Override
    protected boolean mayPlaceOn(BlockState state, IBlockReader reader, BlockPos pos) {
        return state.isFaceSturdy(reader, pos, Direction.UP) && state.is(Blocks.DIRT);
    }

    @Nullable
    public BlockState getStateForPlacement(BlockItemUseContext useContext) {
        FluidState fluidstate = useContext.getLevel().getFluidState(useContext.getClickedPos());
        return fluidstate.is(FluidTags.WATER) && fluidstate.getAmount() == 8 ? super.getStateForPlacement(useContext) : null;
    }

    @Override
    public boolean isValidBonemealTarget(IBlockReader reader, BlockPos blockPos, BlockState blockState, boolean p_176473_4_) {
        return false;
    }

    @Override
    public boolean isBonemealSuccess(World world, Random random, BlockPos pos, BlockState state) {
        return false;
    }

    @Override
    public void performBonemeal(ServerWorld world, Random random, BlockPos pos, BlockState state) {

    }

    @Override
    public boolean canPlaceLiquid(IBlockReader blockReader, BlockPos blockPos, BlockState blockState, Fluid fluid) {
        return false;
    }

    @Override
    public boolean placeLiquid(IWorld world, BlockPos blockPos, BlockState blockState, FluidState fluidState) {
        return false;
    }

    public BlockState updateShape(BlockState blockState, Direction direction, BlockState blockState1, IWorld world, BlockPos blockPos, BlockPos blockPos1) {
        BlockState blockstate = super.updateShape(blockState, direction, blockState1, world, blockPos, blockPos1);
        if (!blockstate.isAir()) {
            world.getLiquidTicks().scheduleTick(blockPos, Fluids.WATER, Fluids.WATER.getTickDelay(world));
        }

        return blockstate;
    }

    /*
    @Override
    protected boolean mayPlaceOn(BlockState state, IBlockReader world, BlockPos pos) {
        FluidState fluidState = world.getFluidState(pos.above());
        return state.getMaterial() == Material.DIRT && fluidState.getType() == Fluids.WATER;
    }

    @Override
    public VoxelShape getShape(BlockState p_220053_1_, IBlockReader p_220053_2_, BlockPos p_220053_3_, ISelectionContext p_220053_4_) {
        return AABB;
    }


    @Override
    public boolean canSustainPlant(BlockState state, IBlockReader world, BlockPos pos, Direction facing, IPlantable plantable) {
        BlockState plant = plantable.getPlant(world, pos.offset(facing));
        net.minecraftforge.common.PlantType type = plantable.getPlantType(world, pos.offset(facing));
        if (plant.getBlock() == ModBlocks.SWEET_FLAG)
            return state.getMaterial() == Material.WATER;
        return false;
    }


    @Override
    public PlantType getPlantType(IBlockReader world, BlockPos pos) {
        return PlantType.WATER;
    }

    */
}
