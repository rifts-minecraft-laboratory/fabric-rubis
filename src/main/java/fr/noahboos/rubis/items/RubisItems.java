package fr.noahboos.rubis.items;

import fr.noahboos.rubis.Rubis;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;

import java.util.function.Function;

public class RubisItems {
    public static void initialize() {
        Rubis.LOGGER.info("Initializing {}'s items.", Rubis.MOD_ID);
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.INGREDIENTS).register(creativeModeTab -> {
            creativeModeTab.accept(RUBY);
        });
        Rubis.LOGGER.info("Initialized {}'s items.", Rubis.MOD_ID);
    }

    public static Item register(ResourceKey<Item> itemResourceKey, Function<Item.Properties, Item> itemFactory, Item.Properties settings) {
        Item item = itemFactory.apply(settings.setId(itemResourceKey));
        Registry.register(BuiltInRegistries.ITEM, itemResourceKey, item);

        return item;
    }

    public static final Item RUBY = register(
        RubisItemsIds.RUBY,
        Item::new,
        new Item.Properties()
    );
}
