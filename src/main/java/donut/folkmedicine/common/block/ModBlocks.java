package donut.folkmedicine.common.block;

import donut.folkmedicine.common.block.tree.JuniperTree;
import donut.folkmedicine.common.block.tree.LindenTree;
import donut.folkmedicine.common.block.tree.SandalwoodTree;
import donut.folkmedicine.common.block.tree.TallWaterHerbBlock;
import donut.folkmedicine.common.item.ModItems;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static donut.folkmedicine.FolkMedicine.MOD_ID;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MOD_ID);

    //herbs
    public static final RegistryObject<Block> CHAMOMILE = BLOCKS.register("chamomile", () -> new HerbBlock(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().sound(SoundType.PLANT), () -> ModItems.chamomile_petals.get()));
    public static final RegistryObject<Block> NETTLE = BLOCKS.register("nettle", () -> new BushBlock(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().sound(SoundType.PLANT)));
    public static final RegistryObject<Block> RIBLEAF = BLOCKS.register("ribleaf", () -> new BushBlock(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().sound(SoundType.PLANT)));
    public static final RegistryObject<Block> SAGE = BLOCKS.register("sage", () -> new BushBlock(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().sound(SoundType.PLANT)));
    public static final RegistryObject<Block> YARROW = BLOCKS.register("yarrow", () -> new BushBlock(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().sound(SoundType.PLANT)));
    public static final RegistryObject<Block> SWEETFLAG = BLOCKS.register("sweetflag", () -> new WaterHerbBlock((Block.Properties.create(Material.PLANTS).doesNotBlockMovement().sound(SoundType.WET_GRASS))));
    public static final RegistryObject<Block> TALL_SWEETFLAG = BLOCKS.register("tall_sweetflag", () -> new TallWaterHerbBlock(AbstractBlock.Properties.create(Material.SEA_GRASS).doesNotBlockMovement().zeroHardnessAndResistance().sound(SoundType.WET_GRASS)));

    //trees' stuff
    public static final RegistryObject<Block> LINDEN_SAPLING = BLOCKS.register("linden_sapling", () -> new SaplingBlock(new LindenTree(), AbstractBlock.Properties.from(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> JUNIPER_SAPLING = BLOCKS.register("juniper_sapling", () -> new SaplingBlock(new JuniperTree(), AbstractBlock.Properties.from(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> SANDALWOOD_SAPLING = BLOCKS.register("sandalwood_sapling", () -> new SaplingBlock(new SandalwoodTree(), AbstractBlock.Properties.from(Blocks.OAK_SAPLING)));

    public static final RegistryObject<Block> LINDEN_LEAVES = BLOCKS.register("linden_leaves", () -> new LeavesBlock(AbstractBlock.Properties.from(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> JUNIPER_LEAVES = BLOCKS.register("juniper_leaves", () ->  new LeavesBlock(AbstractBlock.Properties.from(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> SANDALWOOD_LEAVES = BLOCKS.register("sandalwood_leaves", () ->  new LeavesBlock(AbstractBlock.Properties.from(Blocks.OAK_LEAVES)));

    public static final RegistryObject<Block> LINDEN_LOG = BLOCKS.register("linden_log", () -> new RotatedPillarBlock(AbstractBlock.Properties.from(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> JUNIPER_LOG = BLOCKS.register("juniper_log", () -> new RotatedPillarBlock(AbstractBlock.Properties.from(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> SANDALWOOD_LOG = BLOCKS.register("sandalwood_log", () -> new RotatedPillarBlock(AbstractBlock.Properties.from(Blocks.OAK_LOG)));

    public static final RegistryObject<Block> STRIPPED_LINDEN_LOG = BLOCKS.register("stripped_linden_log", () -> new RotatedPillarBlock(AbstractBlock.Properties.from(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_JUNIPER_LOG = BLOCKS.register("stripped_juniper_log", () -> new RotatedPillarBlock(AbstractBlock.Properties.from(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_SANDALWOOD_LOG = BLOCKS.register("stripped_sandalwood_log", () -> new RotatedPillarBlock(AbstractBlock.Properties.from(Blocks.STRIPPED_OAK_LOG)));

    public static final RegistryObject<Block> LINDEN_PLANKS = BLOCKS.register("linden_planks", () -> new Block(AbstractBlock.Properties.from(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> JUNIPER_PLANKS = BLOCKS.register("juniper_planks", () -> new Block(AbstractBlock.Properties.from(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> SANDALWOOD_PLANKS = BLOCKS.register("sandalwood_planks", () -> new Block(AbstractBlock.Properties.from(Blocks.OAK_PLANKS)));

    public static final RegistryObject<Block> LINDEN_WOOD = BLOCKS.register("linden_wood", () -> new RotatedPillarBlock(AbstractBlock.Properties.from(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> JUNIPER_WOOD = BLOCKS.register("juniper_wood", () -> new RotatedPillarBlock(AbstractBlock.Properties.from(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> SANDALWOOD_WOOD = BLOCKS.register("sandalwood_wood", () -> new RotatedPillarBlock(AbstractBlock.Properties.from(Blocks.OAK_WOOD)));

    public static final RegistryObject<Block> STRIPPED_LINDEN_WOOD = BLOCKS.register("stripped_linden_wood", () -> new RotatedPillarBlock(AbstractBlock.Properties.from(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_JUNIPER_WOOD = BLOCKS.register("stripped_juniper_wood", () -> new RotatedPillarBlock(AbstractBlock.Properties.from(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_SANDALWOOD_WOOD = BLOCKS.register("stripped_sandalwood_wood", () -> new RotatedPillarBlock(AbstractBlock.Properties.from(Blocks.STRIPPED_OAK_WOOD)));

    public static final RegistryObject<Block> LINDEN_SLAB = BLOCKS.register("linden_slab", () -> new SlabBlock(AbstractBlock.Properties.from(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> JUNIPER_SLAB = BLOCKS.register("juniper_slab", () -> new SlabBlock(AbstractBlock.Properties.from(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> SANDALWOOD_SLAB = BLOCKS.register("sandalwood_slab", () -> new SlabBlock(AbstractBlock.Properties.from(Blocks.OAK_SLAB)));

    public static final RegistryObject<Block> LINDEN_PRESSURE_PLATE = BLOCKS.register("linden_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, AbstractBlock.Properties.from(Blocks.OAK_PRESSURE_PLATE)));
    public static final RegistryObject<Block> JUNIPER_PRESSURE_PLATE = BLOCKS.register("juniper_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, AbstractBlock.Properties.from(Blocks.OAK_PRESSURE_PLATE)));
    public static final RegistryObject<Block> SANDALWOOD_PRESSURE_PLATE = BLOCKS.register("sandalwood_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, AbstractBlock.Properties.from(Blocks.OAK_PRESSURE_PLATE)));

    public static final RegistryObject<Block> LINDEN_FENCE = BLOCKS.register("linden_fence", () -> new FenceBlock(AbstractBlock.Properties.from(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> JUNIPER_FENCE = BLOCKS.register("juniper_fence", () -> new FenceBlock(AbstractBlock.Properties.from(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> SANDALWOOD_FENCE = BLOCKS.register("sandalwood_fence", () -> new FenceBlock(AbstractBlock.Properties.from(Blocks.OAK_FENCE)));

    public static final RegistryObject<Block> LINDEN_TRAPDOOR = BLOCKS.register("linden_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.from(Blocks.OAK_TRAPDOOR)));
    public static final RegistryObject<Block> JUNIPER_TRAPDOOR = BLOCKS.register("juniper_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.from(Blocks.OAK_TRAPDOOR)));
    public static final RegistryObject<Block> SANDALWOOD_TRAPDOOR = BLOCKS.register("sandalwood_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.from(Blocks.OAK_TRAPDOOR)));

    public static final RegistryObject<Block> LINDEN_FENCE_GATE = BLOCKS.register("linden_fence_gate", () -> new FenceGateBlock(AbstractBlock.Properties.from(Blocks.OAK_FENCE_GATE)));
    public static final RegistryObject<Block> JUNIPER_FENCE_GATE = BLOCKS.register("juniper_fence_gate", () -> new FenceGateBlock(AbstractBlock.Properties.from(Blocks.OAK_FENCE_GATE)));
    public static final RegistryObject<Block> SANDALWOOD_FENCE_GATE = BLOCKS.register("sandalwood_fence_gate", () -> new FenceGateBlock(AbstractBlock.Properties.from(Blocks.OAK_FENCE_GATE)));

    //przerobić na używanie drugiego konstruktora (takiego z supplierem)
    public static final RegistryObject<Block> LINDEN_STAIRS = BLOCKS.register("linden_stairs", () -> new StairsBlock(Blocks.OAK_PLANKS::getDefaultState, AbstractBlock.Properties.from(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> JUNIPER_STAIRS = BLOCKS.register("juniper_stairs", () -> new StairsBlock(Blocks.OAK_PLANKS::getDefaultState, AbstractBlock.Properties.from(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> SANDALWOOD_STAIRS = BLOCKS.register("sandalwood_stairs", () -> new StairsBlock(Blocks.OAK_PLANKS::getDefaultState, AbstractBlock.Properties.from(Blocks.OAK_STAIRS)));

    public static final RegistryObject<Block> LINDEN_BUTTON = BLOCKS.register("linden_button", () -> new WoodButtonBlock(AbstractBlock.Properties.from(Blocks.OAK_BUTTON)));
    public static final RegistryObject<Block> JUNIPER_BUTTON = BLOCKS.register("juniper_button", () -> new WoodButtonBlock(AbstractBlock.Properties.from(Blocks.OAK_BUTTON)));
    public static final RegistryObject<Block> SANDALWOOD_BUTTON = BLOCKS.register("sandalwood_button", () -> new WoodButtonBlock(AbstractBlock.Properties.from(Blocks.OAK_BUTTON)));

    public static final RegistryObject<Block> LINDEN_DOOR = BLOCKS.register("linden_door", () -> new DoorBlock(AbstractBlock.Properties.from(Blocks.OAK_DOOR)));
    public static final RegistryObject<Block> JUNIPER_DOOR = BLOCKS.register("juniper_door", () -> new DoorBlock(AbstractBlock.Properties.from(Blocks.OAK_DOOR)));
    public static final RegistryObject<Block> SANDALWOOD_DOOR = BLOCKS.register("sandalwood_door", () -> new DoorBlock(AbstractBlock.Properties.from(Blocks.OAK_DOOR)));

    public static final RegistryObject<Block> LINDEN_SIGN = BLOCKS.register("linden_sign", () -> new FolkMedicineStandingSignBlock(AbstractBlock.Properties.from(Blocks.OAK_SIGN), FolkMedicineWoodTypes.LINDEN));
    public static final RegistryObject<Block> JUNIPER_SIGN = BLOCKS.register("juniper_sign", () -> new FolkMedicineStandingSignBlock(AbstractBlock.Properties.from(Blocks.OAK_SIGN), FolkMedicineWoodTypes.JUNIPER));
    public static final RegistryObject<Block> SANDALWOOD_SIGN = BLOCKS.register("sandalwood_sign", () -> new FolkMedicineStandingSignBlock(AbstractBlock.Properties.from(Blocks.OAK_SIGN), FolkMedicineWoodTypes.SANDALWOOD));

    public static final RegistryObject<Block> LINDEN_WALL_SIGN = BLOCKS.register("linden_wall_sign", () -> new FolkMedicineWallSignBlock(AbstractBlock.Properties.from(Blocks.OAK_SIGN), FolkMedicineWoodTypes.LINDEN));
    public static final RegistryObject<Block> JUNIPER_WALL_SIGN = BLOCKS.register("juniper_wall_sign", () -> new FolkMedicineWallSignBlock(AbstractBlock.Properties.from(Blocks.OAK_SIGN), FolkMedicineWoodTypes.JUNIPER));
    public static final RegistryObject<Block> SANDALWOOD_WALL_SIGN = BLOCKS.register("sandalwood_wall_sign", () -> new FolkMedicineWallSignBlock(AbstractBlock.Properties.from(Blocks.OAK_SIGN), FolkMedicineWoodTypes.SANDALWOOD));
}
