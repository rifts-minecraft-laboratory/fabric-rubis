package fr.noahboos.rubis.client.datagen;

import fr.noahboos.rubis.Rubis;
import fr.noahboos.rubis.blocks.RubisBlockItemIds;
import fr.noahboos.rubis.blocks.RubisBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;

import java.util.concurrent.CompletableFuture;

public class RubisBlockTagProvider extends FabricTagsProvider.BlockTagsProvider {
    public RubisBlockTagProvider(FabricPackOutput fabricPackOutput, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(fabricPackOutput, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        Rubis.LOGGER.info("Adding tags to {}'s blocks.", Rubis.MOD_ID);
        builder(BlockTags.MINEABLE_WITH_PICKAXE)
            .add(RubisBlockItemIds.RUBY_BLOCK)
            .add(RubisBlockItemIds.RUBY_ORE)
            .add(RubisBlockItemIds.DEEPSLATE_RUBY_ORE);

        builder(BlockTags.NEEDS_DIAMOND_TOOL)
            .add(RubisBlockItemIds.RUBY_BLOCK)
            .add(RubisBlockItemIds.RUBY_ORE)
            .add(RubisBlockItemIds.DEEPSLATE_RUBY_ORE);
        Rubis.LOGGER.info("Added tags to {}'s blocks.", Rubis.MOD_ID);
    }
}
