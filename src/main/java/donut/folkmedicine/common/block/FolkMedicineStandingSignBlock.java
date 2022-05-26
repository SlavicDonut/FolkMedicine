package donut.folkmedicine.common.block;

import donut.folkmedicine.common.tileentity.FolkMedicineSignTileEntity;
import net.minecraft.block.BlockState;
import net.minecraft.block.StandingSignBlock;
import net.minecraft.block.WoodType;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

public class FolkMedicineStandingSignBlock extends StandingSignBlock
{
    public FolkMedicineStandingSignBlock(Properties p_i225764_1_, WoodType p_i225764_2_) {
        super(p_i225764_1_, p_i225764_2_);
    }

    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }

    @Override
    public TileEntity createNewTileEntity(IBlockReader p_196283_1_) {
        return new FolkMedicineSignTileEntity();
    }
}
