package buzau.theancients.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.context.LootContextParameterSet;
import net.minecraft.util.ItemScatterer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.function.Function;

public class StructVaseBlock extends Block{

    public static final MapCodec<StructVaseBlock> CODEC = StructVaseBlock.createCodec(StructVaseBlock::new);

    private static final VoxelShape SHAPE = StructVaseBlock.createCuboidShape(3,0,3, 13,21,13);

    public StructVaseBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected MapCodec<? extends Block> getCodec() {
        return CODEC;
    }

//    @Override
//    public List<ItemStack> getDroppedStacks(BlockState state, LootContextParameterSet.Builder builder) {
//        System.out.println("cox");
//        return super.getDroppedStacks(state, builder);
//
//    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

}
