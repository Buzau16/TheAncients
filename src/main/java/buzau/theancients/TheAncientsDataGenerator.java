package buzau.theancients;

import buzau.theancients.world.dimension.TheFirstCity;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;

public class TheAncientsDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

	}

	public void buildRegistry(RegistryBuilder regBuilder){
		regBuilder.addRegistry(RegistryKeys.DIMENSION_TYPE, TheFirstCity::bootstrapType);
	}
}
