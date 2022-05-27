package donut.folkmedicine.client.render;

import donut.folkmedicine.common.block.ModBlocks;
import donut.folkmedicine.common.tileentity.FolkMedicineEntityTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.client.renderer.tileentity.SignTileEntityRenderer;
import net.minecraftforge.fml.client.registry.ClientRegistry;

public class RenderManager
{
    public static void registerRenderers() {
        RenderType transparentRenderType = RenderType.getCutoutMipped();

        RenderTypeLookup.setRenderLayer(ModBlocks.LINDEN_LEAVES.get(), transparentRenderType);
        RenderTypeLookup.setRenderLayer(ModBlocks.JUNIPER_LEAVES.get(), transparentRenderType);
        RenderTypeLookup.setRenderLayer(ModBlocks.SANDALWOOD_LEAVES.get(), transparentRenderType);

        RenderTypeLookup.setRenderLayer(ModBlocks.CHAMOMILE.get(), transparentRenderType);
        RenderTypeLookup.setRenderLayer(ModBlocks.NETTLE.get(), transparentRenderType);
        RenderTypeLookup.setRenderLayer(ModBlocks.RIBLEAF.get(), transparentRenderType);
        RenderTypeLookup.setRenderLayer(ModBlocks.SAGE.get(), transparentRenderType);
        RenderTypeLookup.setRenderLayer(ModBlocks.YARROW.get(), transparentRenderType);
        RenderTypeLookup.setRenderLayer(ModBlocks.SWEETFLAG.get(), transparentRenderType);

        bindTileEntityRenderers();
    }

    private static void bindTileEntityRenderers() {
        ClientRegistry.bindTileEntityRenderer(FolkMedicineEntityTypes.SIGN.get(), SignTileEntityRenderer::new);
    }
}
