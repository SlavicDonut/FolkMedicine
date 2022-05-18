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
    public static BlockItem linden_sapling = registerBlockItem("linden_sapling", new BlockItem(ModBlocks.LINDEN_SAPLING, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE)));
    public static BlockItem juniper_sapling = registerBlockItem("juniper_sapling", new BlockItem(ModBlocks.JUNIPER_SAPLING, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE)));
    public static BlockItem sandalwood_sapling = registerBlockItem("sandalwood_sapling", new BlockItem(ModBlocks.SANDALWOOD_SAPLING, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE)));

    public static BlockItem linden_leaves = registerBlockItem("linden_leaves", new BlockItem(ModBlocks.LINDEN_LEAVES, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE)));
    public static BlockItem juniper_leaves = registerBlockItem("juniper_leaves", new BlockItem(ModBlocks.JUNIPER_LEAVES, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE)));
    public static BlockItem sandalwood_leaves = registerBlockItem("sandalwood_leaves", new BlockItem(ModBlocks.SANDALWOOD_LEAVES, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE)));

    public static BlockItem linden_log = registerBlockItem("linden_log", new BlockItem(ModBlocks.LINDEN_LOG, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE)));
    public static BlockItem juniper_log = registerBlockItem("juniper_log", new BlockItem(ModBlocks.JUNIPER_LOG, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE)));
    public static BlockItem sandalwood_log = registerBlockItem("sandalwood_log", new BlockItem(ModBlocks.SANDALWOOD_LOG, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE)));

    public static BlockItem stripped_linden_log = registerBlockItem("stripped_linden_log", new BlockItem(ModBlocks.STRIPPED_LINDEN_LOG, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE)));
    public static BlockItem stripped_juniper_log = registerBlockItem("stripped_juniper_log", new BlockItem(ModBlocks.STRIPPED_JUNIPER_LOG, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE)));
    public static BlockItem stripped_sandalwood_log = registerBlockItem("stripped_sandalwood_log", new BlockItem(ModBlocks.STRIPPED_SANDALWOOD_LOG, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE)));

    public static BlockItem linden_planks = registerBlockItem("linden_planks", new BlockItem(ModBlocks.LINDEN_PLANKS, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE)));
    public static BlockItem juniper_planks = registerBlockItem("juniper_planks", new BlockItem(ModBlocks.JUNIPER_PLANKS, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE)));
    public static BlockItem sandalwood_planks = registerBlockItem("sandalwood_planks", new BlockItem(ModBlocks.SANDALWOOD_PLANKS, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE)));

    public static BlockItem linden_wood = registerBlockItem("linden_wood", new BlockItem(ModBlocks.LINDEN_WOOD, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE)));
    public static BlockItem juniper_wood = registerBlockItem("juniper_wood", new BlockItem(ModBlocks.JUNIPER_WOOD, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE)));
    public static BlockItem sandalwood_wood = registerBlockItem("sandalwood_wood", new BlockItem(ModBlocks.SANDALWOOD_WOOD, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE)));

    public static BlockItem stripped_linden_wood = registerBlockItem("stripped_linden_wood", new BlockItem(ModBlocks.STRIPPED_LINDEN_WOOD, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE)));
    public static BlockItem stripped_juniper_wood = registerBlockItem("stripped_juniper_wood", new BlockItem(ModBlocks.STRIPPED_JUNIPER_WOOD, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE)));
    public static BlockItem stripped_sandalwood_wood = registerBlockItem("stripped_sandalwood_wood", new BlockItem(ModBlocks.STRIPPED_SANDALWOOD_WOOD, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE)));

    public static BlockItem linden_slab = registerBlockItem("linden_slab", new BlockItem(ModBlocks.LINDEN_SLAB, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE)));
    public static BlockItem juniper_slab = registerBlockItem("juniper_slab", new BlockItem(ModBlocks.JUNIPER_SLAB, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE)));
    public static BlockItem sandalwood_slab = registerBlockItem("sandalwood_slab", new BlockItem(ModBlocks.SANDALWOOD_SLAB, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE)));

    public static BlockItem linden_pressure_plate = registerBlockItem("linden_pressure_plate", new BlockItem(ModBlocks.LINDEN_PRESSURE_PLATE, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE)));
    public static BlockItem juniper_pressure_plate = registerBlockItem("juniper_pressure_plate", new BlockItem(ModBlocks.JUNIPER_PRESSURE_PLATE, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE)));
    public static BlockItem sandalwood_pressure_plate = registerBlockItem("sandalwood_pressure_plate", new BlockItem(ModBlocks.SANDALWOOD_PRESSURE_PLATE, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE)));

    public static BlockItem linden_fence = registerBlockItem("linden_fence", new BlockItem(ModBlocks.LINDEN_FENCE, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE)));
    public static BlockItem juniper_fence = registerBlockItem("juniper_fence", new BlockItem(ModBlocks.JUNIPER_FENCE, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE)));
    public static BlockItem sandalwood_fence = registerBlockItem("sandalwood_fence", new BlockItem(ModBlocks.SANDALWOOD_FENCE, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE)));

    public static BlockItem linden_trapdoor = registerBlockItem("linden_trapdoor", new BlockItem(ModBlocks.LINDEN_TRAPDOOR, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE)));
    public static BlockItem juniper_trapdoor = registerBlockItem("juniper_trapdoor", new BlockItem(ModBlocks.JUNIPER_TRAPDOOR, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE)));
    public static BlockItem sandalwood_trapdoor = registerBlockItem("sandalwood_trapdoor", new BlockItem(ModBlocks.SANDALWOOD_TRAPDOOR, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE)));

    public static BlockItem linden_fence_gate = registerBlockItem("linden_fence_gate", new BlockItem(ModBlocks.LINDEN_FENCE_GATE, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE)));
    public static BlockItem juniper_fence_gate = registerBlockItem("juniper_fence_gate", new BlockItem(ModBlocks.JUNIPER_FENCE_GATE, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE)));
    public static BlockItem sandalwood_fence_gate = registerBlockItem("sandalwood_fence_gate", new BlockItem(ModBlocks.SANDALWOOD_FENCE_GATE, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE)));

    public static BlockItem linden_stairs = registerBlockItem("linden_stairs", new BlockItem(ModBlocks.LINDEN_STAIRS, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE)));
    public static BlockItem juniper_stairs = registerBlockItem("juniper_stairs", new BlockItem(ModBlocks.JUNIPER_STAIRS, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE)));
    public static BlockItem sandalwood_stairs = registerBlockItem("sandalwood_stairs", new BlockItem(ModBlocks.SANDALWOOD_STAIRS, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE)));

    public static BlockItem linden_button = registerBlockItem("linden_button", new BlockItem(ModBlocks.LINDEN_BUTTON, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE)));
    public static BlockItem juniper_button = registerBlockItem("juniper_button", new BlockItem(ModBlocks.JUNIPER_BUTTON, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE)));
    public static BlockItem sandalwood_button = registerBlockItem("sandalwood_button", new BlockItem(ModBlocks.SANDALWOOD_BUTTON, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE)));

    public static BlockItem linden_door = registerBlockItem("linden_door", new BlockItem(ModBlocks.LINDEN_DOOR, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE)));
    public static BlockItem juniper_door = registerBlockItem("juniper_door", new BlockItem(ModBlocks.JUNIPER_DOOR, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE)));
    public static BlockItem sandalwood_door = registerBlockItem("sandalwood_door", new BlockItem(ModBlocks.SANDALWOOD_DOOR, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE)));

    public static BlockItem linden_sign = registerBlockItem("linden_sign", new BlockItem(ModBlocks.LINDEN_SIGN, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE)));
    public static BlockItem juniper_sign = registerBlockItem("juniper_sign", new BlockItem(ModBlocks.JUNIPER_SIGN, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE)));
    public static BlockItem sandalwood_sign = registerBlockItem("sandalwood_sign", new BlockItem(ModBlocks.SANDALWOOD_SIGN, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE)));

    //ingredients
    public static Item chamomile_petals = registerItem("chamomile_petals", new Item(new Item.Properties().group(FolkMedicine.FOLK_MEDICINE)));
    public static Item nettle_leaves = registerItem("nettle_leaves", new Item(new Item.Properties().group(FolkMedicine.FOLK_MEDICINE)));
    public static Item ribleaf_leaves = registerItem("ribleaf_leaves", new Item(new Item.Properties().group(FolkMedicine.FOLK_MEDICINE)));
    public static Item sage_leaves = registerItem("sage_leaves", new Item(new Item.Properties().group(FolkMedicine.FOLK_MEDICINE)));
    public static Item yarrow_petals = registerItem("yarrow_petals", new Item(new Item.Properties().group(FolkMedicine.FOLK_MEDICINE)));
    public static Item sweetflag_rhizomes = registerItem("sweetflag_rhizomes", new Item(new Item.Properties().group(FolkMedicine.FOLK_MEDICINE)));

    public static Item linden_petals = registerItem("linden_petals", new Item(new Item.Properties().group(FolkMedicine.FOLK_MEDICINE)));
    public static Item juniper_berries = registerItem("juniper_berries", new Item(new Item.Properties().group(FolkMedicine.FOLK_MEDICINE)));
    public static Item sandalwood_resin = registerItem("sandalwood_resin", new Item(new Item.Properties().group(FolkMedicine.FOLK_MEDICINE)));

    //seeds
    public static Item chamomile_seeds = registerItem("chamomile_seeds", new BlockNamedItem(ModBlocks.CHAMOMILE, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE)));
    public static Item nettle_seeds = registerItem("nettle_seeds", new BlockNamedItem(ModBlocks.NETTLE, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE)));
    public static Item ribleaf_seeds = registerItem("ribleaf_seeds", new BlockNamedItem(ModBlocks.RIBLEAF, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE)));
    public static Item sage_seeds = registerItem("sage_seeds", new BlockNamedItem(ModBlocks.SAGE, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE)));
    public static Item yarrow_seeds = registerItem("yarrow_seeds", new BlockNamedItem(ModBlocks.YARROW, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE)));
    public static Item sweetflag_seeds = registerItem("sweetflag_seeds", new BlockNamedItem(ModBlocks.SWEETFLAG, new Item.Properties().group(FolkMedicine.FOLK_MEDICINE)));


    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
    }

    public static Item registerItem(String name, Item item) {
        item.setRegistryName(name);
        ForgeRegistries.ITEMS.register(item);
        return item;
    }

    public static BlockItem registerBlockItem(String name, BlockItem blockItem) {
        blockItem.setRegistryName(name);
        ForgeRegistries.ITEMS.register(blockItem);
        return blockItem;
    }
}
