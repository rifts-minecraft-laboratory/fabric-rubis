package fr.noahboos.rubis.client.datagen;

import fr.noahboos.rubis.Rubis;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricDynamicRegistryProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;

import java.util.concurrent.CompletableFuture;

public class RubisWorldgenProvider extends FabricDynamicRegistryProvider {
    public RubisWorldgenProvider(FabricPackOutput fabricPackOutput, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(fabricPackOutput, registriesFuture);
    }

    @Override
    protected void configure(HolderLookup.Provider registries, Entries entries) {
        Rubis.LOGGER.info("Configurating {}'s worldgen.", Rubis.MOD_ID);
        entries.addAll(registries.lookupOrThrow(Registries.CONFIGURED_FEATURE));
        entries.addAll(registries.lookupOrThrow(Registries.PLACED_FEATURE));
        Rubis.LOGGER.info("Configurated {}'s worldgen.", Rubis.MOD_ID);
    }

    @Override
    public String getName() {
        return "RubisWorldgenProvider";
    }
}
