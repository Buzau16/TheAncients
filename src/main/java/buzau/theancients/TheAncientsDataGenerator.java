package buzau.theancients;

import buzau.theancients.datagen.*;
import buzau.theancients.world.AncientsConfiguredFeature;
import buzau.theancients.world.AncientsPlacedFeature;
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
//		regBuilder.addRegistry(RegistryKeys.DIMENSION_TYPE, TheElderRealm::bootstrapType);
//		regBuilder.addRegistry(RegistryKeys.BIOME, ModBiomes::boostrap);
		regBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, AncientsConfiguredFeature::boostrap);
		regBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, AncientsPlacedFeature::boostrap);
	}
}
