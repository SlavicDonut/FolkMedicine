package donut.folkmedicine.common.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.RotatedPillarBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.util.Direction;

public class HerbLogBlock extends RotatedPillarBlock {

    public HerbLogBlock(MaterialColor color1, MaterialColor color2) {
        super(AbstractBlock.Properties.create(Material.WOOD, (state) -> {
            return state.get(RotatedPillarBlock.AXIS) == Direction.Axis.Y ? color1 : color2;
        }).hardnessAndResistance(2.0F).sound(SoundType.WOOD));
    }
}
