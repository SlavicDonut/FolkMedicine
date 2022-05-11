package donut.folkmedicine.common.item;

import donut.folkmedicine.FolkMedicine;
import donut.folkmedicine.common.block.ModBlocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.BlockNamedItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class ModItems {

    //trees' stuff
    public static BlockItem linden_sapling = new BlockItem(ModBlocks.LINDEN_SAPLING, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE));
    public static BlockItem juniper_sapling = new BlockItem(ModBlocks.JUNIPER_SAPLING, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE));
    public static BlockItem sandalwood_sapling = new BlockItem(ModBlocks.SANDALWOOD_SAPLING, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE));

    public static BlockItem linden_leaves = new BlockItem(ModBlocks.LINDEN_LEAVES, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE));
    public static BlockItem juniper_leaves = new BlockItem(ModBlocks.JUNIPER_LEAVES, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE));
    public static BlockItem sandalwood_leaves = new BlockItem(ModBlocks.SANDALWOOD_LEAVES, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE));

    public static BlockItem linden_log = new BlockItem(ModBlocks.LINDEN_LOG, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE));
    public static BlockItem juniper_log = new BlockItem(ModBlocks.JUNIPER_LOG, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE));
    public static BlockItem sandalwood_log = new BlockItem(ModBlocks.SANDALWOOD_LOG, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE));

    public static BlockItem stripped_linden_log = new BlockItem(ModBlocks.STRIPPED_LINDEN_LOG, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE));
    public static BlockItem stripped_juniper_log = new BlockItem(ModBlocks.STRIPPED_JUNIPER_LOG, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE));
    public static BlockItem stripped_sandalwood_log = new BlockItem(ModBlocks.STRIPPED_SANDALWOOD_LOG, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE));

    public static BlockItem linden_planks = new BlockItem(ModBlocks.LINDEN_PLANKS, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE));
    public static BlockItem juniper_planks = new BlockItem(ModBlocks.JUNIPER_PLANKS, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE));
    public static BlockItem sandalwood_planks = new BlockItem(ModBlocks.SANDALWOOD_PLANKS, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE));

    public static BlockItem linden_wood = new BlockItem(ModBlocks.LINDEN_WOOD, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE));
    public static BlockItem juniper_wood = new BlockItem(ModBlocks.JUNIPER_WOOD, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE));
    public static BlockItem sandalwood_wood = new BlockItem(ModBlocks.SANDALWOOD_WOOD, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE));

    public static BlockItem stripped_linden_wood = new BlockItem(ModBlocks.STRIPPED_LINDEN_WOOD, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE));
    public static BlockItem stripped_juniper_wood = new BlockItem(ModBlocks.STRIPPED_JUNIPER_WOOD, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE));
    public static BlockItem stripped_sandalwood_wood = new BlockItem(ModBlocks.STRIPPED_SANDALWOOD_WOOD, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE));

    public static BlockItem linden_slab = new BlockItem(ModBlocks.LINDEN_SLAB, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE));
    public static BlockItem juniper_slab = new BlockItem(ModBlocks.JUNIPER_SLAB, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE));
    public static BlockItem sandalwood_slab = new BlockItem(ModBlocks.SANDALWOOD_SLAB, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE));

    public static BlockItem linden_pressure_plate = new BlockItem(ModBlocks.LINDEN_PRESSURE_PLATE, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE));
    public static BlockItem juniper_pressure_plate = new BlockItem(ModBlocks.JUNIPER_PRESSURE_PLATE, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE));
    public static BlockItem sandalwood_pressure_plate = new BlockItem(ModBlocks.SANDALWOOD_PRESSURE_PLATE, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE));

    public static BlockItem linden_fence = new BlockItem(ModBlocks.LINDEN_FENCE, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE));
    public static BlockItem juniper_fence = new BlockItem(ModBlocks.JUNIPER_FENCE, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE));
    public static BlockItem sandalwood_fence = new BlockItem(ModBlocks.SANDALWOOD_FENCE, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE));

    public static BlockItem linden_trapdoor = new BlockItem(ModBlocks.LINDEN_TRAPDOOR, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE));
    public static BlockItem juniper_trapdoor = new BlockItem(ModBlocks.JUNIPER_TRAPDOOR, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE));
    public static BlockItem sandalwood_trapdoor = new BlockItem(ModBlocks.SANDALWOOD_TRAPDOOR, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE));

    public static BlockItem linden_fence_gate = new BlockItem(ModBlocks.LINDEN_FENCE_GATE, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE));
    public static BlockItem juniper_fence_gate = new BlockItem(ModBlocks.JUNIPER_FENCE_GATE, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE));
    public static BlockItem sandalwood_fence_gate = new BlockItem(ModBlocks.SANDALWOOD_FENCE_GATE, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE));

    public static BlockItem linden_stairs = new BlockItem(ModBlocks.LINDEN_STAIRS, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE));
    public static BlockItem juniper_stairs = new BlockItem(ModBlocks.JUNIPER_STAIRS, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE));
    public static BlockItem sandalwood_stairs = new BlockItem(ModBlocks.SANDALWOOD_STAIRS, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE));

    public static BlockItem linden_button = new BlockItem(ModBlocks.LINDEN_BUTTON, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE));
    public static BlockItem juniper_button = new BlockItem(ModBlocks.JUNIPER_BUTTON, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE));
    public static BlockItem sandalwood_button = new BlockItem(ModBlocks.SANDALWOOD_BUTTON, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE));

    public static BlockItem linden_door = new BlockItem(ModBlocks.LINDEN_DOOR, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE));
    public static BlockItem juniper_door = new BlockItem(ModBlocks.JUNIPER_DOOR, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE));
    public static BlockItem sandalwood_door = new BlockItem(ModBlocks.SANDALWOOD_DOOR, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE));

    public static BlockItem linden_sign = new BlockItem(ModBlocks.LINDEN_SIGN, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE));
    public static BlockItem juniper_sign = new BlockItem(ModBlocks.JUNIPER_SIGN, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE));
    public static BlockItem sandalwood_sign = new BlockItem(ModBlocks.SANDALWOOD_SIGN, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE));

    //ingredients
    public static Item chamomile_petals = new Item(new Item.Properties().group(FolkMedicine.FOLK_MEDICINE));
    public static Item nettle_leaves = new Item(new Item.Properties().group(FolkMedicine.FOLK_MEDICINE));
    public static Item ribleaf_leaves = new Item(new Item.Properties().group(FolkMedicine.FOLK_MEDICINE));
    public static Item sage_leaves = new Item(new Item.Properties().group(FolkMedicine.FOLK_MEDICINE));
    public static Item yarrow_petals = new Item(new Item.Properties().group(FolkMedicine.FOLK_MEDICINE));
    public static Item sweetflag_rhizomes = new Item(new Item.Properties().group(FolkMedicine.FOLK_MEDICINE));

    public static Item linden_petals = new Item(new Item.Properties().group(FolkMedicine.FOLK_MEDICINE));
    public static Item juniper_berries = new Item(new Item.Properties().group(FolkMedicine.FOLK_MEDICINE));
    public static Item sandalwood_resin = new Item(new Item.Properties().group(FolkMedicine.FOLK_MEDICINE));

    //seeds
    public static Item chamomile_seeds = new BlockNamedItem(ModBlocks.CHAMOMILE, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE));
    public static Item nettle_seeds = new BlockNamedItem(ModBlocks.NETTLE, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE));
    public static Item ribleaf_seeds = new BlockNamedItem(ModBlocks.RIBLEAF, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE));
    public static Item sage_seeds = new BlockNamedItem(ModBlocks.SAGE, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE));
    public static Item yarrow_seeds = new BlockNamedItem(ModBlocks.YARROW, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE));
    public static Item sweetflag_seeds = new BlockNamedItem(ModBlocks.SWEETFLAG, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE));


    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {

        //trees' stuff
        registerItemBlock(linden_sapling, "linden_sapling");
        registerItemBlock(juniper_sapling, "juniper_sapling");
        registerItemBlock(sandalwood_sapling, "sandalwood_sapling");

        registerItemBlock(linden_leaves, "linden_leaves");
        registerItemBlock(juniper_leaves, "juniper_leaves");
        registerItemBlock(sandalwood_leaves, "sandalwood_leaves");

        registerItemBlock(linden_log, "linden_log");
        registerItemBlock(juniper_log, "juniper_log");
        registerItemBlock(sandalwood_log, "sandalwood_log");

        registerItemBlock(stripped_linden_log, "stripped_linden_log");
        registerItemBlock(stripped_juniper_log, "stripped_juniper_log");
        registerItemBlock(stripped_sandalwood_log, "stripped_sandalwood_log");

        registerItemBlock(linden_planks, "linden_planks");
        registerItemBlock(juniper_planks, "juniper_planks");
        registerItemBlock(sandalwood_planks, "sandalwood_planks");

        registerItemBlock(linden_wood, "linden_wood");
        registerItemBlock(juniper_wood, "juniper_wood");
        registerItemBlock(sandalwood_wood, "sandalwood_wood");

        registerItemBlock(stripped_linden_wood, "stripped_linden_wood");
        registerItemBlock(stripped_juniper_wood, "stripped_juniper_wood");
        registerItemBlock(stripped_sandalwood_wood, "stripped_sandalwood_wood");

        registerItemBlock(linden_slab, "linden_slab");
        registerItemBlock(juniper_slab, "juniper_slab");
        registerItemBlock(sandalwood_slab, "sandalwood_slab");

        registerItemBlock(linden_pressure_plate, "linden_pressure_plate");
        registerItemBlock(juniper_pressure_plate, "juniper_pressure_plate");
        registerItemBlock(sandalwood_pressure_plate, "sandalwood_pressure_plate");

        registerItemBlock(linden_fence, "linden_fence");
        registerItemBlock(juniper_fence, "juniper_fence");
        registerItemBlock(sandalwood_fence, "sandalwood_fence");

        registerItemBlock(linden_trapdoor, "linden_trapdoor");
        registerItemBlock(juniper_trapdoor, "juniper_trapdoor");
        registerItemBlock(sandalwood_trapdoor, "sandalwood_trapdoor");

        registerItemBlock(linden_fence_gate, "linden_fence_gate");
        registerItemBlock(juniper_fence_gate, "juniper_fence_gate");
        registerItemBlock(sandalwood_fence_gate, "sandalwood_fence_gate");

        registerItemBlock(linden_stairs, "linden_stairs");
        registerItemBlock(juniper_stairs, "juniper_stairs");
        registerItemBlock(sandalwood_stairs, "sandalwood_stairs");

        registerItemBlock(linden_button, "linden_button");
        registerItemBlock(juniper_button, "juniper_button");
        registerItemBlock(sandalwood_button, "sandalwood_button");

        registerItemBlock(linden_door, "linden_door");
        registerItemBlock(juniper_door, "juniper_door");
        registerItemBlock(sandalwood_door, "sandalwood_door");

        registerItemBlock(linden_sign, "linden_sign");
        registerItemBlock(juniper_sign, "juniper_sign");
        registerItemBlock(sandalwood_sign, "sandalwood_sign");

        //ingredients
        registerItem(chamomile_petals,"chamomile_petals");
        registerItem(nettle_leaves,"nettle_leaves");
        registerItem(ribleaf_leaves,"ribleaf_leaves");
        registerItem(sage_leaves,"sage_leaves");
        registerItem(yarrow_petals,"yarrow_petals");
        registerItem(sweetflag_rhizomes,"sweetflag_rhizomes");

        registerItem(linden_petals,"linden_petals");
        registerItem(juniper_berries,"juniper_berries");
        registerItem(sandalwood_resin,"sandalwood_resin");

        //seeds
        registerItem(chamomile_seeds, "chamomile_seeds");
        registerItem(nettle_seeds, "nettle_seeds");
        registerItem(ribleaf_seeds, "ribleaf_seeds");
        registerItem(sage_seeds, "sage_seeds");
        registerItem(yarrow_seeds, "yarrow_seeds");
        registerItem(sweetflag_seeds, "sweetflag_seeds");



    }

    public static void registerItem(Item item, String name) {
        item.setRegistryName(name);
        ForgeRegistries.ITEMS.register(item);
    }

    public static void registerItemBlock(BlockItem itemBlock, String name) {
        itemBlock.setRegistryName(name);
        ForgeRegistries.ITEMS.register(itemBlock);
    }
}
