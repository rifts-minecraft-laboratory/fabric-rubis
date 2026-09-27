package fr.noahboos.rubis.blocks;

import fr.noahboos.rubis.Rubis;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.references.BlockItemId;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

import java.util.function.Function;

public class RubisBlocks {
    public static void initialize() {
        Rubis.LOGGER.info("Initializing {}'s blocks.", Rubis.MOD_ID);
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.BUILDING_BLOCKS).register(creativeModeTab -> {
            creativeModeTab.accept(RUBY_BLOCK.asItem());
        });

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.NATURAL_BLOCKS).register(creativeModeTab -> {
            creativeModeTab.accept(RUBY_ORE.asItem());
            creativeModeTab.accept(DEEPSLATE_RUBY_ORE.asItem());
        });
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

    public static final Block RUBY_BLOCK = register(
        RubisBlockItemIds.RUBY_BLOCK,
        Block::new,
        BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_RED)
            .requiresCorrectToolForDrops()
            .sound(SoundType.METAL)
            .strength(5.0f, 6.0f)
    );

    public static final Block RUBY_ORE = register(
        RubisBlockItemIds.RUBY_ORE,
        Block::new,
        BlockBehaviour.Properties.of()
            .mapColor(MapColor.STONE)
            .requiresCorrectToolForDrops()
            .sound(SoundType.STONE)
            .strength(3.0f, 3.0f)
    );

    public static final Block DEEPSLATE_RUBY_ORE = register(
        RubisBlockItemIds.DEEPSLATE_RUBY_ORE,
        Block::new,
        BlockBehaviour.Properties.of()
            .mapColor(MapColor.DEEPSLATE)
            .requiresCorrectToolForDrops()
            .sound(SoundType.DEEPSLATE)
            .strength(4.5f, 3.0f)
    );
}
