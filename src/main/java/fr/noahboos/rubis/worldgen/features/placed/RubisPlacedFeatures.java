package fr.noahboos.rubis.worldgen.features.placed;

import fr.noahboos.rubis.Rubis;
import fr.noahboos.rubis.worldgen.features.placed.definitions.OrePlacedFeatures;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class RubisPlacedFeatures {
    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        Rubis.LOGGER.info("Bootstrapping {}'s worldgen's placed features.", Rubis.MOD_ID);
        OrePlacedFeatures.bootstrap(context);
        Rubis.LOGGER.info("Bootstrapped {}'s worldgen's placed features.", Rubis.MOD_ID);
    }

    public static ResourceKey<PlacedFeature> register(String name) {
        return ResourceKey.create(
            Registries.PLACED_FEATURE,
            Rubis.id(name)
        );
    }
}
