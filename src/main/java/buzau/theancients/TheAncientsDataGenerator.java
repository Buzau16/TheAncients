package buzau.theancients;

import buzau.theancients.datagen.*;
import buzau.theancients.world.biome.ModBiomes;
import buzau.theancients.world.dimension.TheElderRealm;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;

public class TheAncientsDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(BlockTagProvider::new);
		pack.addProvider(ItemTagProvider::new);
		pack.addProvider(LootTableProvider::new);
		pack.addProvider(ModelProvider::new);
		pack.addProvider(RecipeProvider::new);
		pack.addProvider(WorldDataProvider::new);
	}

	public void buildRegistry(RegistryBuilder regBuilder){
		regBuilder.addRegistry(RegistryKeys.DIMENSION_TYPE, TheElderRealm::bootstrapType);
		regBuilder.addRegistry(RegistryKeys.BIOME, ModBiomes::boostrap);
	}
}
