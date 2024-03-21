package buzau.theancients.world.biome.surface;

import buzau.theancients.TheAncients;
import buzau.theancients.block.ModBlocks;
import buzau.theancients.world.biome.ModBiomes;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;
import net.minecraft.world.gen.surfacebuilder.MaterialRules;

public class ModMaterialRules {
    private static final MaterialRules.MaterialRule ANCIENT_GRASS_BLOCK = makeStateRule(ModBlocks.ANCIENT_GRASS_BLOCK);
    private static final MaterialRules.MaterialRule ANCIENT_DIRT = makeStateRule(ModBlocks.ANCIENT_DIRT);
//    private static final MaterialRules.MaterialRule RUBY = makeStateRule(ModBlocks.RUBY_BLOCK);
//    private static final MaterialRules.MaterialRule RAW_RUBY = makeStateRule(ModBlocks.RAW_RUBY_BLOCK);

    public static MaterialRules.MaterialRule makeRules() {
//        MaterialRules.MaterialCondition isAtOrAboveWaterLevel = MaterialRules.water(-1, 0);
//
//        MaterialRules.MaterialRule grassSurface = MaterialRules.sequence(MaterialRules.condition(isAtOrAboveWaterLevel, GRASS_BLOCK), DIRT);
//
//        return MaterialRules.sequence(
//                MaterialRules.sequence(MaterialRules.condition(MaterialRules.biome(ModBiomes.TEST_BIOME),
//                                MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR, RAW_RUBY)),
//                        MaterialRules.condition(MaterialRules.STONE_DEPTH_CEILING, RUBY)),
//
//                // Default to a grass and dirt surface
//                MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR, grassSurface)
        MaterialRules.MaterialCondition isAtOrAboveWaterLevel = MaterialRules.water(-1, 0);

        MaterialRules.MaterialRule customGrassSurface = MaterialRules.sequence(MaterialRules.condition(isAtOrAboveWaterLevel, ANCIENT_GRASS_BLOCK), ANCIENT_DIRT);

        return MaterialRules.sequence(
                MaterialRules.sequence(MaterialRules.condition(MaterialRules.biome(ModBiomes.ENIGMATICWILDS),
                                MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR, ANCIENT_GRASS_BLOCK)),
                        MaterialRules.condition(isAtOrAboveWaterLevel, ANCIENT_GRASS_BLOCK), ANCIENT_DIRT),
                        MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR_WITH_SURFACE_DEPTH_RANGE_6, ANCIENT_DIRT),

                MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR, customGrassSurface)
        );
    }

    private static MaterialRules.MaterialRule makeStateRule(Block block) {
        return MaterialRules.block(block.getDefaultState());
    }
}
