package buzau.theancients.world.dimension;

import buzau.theancients.TheAncients;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionOptions;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.dimension.DimensionTypes;

import java.util.OptionalLong;

public class TheElderRealm {
    public static final RegistryKey<DimensionOptions> THEELDERREALM_KEY = RegistryKey.of(RegistryKeys.DIMENSION,
            new Identifier(TheAncients.MOD_ID, "theelderrealm"));
    public static final RegistryKey<World> THEELDERREALM_LEVEL_KEY = RegistryKey.of(RegistryKeys.WORLD,
            new Identifier(TheAncients.MOD_ID, "theelderrealm"));
    public static final RegistryKey<DimensionType> THEELDERREALM_DIM_TYPE = RegistryKey.of(RegistryKeys.DIMENSION_TYPE,
            new Identifier(TheAncients.MOD_ID, "theelderrealm_type"));

    public static void bootstrapType(Registerable<DimensionType> context){
        context.register(THEELDERREALM_DIM_TYPE, new DimensionType(
                OptionalLong.of(12000),
                true,
                false,
                false,
                true,
                1.0,
                true,
                true,
                0,
                256,
                256,
                BlockTags.INFINIBURN_OVERWORLD,
                DimensionTypes.OVERWORLD_ID,
                1.0f,
                new DimensionType.MonsterSettings(false,false, UniformIntProvider.create(0, 0), 0)));
    }
}
