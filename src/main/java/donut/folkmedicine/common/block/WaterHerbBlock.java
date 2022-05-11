package donut.folkmedicine.common.block;

import net.minecraft.block.*;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.state.properties.DoubleBlockHalf;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nullable;
import java.util.Random;

public class WaterHerbBlock extends SeaGrassBlock {

    public WaterHerbBlock(Properties properties) {
        super(properties);
    }

    public void grow(ServerWorld worldIn, Random rand, BlockPos pos, BlockState state) {
        BlockState blockstate = ModBlocks.TALL_SWEETFLAG.getDefaultState();
        BlockState blockstate1 = blockstate.with(TallSeaGrassBlock.HALF, DoubleBlockHalf.UPPER);
        BlockPos blockpos = pos.up();
        if (worldIn.getBlockState(blockpos).matchesBlock(Blocks.AIR)) {
            worldIn.setBlockState(pos, blockstate, 2);
            worldIn.setBlockState(blockpos, blockstate1, 2);
        }
    }
}
