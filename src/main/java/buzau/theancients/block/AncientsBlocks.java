package buzau.theancients.block;

import buzau.theancients.TheAncients;
import buzau.theancients.world.tree.AncientsSaplings;
import net.fabricmc.fabric.api.block.v1.FabricBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

// Just making the blocks
public class AncientsBlocks {
    // FIXME RECIPES COULD HAVE MULTIPLE VARIANT:
    //  Smelting
    //  Crafting
    //  Stonecutting

    //FIXME TODOS WITH THE "*" SYMBOL COULD HAVE ALL THE RECIPE VARIANTS!!!

    public static Block ANCIENT_DIRT = registerBlock("ancient_dirt",
            new Block(FabricBlockSettings.copyOf(Blocks.DIRT).luminance(state -> 2)));
    public static Block ANCIENT_GRASS_BLOCK = registerBlock("ancient_grass_block",
            new Block(FabricBlockSettings.copyOf(Blocks.GRASS_BLOCK).luminance(state -> 2)));

    //TODO: ADD RECIPES FOR THESE (maybe done)
    public static Block ANCIENT_STONE = registerBlock("ancient_stone",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).strength(2.5f, 6.5f)));
    public static Block ANCIENT_STONE_SLAB = registerBlock("ancient_stone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ANCIENT_STONE)));
    public static Block ANCIENT_STONE_WALL = registerBlock("ancient_stone_wall",
            new WallBlock(FabricBlockSettings.copyOf(ANCIENT_STONE)));
    public static Block ANCIENT_STONE_STAIRS = registerBlock("ancient_stone_stairs",
            new StairsBlock(ANCIENT_STONE.getDefaultState(), FabricBlockSettings.copyOf(ANCIENT_STONE)));


    //TODO: ADD RECIPES FOR THESE (maybe)
    public static Block ANCIENT_STONE_BRICKS = registerBlock("ancient_stone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).strength(2.f,6.f)));
    public static Block ANCIENT_STONE_BRICK_SLAB = registerBlock("ancient_stone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ANCIENT_STONE_BRICKS)));
    public static Block ANCIENT_STONE_BRICK_WALL = registerBlock("ancient_stone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(ANCIENT_STONE_BRICKS)));
    public static Block ANCIENT_STONE_BRICK_STAIRS = registerBlock("ancient_stone_brick_stairs",
            new StairsBlock(ANCIENT_STONE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(ANCIENT_STONE_BRICKS)));

    // TODO: Add recipes for these (maybe done)
    public static Block CRACKED_ANCIENT_STONE_BRICKS = registerBlock("cracked_ancient_stone_bricks",
            new Block(FabricBlockSettings.copyOf(ANCIENT_STONE_BRICKS)));
    public static Block CRACKED_ANCIENT_STONE_BRICK_SLAB = registerBlock("cracked_ancient_stone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ANCIENT_STONE_BRICKS)));
    public static Block CRACKED_ANCIENT_STONE_BRICK_WALL = registerBlock("cracked_ancient_stone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(ANCIENT_STONE_BRICKS)));
    public static Block CRACKED_ANCIENT_STONE_BRICK_STAIRS = registerBlock("cracked_ancient_stone_brick_stairs",
            new StairsBlock(CRACKED_ANCIENT_STONE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(ANCIENT_STONE_BRICKS)));


    // TODO: Add recipie for these (maybe done)
    public static Block ANCIENT_COBBLE = registerBlock("ancient_cobble",
            new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).strength(3.f, 5.5f)));
    public static Block ANCIENT_COBBLE_SLAB = registerBlock("ancient_cobble_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_SLAB).strength(2.5f, 6.5f)));
    public static Block ANCIENT_COBBLE_WALL = registerBlock("ancient_cobble_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL).strength(1.5f, 5.5f)));
    public static Block ANCIENT_COBBLE_STAIRS = registerBlock("ancient_cobble_stairs",
            new StairsBlock(ANCIENT_COBBLE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE_STAIRS).strength(2.5f, 6.5f)));



    public static Block ETHEREAL_ARCANE_ORE = registerBlock("ethereal_arcane_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE).strength(3.5f, 6.0f)));
    public static Block VOIDSTONE_ORE = registerBlock("voidstone_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(3.5f, 6.f)));


    public static Block LUMINESCENT_FOSSILITE = registerBlock("luminescent_fossilite",
            new Block(FabricBlockSettings.copyOf(Blocks.SHROOMLIGHT).mapColor(MapColor.BLUE).luminance(state -> 14)));
    public static Block PRIMORDIAL_LOG = registerBlock("primordial_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.DARK_OAK_LOG).strength(4.f)));
    public static Block PRIMORDIAL_PLANKS = registerBlock("primordial_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.DARK_OAK_PLANKS).strength(4.f)));
    public static Block PRIMORDIAL_FENCE = registerBlock("primordial_fence",
            new FenceBlock(PRIMORDIAL_PLANKS.getSettings()));
    public static Block PRIMORDIAL_FENCE_GATE = registerBlock("primordial_fence_gate",
            new FenceGateBlock(WoodType.DARK_OAK, PRIMORDIAL_PLANKS.getSettings()));
    public static Block PRIMORDIAL_STAIRS = registerBlock("primordial_stairs",
            new StairsBlock(PRIMORDIAL_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.DARK_OAK_STAIRS).strength(4.f)));
    public static Block PRIMORDIAL_SLAB = registerBlock("primordial_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.DARK_OAK_SLAB).strength(4.f)));
    public static final Block VASE = registerBlock("vase",
            new VaseBlock(FabricBlockSettings.copyOf(Blocks.STONE).nonOpaque()));

    // TODO: add signs
    public static Block PRIMORDIAL_SAPLING = registerBlock("primordial_sapling",
            new AncientsSaplings(AncientsSaplings.PRIMORDIAL, FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));

    public static Block PRIMORDIAL_LEAVES = registerBlock("primordial_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.DARK_OAK_LEAVES).luminance(state -> 4).nonOpaque()));

    // --------------------------- QOL FUNCTIONS -------------------------------------
    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(TheAncients.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(TheAncients.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    // Called in the main class to register the blocks
    public static void registerBlocks(){
        TheAncients.LOGGER.info("Registering Blocks for " + TheAncients.MOD_ID);
    }
}
