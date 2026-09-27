package fr.noahboos.rubis.blocks;

import fr.noahboos.rubis.Rubis;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.references.BlockItemId;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Function;

public class RubisBlocks {
    public static void initialize() {
        Rubis.LOGGER.info("Initializing {}'s blocks.", Rubis.MOD_ID);
        //
        Rubis.LOGGER.info("Initialized {}'s blocks.", Rubis.MOD_ID);
    }

    public static Block register(BlockItemId blockItemId, Function<BlockBehaviour.Properties, Block> blockFactory, BlockBehaviour.Properties properties) {
        Block block = register(blockItemId.block(), blockFactory, properties);
        BlockItem blockItem = new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix().setId(blockItemId.item()));
        Registry.register(BuiltInRegistries.ITEM, blockItemId.item(), blockItem);

        return block;
    }

    public static Block register(ResourceKey<Block> resourceKey, Function<BlockBehaviour.Properties, Block> blockFactory, BlockBehaviour.Properties properties) {
        Block block = blockFactory.apply(properties.setId(resourceKey));

        return Registry.register(BuiltInRegistries.BLOCK, resourceKey, block);
    }
}
