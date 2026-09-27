package fr.noahboos.rubis.client.datagen;

import fr.noahboos.rubis.Rubis;
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
        //
        Rubis.LOGGER.info("Generated {}'s block loot tables.", Rubis.MOD_ID);
    }
}
