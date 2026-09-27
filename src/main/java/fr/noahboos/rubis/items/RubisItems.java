package fr.noahboos.rubis.items;

import fr.noahboos.rubis.Rubis;
import fr.noahboos.rubis.items.definitions.materials.armor.RubyArmorMaterial;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.ArmorType;

import java.util.function.Function;

public class RubisItems {
    public static void initialize() {
        Rubis.LOGGER.info("Initializing {}'s items.", Rubis.MOD_ID);
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.COMBAT).register(creativeModeTab -> {
            creativeModeTab.accept(RUBY_HELMET);
            creativeModeTab.accept(RUBY_CHESTPLATE);
            creativeModeTab.accept(RUBY_LEGGINGS);
            creativeModeTab.accept(RUBY_BOOTS);
        });
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
        RubisItemIds.RUBY,
        Item::new,
        new Item.Properties()
    );

    public static final Item RUBY_HELMET = register(
        RubisItemIds.RUBY_HELMET,
        Item::new,
        new Item.Properties()
            .humanoidArmor(RubyArmorMaterial.INSTANCE, ArmorType.HELMET)
            .durability(ArmorType.HELMET.getDurability(RubyArmorMaterial.BASE_DURABILITY))
    );

    public static final Item RUBY_CHESTPLATE = register(
        RubisItemIds.RUBY_CHESTPLATE,
        Item::new,
        new Item.Properties()
            .humanoidArmor(RubyArmorMaterial.INSTANCE, ArmorType.CHESTPLATE)
            .durability(ArmorType.CHESTPLATE.getDurability(RubyArmorMaterial.BASE_DURABILITY))
    );

    public static final Item RUBY_LEGGINGS = register(
        RubisItemIds.RUBY_LEGGINGS,
        Item::new,
        new Item.Properties()
            .humanoidArmor(RubyArmorMaterial.INSTANCE, ArmorType.LEGGINGS)
            .durability(ArmorType.LEGGINGS.getDurability(RubyArmorMaterial.BASE_DURABILITY))
    );

    public static final Item RUBY_BOOTS = register(
        RubisItemIds.RUBY_BOOTS,
        Item::new,
        new Item.Properties()
            .humanoidArmor(RubyArmorMaterial.INSTANCE, ArmorType.BOOTS)
            .durability(ArmorType.BOOTS.getDurability(RubyArmorMaterial.BASE_DURABILITY))
    );
}
