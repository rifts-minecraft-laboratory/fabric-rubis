package fr.noahboos.rubis.client;

import fr.noahboos.rubis.Rubis;
import fr.noahboos.rubis.client.datagen.*;
import fr.noahboos.rubis.worldgen.features.configured.RubisConfiguredFeatures;
import fr.noahboos.rubis.worldgen.features.placed.RubisPlacedFeatures;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;

public class RubisDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		Rubis.LOGGER.info("Initializing {}'s datagen.", Rubis.MOD_ID);
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(RubisBlockLootTableProvider::new);
		pack.addProvider(RubisBlockTagProvider::new);
		pack.addProvider(RubisItemTagProvider::new);
		pack.addProvider(RubisModelProvider::new);
		pack.addProvider(RubisRecipeProvider::new);
		pack.addProvider(RubisWorldgenProvider::new);
		Rubis.LOGGER.info("Initialized {}'s datagen.", Rubis.MOD_ID);
	}

	@Override
	public void buildRegistry(RegistrySetBuilder registrySetBuilder) {
		registrySetBuilder.add(Registries.CONFIGURED_FEATURE, RubisConfiguredFeatures::bootstrap);
		registrySetBuilder.add(Registries.PLACED_FEATURE, RubisPlacedFeatures::bootstrap);
	}
}
