package buzau.theancients.datagen;

import buzau.theancients.items.custom.AncientsItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ItemTagProvider extends FabricTagProvider.ItemTagProvider {

    public ItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(buzau.theancients.items.custom.AncientsItems.ETHEREAL_ARCANE_HELMET, buzau.theancients.items.custom.AncientsItems.ETHEREAL_ARCANE_CHESTPLATE, buzau.theancients.items.custom.AncientsItems.ETHEREAL_ARCANE_LEGGINGS, AncientsItems.ETHEREAL_ARCANE_BOOTS);
    }
}
