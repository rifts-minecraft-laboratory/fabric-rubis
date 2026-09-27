package fr.noahboos.rubis.client.datagen;

import fr.noahboos.rubis.Rubis;
import fr.noahboos.rubis.items.RubisItemIds;
import fr.noahboos.rubis.tags.RubisItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.ItemTags;

import java.util.concurrent.CompletableFuture;

public class RubisItemTagProvider extends FabricTagsProvider.ItemTagsProvider {
    public RubisItemTagProvider(FabricPackOutput fabricPackOutput, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(fabricPackOutput, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        Rubis.LOGGER.info("Adding tags to {}'s items.", Rubis.MOD_ID);
        builder(RubisItemTags.REPAIRS_RUBY_ARMOR)
            .add(RubisItemIds.RUBY);

        builder(ItemTags.HEAD_ARMOR)
            .add(RubisItemIds.RUBY_HELMET);

        builder(ItemTags.CHEST_ARMOR)
            .add(RubisItemIds.RUBY_CHESTPLATE);

        builder(ItemTags.LEG_ARMOR)
            .add(RubisItemIds.RUBY_LEGGINGS);

        builder(ItemTags.FOOT_ARMOR)
            .add(RubisItemIds.RUBY_BOOTS);

        builder(ItemTags.TRIMMABLE_ARMOR)
            .add(RubisItemIds.RUBY_HELMET)
            .add(RubisItemIds.RUBY_CHESTPLATE)
            .add(RubisItemIds.RUBY_LEGGINGS)
            .add(RubisItemIds.RUBY_BOOTS);

        builder(ItemTags.TRIM_MATERIALS)
            .add(RubisItemIds.RUBY);
        Rubis.LOGGER.info("Added tags to {}'s items.", Rubis.MOD_ID);
    }
}
