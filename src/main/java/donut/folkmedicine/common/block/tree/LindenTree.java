package donut.folkmedicine.common.block.tree;

import donut.folkmedicine.common.world.gen.feature.ModFeatures;
import net.minecraft.block.trees.Tree;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;

import javax.annotation.Nullable;
import java.util.Random;

public class LindenTree extends Tree {

    @Nullable
    @Override
    protected ConfiguredFeature<BaseTreeFeatureConfig, ?> getTreeFeature(Random random, boolean largeHive) {
        return ModFeatures.LINDEN;
    }
}
