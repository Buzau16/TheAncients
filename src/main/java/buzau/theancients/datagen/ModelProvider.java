package buzau.theancients.datagen;

import buzau.theancients.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;

public class ModelProvider extends FabricModelProvider {
    public ModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ANCIENT_DIRT);
        //the model for the ancient grass block is generated externally because IDK how to generate it here
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
