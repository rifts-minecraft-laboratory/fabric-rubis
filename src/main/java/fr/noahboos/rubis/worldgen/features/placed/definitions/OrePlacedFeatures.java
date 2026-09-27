package fr.noahboos.rubis.worldgen.features.placed.definitions;

import fr.noahboos.rubis.Rubis;
import fr.noahboos.rubis.worldgen.features.configured.definitions.OreConfiguredFeatures;
import fr.noahboos.rubis.worldgen.features.placed.RubisPlacedFeatures;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.heightproviders.BiasedToBottomHeight;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class OrePlacedFeatures {
    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        Rubis.LOGGER.info("Bootstrapping {}'s worldgen's ore placed features.", Rubis.MOD_ID);
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatureHolderGetter = context.lookup(Registries.CONFIGURED_FEATURE);

        context.register(EXTRA_SMALL_RUBY_VEIN_PLACED_KEY, new PlacedFeature(
            configuredFeatureHolderGetter.getOrThrow(OreConfiguredFeatures.EXTRA_SMALL_RUBY_VEIN_CONFIGURED_KEY),
            List.of(
                CountPlacement.of(8),
                BiomeFilter.biome(),
                InSquarePlacement.spread(),
                HeightRangePlacement.of(
                    BiasedToBottomHeight.of(
                        VerticalAnchor.aboveBottom(20),
                        VerticalAnchor.absolute(16),
                        8
                    )
                )
            )
        ));

        context.register(SMALL_RUBY_VEIN_PLACED_KEY, new PlacedFeature(
            configuredFeatureHolderGetter.getOrThrow(OreConfiguredFeatures.SMALL_RUBY_VEIN_CONFIGURED_KEY),
            List.of(
                CountPlacement.of(8),
                RarityFilter.onAverageOnceEvery(2),
                BiomeFilter.biome(),
                InSquarePlacement.spread(),
                HeightRangePlacement.of(
                    BiasedToBottomHeight.of(
                        VerticalAnchor.aboveBottom(16),
                        VerticalAnchor.absolute(8),
                        12
                    )
                )
            )
        ));

        context.register(MEDIUM_RUBY_VEIN_PLACED_KEY, new PlacedFeature(
            configuredFeatureHolderGetter.getOrThrow(OreConfiguredFeatures.MEDIUM_RUBY_VEIN_CONFIGURED_KEY),
            List.of(
                CountPlacement.of(6),
                RarityFilter.onAverageOnceEvery(4),
                BiomeFilter.biome(),
                InSquarePlacement.spread(),
                HeightRangePlacement.of(
                    BiasedToBottomHeight.of(
                        VerticalAnchor.aboveBottom(8),
                        VerticalAnchor.absolute(-8),
                        16
                    )
                )
            )
        ));

        context.register(LARGE_RUBY_VEIN_PLACED_KEY, new PlacedFeature(
            configuredFeatureHolderGetter.getOrThrow(OreConfiguredFeatures.LARGE_RUBY_VEIN_CONFIGURED_KEY),
            List.of(
                CountPlacement.of(4),
                RarityFilter.onAverageOnceEvery(8),
                BiomeFilter.biome(),
                InSquarePlacement.spread(),
                HeightRangePlacement.of(
                    BiasedToBottomHeight.of(
                        VerticalAnchor.aboveBottom(12),
                        VerticalAnchor.absolute(-32),
                        12
                    )
                )
            )
        ));

        context.register(EXTRA_LARGE_RUBY_VEIN_PLACED_KEY, new PlacedFeature(
            configuredFeatureHolderGetter.getOrThrow(OreConfiguredFeatures.EXTRA_LARGE_RUBY_VEIN_CONFIGURED_KEY),
            List.of(
                CountPlacement.of(2),
                RarityFilter.onAverageOnceEvery(6),
                BiomeFilter.biome(),
                InSquarePlacement.spread(),
                HeightRangePlacement.of(
                    BiasedToBottomHeight.of(
                        VerticalAnchor.aboveBottom(8),
                        VerticalAnchor.absolute(-40),
                        8
                    )
                )
            )
        ));
        Rubis.LOGGER.info("Bootstrapped {}'s worldgen's ore placed features.", Rubis.MOD_ID);
    }

    public static final ResourceKey<PlacedFeature> EXTRA_SMALL_RUBY_VEIN_PLACED_KEY = RubisPlacedFeatures.register("extra_small_ruby_vein_placed_key");
    public static final ResourceKey<PlacedFeature> SMALL_RUBY_VEIN_PLACED_KEY = RubisPlacedFeatures.register("small_ruby_vein_placed_key");
    public static final ResourceKey<PlacedFeature> MEDIUM_RUBY_VEIN_PLACED_KEY = RubisPlacedFeatures.register("medium_ruby_vein_placed_key");
    public static final ResourceKey<PlacedFeature> LARGE_RUBY_VEIN_PLACED_KEY = RubisPlacedFeatures.register("large_ruby_vein_placed_key");
    public static final ResourceKey<PlacedFeature> EXTRA_LARGE_RUBY_VEIN_PLACED_KEY = RubisPlacedFeatures.register("extra_large_ruby_vein_placed_key");
}
