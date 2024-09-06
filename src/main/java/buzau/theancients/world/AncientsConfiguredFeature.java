package buzau.theancients.world;

import buzau.theancients.TheAncients;
import buzau.theancients.registry.AncientsBlocks;
import buzau.theancients.registry.AncientsBlockTags;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.CherryFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.BendingTrunkPlacer;

import java.util.List;

public class AncientsConfiguredFeature {

    // Register key for the tree
    public static final RegistryKey<ConfiguredFeature<?, ?>> PRIMORDIAL_KEY = registerKey("tree_primordial");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ETHEREAL_ARCANE_KEY = registerKey("ore_ethereal_arcane");

    public static final RegistryKey<ConfiguredFeature<?, ?>> VOIDSTONE_KEY = registerKey("ore_voidstone");


    public static void boostrap(Registerable<ConfiguredFeature<?, ?>> context){
        RuleTest ancientStoneReplacables = new TagMatchRuleTest(AncientsBlockTags.ANCIENT_STONE_REPLACEABLE);

        List<OreFeatureConfig.Target> elderRealmEthArcane = List.of(
                OreFeatureConfig.createTarget(ancientStoneReplacables, AncientsBlocks.ETHEREAL_ARCANE_ORE.getDefaultState())
        );
        List<OreFeatureConfig.Target> elderRealmVoidStone = List.of(
                OreFeatureConfig.createTarget(ancientStoneReplacables, AncientsBlocks.VOIDSTONE_ORE.getDefaultState())
        );

        register(context, ETHEREAL_ARCANE_KEY, Feature.ORE, new OreFeatureConfig(elderRealmEthArcane, 6));
        register(context, VOIDSTONE_KEY, Feature.ORE, new OreFeatureConfig(elderRealmVoidStone, 4));

        register(context, PRIMORDIAL_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(AncientsBlocks.PRIMORDIAL_LOG),
                new BendingTrunkPlacer(3,2,1,2, ConstantIntProvider.create(2)),
                BlockStateProvider.of(AncientsBlocks.PRIMORDIAL_LEAVES),
                new CherryFoliagePlacer(ConstantIntProvider.create(2), UniformIntProvider.create(1,2), ConstantIntProvider.create(4),
                        0.2f, 0.2f, 0.99f, 0.99f),
                new TwoLayersFeatureSize(1, 0, 2)
        ).dirtProvider(BlockStateProvider.of(AncientsBlocks.ANCIENT_GRASS_BLOCK))
                .build());
    }


    // --------------------------- QOL FUNCTIONS -------------------------------------
    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(TheAncients.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }

}
