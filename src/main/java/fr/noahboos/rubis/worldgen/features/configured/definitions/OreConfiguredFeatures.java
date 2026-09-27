package fr.noahboos.rubis.worldgen.features.configured.definitions;

import fr.noahboos.rubis.Rubis;
import fr.noahboos.rubis.blocks.RubisBlocks;
import fr.noahboos.rubis.worldgen.features.configured.RubisConfiguredFeatures;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class OreConfiguredFeatures {
    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        Rubis.LOGGER.info("Bootstrapping {}'s worldgen's ore configured features.", Rubis.MOD_ID);
        RuleTest stoneReplaceableRule = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceableRule = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);


        List<OreConfiguration.TargetBlockState> oreRubyTargetList = List.of(
            OreConfiguration.target(stoneReplaceableRule, RubisBlocks.RUBY_ORE.defaultBlockState()),
            OreConfiguration.target(deepslateReplaceableRule, RubisBlocks.DEEPSLATE_RUBY_ORE.defaultBlockState())
        );

        context.register(EXTRA_SMALL_RUBY_VEIN_CONFIGURED_KEY, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(oreRubyTargetList, 1)));
        context.register(SMALL_RUBY_VEIN_CONFIGURED_KEY, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(oreRubyTargetList, 2)));
        context.register(MEDIUM_RUBY_VEIN_CONFIGURED_KEY, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(oreRubyTargetList, 4, 0.25f)));
        context.register(LARGE_RUBY_VEIN_CONFIGURED_KEY, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(oreRubyTargetList, 6, 0.75f)));
        context.register(EXTRA_LARGE_RUBY_VEIN_CONFIGURED_KEY, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(oreRubyTargetList, 8, 0.95f)));
        Rubis.LOGGER.info("Bootstrapped {}'s worldgen's ore configured features.", Rubis.MOD_ID);
    }


    public static final ResourceKey<ConfiguredFeature<?, ?>> EXTRA_SMALL_RUBY_VEIN_CONFIGURED_KEY = RubisConfiguredFeatures.register("extra_small_ruby_vein_configured_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SMALL_RUBY_VEIN_CONFIGURED_KEY = RubisConfiguredFeatures.register("small_ruby_vein_configured_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MEDIUM_RUBY_VEIN_CONFIGURED_KEY = RubisConfiguredFeatures.register("medium_ruby_vein_configured_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LARGE_RUBY_VEIN_CONFIGURED_KEY = RubisConfiguredFeatures.register("large_ruby_vein_configured_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> EXTRA_LARGE_RUBY_VEIN_CONFIGURED_KEY = RubisConfiguredFeatures.register("extra_large_ruby_vein_configured_key");
}
