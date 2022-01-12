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
            Feature.TREE.configured((
                    new BaseTreeFeatureConfig.Builder(
                            new SimpleBlockStateProvider(ModBlocks.LINDEN_LOG.defaultBlockState()),
                            new SimpleBlockStateProvider(ModBlocks.LINDEN_LEAVES.defaultBlockState()),
                            new FancyFoliagePlacer(FeatureSpread.fixed(6), FeatureSpread.fixed(6), 6),
                            new FancyTrunkPlacer(11, 11, 11),
                            new TwoLayerFeature(0, 0, 0, OptionalInt.of(4)))).ignoreVines().heightmap(Heightmap.Type.MOTION_BLOCKING).build()));

    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> JUNIPER =
            register("juniper", Feature.TREE.configured((
                    new BaseTreeFeatureConfig.Builder(
                            new SimpleBlockStateProvider(ModBlocks.JUNIPER_LOG.defaultBlockState()),
                            new SimpleBlockStateProvider(ModBlocks.JUNIPER_LEAVES.defaultBlockState()),
                            new SpruceFoliagePlacer(FeatureSpread.of(4, 4), FeatureSpread.of(1, 1), FeatureSpread.of(1, 1)),
                            new StraightTrunkPlacer(5, 2, 1), new TwoLayerFeature(2, 0, 2))).ignoreVines().build()));


    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> SANDALWOOD =
            register("sandalwood", Feature.TREE.configured((
                    new BaseTreeFeatureConfig.Builder(
                            new SimpleBlockStateProvider(ModBlocks.SANDALWOOD_LOG.defaultBlockState()),
                            new SimpleBlockStateProvider(ModBlocks.SANDALWOOD_LEAVES.defaultBlockState()),
                            new BlobFoliagePlacer(FeatureSpread.fixed(2), FeatureSpread.fixed(0), 3),
                            new StraightTrunkPlacer(4, 2, 0),
                            new TwoLayerFeature(1, 0, 1))).ignoreVines().build()));


    private static <FC extends IFeatureConfig> ConfiguredFeature<FC, ?> register(String p_243968_0_, ConfiguredFeature<FC, ?> p_243968_1_) {
        return Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, p_243968_0_, p_243968_1_);
    }
}