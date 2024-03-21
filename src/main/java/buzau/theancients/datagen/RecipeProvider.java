package buzau.theancients.datagen;

import buzau.theancients.block.ModBlocks;
import buzau.theancients.items.custom.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.List;

public class RecipeProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> _ETHEREAL_ARCANE_BLOCK = List.of(ModBlocks.ETHEREAL_ARCANE_ORE);
    private static final List<ItemConvertible> _ETHEREAL_ARCANE_ORE = List.of(ModItems.RAW_ETHEREAL_ARCANE_ORE);
    public RecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offerSmelting(exporter, _ETHEREAL_ARCANE_BLOCK, RecipeCategory.MISC, ModItems.RAW_ETHEREAL_ARCANE_ORE, 1.0f, 200, "theancients");
        offerBlasting(exporter, _ETHEREAL_ARCANE_BLOCK, RecipeCategory.MISC, ModItems.RAW_ETHEREAL_ARCANE_ORE, 1.2f, 100, "theancients");

        offerSmelting(exporter, _ETHEREAL_ARCANE_ORE, RecipeCategory.MISC, ModItems.ETHEREAL_ARCANE_INGOT, 0.9f, 200, "theancients");
        offerBlasting(exporter, _ETHEREAL_ARCANE_ORE, RecipeCategory.MISC, ModItems.ETHEREAL_ARCANE_INGOT, 1.0f, 100, "theancients");

    }
}
