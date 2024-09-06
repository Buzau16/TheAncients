package buzau.theancients.datagen;

import buzau.theancients.registry.AncientsBlocks;
import buzau.theancients.registry.AncientsItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.List;

public class RecipeProvider extends FabricRecipeProvider {
    // IDK WHAT THIS DOES TBH ( I FORGOR )
    private static final List<ItemConvertible> _ETHEREAL_ARCANE_BLOCK = List.of(AncientsBlocks.ETHEREAL_ARCANE_ORE);
    private static final List<ItemConvertible> _ETHEREAL_ARCANE_ORE = List.of(AncientsItems.RAW_ETHEREAL_ARCANE_ORE);

//    private static final List<ItemConvertible> _VOIDSTONE_BLOCK = List.of(AncientsBlocks.VOIDSTONE_ORE);
    private static final List<ItemConvertible> _VOIDSTONE_ORE = List.of(AncientsBlocks.VOIDSTONE_ORE);
    public RecipeProvider(FabricDataOutput output) {
        super(output);
    }

    // Generating the recipes
    @Override
    public void generate(RecipeExporter exporter) {
        offerSmelting(exporter, _ETHEREAL_ARCANE_BLOCK, RecipeCategory.MISC, AncientsItems.RAW_ETHEREAL_ARCANE_ORE, 1f, 200, "theancients");
        offerBlasting(exporter, _ETHEREAL_ARCANE_BLOCK, RecipeCategory.MISC, AncientsItems.RAW_ETHEREAL_ARCANE_ORE, 0.5f, 100, "theancients");

        offerSmelting(exporter, _ETHEREAL_ARCANE_ORE, RecipeCategory.MISC, AncientsItems.ETHEREAL_ARCANE_INGOT, 1.f, 200, "theancients");
        offerBlasting(exporter, _ETHEREAL_ARCANE_ORE, RecipeCategory.MISC, AncientsItems.ETHEREAL_ARCANE_INGOT, 0.5f, 100, "theancients");

//        offerSmelting(exporter, _VOIDSTONE_BLOCK, RecipeCategory.MISC, AncientsItems.VOIDSTONE_INGOT, 1.5f, 200, "theancients");
//        offerBlasting(exporter, _VOIDSTONE_BLOCK, RecipeCategory.MISC, AncientsItems.VOIDSTONE_INGOT, 1.f, 100, "theancients");

        offerSmelting(exporter, _VOIDSTONE_ORE, RecipeCategory.MISC, AncientsItems.VOIDSTONE_INGOT, 1.5f, 200, "theancients");
        offerBlasting(exporter, _VOIDSTONE_ORE, RecipeCategory.MISC, AncientsItems.VOIDSTONE_INGOT, 1.f, 100, "theancients");

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, AncientsBlocks.ANCIENT_STONE_SLAB, AncientsBlocks.ANCIENT_STONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, AncientsBlocks.ANCIENT_STONE_STAIRS, AncientsBlocks.ANCIENT_STONE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, AncientsBlocks.ANCIENT_STONE_WALL, AncientsBlocks.ANCIENT_STONE, 1);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, AncientsBlocks.ANCIENT_STONE_BRICKS, AncientsBlocks.ANCIENT_STONE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, AncientsBlocks.ANCIENT_STONE_BRICK_SLAB, AncientsBlocks.ANCIENT_STONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, AncientsBlocks.ANCIENT_STONE_BRICK_SLAB, AncientsBlocks.ANCIENT_STONE_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, AncientsBlocks.ANCIENT_STONE_BRICK_WALL, AncientsBlocks.ANCIENT_STONE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, AncientsBlocks.ANCIENT_STONE_BRICK_WALL, AncientsBlocks.ANCIENT_STONE_BRICKS, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, AncientsBlocks.ANCIENT_STONE_BRICK_STAIRS, AncientsBlocks.ANCIENT_STONE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, AncientsBlocks.ANCIENT_STONE_BRICK_STAIRS, AncientsBlocks.ANCIENT_STONE_BRICKS, 1);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, AncientsBlocks.CRACKED_ANCIENT_STONE_BRICK_SLAB, AncientsBlocks.CRACKED_ANCIENT_STONE_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, AncientsBlocks.CRACKED_ANCIENT_STONE_BRICK_STAIRS, AncientsBlocks.CRACKED_ANCIENT_STONE_BRICKS, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, AncientsBlocks.CRACKED_ANCIENT_STONE_BRICK_WALL, AncientsBlocks.CRACKED_ANCIENT_STONE_BRICKS, 1);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, AncientsBlocks.ANCIENT_COBBLE, AncientsBlocks.ANCIENT_STONE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, AncientsBlocks.ANCIENT_COBBLE_SLAB, AncientsBlocks.ANCIENT_STONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, AncientsBlocks.ANCIENT_COBBLE_SLAB, AncientsBlocks.ANCIENT_COBBLE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, AncientsBlocks.ANCIENT_COBBLE_STAIRS, AncientsBlocks.ANCIENT_COBBLE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, AncientsBlocks.ANCIENT_COBBLE_STAIRS, AncientsBlocks.ANCIENT_STONE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, AncientsBlocks.ANCIENT_COBBLE_WALL, AncientsBlocks.ANCIENT_STONE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, AncientsBlocks.ANCIENT_COBBLE_WALL, AncientsBlocks.ANCIENT_COBBLE, 1);
    }
}
