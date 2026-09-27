package fr.noahboos.rubis.client.datagen;

import fr.noahboos.rubis.Rubis;
import fr.noahboos.rubis.blocks.RubisBlocks;
import fr.noahboos.rubis.items.RubisItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class RubisBlockLootTableProvider extends FabricBlockLootSubProvider {
    public RubisBlockLootTableProvider(FabricPackOutput fabricPackOutput, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(fabricPackOutput, registriesFuture);
    }

    @Override
    public void generate() {
        Rubis.LOGGER.info("Generating {}'s block loot tables.", Rubis.MOD_ID);
        dropSelf(RubisBlocks.RUBY_BLOCK);
        dropWhenSilkTouch(RubisBlocks.RUBY_ORE);
        add(RubisBlocks.RUBY_ORE, createOreDrop(RubisBlocks.RUBY_ORE, RubisItems.RUBY));
        dropWhenSilkTouch(RubisBlocks.DEEPSLATE_RUBY_ORE);
        add(RubisBlocks.DEEPSLATE_RUBY_ORE, createOreDrop(RubisBlocks.DEEPSLATE_RUBY_ORE, RubisItems.RUBY));
        Rubis.LOGGER.info("Generated {}'s block loot tables.", Rubis.MOD_ID);
    }
}
