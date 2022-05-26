package donut.folkmedicine.common.block;

import donut.folkmedicine.FolkMedicine;
import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import net.minecraft.block.WoodType;
import net.minecraft.util.ResourceLocation;

import java.util.Set;

public class FolkMedicineWoodTypes
{
    public static final Set<WoodType> WOOD_TYPES = new ObjectArraySet<>();

    public static final WoodType LINDEN = register(WoodType.create(new ResourceLocation(FolkMedicine.MOD_ID, "linden").toString()));
    public static final WoodType JUNIPER = register(WoodType.create(new ResourceLocation(FolkMedicine.MOD_ID, "juniper").toString()));
    public static final WoodType SANDALWOOD = register(WoodType.create(new ResourceLocation(FolkMedicine.MOD_ID, "sandalwood").toString()));

    private static WoodType register(WoodType woodType)
    {
        WOOD_TYPES.add(woodType);
        WoodType.register(woodType);
        return woodType;
    }
}
