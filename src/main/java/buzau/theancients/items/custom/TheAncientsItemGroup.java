package buzau.theancients.items.custom;

import buzau.theancients.TheAncients;
import buzau.theancients.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class TheAncientsItemGroup {
    public static final net.minecraft.item.ItemGroup THE_ANCIENTS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TheAncients.MOD_ID, "theancients"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.theancients"))
                    .icon(() -> new ItemStack(ModBlocks.ANCIENT_DIRT)).entries((displayContext, entries) -> {

                        entries.add(ModItems.RAW_ETHEREAL_ARCANE_ORE);
                        entries.add(ModItems.ETHEREAL_ARCANE_INGOT);

                        entries.add(ModBlocks.ANCIENT_DIRT);
                        entries.add(ModBlocks.ANCIENT_GRASS_BLOCK);
                        entries.add(ModBlocks.ETHEREAL_ARCANE_ORE);

                        entries.add(ModItems.ETHEREAL_ARCANE_HELMET);
                        entries.add(ModItems.ETHEREAL_ARCANE_CHESTPLATE);
                        entries.add(ModItems.ETHEREAL_ARCANE_LEGGINGS);
                        entries.add(ModItems.ETHEREAL_ARCANE_BOOTS);
                    }).build());
    public static void registerItemGroup(){
        TheAncients.LOGGER.info("Registering Item Groups for " + TheAncients.MOD_ID);
    }
}
