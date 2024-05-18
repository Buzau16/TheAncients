package buzau.theancients.world;

import buzau.theancients.TheAncients;
import buzau.theancients.block.AncientsBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.CherryFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.BendingTrunkPlacer;

public class AncientsConfiguredFeature {

    public static final RegistryKey<ConfiguredFeature<?, ?>> MYSTWOOD_KEY = registerKey("mystwood");


    public static void boostrap(Registerable<ConfiguredFeature<?, ?>> context){


        register(context, MYSTWOOD_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(AncientsBlocks.PRIMORDIAL_LOG),
                new BendingTrunkPlacer(3,2,1,2, ConstantIntProvider.create(2)),

                BlockStateProvider.of(AncientsBlocks.PRIMORDIAL_LEAVES),
//new BlobFoliagePlacer(UniformIntProvider.create(1,2), UniformIntProvider.create(2,3), 2),
                new CherryFoliagePlacer(ConstantIntProvider.create(2), UniformIntProvider.create(1,2), ConstantIntProvider.create(4),
                        0.2f, 0.2f, 0.99f, 0.99f),


                new TwoLayersFeatureSize(1, 0, 2)
        ).dirtProvider(BlockStateProvider.of(AncientsBlocks.ANCIENT_GRASS_BLOCK))
                .build());

//        register(context, MYSTWOOD_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
//                BlockStateProvider.of(AncientsBlocks.MYSTWOOD_LOG),
//                new StraightTrunkPlacer(5, 4, 3),
//
//                BlockStateProvider.of(AncientsBlocks.MYSTWOOD_LEAVES),
//                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
//
//                new TwoLayersFeatureSize(1, 0, 2)).build());
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(TheAncients.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }

}
