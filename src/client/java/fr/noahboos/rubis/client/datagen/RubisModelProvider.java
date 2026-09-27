package fr.noahboos.rubis.client.datagen;

import fr.noahboos.rubis.Rubis;
import fr.noahboos.rubis.blocks.RubisBlocks;
import fr.noahboos.rubis.items.RubisItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;

public class RubisModelProvider extends FabricModelProvider {
    public RubisModelProvider(FabricPackOutput fabricPackOutput) {
        super(fabricPackOutput);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {
        Rubis.LOGGER.info("Generating {}'s block models.", Rubis.MOD_ID);
        blockModelGenerators.createTrivialCube(RubisBlocks.RUBY_BLOCK);
        blockModelGenerators.createTrivialCube(RubisBlocks.RUBY_ORE);
        blockModelGenerators.createTrivialCube(RubisBlocks.DEEPSLATE_RUBY_ORE);
        Rubis.LOGGER.info("Generated {}'s block models.", Rubis.MOD_ID);
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        Rubis.LOGGER.info("Generating {}'s item models.", Rubis.MOD_ID);
        itemModelGenerators.generateFlatItem(RubisItems.RUBY, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(RubisItems.RUBY_HELMET, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(RubisItems.RUBY_CHESTPLATE , ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(RubisItems.RUBY_LEGGINGS, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(RubisItems.RUBY_BOOTS, ModelTemplates.FLAT_ITEM);
        Rubis.LOGGER.info("Generated {}'s item models.", Rubis.MOD_ID);
    }

    @Override
    public String getName() {
        return "RubisModelProvider";
    }
}
