package donut.folkmedicine.common.world.gen.feature;

import donut.folkmedicine.FolkMedicine;
import donut.folkmedicine.common.block.ModBlocks;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.foliageplacer.BlobFoliagePlacer;
import net.minecraft.world.gen.foliageplacer.FancyFoliagePlacer;
import net.minecraft.world.gen.foliageplacer.PineFoliagePlacer;
import net.minecraft.world.gen.foliageplacer.SpruceFoliagePlacer;
import net.minecraft.world.gen.trunkplacer.FancyTrunkPlacer;
import net.minecraft.world.gen.trunkplacer.StraightTrunkPlacer;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraft.world.gen.feature.Feature;

import java.util.OptionalInt;

public class ModFeatures {
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> LINDEN = register("linden",
            Feature.TREE.withConfiguration((
                    new BaseTreeFeatureConfig.Builder(
                            new SimpleBlockStateProvider(ModBlocks.LINDEN_LOG.getDefaultState()),
                            new SimpleBlockStateProvider(ModBlocks.LINDEN_LEAVES.getDefaultState()),
                            new FancyFoliagePlacer(FeatureSpread.create(6), FeatureSpread.create(6), 6),
                            new FancyTrunkPlacer(11, 11, 11),
                            new TwoLayerFeature(0, 0, 0, OptionalInt.of(4)))).setIgnoreVines().setHeightmap(Heightmap.Type.MOTION_BLOCKING).build()));

    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> JUNIPER =
            register("juniper", Feature.TREE.withConfiguration((
                    new BaseTreeFeatureConfig.Builder(
                            new SimpleBlockStateProvider(ModBlocks.JUNIPER_LOG.getDefaultState()),
                            new SimpleBlockStateProvider(ModBlocks.JUNIPER_LEAVES.getDefaultState()),
                            new SpruceFoliagePlacer(FeatureSpread.create(4, 4), FeatureSpread.create(1, 1), FeatureSpread.create(1, 1)),
                            new StraightTrunkPlacer(5, 2, 1), new TwoLayerFeature(2, 0, 2))).setIgnoreVines().build()));


    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> SANDALWOOD =
            register("sandalwood", Feature.TREE.withConfiguration((
                    new BaseTreeFeatureConfig.Builder(
                            new SimpleBlockStateProvider(ModBlocks.SANDALWOOD_LOG.getDefaultState()),
                            new SimpleBlockStateProvider(ModBlocks.SANDALWOOD_LEAVES.getDefaultState()),
                            new BlobFoliagePlacer(FeatureSpread.create(2), FeatureSpread.create(0), 3),
                            new StraightTrunkPlacer(4, 2, 0),
                            new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build()));

    private static <FC extends IFeatureConfig> ConfiguredFeature<FC, ?> register(String p_243968_0_, ConfiguredFeature<FC, ?> p_243968_1_) {
        return Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, p_243968_0_, p_243968_1_);
    }
}
