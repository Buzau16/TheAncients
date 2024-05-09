package buzau.theancients.datagen;

import buzau.theancients.block.AncientsBlocks;
import buzau.theancients.world.tree.AncientsSaplings;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class BlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public BlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        getOrCreateTagBuilder(AncientsSaplings.PLANTABLE)
                .add(AncientsBlocks.ANCIENT_GRASS_BLOCK)
                .add(AncientsBlocks.ANCIENT_DIRT);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(AncientsBlocks.ETHEREAL_ARCANE_ORE);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(AncientsBlocks.ETHEREAL_ARCANE_ORE);

        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE)
                .add(AncientsBlocks.ANCIENT_DIRT)
                .add(AncientsBlocks.ANCIENT_GRASS_BLOCK);

        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
                .add(AncientsBlocks.LUMINESCENT_FOSSILITE);
    }
}
