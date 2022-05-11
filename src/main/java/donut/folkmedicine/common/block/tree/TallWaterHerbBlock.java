package donut.folkmedicine.common.block.tree;

import net.minecraft.block.BlockState;
import net.minecraft.block.TallSeaGrassBlock;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.properties.DoubleBlockHalf;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;

import javax.annotation.Nullable;

public class TallWaterHerbBlock extends TallSeaGrassBlock {

    public TallWaterHerbBlock(Properties properties) {
        super(properties);
    }

    /*
    @Override
    public boolean isValidPosition(BlockState state, IWorldReader worldIn, BlockPos pos) {
        if (state.get(HALF) == DoubleBlockHalf.UPPER) {
            BlockState blockstate = worldIn.getBlockState(pos.down());
            return blockstate.matchesBlock(this) && blockstate.get(HALF) == DoubleBlockHalf.LOWER;
        } else {
            FluidState fluidstate = worldIn.getFluidState(pos);
            return super.isValidPosition(state, worldIn, pos);
        }
    }
     */

    @Override
    public FluidState getFluidState(BlockState state) {
        if (state.get(HALF) == DoubleBlockHalf.UPPER) {
            return Fluids.EMPTY.getDefaultState();
        }
        else {return Fluids.WATER.getStillFluidState(false);}
    }

}
