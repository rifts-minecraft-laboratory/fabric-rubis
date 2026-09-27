package fr.noahboos.rubis.client.datagen;

import fr.noahboos.rubis.Rubis;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class RubisItemTagProvider extends FabricTagsProvider.ItemTagsProvider {
    public RubisItemTagProvider(FabricPackOutput fabricPackOutput, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(fabricPackOutput, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        Rubis.LOGGER.info("Adding tags to {}'s items.", Rubis.MOD_ID);
        //
        Rubis.LOGGER.info("Added tags to {}'s items.", Rubis.MOD_ID);
    }
}
