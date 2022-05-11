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
    public static Block CHAMOMILE = new HerbBlock(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().sound(SoundType.PLANT), () -> ModItems.chamomile_petals);
    public static Block NETTLE = new BushBlock(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().sound(SoundType.PLANT));
    public static Block RIBLEAF = new BushBlock(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().sound(SoundType.PLANT));
    public static Block SAGE = new BushBlock(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().sound(SoundType.PLANT));
    public static Block YARROW = new BushBlock(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().sound(SoundType.PLANT));
    public static Block SWEETFLAG = new WaterHerbBlock((Block.Properties.create(Material.PLANTS).doesNotBlockMovement().sound(SoundType.WET_GRASS)));
    public static Block TALL_SWEETFLAG = new TallWaterHerbBlock(AbstractBlock.Properties.create(Material.SEA_GRASS).doesNotBlockMovement().zeroHardnessAndResistance().sound(SoundType.WET_GRASS));

    //trees' stuff
    public static Block LINDEN_SAPLING = new SaplingBlock(new LindenTree(), AbstractBlock.Properties.from(Blocks.OAK_SAPLING));
    public static Block JUNIPER_SAPLING = new SaplingBlock(new JuniperTree(), AbstractBlock.Properties.from(Blocks.OAK_SAPLING));
    public static Block SANDALWOOD_SAPLING = new SaplingBlock(new SandalwoodTree(), AbstractBlock.Properties.from(Blocks.OAK_SAPLING));

    public static Block LINDEN_LEAVES = leaves();
    public static Block JUNIPER_LEAVES = leaves();
    public static Block SANDALWOOD_LEAVES = leaves();

    public static Block LINDEN_LOG = new HerbLogBlock(MaterialColor.WOOD, MaterialColor.GRAY);
    public static Block JUNIPER_LOG = new HerbLogBlock(MaterialColor.WOOD, MaterialColor.BROWN);
    public static Block SANDALWOOD_LOG = new HerbLogBlock(MaterialColor.WOOD, MaterialColor.ORANGE_TERRACOTTA);

    public static Block STRIPPED_LINDEN_LOG = new HerbLogBlock(MaterialColor.WOOD, MaterialColor.GRAY);
    public static Block STRIPPED_JUNIPER_LOG = new HerbLogBlock(MaterialColor.WOOD, MaterialColor.BROWN);
    public static Block STRIPPED_SANDALWOOD_LOG = new HerbLogBlock(MaterialColor.WOOD, MaterialColor.ORANGE_TERRACOTTA);

    public static Block LINDEN_PLANKS = new Block(AbstractBlock.Properties.create(Material.WOOD, MaterialColor.GRAY).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD));
    public static Block JUNIPER_PLANKS = new Block(AbstractBlock.Properties.create(Material.WOOD, MaterialColor.BROWN).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD));
    public static Block SANDALWOOD_PLANKS = new Block(AbstractBlock.Properties.create(Material.WOOD, MaterialColor.ORANGE_TERRACOTTA).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD));

    public static Block LINDEN_WOOD = new RotatedPillarBlock(AbstractBlock.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD));
    public static Block JUNIPER_WOOD = new RotatedPillarBlock(AbstractBlock.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD));
    public static Block SANDALWOOD_WOOD = new RotatedPillarBlock(AbstractBlock.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD));

    public static Block STRIPPED_LINDEN_WOOD = new RotatedPillarBlock(AbstractBlock.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD));
    public static Block STRIPPED_JUNIPER_WOOD = new RotatedPillarBlock(AbstractBlock.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD));
    public static Block STRIPPED_SANDALWOOD_WOOD = new RotatedPillarBlock(AbstractBlock.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD));

    public static Block LINDEN_SLAB = new SlabBlock(AbstractBlock.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD));
    public static Block JUNIPER_SLAB = new SlabBlock(AbstractBlock.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD));
    public static Block SANDALWOOD_SLAB = new SlabBlock(AbstractBlock.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD));

    public static Block LINDEN_PRESSURE_PLATE = new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, AbstractBlock.Properties.create(Material.WOOD, LINDEN_PLANKS.getMaterialColor()).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD));
    public static Block JUNIPER_PRESSURE_PLATE = new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, AbstractBlock.Properties.create(Material.WOOD, JUNIPER_PLANKS.getMaterialColor()).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD));
    public static Block SANDALWOOD_PRESSURE_PLATE = new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, AbstractBlock.Properties.create(Material.WOOD, LINDEN_PLANKS.getMaterialColor()).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD));

    public static Block LINDEN_FENCE = new FenceBlock(AbstractBlock.Properties.create(Material.WOOD, LINDEN_PLANKS.getMaterialColor()).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD));
    public static Block JUNIPER_FENCE = new FenceBlock(AbstractBlock.Properties.create(Material.WOOD, JUNIPER_PLANKS.getMaterialColor()).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD));
    public static Block SANDALWOOD_FENCE = new FenceBlock(AbstractBlock.Properties.create(Material.WOOD, SANDALWOOD_PLANKS.getMaterialColor()).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD));

    public static Block LINDEN_TRAPDOOR = new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD).notSolid().setAllowsSpawn(ModBlocks::neverAllowSpawn));
    public static Block JUNIPER_TRAPDOOR = new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD).notSolid().setAllowsSpawn(ModBlocks::neverAllowSpawn));
    public static Block SANDALWOOD_TRAPDOOR = new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD).notSolid().setAllowsSpawn(ModBlocks::neverAllowSpawn));

    public static Block LINDEN_FENCE_GATE = new FenceGateBlock(AbstractBlock.Properties.create(Material.WOOD, LINDEN_PLANKS.getMaterialColor()).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD));
    public static Block JUNIPER_FENCE_GATE = new FenceGateBlock(AbstractBlock.Properties.create(Material.WOOD, JUNIPER_PLANKS.getMaterialColor()).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD));
    public static Block SANDALWOOD_FENCE_GATE = new FenceGateBlock(AbstractBlock.Properties.create(Material.WOOD, SANDALWOOD_PLANKS.getMaterialColor()).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD));

    //przerobić na używanie drugiego konstruktora (takiego z supplierem)
    public static Block LINDEN_STAIRS = new StairsBlock(LINDEN_PLANKS.getDefaultState(), AbstractBlock.Properties.from(LINDEN_PLANKS));
    public static Block JUNIPER_STAIRS = new StairsBlock(JUNIPER_PLANKS.getDefaultState(), AbstractBlock.Properties.from(JUNIPER_PLANKS));
    public static Block SANDALWOOD_STAIRS = new StairsBlock(LINDEN_PLANKS.getDefaultState(), AbstractBlock.Properties.from(SANDALWOOD_PLANKS));

    public static Block LINDEN_BUTTON = new WoodButtonBlock(AbstractBlock.Properties.create(Material.MISCELLANEOUS).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD));
    public static Block JUNIPER_BUTTON = new WoodButtonBlock(AbstractBlock.Properties.create(Material.MISCELLANEOUS).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD));
    public static Block SANDALWOOD_BUTTON = new WoodButtonBlock(AbstractBlock.Properties.create(Material.MISCELLANEOUS).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD));

    public static Block LINDEN_DOOR = new DoorBlock(AbstractBlock.Properties.create(Material.WOOD, LINDEN_PLANKS.getMaterialColor()).hardnessAndResistance(3.0F).sound(SoundType.WOOD).notSolid());
    public static Block JUNIPER_DOOR = new DoorBlock(AbstractBlock.Properties.create(Material.WOOD, JUNIPER_PLANKS.getMaterialColor()).hardnessAndResistance(3.0F).sound(SoundType.WOOD).notSolid());
    public static Block SANDALWOOD_DOOR = new DoorBlock(AbstractBlock.Properties.create(Material.WOOD, SANDALWOOD_PLANKS.getMaterialColor()).hardnessAndResistance(3.0F).sound(SoundType.WOOD).notSolid());

    public static Block LINDEN_SIGN = new StandingSignBlock(AbstractBlock.Properties.create(Material.WOOD, LINDEN_LOG.getMaterialColor()).doesNotBlockMovement().hardnessAndResistance(1.0F).sound(SoundType.WOOD), WoodType.OAK);
    public static Block JUNIPER_SIGN = new StandingSignBlock(AbstractBlock.Properties.create(Material.WOOD, JUNIPER_LOG.getMaterialColor()).doesNotBlockMovement().hardnessAndResistance(1.0F).sound(SoundType.WOOD), WoodType.OAK);
    public static Block SANDALWOOD_SIGN = new StandingSignBlock(AbstractBlock.Properties.create(Material.WOOD, SANDALWOOD_LOG.getMaterialColor()).doesNotBlockMovement().hardnessAndResistance(1.0F).sound(SoundType.WOOD), WoodType.OAK);

    //tu też przerobić na drugi konstruktor
    public static Block LINDEN_WALL_SIGN = new WallSignBlock(AbstractBlock.Properties.create(Material.WOOD, LINDEN_LOG.getMaterialColor()).doesNotBlockMovement().hardnessAndResistance(1.0F).sound(SoundType.WOOD).lootFrom(LINDEN_SIGN), WoodType.DARK_OAK);
    public static Block JUNIPER_WALL_SIGN = new WallSignBlock(AbstractBlock.Properties.create(Material.WOOD,  JUNIPER_LOG.getMaterialColor()).doesNotBlockMovement().hardnessAndResistance(1.0F).sound(SoundType.WOOD).lootFrom(JUNIPER_SIGN), WoodType.DARK_OAK);
    public static Block SANDALWOOD_WALL_SIGN = new WallSignBlock(AbstractBlock.Properties.create(Material.WOOD, SANDALWOOD_LOG.getMaterialColor()).doesNotBlockMovement().hardnessAndResistance(1.0F).sound(SoundType.WOOD).lootFrom(SANDALWOOD_SIGN), WoodType.DARK_OAK);


    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        //herbs
        registerBlock(CHAMOMILE, "chamomile");
        registerBlock(NETTLE, "nettle");
        registerBlock(RIBLEAF, "ribleaf");
        registerBlock(SAGE, "sage");
        registerBlock(YARROW, "yarrow");
        registerBlock(SWEETFLAG, "sweetflag");
        registerBlock(TALL_SWEETFLAG, "tall_sweetflag");

        //trees' stuff
        registerBlock(LINDEN_SAPLING, "linden_sapling");
        registerBlock(JUNIPER_SAPLING, "juniper_sapling");
        registerBlock(SANDALWOOD_SAPLING, "sandalwood_sapling");

        registerBlock(LINDEN_LEAVES, "linden_leaves");
        registerBlock(JUNIPER_LEAVES, "juniper_leaves");
        registerBlock(SANDALWOOD_LEAVES, "sandalwood_leaves");


        registerBlock(LINDEN_LOG, "linden_log");
        registerBlock(JUNIPER_LOG, "juniper_log");
        registerBlock(SANDALWOOD_LOG, "sandalwood_log");

        registerBlock(STRIPPED_LINDEN_LOG, "stripped_linden_log");
        registerBlock(STRIPPED_JUNIPER_LOG, "stripped_juniper_log");
        registerBlock(STRIPPED_SANDALWOOD_LOG, "stripped_sandalwood_log");

        registerBlock(LINDEN_PLANKS, "linden_planks");
        registerBlock(JUNIPER_PLANKS, "juniper_planks");
        registerBlock(SANDALWOOD_PLANKS, "sandalwood_planks");

        registerBlock(LINDEN_WOOD, "linden_wood");
        registerBlock(JUNIPER_WOOD, "juniper_wood");
        registerBlock(SANDALWOOD_WOOD, "sandalwood_wood");

        registerBlock(STRIPPED_LINDEN_WOOD, "stripped_linden_wood");
        registerBlock(STRIPPED_JUNIPER_WOOD, "stripped_sandalwood_wood");
        registerBlock(STRIPPED_SANDALWOOD_WOOD, "stripped_juniper_wood");

        registerBlock(LINDEN_SLAB, "linden_slab");
        registerBlock(JUNIPER_SLAB, "juniper_slab");
        registerBlock(SANDALWOOD_SLAB, "sandalwood_slab");

        registerBlock(LINDEN_PRESSURE_PLATE, "linden_pressure_plate");
        registerBlock(JUNIPER_PRESSURE_PLATE, "juniper_pressure_plate");
        registerBlock(SANDALWOOD_PRESSURE_PLATE, "sandalwood_pressure_plate");

        registerBlock(LINDEN_FENCE, "linden_fence");
        registerBlock(JUNIPER_FENCE, "juniper_fence");
        registerBlock(SANDALWOOD_FENCE, "sandalwood_fence");

        registerBlock(LINDEN_TRAPDOOR, "linden_trapdoor");
        registerBlock(JUNIPER_TRAPDOOR, "juniper_trapdoor");
        registerBlock(SANDALWOOD_TRAPDOOR, "sandalwood_trapdoor");

        registerBlock(LINDEN_FENCE_GATE, "linden_fence_gate");
        registerBlock(JUNIPER_FENCE_GATE, "juniper_fence_gate");
        registerBlock(SANDALWOOD_FENCE_GATE, "sandalwood_fence_gate");

        registerBlock(LINDEN_STAIRS, "linden_stairs");
        registerBlock(JUNIPER_STAIRS, "juniper_stairs");
        registerBlock(SANDALWOOD_STAIRS, "sandalwood_stairs");

        registerBlock(LINDEN_BUTTON, "linden_button");
        registerBlock(JUNIPER_BUTTON, "juniper_button");
        registerBlock(SANDALWOOD_BUTTON, "sandalwood_button");

        registerBlock(LINDEN_DOOR, "linden_door");
        registerBlock(JUNIPER_DOOR, "juniper_door");
        registerBlock(SANDALWOOD_DOOR, "sandalwood_door");

        registerBlock(LINDEN_SIGN, "linden_sign");
        registerBlock(JUNIPER_SIGN, "juniper_sign");
        registerBlock(SANDALWOOD_SIGN, "sandalwood_sign");

        registerBlock(LINDEN_WALL_SIGN, "linden_wall_sign");
        registerBlock(JUNIPER_WALL_SIGN, "juniper_wall_sign");
        registerBlock(SANDALWOOD_WALL_SIGN, "sandalwood_wall_sign");

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
        }
    }

    public static void registerBlock(Block block, String name) {
        block.setRegistryName(name);
        ForgeRegistries.BLOCKS.register(block);
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
