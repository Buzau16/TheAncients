package buzau.theancients.block;

import buzau.theancients.TheAncients;
import buzau.theancients.world.tree.AncientsSaplings;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class AncientsBlocks {

    public static Block ANCIENT_DIRT = registerBlock("ancient_dirt",
            new Block(FabricBlockSettings.copyOf(Blocks.DIRT).luminance(state -> 2)));
    public static Block ANCIENT_GRASS_BLOCK = registerBlock("ancient_grass_block",
            new Block(FabricBlockSettings.copyOf(Blocks.GRASS_BLOCK).luminance(state -> 2)));

    public static Block ETHEREAL_ARCANE_ORE = registerBlock("ethereal_arcane_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));


    public static Block LUMINESCENT_FOSSILITE = registerBlock("luminescent_fossilite",
            new Block(FabricBlockSettings.copyOf(Blocks.SHROOMLIGHT).mapColor(MapColor.BLUE)));
    public static Block MYSTWOOD_LOG = registerBlock("mystwood_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.DARK_OAK_LOG).strength(4.f)));

    public static Block MYSTWOOD_SAPLING = registerBlock("mystwood_sapling",
            new AncientsSaplings(AncientsSaplings.MYSTWOOD, FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));


    public static Block MYSTWOOD_LEAVES = registerBlock("mystwood_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.MANGROVE_LEAVES).luminance(state -> 8).nonOpaque()));

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(TheAncients.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(TheAncients.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerBlocks(){
        TheAncients.LOGGER.info("Registering Blocks for " + TheAncients.MOD_ID);
    }
}
