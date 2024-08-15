package buzau.theancients.datagen;

import buzau.theancients.block.AncientsBlocks;
import buzau.theancients.util.AncientsBlockTags;
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
        getOrCreateTagBuilder(AncientsBlockTags.ANCIENT_STONE_REPLACEABLE)
                .add(AncientsBlocks.ANCIENT_STONE);

        getOrCreateTagBuilder(AncientsBlockTags.PRIMORDIAL_LOG)
                .add(AncientsBlocks.PRIMORDIAL_LOG);

        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .addTag(AncientsBlockTags.PRIMORDIAL_LOG);

        getOrCreateTagBuilder(BlockTags.LOGS)
                .addTag(BlockTags.LOGS_THAT_BURN);

        getOrCreateTagBuilder(BlockTags.LEAVES)
                .add(AncientsBlocks.PRIMORDIAL_LEAVES);

        // Un what blocks the custom saplings are able to be planted
        getOrCreateTagBuilder(AncientsBlockTags.PLANTABLE)
                .add(AncientsBlocks.ANCIENT_GRASS_BLOCK)
                .add(AncientsBlocks.ANCIENT_DIRT);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(AncientsBlocks.ANCIENT_DIRT)
                .add(AncientsBlocks.ANCIENT_GRASS_BLOCK)

                .add(AncientsBlocks.LUMINESCENT_FOSSILITE)
                .add(AncientsBlocks.PRIMORDIAL_LOG)
                .add(AncientsBlocks.PRIMORDIAL_PLANKS)
                .add(AncientsBlocks.PRIMORDIAL_SLAB)
                .add(AncientsBlocks.PRIMORDIAL_STAIRS)
                .add(AncientsBlocks.PRIMORDIAL_FENCE)
                .add(AncientsBlocks.PRIMORDIAL_FENCE_GATE)

                .add(AncientsBlocks.ANCIENT_STONE)
                .add(AncientsBlocks.ANCIENT_STONE_SLAB)
                .add(AncientsBlocks.ANCIENT_STONE_WALL)
                .add(AncientsBlocks.ANCIENT_STONE_STAIRS)
                .add(AncientsBlocks.ANCIENT_STONE_BRICKS)
                .add(AncientsBlocks.ANCIENT_STONE_BRICK_SLAB)
                .add(AncientsBlocks.ANCIENT_STONE_BRICK_STAIRS)
                .add(AncientsBlocks.ANCIENT_STONE_BRICK_WALL)
                .add(AncientsBlocks.CRACKED_ANCIENT_STONE_BRICKS)
                .add(AncientsBlocks.CRACKED_ANCIENT_STONE_BRICK_SLAB)
                .add(AncientsBlocks.CRACKED_ANCIENT_STONE_BRICK_STAIRS)
                .add(AncientsBlocks.CRACKED_ANCIENT_STONE_BRICK_WALL)
                .add(AncientsBlocks.ANCIENT_COBBLE_STAIRS)
                .add(AncientsBlocks.ANCIENT_COBBLE_WALL)
                .add(AncientsBlocks.ANCIENT_COBBLE_SLAB)
                .add(AncientsBlocks.ETHEREAL_ARCANE_ORE)
                .add(AncientsBlocks.ANCIENT_COBBLE);

        // Which blocks require iron tools
        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(AncientsBlocks.VOIDSTONE_ORE);


        // Which blocks require a pickaxe to be able to be mined
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(AncientsBlocks.PRIMORDIAL_LEAVES)
                .add(AncientsBlocks.PRIMORDIAL_SAPLING)

                .add(AncientsBlocks.ANCIENT_STONE)
                .add(AncientsBlocks.ANCIENT_STONE_SLAB)
                .add(AncientsBlocks.ANCIENT_STONE_WALL)
                .add(AncientsBlocks.ANCIENT_STONE_STAIRS)
                .add(AncientsBlocks.ANCIENT_STONE_BRICKS)
                .add(AncientsBlocks.ANCIENT_STONE_BRICK_SLAB)
                .add(AncientsBlocks.ANCIENT_STONE_BRICK_STAIRS)
                .add(AncientsBlocks.ANCIENT_STONE_BRICK_WALL)
                .add(AncientsBlocks.CRACKED_ANCIENT_STONE_BRICKS)
                .add(AncientsBlocks.CRACKED_ANCIENT_STONE_BRICK_SLAB)
                .add(AncientsBlocks.CRACKED_ANCIENT_STONE_BRICK_STAIRS)
                .add(AncientsBlocks.CRACKED_ANCIENT_STONE_BRICK_WALL)
                .add(AncientsBlocks.ANCIENT_COBBLE_STAIRS)
                .add(AncientsBlocks.ANCIENT_COBBLE_WALL)
                .add(AncientsBlocks.ANCIENT_COBBLE_SLAB)
                .add(AncientsBlocks.ETHEREAL_ARCANE_ORE)
                .add(AncientsBlocks.ANCIENT_COBBLE)
                .add(AncientsBlocks.VASE)
                .add(AncientsBlocks.VOIDSTONE_ORE);

        // What blocks require a shovel to be able to be mined
        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE)
                .add(AncientsBlocks.PRIMORDIAL_LEAVES)
                .add(AncientsBlocks.PRIMORDIAL_SAPLING)

                .add(AncientsBlocks.ANCIENT_DIRT)
                .add(AncientsBlocks.ANCIENT_GRASS_BLOCK);

        // What blocks require a hoe to be able to be mined
        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
                .add(AncientsBlocks.PRIMORDIAL_LEAVES)
                .add(AncientsBlocks.PRIMORDIAL_SAPLING)

                .add(AncientsBlocks.LUMINESCENT_FOSSILITE);

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(AncientsBlocks.PRIMORDIAL_LEAVES)
                .add(AncientsBlocks.PRIMORDIAL_SAPLING)

                .add(AncientsBlocks.PRIMORDIAL_LOG)
                .add(AncientsBlocks.PRIMORDIAL_PLANKS)
                .add(AncientsBlocks.PRIMORDIAL_SLAB)
                .add(AncientsBlocks.PRIMORDIAL_STAIRS)
                .add(AncientsBlocks.PRIMORDIAL_FENCE)
                .add(AncientsBlocks.PRIMORDIAL_FENCE_GATE);

        // Makes walls able to join/connect
        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(AncientsBlocks.ANCIENT_STONE_WALL)
                .add(AncientsBlocks.ANCIENT_STONE_BRICK_WALL)
                .add(AncientsBlocks.CRACKED_ANCIENT_STONE_BRICK_WALL)
                .add(AncientsBlocks.ANCIENT_COBBLE_WALL);

        getOrCreateTagBuilder(BlockTags.WOODEN_FENCES)
                .add(AncientsBlocks.PRIMORDIAL_FENCE);

        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(AncientsBlocks.PRIMORDIAL_FENCE_GATE);
    }
}
