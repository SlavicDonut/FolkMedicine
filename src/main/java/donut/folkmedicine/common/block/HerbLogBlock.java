package donut.folkmedicine.common.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.RotatedPillarBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.util.Direction;

public class HerbLogBlock extends RotatedPillarBlock {

    public HerbLogBlock(MaterialColor color1, MaterialColor color2) {
        super(AbstractBlock.Properties.of(Material.WOOD, (x) -> {
            return x.getValue(RotatedPillarBlock.AXIS) == Direction.Axis.Y ? color1 : color2;
        }).strength(2.0F).sound(SoundType.WOOD));
    }
}
