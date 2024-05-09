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

    public static final TagKey<Block> PLANTABLE = of("adirt");

    public final static SaplingGenerator MYSTWOOD = new SaplingGenerator("mystwood", 0.f,
            Optional.empty(), Optional.empty(), Optional.of(AncientsConfiguredFeature.MYSTWOOD_KEY),
            Optional.empty(), Optional.empty(),
            Optional.empty());
    public AncientsSaplings(SaplingGenerator generator, Settings settings) {
        super(generator, settings);


    }

    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isIn(PLANTABLE);
    }
    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        return this.canPlantOnTop(world.getBlockState(pos.down()), world, pos.down());
//
//        // floor.isIn(BlockTags.DIRT) || floor.isOf(Blocks.FARMLAND);
////        BlockPos blockPos = pos.down();
//
//        if(state.isIn(PLANTABLE)){
//
////        return state.isOf(AncientsBlocks.ANCIENT_GRASS_BLOCK) || state.isOf(AncientsBlocks.ANCIENT_DIRT);
////            TheAncients.LOGGER.info("Getting the grass block");
////
////            return true;
//////            return super.canPlaceAt(state, world, pos); // world.getBlockState(blockPos)
////        }return false;
//        }
    }

    private static TagKey<Block> of(String id) {
        return TagKey.of(RegistryKeys.BLOCK, new Identifier(id));
    }

}