package buzau.theancients.world.tree;

import buzau.theancients.util.AncientsBlockTags;
import buzau.theancients.world.AncientsConfiguredFeature;
import net.minecraft.block.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldView;

import java.util.Optional;

public class AncientsSaplings extends SaplingBlock {
    // Creating the sapling/saplings
    public final static SaplingGenerator PRIMORDIAL = new SaplingGenerator("tree_primordial", 0.f,
            Optional.empty(), Optional.empty(), Optional.of(AncientsConfiguredFeature.PRIMORDIAL_KEY),
            Optional.empty(), Optional.empty(),
            Optional.empty());
    public AncientsSaplings(SaplingGenerator generator, Settings settings) {
        super(generator, settings);
    }
    // (Copied off of the PlantBlock Class) Checks if the block clicked is in the "PLANTABLE" tag
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isIn(AncientsBlockTags.PLANTABLE);
    }

    // Making the sapling/saplings placeable on different blocks using the canPlantOnTop method
    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        return this.canPlantOnTop(world.getBlockState(pos.down()), world, pos.down());
    }
}