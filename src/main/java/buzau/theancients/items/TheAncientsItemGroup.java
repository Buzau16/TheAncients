package buzau.theancients.items;

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
    public static final net.minecraft.item.ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TheAncients.MOD_ID, "theancients"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.theancients"))
                    .icon(() -> new ItemStack(ModBlocks.ANCIENT_DIRT)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.ANCIENT_DIRT);
                        entries.add(ModBlocks.ANCIENT_GRASS_BLOCK);
                    }).build());
    public static void registerItemGroup(){
        TheAncients.LOGGER.info("Registering Item Groups for " + TheAncients.MOD_ID);
    }
}
