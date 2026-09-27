package fr.noahboos.rubis.items;

import fr.noahboos.rubis.Rubis;
import fr.noahboos.rubis.items.definitions.materials.armor.RubyArmorMaterial;
import fr.noahboos.rubis.items.definitions.materials.tool.RubyToolMaterial;
import fr.noahboos.rubis.trims.RubisTrimMaterials;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.*;
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
            creativeModeTab.accept(RUBY_SWORD);
            creativeModeTab.accept(RUBY_SPEAR);
            creativeModeTab.accept(RUBY_AXE);
        });
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.INGREDIENTS).register(creativeModeTab -> {
            creativeModeTab.accept(RUBY);
        });
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.TOOLS_AND_UTILITIES).register(creativeModeTab -> {
            creativeModeTab.accept(RUBY_SHOVEL);
            creativeModeTab.accept(RUBY_PICKAXE);
            creativeModeTab.accept(RUBY_AXE);
            creativeModeTab.accept(RUBY_HOE);
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
            .trimMaterial(RubisTrimMaterials.RUBY_TRIM_MATERIAL)
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

    public static final Item RUBY_SWORD = register(
        RubisItemIds.RUBY_SWORD,
        Item::new,
        new Item.Properties()
            .sword(RubyToolMaterial.INSTANCE, 3.0f, -2.4f)
    );

    public static final Item RUBY_SPEAR = register(
        RubisItemIds.RUBY_SPEAR,
        Item::new,
        new Item.Properties()
            .spear(RubyToolMaterial.INSTANCE, 1.10f, 1.1375f, 0.45f, 2.75f, 9.5f, 6.0f, 5.1f, 9.375f, 4.6f)
    );

    public static final Item RUBY_PICKAXE = register(
        RubisItemIds.RUBY_PICKAXE,
        Item::new,
        new Item.Properties()
            .pickaxe(RubyToolMaterial.INSTANCE, 1.0f, -2.8f)
    );

    public static final Item RUBY_AXE = register(
        RubisItemIds.RUBY_AXE,
        settings -> new AxeItem(RubyToolMaterial.INSTANCE, 5.0f, -3.0f, settings),
        new Item.Properties()
    );

    public static final Item RUBY_SHOVEL = register(
        RubisItemIds.RUBY_SHOVEL,
        settings -> new ShovelItem(RubyToolMaterial.INSTANCE, 1.5f, -3.0f, settings),
        new Item.Properties()
    );

    public static final Item RUBY_HOE = register(
        RubisItemIds.RUBY_HOE,
        settings -> new HoeItem(RubyToolMaterial.INSTANCE, -3.0f, 0.0f, settings),
        new Item.Properties()
    );
}
