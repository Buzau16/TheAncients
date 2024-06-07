package buzau.theancients.util;

import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BiomeTags;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class AncientsBlockTags {
    public static final TagKey<Block> PLANTABLE = of("ancient_dirt");

    public static final  TagKey<Block> PRIMORDIAL_LOG = of("primordial_log");
    public static final TagKey<Block> ANCIENT_STONE_REPLACEABLE = of("ancient_stone_replaceable");

    private static TagKey<Block> of(String id) {
        return TagKey.of(RegistryKeys.BLOCK, new Identifier(id));
    }
}
