package buzau.theancients.datagen;

import buzau.theancients.block.ModBlocks;
import buzau.theancients.items.custom.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class LootTableProvider extends FabricBlockLootTableProvider {
    public LootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.ANCIENT_DIRT);
        addDrop(ModBlocks.ANCIENT_GRASS_BLOCK);
        addDrop(ModBlocks.ETHEREAL_ARCANE_ORE, ModItems.RAW_ETHEREAL_ARCANE_ORE);
    }
}
