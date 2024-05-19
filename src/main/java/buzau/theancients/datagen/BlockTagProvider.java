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

    // Adding different blocks to a tag
    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        // Un what blocks the custom saplings are able to be planted
        getOrCreateTagBuilder(AncientsSaplings.PLANTABLE)
                .add(AncientsBlocks.ANCIENT_GRASS_BLOCK)
                .add(AncientsBlocks.ANCIENT_DIRT);

        // Which blocks require iron tools
        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(AncientsBlocks.ETHEREAL_ARCANE_ORE)
                .add(AncientsBlocks.ANCIENT_STONE)
                .add(AncientsBlocks.ANCIENT_COBBLE);

        // Which blocks require a pickaxe to be able to be mined
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(AncientsBlocks.ETHEREAL_ARCANE_ORE)
                .add(AncientsBlocks.ANCIENT_STONE)
                .add(AncientsBlocks.ANCIENT_COBBLE);

        // What blocks require a shovel to be able to be mined
        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE)
                .add(AncientsBlocks.ANCIENT_DIRT)
                .add(AncientsBlocks.ANCIENT_GRASS_BLOCK);

        // What blocks require a hoe to be able to be mined
        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
                .add(AncientsBlocks.LUMINESCENT_FOSSILITE);

        // Makes wall/fences able to join/connect
        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(AncientsBlocks.ANCIENT_STONE_WALL)
                .add(AncientsBlocks.ANCIENT_STONE_BRICK_WALL)
                .add(AncientsBlocks.CRACKED_ANCIENT_STONE_BRICK_WALL)
                .add(AncientsBlocks.ANCIENT_COBBLE_WALL);
    }
}
