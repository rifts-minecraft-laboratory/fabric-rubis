package fr.noahboos.rubis.client.datagen;

import fr.noahboos.rubis.Rubis;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;

public class RubisModelProvider extends FabricModelProvider {
    public RubisModelProvider(FabricPackOutput fabricPackOutput) {
        super(fabricPackOutput);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {
        Rubis.LOGGER.info("Generating {}'s block models.", Rubis.MOD_ID);
        //
        Rubis.LOGGER.info("Generated {}'s block models.", Rubis.MOD_ID);
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        Rubis.LOGGER.info("Generating {}'s item models.", Rubis.MOD_ID);
        //
        Rubis.LOGGER.info("Generated {}'s item models.", Rubis.MOD_ID);
    }

    @Override
    public String getName() {
        return "RubisModelProvider";
    }
}
