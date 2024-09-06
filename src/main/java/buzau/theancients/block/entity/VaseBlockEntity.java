package buzau.theancients.block.entity;

import buzau.theancients.registry.AncientsEntities;
import buzau.theancients.ui.screenHandlers.Vase.VaseScreenHandler;
import buzau.theancients.util.ImplementedInventory;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.LootableContainerBlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtElement;
import net.minecraft.network.listener.ClientPlayPacketListener;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.BlockEntityUpdateS2CPacket;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class VaseBlockEntity extends LootableContainerBlockEntity implements ImplementedInventory, NamedScreenHandlerFactory {

    public static final String ITEMS_KEY = "Items";
    private DefaultedList<ItemStack> INVENTORY = DefaultedList.ofSize(9, ItemStack.EMPTY);
    public VaseBlockEntity(BlockPos pos, BlockState state) {
        super(AncientsEntities.VASE_BLOCK_ENTITY, pos, state);
    }

    public static void tick(World world1, BlockPos pos, BlockState state1, VaseBlockEntity be) {
    }

    public int getContainerSize() {
        return this.INVENTORY.size();
    }

    @Override
    public DefaultedList<ItemStack> getItems() {
        return INVENTORY;
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);
        Inventories.readNbt(nbt, INVENTORY);
    }

    @Nullable
    @Override
    public Packet<ClientPlayPacketListener> toUpdatePacket() {
        return BlockEntityUpdateS2CPacket.create(this);
    }

    @Override
    public NbtCompound toInitialChunkDataNbt() {
        return createNbt();
    }

    @Override
    protected void writeNbt(NbtCompound nbt) {
        Inventories.writeNbt(nbt, this.INVENTORY, false);
        super.writeNbt(nbt);
    }

    public void readInventoryNbt(NbtCompound nbt) {
        this.INVENTORY = DefaultedList.ofSize(this.size(), ItemStack.EMPTY);
        if (!this.readLootTable(nbt) && nbt.contains(ITEMS_KEY, NbtElement.LIST_TYPE)) {
            Inventories.readNbt(nbt, this.INVENTORY);
        }
    }

    @Override
    protected Text getContainerName() {
        return Text.translatable(getCachedState().getBlock().getTranslationKey());
    }

    @Override
    protected DefaultedList<ItemStack> method_11282() {
        return INVENTORY;
    }

    @Override
    protected void setInvStackList(DefaultedList<ItemStack> list) {

    }

    @Override
    protected ScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) {
        return new VaseScreenHandler(syncId, playerInventory, this);
    }

}
