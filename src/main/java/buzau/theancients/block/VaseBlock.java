package buzau.theancients.block;

import buzau.theancients.TheAncients;
import buzau.theancients.registry.AncientsEntities;
import buzau.theancients.block.entity.VaseBlockEntity;
import com.mojang.serialization.MapCodec;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.context.LootContextParameterSet;
import net.minecraft.loot.context.LootContextParameters;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class VaseBlock extends BlockWithEntity implements BlockEntityProvider {
    public static final MapCodec<VaseBlock> CODEC = VaseBlock.createCodec(VaseBlock::new);
    private static final Identifier CONTENTS = new Identifier(TheAncients.MOD_ID, "contents");
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





    // TODO: Add dispenser-like inventory
    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
//        Inventory blockEntity = (Inventory) world.getBlockEntity(pos);
//        int prevStackItemCount;
//        // Check if the player is holding something
//        if(!player.getStackInHand(hand).isEmpty()){
//            // loop through the slots of the vase
//            for(int slot = 0; slot < blockEntity.size(); slot++){
//                // Check if the slot is empty,
//                // If it is then copy whatever the player has in hand to the current slot and remove the item/items from the players hand
//                if(blockEntity.getStack(slot).isEmpty()){
//                    blockEntity.setStack(slot, player.getStackInHand(hand).copy());
//                    player.getStackInHand(hand).setCount(0);
//                }
//                // If it's not empty check if the current item matches the item that player is holding
//                // If it matches add the amount of items that player is holding to current slot
//                if(blockEntity.getStack(slot).getItem() == player.getStackInHand(hand).getItem()){
//                    prevStackItemCount = blockEntity.getStack(slot).getCount();
//                    blockEntity.getStack(slot).setCount(prevStackItemCount + player.getStackInHand(hand).getCount());
//                    player.getStackInHand(hand).setCount(0);
//                    }
//                }
//        }else{
//            // Loop backwards through the inventory
//            for(int slot = blockEntity.size() - 1; slot >= 0; slot--){
//                // Check if the block entity has some in the inventory slots
//                // If they have offer or drop the to the player and remove them from the slot
//                if(!blockEntity.getStack(slot).isEmpty()){
//                        printInventory(blockEntity);
////                    player.getInventory().offerOrDrop(blockEntity.getStack(slot));
////                    blockEntity.removeStack(slot);
//                }
//            }
//        }
        if (!world.isClient) {
            //This will call the createScreenHandlerFactory method from BlockWithEntity, which will return our blockEntity casted to
            //a namedScreenHandlerFactory. If your block class does not extend BlockWithEntity, it needs to implement createScreenHandlerFactory.
            NamedScreenHandlerFactory screenHandlerFactory = state.createScreenHandlerFactory(world, pos);

            if (screenHandlerFactory != null) {
                //With this call the server will request the client to open the appropriate Screenhandler
                player.openHandledScreen(screenHandlerFactory);
            }
        }
        return ActionResult.SUCCESS;
    }

    @Override
    public List<ItemStack> getDroppedStacks(BlockState state, LootContextParameterSet.Builder builder) {
       if(builder.getOptional(LootContextParameters.BLOCK_ENTITY) instanceof VaseBlockEntity vaseEntity){
           builder = builder.addDynamicDrop(CONTENTS, (lootConsumer -> {
               for (int i = 0; i < vaseEntity.getContainerSize(); ++i) {
                   lootConsumer.accept(vaseEntity.getStack(i));
               }
           }));
       }
        return super.getDroppedStacks(state, builder);
    }

    @Override
    protected MapCodec<? extends BlockWithEntity> getCodec() {
        return CODEC;
    }

    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
        return validateTicker(type, AncientsEntities.VASE_BLOCK_ENTITY, (world1, pos, state1, be) -> VaseBlockEntity.tick(world1, pos, state1, be));
    }

    private static void printInventory(Inventory be){
        for (int i = 0; i < be.size(); i++) {
            System.out.println(be.getStack(i));
        }
    }

}
