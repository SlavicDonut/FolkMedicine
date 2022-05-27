package donut.folkmedicine.common.tileentity;

import net.minecraft.tileentity.SignTileEntity;
import net.minecraft.tileentity.TileEntityType;

public class FolkMedicineSignTileEntity extends SignTileEntity {

    @Override
    public TileEntityType<?> getType()
    {
        return FolkMedicineEntityTypes.SIGN.get();
    }
}
