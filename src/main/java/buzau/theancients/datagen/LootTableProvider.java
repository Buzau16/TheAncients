package buzau.theancients.datagen;

import buzau.theancients.block.AncientsBlocks;
import buzau.theancients.items.custom.AncientsItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class LootTableProvider extends FabricBlockLootTableProvider {
    public LootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(AncientsBlocks.ANCIENT_DIRT);
        addDrop(AncientsBlocks.ANCIENT_GRASS_BLOCK);

        addDrop(AncientsBlocks.LUMINESCENT_FOSSILITE);
        addDrop(AncientsBlocks.MYSTWOOD_LEAVES);
        addDrop(AncientsBlocks.MYSTWOOD_LOG);


        addDrop(AncientsBlocks.ETHEREAL_ARCANE_ORE, AncientsItems.RAW_ETHEREAL_ARCANE_ORE);
    }
}
