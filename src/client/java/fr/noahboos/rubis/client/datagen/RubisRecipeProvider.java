package fr.noahboos.rubis.client.datagen;

import fr.noahboos.rubis.Rubis;
import fr.noahboos.rubis.blocks.RubisBlocks;
import fr.noahboos.rubis.items.RubisItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Items;

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
                shaped(RecipeCategory.BUILDING_BLOCKS, RubisBlocks.RUBY_BLOCK, 1)
                    .pattern("aaa")
                    .pattern("aaa")
                    .pattern("aaa")
                    .define('a', RubisItems.RUBY)
                    .unlockedBy("has_ruby", has(RubisItems.RUBY))
                    .save(output);

                shapeless(RecipeCategory.MISC, RubisItems.RUBY, 9)
                    .requires(RubisBlocks.RUBY_BLOCK)
                    .unlockedBy("has_ruby", has(RubisItems.RUBY))
                    .save(output);

                shaped(RecipeCategory.COMBAT, RubisItems.RUBY_HELMET, 1)
                    .pattern("aaa")
                    .pattern("a a")
                    .define('a', RubisItems.RUBY)
                    .unlockedBy("has_ruby", has(RubisItems.RUBY))
                    .save(output);

                shaped(RecipeCategory.COMBAT, RubisItems.RUBY_CHESTPLATE, 1)
                    .pattern("a a")
                    .pattern("aaa")
                    .pattern("aaa")
                    .define('a', RubisItems.RUBY)
                    .unlockedBy("has_ruby", has(RubisItems.RUBY))
                    .save(output);

                shaped(RecipeCategory.COMBAT, RubisItems.RUBY_LEGGINGS, 1)
                    .pattern("aaa")
                    .pattern("a a")
                    .pattern("a a")
                    .define('a', RubisItems.RUBY)
                    .unlockedBy("has_ruby", has(RubisItems.RUBY))
                    .save(output);

                shaped(RecipeCategory.COMBAT, RubisItems.RUBY_BOOTS, 1)
                    .pattern("a a")
                    .pattern("a a")
                    .define('a', RubisItems.RUBY)
                    .unlockedBy("has_ruby", has(RubisItems.RUBY))
                    .save(output);

                shaped(RecipeCategory.COMBAT, RubisItems.RUBY_SWORD, 1)
                    .pattern("a")
                    .pattern("a")
                    .pattern("b")
                    .define('a', RubisItems.RUBY)
                    .define('b', Items.STICK)
                    .unlockedBy("has_ruby", has(RubisItems.RUBY))
                    .save(output);

                shaped(RecipeCategory.COMBAT, RubisItems.RUBY_SPEAR, 1)
                    .pattern("  a")
                    .pattern(" b ")
                    .pattern("b  ")
                    .define('a', RubisItems.RUBY)
                    .define('b', Items.STICK)
                    .unlockedBy("has_ruby", has(RubisItems.RUBY))
                    .save(output);

                shaped(RecipeCategory.TOOLS, RubisItems.RUBY_PICKAXE, 1)
                    .pattern("aaa")
                    .pattern(" b ")
                    .pattern(" b ")
                    .define('a', RubisItems.RUBY)
                    .define('b', Items.STICK)
                    .unlockedBy("has_ruby", has(RubisItems.RUBY))
                    .save(output);

                shaped(RecipeCategory.TOOLS, RubisItems.RUBY_AXE, 1)
                    .pattern("aa")
                    .pattern("ba")
                    .pattern("b ")
                    .define('a', RubisItems.RUBY)
                    .define('b', Items.STICK)
                    .unlockedBy("has_ruby", has(RubisItems.RUBY))
                    .save(output);

                shaped(RecipeCategory.TOOLS, RubisItems.RUBY_SHOVEL, 1)
                    .pattern("a")
                    .pattern("b")
                    .pattern("b")
                    .define('a', RubisItems.RUBY)
                    .define('b', Items.STICK)
                    .unlockedBy("has_ruby", has(RubisItems.RUBY))
                    .save(output);

                shaped(RecipeCategory.TOOLS, RubisItems.RUBY_HOE, 1)
                    .pattern("aa")
                    .pattern("b ")
                    .pattern("b ")
                    .define('a', RubisItems.RUBY)
                    .define('b', Items.STICK)
                    .unlockedBy("has_ruby", has(RubisItems.RUBY))
                    .save(output);
                Rubis.LOGGER.info("Generated {}'s recipes.", Rubis.MOD_ID);
            }
        };
    }

    @Override
    public String getName() {
        return "RubisRecipeProvider";
    }
}
