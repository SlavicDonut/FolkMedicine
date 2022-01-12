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
    public static BlockItem linden_sapling = new BlockItem(ModBlocks.LINDEN_SAPLING, new Item.Properties().tab(FolkMedicine.FOLK_MEDICINE));
    public static BlockItem juniper_sapling = new BlockItem(ModBlocks.JUNIPER_SAPLING, new Item.Properties().tab(FolkMedicine.FOLK_MEDICINE));
    public static BlockItem sandalwood_sapling = new BlockItem(ModBlocks.SANDALWOOD_SAPLING, new Item.Properties().tab(FolkMedicine.FOLK_MEDICINE));

    public static BlockItem linden_leaves = new BlockItem(ModBlocks.LINDEN_LEAVES, new Item.Properties().tab(FolkMedicine.FOLK_MEDICINE));
    public static BlockItem juniper_leaves = new BlockItem(ModBlocks.JUNIPER_LEAVES, new Item.Properties().tab(FolkMedicine.FOLK_MEDICINE));
    public static BlockItem sandalwood_leaves = new BlockItem(ModBlocks.SANDALWOOD_LEAVES, new Item.Properties().tab(FolkMedicine.FOLK_MEDICINE));

    public static BlockItem linden_log = new BlockItem(ModBlocks.LINDEN_LOG, new Item.Properties().tab(FolkMedicine.FOLK_MEDICINE));
    public static BlockItem juniper_log = new BlockItem(ModBlocks.JUNIPER_LOG, new Item.Properties().tab(FolkMedicine.FOLK_MEDICINE));
    public static BlockItem sandalwood_log = new BlockItem(ModBlocks.SANDALWOOD_LOG, new Item.Properties().tab(FolkMedicine.FOLK_MEDICINE));

    public static BlockItem stripped_linden_log = new BlockItem(ModBlocks.STRIPPED_LINDEN_LOG, new Item.Properties().tab(FolkMedicine.FOLK_MEDICINE));
    public static BlockItem stripped_juniper_log = new BlockItem(ModBlocks.STRIPPED_JUNIPER_LOG, new Item.Properties().tab(FolkMedicine.FOLK_MEDICINE));
    public static BlockItem stripped_sandalwood_log = new BlockItem(ModBlocks.STRIPPED_SANDALWOOD_LOG, new Item.Properties().tab(FolkMedicine.FOLK_MEDICINE));

    public static BlockItem linden_planks = new BlockItem(ModBlocks.LINDEN_PLANKS, new Item.Properties().tab(FolkMedicine.FOLK_MEDICINE));
    public static BlockItem juniper_planks = new BlockItem(ModBlocks.JUNIPER_PLANKS, new Item.Properties().tab(FolkMedicine.FOLK_MEDICINE));
    public static BlockItem sandalwood_planks = new BlockItem(ModBlocks.SANDALWOOD_PLANKS, new Item.Properties().tab(FolkMedicine.FOLK_MEDICINE));

    //ingredients
    public static Item chamomile_petals = new Item(new Item.Properties().tab(FolkMedicine.FOLK_MEDICINE));
    public static Item nettle_leaves = new Item(new Item.Properties().tab(FolkMedicine.FOLK_MEDICINE));
    public static Item ribleaf_leaves = new Item(new Item.Properties().tab(FolkMedicine.FOLK_MEDICINE));
    public static Item sage_leaves = new Item(new Item.Properties().tab(FolkMedicine.FOLK_MEDICINE));
    public static Item yarrow_petals = new Item(new Item.Properties().tab(FolkMedicine.FOLK_MEDICINE));
    public static Item sweetflag_rhizomes = new Item(new Item.Properties().tab(FolkMedicine.FOLK_MEDICINE));

    public static Item linden_petals = new Item(new Item.Properties().tab(FolkMedicine.FOLK_MEDICINE));
    public static Item juniper_berries = new Item(new Item.Properties().tab(FolkMedicine.FOLK_MEDICINE));
    public static Item sandalwood_resin = new Item(new Item.Properties().tab(FolkMedicine.FOLK_MEDICINE));

    //seeds
    public static Item chamomile_seeds = new BlockNamedItem(ModBlocks.CHAMOMILE, new Item.Properties().tab(FolkMedicine.FOLK_MEDICINE));
    public static Item nettle_seeds = new BlockNamedItem(ModBlocks.NETTLE, new Item.Properties().tab(FolkMedicine.FOLK_MEDICINE));
    public static Item ribleaf_seeds = new BlockNamedItem(ModBlocks.RIBLEAF, new Item.Properties().tab(FolkMedicine.FOLK_MEDICINE));
    public static Item sage_seeds = new BlockNamedItem(ModBlocks.SAGE, new Item.Properties().tab(FolkMedicine.FOLK_MEDICINE));
    public static Item yarrow_seeds = new BlockNamedItem(ModBlocks.YARROW, new Item.Properties().tab(FolkMedicine.FOLK_MEDICINE));
    public static Item sweetflag_seeds = new BlockNamedItem(ModBlocks.SWEET_FLAG, new Item.Properties().tab(FolkMedicine.FOLK_MEDICINE));


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
