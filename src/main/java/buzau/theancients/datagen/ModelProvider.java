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
        // Used for the blocks that have stair,slab,wall,fence etc. variants
        BlockStateModelGenerator.BlockTexturePool cobble_pool = blockStateModelGenerator.registerCubeAllModelTexturePool(AncientsBlocks.ANCIENT_COBBLE);
        BlockStateModelGenerator.BlockTexturePool stone_pool = blockStateModelGenerator.registerCubeAllModelTexturePool(AncientsBlocks.ANCIENT_STONE);
        BlockStateModelGenerator.BlockTexturePool primordialPlanks_pool = blockStateModelGenerator.registerCubeAllModelTexturePool(AncientsBlocks.PRIMORDIAL_PLANKS);
        BlockStateModelGenerator.BlockTexturePool stoneBricks_pool = blockStateModelGenerator.registerCubeAllModelTexturePool(AncientsBlocks.ANCIENT_STONE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool crackedStoneBricks_pool = blockStateModelGenerator.registerCubeAllModelTexturePool(AncientsBlocks.CRACKED_ANCIENT_STONE_BRICKS);


        // Registering the actual models
        blockStateModelGenerator.registerSimpleCubeAll(AncientsBlocks.ANCIENT_DIRT);
        blockStateModelGenerator.registerSimpleCubeAll(AncientsBlocks.ETHEREAL_ARCANE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(AncientsBlocks.VOIDSTONE_ORE);

        primordialPlanks_pool.slab(AncientsBlocks.PRIMORDIAL_SLAB);
        primordialPlanks_pool.stairs(AncientsBlocks.PRIMORDIAL_STAIRS);
        primordialPlanks_pool.fence(AncientsBlocks.PRIMORDIAL_FENCE);
        primordialPlanks_pool.fenceGate(AncientsBlocks.PRIMORDIAL_FENCE_GATE);

        cobble_pool.stairs(AncientsBlocks.ANCIENT_COBBLE_STAIRS);
        cobble_pool.slab(AncientsBlocks.ANCIENT_COBBLE_SLAB);
        cobble_pool.wall(AncientsBlocks.ANCIENT_COBBLE_WALL);

        stone_pool.stairs(AncientsBlocks.ANCIENT_STONE_STAIRS);
        stone_pool.slab(AncientsBlocks.ANCIENT_STONE_SLAB);
        stone_pool.wall(AncientsBlocks.ANCIENT_STONE_WALL);

        stoneBricks_pool.stairs(AncientsBlocks.ANCIENT_STONE_BRICK_STAIRS);
        stoneBricks_pool.slab(AncientsBlocks.ANCIENT_STONE_BRICK_SLAB);
        stoneBricks_pool.wall(AncientsBlocks.ANCIENT_STONE_BRICK_WALL);

        crackedStoneBricks_pool.stairs(AncientsBlocks.CRACKED_ANCIENT_STONE_BRICK_STAIRS);
        crackedStoneBricks_pool.slab(AncientsBlocks.CRACKED_ANCIENT_STONE_BRICK_SLAB);
        crackedStoneBricks_pool.wall(AncientsBlocks.CRACKED_ANCIENT_STONE_BRICK_WALL);

        //the model for the ancient grass block is generated externally because IDK how to generate it here
        blockStateModelGenerator.registerSimpleCubeAll(AncientsBlocks.LUMINESCENT_FOSSILITE);
        blockStateModelGenerator.registerLog(AncientsBlocks.PRIMORDIAL_LOG).log(AncientsBlocks.PRIMORDIAL_LOG);
        blockStateModelGenerator.registerSimpleCubeAll(AncientsBlocks.PRIMORDIAL_LEAVES);
        blockStateModelGenerator.registerTintableCross(AncientsBlocks.PRIMORDIAL_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);

    }

    // Registering the models for the armours/ items
    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(AncientsItems.RAW_ETHEREAL_ARCANE_ORE, Models.GENERATED);
        itemModelGenerator.register(AncientsItems.ETHEREAL_ARCANE_INGOT, Models.GENERATED);
        itemModelGenerator.register(AncientsItems.RAW_VOIDSTONE_ORE, Models.GENERATED);

        itemModelGenerator.registerArmor(((ArmorItem) AncientsItems.ETHEREAL_ARCANE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) AncientsItems.ETHEREAL_ARCANE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) AncientsItems.ETHEREAL_ARCANE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) AncientsItems.ETHEREAL_ARCANE_BOOTS));
    }
}
