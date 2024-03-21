package buzau.theancients.datagen;

import buzau.theancients.block.ModBlocks;
import buzau.theancients.items.custom.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;

public class ModelProvider extends FabricModelProvider {
    public ModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ANCIENT_DIRT);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ETHEREAL_ARCANE_ORE);
        //the model for the ancient grass block is generated externally because IDK how to generate it here
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.RAW_ETHEREAL_ARCANE_ORE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ETHEREAL_ARCANE_INGOT, Models.GENERATED);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ETHEREAL_ARCANE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ETHEREAL_ARCANE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ETHEREAL_ARCANE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ETHEREAL_ARCANE_BOOTS));
    }
}
