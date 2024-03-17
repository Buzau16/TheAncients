package buzau.theancients.items;

import buzau.theancients.TheAncients;

public class TheAncientsItemGroup {
//    public static final net.minecraft.item.ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
//            new Identifier(TheAncients.MOD_ID, ""),
//            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby"))
//                    .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {
//                        entries.add(ModItems.RUBY);
//                        entries.add(ModItems.RAW_RUBY);
//                        entries.add(ModBlocks.RUBY_BLOCK);
//                        entries.add(ModBlocks.RAW_RUBY_BLOCK);
//                        entries.add(ModBlocks.RUBY_ORE);
//                        entries.add(ModBlocks.DEEPSLATE_RUBY_ORE);
//                        entries.add(ModBlocks.NETHER_RUBY_ORE);
//                        entries.add(ModBlocks.END_RUBY_ORE);
//                    }).build());
    public static void registerItemGroup(){
        TheAncients.LOGGER.info("Registering Item Groups for " + TheAncients.MOD_ID);
    }
}
