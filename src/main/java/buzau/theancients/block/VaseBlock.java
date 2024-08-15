package buzau.theancients.block;

import buzau.theancients.TheAncients;
import buzau.theancients.entity.AncientsEntities;
import buzau.theancients.entity.block.VaseBlockEntity;
import com.mojang.serialization.MapCodec;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.entity.ShulkerBoxBlockEntity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.Inventories;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.ItemScatterer;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class VaseBlock extends BlockWithEntity implements BlockEntityProvider {
    public static final MapCodec<VaseBlock> CODEC = VaseBlock.createCodec(VaseBlock::new);
    private static final VoxelShape SHAPE = VaseBlock.createCuboidShape(5,0,5,11,10,11);
    public VaseBlock(Settings settings) {
        super(settings);
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new VaseBlockEntity(pos, state);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        Inventory blockEntity = (Inventory) world.getBlockEntity(pos);
        int prevStackItemCount;
        // Check if the player is holding something
        if(!player.getStackInHand(hand).isEmpty()){
            // loop through the slots of the vase
            for(int slot = 0; slot < blockEntity.size(); slot++){
                // Check if the slot is empty,
                // If it is then copy whatever the player has in hand to the current slot and remove the item/items from the players hand
                if(blockEntity.getStack(slot).isEmpty()){
                    blockEntity.setStack(slot, player.getStackInHand(hand).copy());
                    player.getStackInHand(hand).setCount(0);
                    return ActionResult.SUCCESS;
                }
                // If it's not empty check if the current item matches the item that player is holding
                // If it matches add the amount of items that player is holding to current slot
                if(blockEntity.getStack(slot).getItem() == player.getStackInHand(hand).getItem()){
                    prevStackItemCount = blockEntity.getStack(slot).getCount();
                    blockEntity.getStack(slot).setCount(prevStackItemCount + player.getStackInHand(hand).getCount());
                    player.getStackInHand(hand).setCount(0);
                    return ActionResult.SUCCESS;
                    }
                }
        }else{
            // Loop backwards through the inventory
            for(int slot = blockEntity.size() - 1; slot >= 0; slot--){
                // Check if they have something in them
                // If they have offer or drop the to the player and remove them from the slot
                if(!blockEntity.getStack(slot).isEmpty()){
                    player.getInventory().offerOrDrop(blockEntity.getStack(slot));
                    blockEntity.removeStack(slot);
                    return ActionResult.SUCCESS;
                }
            }
        }
        return ActionResult.FAIL;
    }

    @Override
    public BlockState onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        Inventory blockEntity = (Inventory) world.getBlockEntity(pos);
        VaseBlockEntity entity = (VaseBlockEntity) blockEntity;
        if (blockEntity instanceof VaseBlockEntity) {
            if (!world.isClient && player.isCreative() && !blockEntity.isEmpty()) {
            } else {
            }
        }
        return super.onBreak(world, pos, state, player);
    }

    @Override
    public void onStateReplaced(BlockState state, World world, BlockPos pos, BlockState newState, boolean moved) {
        if (state.getBlock() != newState.getBlock()) {
            BlockEntity blockEntity = world.getBlockEntity(pos);
            if (blockEntity instanceof VaseBlockEntity) {
                ItemScatterer.spawn(world, pos, (VaseBlockEntity)blockEntity);
                // update comparators
                world.updateComparators(pos,this);
            }
            super.onStateReplaced(state, world, pos, newState, moved);
        }
    }

    @Override
    protected MapCodec<? extends BlockWithEntity> getCodec() {
        return CODEC;
    }

    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
        return validateTicker(type, AncientsEntities.VASE_BLOCK_ENTITY, (world1, pos, state1, be) -> VaseBlockEntity.tick(world1, pos, state1, be));
    }

}
