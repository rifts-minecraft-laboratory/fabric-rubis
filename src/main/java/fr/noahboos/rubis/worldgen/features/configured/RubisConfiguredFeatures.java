package fr.noahboos.rubis.worldgen.features.configured;

import fr.noahboos.rubis.Rubis;
import fr.noahboos.rubis.worldgen.features.configured.definitions.OreConfiguredFeatures;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

public class RubisConfiguredFeatures {
    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        Rubis.LOGGER.info("Bootstrapping {}'s worldgen's configured features.", Rubis.MOD_ID);
        OreConfiguredFeatures.bootstrap(context);
        Rubis.LOGGER.info("Bootstrapped {}'s worldgen's configured features.", Rubis.MOD_ID);
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> register(String name) {
        return ResourceKey.create(
            Registries.CONFIGURED_FEATURE,
            Rubis.id(name)
        );
    }
}
