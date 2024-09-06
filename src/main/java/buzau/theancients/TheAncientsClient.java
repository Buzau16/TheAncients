package buzau.theancients;

import buzau.theancients.registry.AncientsBlocks;
import buzau.theancients.registry.AncientsScreenHandlers;
import buzau.theancients.ui.screenHandlers.Vase.VaseScreen;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.RenderLayer;

public class TheAncientsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        HandledScreens.register(AncientsScreenHandlers.VASE_SH, VaseScreen::new);

        BlockRenderLayerMap.INSTANCE.putBlock(AncientsBlocks.PRIMORDIAL_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(AncientsBlocks.PRIMORDIAL_SAPLING, RenderLayer.getCutout());
    }
}
