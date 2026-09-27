package fr.noahboos.rubis.client.datagen;

import fr.noahboos.rubis.Rubis;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;

import java.util.concurrent.CompletableFuture;

public class RubisRecipeProvider extends FabricRecipeProvider {
    public RubisRecipeProvider(FabricPackOutput fabricPackOutput, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(fabricPackOutput, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registryLookup, RecipeOutput recipeOutput) {
        return new RecipeProvider(registryLookup, recipeOutput) {
            @Override
            public void buildRecipes() {
                Rubis.LOGGER.info("Generating {}'s recipes.", Rubis.MOD_ID);
                //
                Rubis.LOGGER.info("Generated {}'s recipes.", Rubis.MOD_ID);
            }
        };
    }

    @Override
    public String getName() {
        return "RubisRecipeProvider";
    }
}
