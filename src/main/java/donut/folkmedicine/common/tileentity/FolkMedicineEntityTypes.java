package donut.folkmedicine.common.tileentity;

import donut.folkmedicine.FolkMedicine;
import donut.folkmedicine.common.block.ModBlocks;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class FolkMedicineEntityTypes
{
    public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, FolkMedicine.MOD_ID);

    public static final RegistryObject<TileEntityType<FolkMedicineSignTileEntity>> SIGN =
            TILE_ENTITY_TYPES.register("sign",
                    () -> TileEntityType.Builder.create(FolkMedicineSignTileEntity::new,
                            ModBlocks.LINDEN_SIGN.get(),
                            ModBlocks.LINDEN_WALL_SIGN.get(),
                            ModBlocks.JUNIPER_SIGN.get(),
                            ModBlocks.JUNIPER_WALL_SIGN.get(),
                            ModBlocks.SANDALWOOD_SIGN.get(),
                            ModBlocks.SANDALWOOD_WALL_SIGN.get())
                        .build(null));
}
