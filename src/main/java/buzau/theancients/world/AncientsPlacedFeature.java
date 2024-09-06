package buzau.theancients.world;

import buzau.theancients.TheAncients;
import buzau.theancients.registry.AncientsBlocks;
import buzau.theancients.util.OrePlacement;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;

import java.util.List;

public class AncientsPlacedFeature {

    // Register key for the sapling?
    public static final RegistryKey<PlacedFeature> PRIMORDIAL_PLACED = registerKey("tree_primordial");
    public static final RegistryKey<PlacedFeature> ETH_ARCANE_PLACED = registerKey("ore_ethereal_arcane");
    public static final RegistryKey<PlacedFeature> VOIDSTONE_PLACED = registerKey("ore_voidstone");
    public static void boostrap(Registerable<PlacedFeature> context){
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, ETH_ARCANE_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(AncientsConfiguredFeature.ETHEREAL_ARCANE_KEY),
                OrePlacement.modifiersWithCount(5, HeightRangePlacementModifier.trapezoid(YOffset.fixed(-10), YOffset.fixed(80))));

        register(context, VOIDSTONE_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(AncientsConfiguredFeature.VOIDSTONE_KEY),
                OrePlacement.modifiersWithCount(5, HeightRangePlacementModifier.trapezoid(YOffset.fixed(-80), YOffset.fixed(20))));

        register(context, PRIMORDIAL_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(AncientsConfiguredFeature.PRIMORDIAL_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(2, 0.1f, 2),
                        AncientsBlocks.PRIMORDIAL_SAPLING));
    }

    // --------------------------- QOL FUNCTIONS -------------------------------------
    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(TheAncients.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }


}




