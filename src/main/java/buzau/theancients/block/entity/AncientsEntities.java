package buzau.theancients.block.entity;

import buzau.theancients.TheAncients;
import buzau.theancients.block.AncientsBlocks;
import buzau.theancients.block.entity.VaseBlockEntity;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class AncientsEntities {
    public static final BlockEntityType<VaseBlockEntity> VASE_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(TheAncients.MOD_ID, "vase_be"),
                    FabricBlockEntityTypeBuilder.create(VaseBlockEntity::new, AncientsBlocks.VASE).build(null));

    public static void registerEntities(){
        TheAncients.LOGGER.info("Registering Entities for " + TheAncients.MOD_ID);
    }
}
