package buzau.theancients.world.tree;

import buzau.theancients.world.AncientsConfiguredFeature;
import net.minecraft.block.*;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldView;

import java.util.Optional;

public class AncientsSaplings extends SaplingBlock {

    // A tag for allowing the sapling/saplings to be placed on the custom dirt/grass
    public static final TagKey<Block> PLANTABLE = of("ancient_dirt");

    // Creating the sapling/saplings
    public final static SaplingGenerator MYSTWOOD = new SaplingGenerator("mystwood", 0.f,
            Optional.empty(), Optional.empty(), Optional.of(AncientsConfiguredFeature.MYSTWOOD_KEY),
            Optional.empty(), Optional.empty(),
            Optional.empty());
    public AncientsSaplings(SaplingGenerator generator, Settings settings) {
        super(generator, settings);
    }
    // (Copied off of the PlantBlock Class) Checks if the block clicked is in the "PLANTABLE" tag
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isIn(PLANTABLE);
    }

    // Making the sapling/saplings placeable on different blocks using the canPlantOnTop method
    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        return this.canPlantOnTop(world.getBlockState(pos.down()), world, pos.down());
    }

    // Used for making tags
    private static TagKey<Block> of(String id) {
        return TagKey.of(RegistryKeys.BLOCK, new Identifier(id));
    }

}