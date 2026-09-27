package fr.noahboos.rubis.worldgen;

import fr.noahboos.rubis.Rubis;
import fr.noahboos.rubis.worldgen.features.placed.definitions.OrePlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.levelgen.GenerationStep;

public class RubisWorldgen {
    public static void initialize() {
        Rubis.LOGGER.info("Initializing {}'s worldgen.", Rubis.MOD_ID);
        BiomeModifications.addFeature(
            BiomeSelectors.foundInOverworld(),
            GenerationStep.Decoration.UNDERGROUND_ORES,
            OrePlacedFeatures.EXTRA_SMALL_RUBY_VEIN_PLACED_KEY
        );

        BiomeModifications.addFeature(
            BiomeSelectors.foundInOverworld(),
            GenerationStep.Decoration.UNDERGROUND_ORES,
            OrePlacedFeatures.SMALL_RUBY_VEIN_PLACED_KEY
        );

        BiomeModifications.addFeature(
            BiomeSelectors.foundInOverworld(),
            GenerationStep.Decoration.UNDERGROUND_ORES,
            OrePlacedFeatures.MEDIUM_RUBY_VEIN_PLACED_KEY
        );

        BiomeModifications.addFeature(
            BiomeSelectors.foundInOverworld(),
            GenerationStep.Decoration.UNDERGROUND_ORES,
            OrePlacedFeatures.LARGE_RUBY_VEIN_PLACED_KEY
        );

        BiomeModifications.addFeature(
            BiomeSelectors.tag(BiomeTags.IS_MOUNTAIN),
            GenerationStep.Decoration.UNDERGROUND_ORES,
            OrePlacedFeatures.EXTRA_LARGE_RUBY_VEIN_PLACED_KEY
        );
        Rubis.LOGGER.info("Initialized {}'s worldgen.", Rubis.MOD_ID);
    }
}
