package donut.folkmedicine.common.block;

import donut.folkmedicine.common.block.tree.JuniperTree;
import donut.folkmedicine.common.block.tree.LindenTree;
import donut.folkmedicine.common.block.tree.SandalwoodTree;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.block.trees.OakTree;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
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
    public static Block CHAMOMILE = new HerbBlock(Block.Properties.of(Material.PLANT).noCollission().sound(SoundType.GRASS));
    public static Block NETTLE = new HerbBlock(Block.Properties.of(Material.PLANT).noCollission().sound(SoundType.GRASS));
    public static Block RIBLEAF = new HerbBlock(Block.Properties.of(Material.PLANT).noCollission().sound(SoundType.GRASS));
    public static Block SAGE = new HerbBlock(Block.Properties.of(Material.PLANT).noCollission().sound(SoundType.GRASS));
    public static Block YARROW = new HerbBlock(Block.Properties.of(Material.PLANT).noCollission().sound(SoundType.GRASS));
    public static Block SWEET_FLAG = new WaterHerbBlock((Block.Properties.of(Material.PLANT).noCollission().sound(SoundType.GRASS).noOcclusion()));

    //trees' stuff
    public static Block LINDEN_SAPLING = new SaplingBlock(new LindenTree(), AbstractBlock.Properties.copy(Blocks.OAK_SAPLING));
    public static Block JUNIPER_SAPLING = new SaplingBlock(new JuniperTree(), AbstractBlock.Properties.copy(Blocks.OAK_SAPLING));
    public static Block SANDALWOOD_SAPLING = new SaplingBlock(new SandalwoodTree(), AbstractBlock.Properties.copy(Blocks.OAK_SAPLING));

    public static Block LINDEN_LEAVES = leaves();
    public static Block SANDALWOOD_LEAVES = leaves();
    public static Block JUNIPER_LEAVES = leaves();

    public static Block LINDEN_LOG = new HerbLogBlock(MaterialColor.WOOD, MaterialColor.COLOR_GRAY);
    public static Block SANDALWOOD_LOG = new HerbLogBlock(MaterialColor.WOOD, MaterialColor.COLOR_ORANGE);
    public static Block JUNIPER_LOG = new HerbLogBlock(MaterialColor.WOOD, MaterialColor.COLOR_BROWN);

    public static Block STRIPPED_LINDEN_LOG = new HerbLogBlock(MaterialColor.WOOD, MaterialColor.COLOR_GRAY);
    public static Block STRIPPED_SANDALWOOD_LOG = new HerbLogBlock(MaterialColor.WOOD, MaterialColor.COLOR_ORANGE);
    public static Block STRIPPED_JUNIPER_LOG = new HerbLogBlock(MaterialColor.WOOD, MaterialColor.COLOR_BROWN);

    public static Block LINDEN_PLANKS = new Block(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.COLOR_GRAY).strength(2.0F, 3.0F).sound(SoundType.WOOD));
    public static Block SANDALWOOD_PLANKS = new Block(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.COLOR_ORANGE).strength(2.0F, 3.0F).sound(SoundType.WOOD));
    public static Block JUNIPER_PLANKS = new Block(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.COLOR_BROWN).strength(2.0F, 3.0F).sound(SoundType.WOOD));

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        //herbs
        registerBlock(CHAMOMILE, "chamomile");
        registerBlock(NETTLE, "nettle");
        registerBlock(RIBLEAF, "ribleaf");
        registerBlock(SAGE, "sage");
        registerBlock(YARROW, "yarrow");
        registerBlock(SWEET_FLAG, "sweetflag");

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

        if (FMLEnvironment.dist == Dist.CLIENT) {
            RenderType transparentRender = RenderType.cutoutMipped();

            RenderTypeLookup.setRenderLayer(CHAMOMILE, transparentRender);
            RenderTypeLookup.setRenderLayer(NETTLE, transparentRender);
            RenderTypeLookup.setRenderLayer(RIBLEAF, transparentRender);
            RenderTypeLookup.setRenderLayer(SAGE, transparentRender);
            RenderTypeLookup.setRenderLayer(YARROW, transparentRender);
            RenderTypeLookup.setRenderLayer(SWEET_FLAG, transparentRender);

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
        return new LeavesBlock(AbstractBlock.Properties.of(Material.LEAVES).strength(0.2F).randomTicks().sound(SoundType.GRASS).noOcclusion().isSuffocating(ModBlocks::never).isViewBlocking(ModBlocks::never));
    }

}
