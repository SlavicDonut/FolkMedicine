package donut.folkmedicine.common.block;

import donut.folkmedicine.common.block.tree.JuniperTree;
import donut.folkmedicine.common.block.tree.LindenTree;
import donut.folkmedicine.common.block.tree.SandalwoodTree;
import donut.folkmedicine.common.block.tree.TallWaterHerbBlock;
import donut.folkmedicine.common.item.ModItems;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.block.trees.OakTree;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.entity.EntityType;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.loading.FMLEnvironment;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModBlocks {
    //herbs
    public static Block CHAMOMILE = registerBlock("chamomile", new HerbBlock(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().sound(SoundType.PLANT), () -> ModItems.chamomile_petals));
    public static Block NETTLE = registerBlock("nettle", new BushBlock(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().sound(SoundType.PLANT)));
    public static Block RIBLEAF = registerBlock("ribleaf", new BushBlock(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().sound(SoundType.PLANT)));
    public static Block SAGE = registerBlock("sage", new BushBlock(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().sound(SoundType.PLANT)));
    public static Block YARROW = registerBlock("yarrow", new BushBlock(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().sound(SoundType.PLANT)));
    public static Block SWEETFLAG = registerBlock("sweetflag", new WaterHerbBlock((Block.Properties.create(Material.PLANTS).doesNotBlockMovement().sound(SoundType.WET_GRASS))));
    public static Block TALL_SWEETFLAG = registerBlock("tall_sweetflag", new TallWaterHerbBlock(AbstractBlock.Properties.create(Material.SEA_GRASS).doesNotBlockMovement().zeroHardnessAndResistance().sound(SoundType.WET_GRASS)));

    //trees' stuff
    public static Block LINDEN_SAPLING = registerBlock("linden_sapling", new SaplingBlock(new LindenTree(), AbstractBlock.Properties.from(Blocks.OAK_SAPLING)));
    public static Block JUNIPER_SAPLING = registerBlock("juniper_sapling", new SaplingBlock(new JuniperTree(), AbstractBlock.Properties.from(Blocks.OAK_SAPLING)));
    public static Block SANDALWOOD_SAPLING = registerBlock("sandalwood_sapling", new SaplingBlock(new SandalwoodTree(), AbstractBlock.Properties.from(Blocks.OAK_SAPLING)));

    public static Block LINDEN_LEAVES = registerBlock("linden_leaves", leaves());
    public static Block JUNIPER_LEAVES = registerBlock("juniper_leaves", leaves());
    public static Block SANDALWOOD_LEAVES = registerBlock("sandalwood_leaves", leaves());

    public static Block LINDEN_LOG = registerBlock("linden_log", new HerbLogBlock(MaterialColor.WOOD, MaterialColor.GRAY));
    public static Block JUNIPER_LOG = registerBlock("juniper_log", new HerbLogBlock(MaterialColor.WOOD, MaterialColor.BROWN));
    public static Block SANDALWOOD_LOG = registerBlock("sandalwood_log", new HerbLogBlock(MaterialColor.WOOD, MaterialColor.ORANGE_TERRACOTTA));

    public static Block STRIPPED_LINDEN_LOG = registerBlock("stripped_linden_log", new HerbLogBlock(MaterialColor.WOOD, MaterialColor.GRAY));
    public static Block STRIPPED_JUNIPER_LOG = registerBlock("stripped_juniper_log", new HerbLogBlock(MaterialColor.WOOD, MaterialColor.BROWN));
    public static Block STRIPPED_SANDALWOOD_LOG = registerBlock("stripped_sandalwood_log", new HerbLogBlock(MaterialColor.WOOD, MaterialColor.ORANGE_TERRACOTTA));

    public static Block LINDEN_PLANKS = registerBlock("linden_planks", new Block(AbstractBlock.Properties.create(Material.WOOD, MaterialColor.GRAY).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static Block JUNIPER_PLANKS = registerBlock("juniper_planks", new Block(AbstractBlock.Properties.create(Material.WOOD, MaterialColor.BROWN).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static Block SANDALWOOD_PLANKS = registerBlock("sandalwood_planks", new Block(AbstractBlock.Properties.create(Material.WOOD, MaterialColor.ORANGE_TERRACOTTA).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static Block LINDEN_WOOD = registerBlock("linden_wood", new RotatedPillarBlock(AbstractBlock.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)));
    public static Block JUNIPER_WOOD = registerBlock("juniper_wood", new RotatedPillarBlock(AbstractBlock.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)));
    public static Block SANDALWOOD_WOOD = registerBlock("sandalwood_wood", new RotatedPillarBlock(AbstractBlock.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)));

    public static Block STRIPPED_LINDEN_WOOD = registerBlock("stripped_linden_wood", new RotatedPillarBlock(AbstractBlock.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)));
    public static Block STRIPPED_JUNIPER_WOOD = registerBlock("stripped_juniper_wood", new RotatedPillarBlock(AbstractBlock.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)));
    public static Block STRIPPED_SANDALWOOD_WOOD = registerBlock("stripped_sandalwood_wood", new RotatedPillarBlock(AbstractBlock.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)));

    public static Block LINDEN_SLAB = registerBlock("linden_slab", new SlabBlock(AbstractBlock.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static Block JUNIPER_SLAB = registerBlock("juniper_slab", new SlabBlock(AbstractBlock.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static Block SANDALWOOD_SLAB = registerBlock("sandalwood_slab", new SlabBlock(AbstractBlock.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static Block LINDEN_PRESSURE_PLATE = registerBlock("linden_pressure_plate", new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, AbstractBlock.Properties.create(Material.WOOD, LINDEN_PLANKS.getMaterialColor()).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static Block JUNIPER_PRESSURE_PLATE = registerBlock("juniper_pressure_plate", new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, AbstractBlock.Properties.create(Material.WOOD, JUNIPER_PLANKS.getMaterialColor()).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static Block SANDALWOOD_PRESSURE_PLATE = registerBlock("sandalwood_pressure_plate", new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, AbstractBlock.Properties.create(Material.WOOD, LINDEN_PLANKS.getMaterialColor()).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)));

    public static Block LINDEN_FENCE = registerBlock("linden_fence", new FenceBlock(AbstractBlock.Properties.create(Material.WOOD, LINDEN_PLANKS.getMaterialColor()).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static Block JUNIPER_FENCE = registerBlock("juniper_fence", new FenceBlock(AbstractBlock.Properties.create(Material.WOOD, JUNIPER_PLANKS.getMaterialColor()).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static Block SANDALWOOD_FENCE = registerBlock("sandalwood_fence", new FenceBlock(AbstractBlock.Properties.create(Material.WOOD, SANDALWOOD_PLANKS.getMaterialColor()).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static Block LINDEN_TRAPDOOR = registerBlock("linden_trapdoor", new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD).notSolid().setAllowsSpawn(ModBlocks::neverAllowSpawn)));
    public static Block JUNIPER_TRAPDOOR = registerBlock("juniper_trapdoor", new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD).notSolid().setAllowsSpawn(ModBlocks::neverAllowSpawn)));
    public static Block SANDALWOOD_TRAPDOOR = registerBlock("sandalwood_trapdoor", new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD).notSolid().setAllowsSpawn(ModBlocks::neverAllowSpawn)));

    public static Block LINDEN_FENCE_GATE = registerBlock("linden_fence_gate", new FenceGateBlock(AbstractBlock.Properties.create(Material.WOOD, LINDEN_PLANKS.getMaterialColor()).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static Block JUNIPER_FENCE_GATE = registerBlock("juniper_fence_gate", new FenceGateBlock(AbstractBlock.Properties.create(Material.WOOD, JUNIPER_PLANKS.getMaterialColor()).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static Block SANDALWOOD_FENCE_GATE = registerBlock("sandalwood_fence_gate", new FenceGateBlock(AbstractBlock.Properties.create(Material.WOOD, SANDALWOOD_PLANKS.getMaterialColor()).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)));

    //przerobić na używanie drugiego konstruktora (takiego z supplierem)
    public static Block LINDEN_STAIRS = registerBlock("linden_stairs", new StairsBlock(LINDEN_PLANKS.getDefaultState(), AbstractBlock.Properties.from(LINDEN_PLANKS)));
    public static Block JUNIPER_STAIRS = registerBlock("juniper_stairs", new StairsBlock(JUNIPER_PLANKS.getDefaultState(), AbstractBlock.Properties.from(JUNIPER_PLANKS)));
    public static Block SANDALWOOD_STAIRS = registerBlock("sandalwood_stairs", new StairsBlock(LINDEN_PLANKS.getDefaultState(), AbstractBlock.Properties.from(SANDALWOOD_PLANKS)));

    public static Block LINDEN_BUTTON = registerBlock("linden_button", new WoodButtonBlock(AbstractBlock.Properties.create(Material.MISCELLANEOUS).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static Block JUNIPER_BUTTON = registerBlock("juniper_button", new WoodButtonBlock(AbstractBlock.Properties.create(Material.MISCELLANEOUS).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static Block SANDALWOOD_BUTTON = registerBlock("sandalwood_button", new WoodButtonBlock(AbstractBlock.Properties.create(Material.MISCELLANEOUS).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)));

    public static Block LINDEN_DOOR = registerBlock("linden_door", new DoorBlock(AbstractBlock.Properties.create(Material.WOOD, LINDEN_PLANKS.getMaterialColor()).hardnessAndResistance(3.0F).sound(SoundType.WOOD).notSolid()));
    public static Block JUNIPER_DOOR = registerBlock("juniper_door", new DoorBlock(AbstractBlock.Properties.create(Material.WOOD, JUNIPER_PLANKS.getMaterialColor()).hardnessAndResistance(3.0F).sound(SoundType.WOOD).notSolid()));
    public static Block SANDALWOOD_DOOR = registerBlock("sandalwood_door", new DoorBlock(AbstractBlock.Properties.create(Material.WOOD, SANDALWOOD_PLANKS.getMaterialColor()).hardnessAndResistance(3.0F).sound(SoundType.WOOD).notSolid()));

    public static Block LINDEN_SIGN = registerBlock("linden_sign", new StandingSignBlock(AbstractBlock.Properties.create(Material.WOOD, LINDEN_LOG.getMaterialColor()).doesNotBlockMovement().hardnessAndResistance(1.0F).sound(SoundType.WOOD), WoodType.OAK));
    public static Block JUNIPER_SIGN = registerBlock("juniper_sign", new StandingSignBlock(AbstractBlock.Properties.create(Material.WOOD, JUNIPER_LOG.getMaterialColor()).doesNotBlockMovement().hardnessAndResistance(1.0F).sound(SoundType.WOOD), WoodType.OAK));
    public static Block SANDALWOOD_SIGN = registerBlock("sandalwood_sign", new StandingSignBlock(AbstractBlock.Properties.create(Material.WOOD, SANDALWOOD_LOG.getMaterialColor()).doesNotBlockMovement().hardnessAndResistance(1.0F).sound(SoundType.WOOD), WoodType.OAK));

    //tu też przerobić na drugi konstruktor
    public static Block LINDEN_WALL_SIGN = registerBlock("linden_wall_sign", new WallSignBlock(AbstractBlock.Properties.create(Material.WOOD, LINDEN_LOG.getMaterialColor()).doesNotBlockMovement().hardnessAndResistance(1.0F).sound(SoundType.WOOD).lootFrom(LINDEN_SIGN), WoodType.DARK_OAK));
    public static Block JUNIPER_WALL_SIGN = registerBlock("juniper_wall_sign", new WallSignBlock(AbstractBlock.Properties.create(Material.WOOD,  JUNIPER_LOG.getMaterialColor()).doesNotBlockMovement().hardnessAndResistance(1.0F).sound(SoundType.WOOD).lootFrom(JUNIPER_SIGN), WoodType.DARK_OAK));
    public static Block SANDALWOOD_WALL_SIGN = registerBlock("sandalwood_wall_sign", new WallSignBlock(AbstractBlock.Properties.create(Material.WOOD, SANDALWOOD_LOG.getMaterialColor()).doesNotBlockMovement().hardnessAndResistance(1.0F).sound(SoundType.WOOD).lootFrom(SANDALWOOD_SIGN), WoodType.DARK_OAK));


    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {

        if (FMLEnvironment.dist == Dist.CLIENT) {
            RenderType transparentRender = RenderType.getCutoutMipped();

            RenderTypeLookup.setRenderLayer(CHAMOMILE, transparentRender);
            RenderTypeLookup.setRenderLayer(NETTLE, transparentRender);
            RenderTypeLookup.setRenderLayer(RIBLEAF, transparentRender);
            RenderTypeLookup.setRenderLayer(SAGE, transparentRender);
            RenderTypeLookup.setRenderLayer(YARROW, transparentRender);
            RenderTypeLookup.setRenderLayer(SWEETFLAG, transparentRender);
            RenderTypeLookup.setRenderLayer(TALL_SWEETFLAG, transparentRender);

            //Trees' stuff
            RenderTypeLookup.setRenderLayer(LINDEN_SAPLING, transparentRender);
            RenderTypeLookup.setRenderLayer(JUNIPER_SAPLING, transparentRender);
            RenderTypeLookup.setRenderLayer(SANDALWOOD_SAPLING, transparentRender);

            RenderTypeLookup.setRenderLayer(LINDEN_LEAVES, transparentRender);
            RenderTypeLookup.setRenderLayer(JUNIPER_LEAVES, transparentRender);
            RenderTypeLookup.setRenderLayer(SANDALWOOD_LEAVES, transparentRender);

//            slab, pressureplate, fence, trapdoor, fence_gate, stairs, button, sign, wallsign
            RenderTypeLookup.setRenderLayer(LINDEN_TRAPDOOR, transparentRender);
            RenderTypeLookup.setRenderLayer(JUNIPER_TRAPDOOR, transparentRender);
            RenderTypeLookup.setRenderLayer(SANDALWOOD_TRAPDOOR, transparentRender);

            RenderTypeLookup.setRenderLayer(LINDEN_DOOR, transparentRender);
            RenderTypeLookup.setRenderLayer(JUNIPER_DOOR, transparentRender);
            RenderTypeLookup.setRenderLayer(SANDALWOOD_DOOR, transparentRender);
        }
    }

    public static Block registerBlock(String name, Block block) {
        block.setRegistryName(name);
        ForgeRegistries.BLOCKS.register(block);
        return block;
    }

    private static boolean never(BlockState blockState, IBlockReader iBlockReader, BlockPos blockPos) {
        return false;
    }

    private static LeavesBlock leaves() {
        return new LeavesBlock(AbstractBlock.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly().sound(SoundType.PLANT).notSolid().setSuffocates(ModBlocks::never).setBlocksVision(ModBlocks::never));
    }

    private static Boolean neverAllowSpawn(BlockState state, IBlockReader reader, BlockPos pos, EntityType<?> entity) {
        return (boolean)false;
    }
}
