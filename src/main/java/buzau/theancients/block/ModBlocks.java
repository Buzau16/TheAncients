package buzau.theancients.block;

import buzau.theancients.TheAncients;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks{

    public static Block ANCIENT_DIRT = registerBlock("ancient_dirt",
            new Block(FabricBlockSettings.copyOf(Blocks.DIRT)));
    public static Block ANCIENT_GRASS_BLOCK = registerBlock("ancient_grass_block",
            new Block(FabricBlockSettings.copyOf(Blocks.GRASS_BLOCK)));

    public static Block ETHEREAL_ARCANE_ORE = registerBlock("ethereal_arcane_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));

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
