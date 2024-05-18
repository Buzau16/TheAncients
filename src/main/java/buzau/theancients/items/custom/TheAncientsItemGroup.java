package buzau.theancients.items.custom;

import buzau.theancients.TheAncients;
import buzau.theancients.block.AncientsBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class TheAncientsItemGroup {
    public static final net.minecraft.item.ItemGroup THE_ANCIENTS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TheAncients.MOD_ID, "theancients"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.theancients"))
                    .icon(() -> new ItemStack(AncientsBlocks.LUMINESCENT_FOSSILITE)).entries((displayContext, entries) -> {

                        entries.add(AncientsItems.RAW_ETHEREAL_ARCANE_ORE);
                        entries.add(AncientsItems.ETHEREAL_ARCANE_INGOT);

                        entries.add(AncientsBlocks.ANCIENT_DIRT);
                        entries.add(AncientsBlocks.ANCIENT_GRASS_BLOCK);
                        entries.add(AncientsBlocks.ANCIENT_STONE);
                        entries.add(AncientsBlocks.ANCIENT_STONE_WALL);
                        entries.add(AncientsBlocks.ANCIENT_STONE_SLAB);
                        entries.add(AncientsBlocks.ANCIENT_STONE_STAIR);
                        entries.add(AncientsBlocks.ANCIENT_COBBLE);
                        entries.add(AncientsBlocks.ANCIENT_COBBLE_WALL);
                        entries.add(AncientsBlocks.ANCIENT_COBBLE_SLAB);
                        entries.add(AncientsBlocks.ANCIENT_COBBLE_STAIR);
                        entries.add(AncientsBlocks.ETHEREAL_ARCANE_ORE);

                        entries.add(AncientsBlocks.LUMINESCENT_FOSSILITE);
                        entries.add(AncientsBlocks.PRIMORDIAL_LEAVES);
                        entries.add(AncientsBlocks.PRIMORDIAL_LOG);
                        entries.add(AncientsBlocks.PRIMORDIAL_PLANKS);
                        entries.add(AncientsBlocks.PRIMORDIAL_SLAB);
                        entries.add(AncientsBlocks.PRIMORDIAL_STAIRS);
                        entries.add(AncientsBlocks.PRIMORDIAL_SAPLING);

                        entries.add(AncientsItems.ETHEREAL_ARCANE_HELMET);
                        entries.add(AncientsItems.ETHEREAL_ARCANE_CHESTPLATE);
                        entries.add(AncientsItems.ETHEREAL_ARCANE_LEGGINGS);
                        entries.add(AncientsItems.ETHEREAL_ARCANE_BOOTS);
                    }).build());
    public static void registerItemGroup(){
        TheAncients.LOGGER.info("Registering Item Groups for " + TheAncients.MOD_ID);
    }
}
