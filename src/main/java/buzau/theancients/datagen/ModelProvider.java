package buzau.theancients.datagen;

import buzau.theancients.block.AncientsBlocks;
import buzau.theancients.items.custom.AncientsItems;
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
        blockStateModelGenerator.registerSimpleCubeAll(AncientsBlocks.ANCIENT_DIRT);
        blockStateModelGenerator.registerSimpleCubeAll(AncientsBlocks.ETHEREAL_ARCANE_ORE);
        //the model for the ancient grass block is generated externally because IDK how to generate it here
        blockStateModelGenerator.registerSimpleCubeAll(AncientsBlocks.LUMINESCENT_FOSSILITE);
        blockStateModelGenerator.registerLog(AncientsBlocks.MYSTWOOD_LOG).log(AncientsBlocks.MYSTWOOD_LOG);
        blockStateModelGenerator.registerSimpleCubeAll(AncientsBlocks.MYSTWOOD_LEAVES);
        blockStateModelGenerator.registerTintableCross(AncientsBlocks.MYSTWOOD_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(buzau.theancients.items.custom.AncientsItems.RAW_ETHEREAL_ARCANE_ORE, Models.GENERATED);
        itemModelGenerator.register(buzau.theancients.items.custom.AncientsItems.ETHEREAL_ARCANE_INGOT, Models.GENERATED);

        itemModelGenerator.registerArmor(((ArmorItem) buzau.theancients.items.custom.AncientsItems.ETHEREAL_ARCANE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) AncientsItems.ETHEREAL_ARCANE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) buzau.theancients.items.custom.AncientsItems.ETHEREAL_ARCANE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) buzau.theancients.items.custom.AncientsItems.ETHEREAL_ARCANE_BOOTS));
    }
}
