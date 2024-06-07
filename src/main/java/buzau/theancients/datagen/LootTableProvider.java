package buzau.theancients.datagen;

import buzau.theancients.block.AncientsBlocks;
import buzau.theancients.items.custom.AncientsItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class LootTableProvider extends FabricBlockLootTableProvider {
    public LootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    // Basically what each block drops
    @Override
    public void generate() {
        addDrop(AncientsBlocks.ANCIENT_DIRT);
        addDrop(AncientsBlocks.ANCIENT_COBBLE);
        addDrop(AncientsBlocks.ANCIENT_COBBLE_SLAB);
        addDrop(AncientsBlocks.ANCIENT_COBBLE_STAIRS);
        addDrop(AncientsBlocks.ANCIENT_COBBLE_WALL);
        addDrop(AncientsBlocks.ANCIENT_STONE_SLAB);
        addDrop(AncientsBlocks.ANCIENT_STONE_STAIRS);
        addDrop(AncientsBlocks.ANCIENT_STONE_WALL);
        addDrop(AncientsBlocks.LUMINESCENT_FOSSILITE);
        addDrop(AncientsBlocks.PRIMORDIAL_LEAVES, leavesDrops(AncientsBlocks.PRIMORDIAL_LEAVES, AncientsBlocks.PRIMORDIAL_SAPLING, 0.002f));
        addDrop(AncientsBlocks.PRIMORDIAL_LOG);
        addDrop(AncientsBlocks.PRIMORDIAL_PLANKS);
        addDrop(AncientsBlocks.ANCIENT_STONE_BRICKS);
        addDrop(AncientsBlocks.ANCIENT_STONE_BRICK_WALL);
        addDrop(AncientsBlocks.ANCIENT_STONE_BRICK_STAIRS);
        addDrop(AncientsBlocks.ANCIENT_STONE_BRICK_SLAB);
        addDrop(AncientsBlocks.CRACKED_ANCIENT_STONE_BRICKS);
        addDrop(AncientsBlocks.CRACKED_ANCIENT_STONE_BRICK_WALL);
        addDrop(AncientsBlocks.CRACKED_ANCIENT_STONE_BRICK_STAIRS);
        addDrop(AncientsBlocks.CRACKED_ANCIENT_STONE_BRICK_SLAB);
        addDrop(AncientsBlocks.PRIMORDIAL_STAIRS);
        addDrop(AncientsBlocks.PRIMORDIAL_SLAB);
        addDrop(AncientsBlocks.PRIMORDIAL_FENCE);
        addDrop(AncientsBlocks.PRIMORDIAL_FENCE_GATE);


        addDrop(AncientsBlocks.ETHEREAL_ARCANE_ORE, AncientsItems.RAW_ETHEREAL_ARCANE_ORE);
        addDrop(AncientsBlocks.VOIDSTONE_ORE, AncientsItems.RAW_VOIDSTONE_ORE);
    }
}
