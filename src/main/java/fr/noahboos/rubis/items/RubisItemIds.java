package fr.noahboos.rubis.items;

import fr.noahboos.rubis.Rubis;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

public class RubisItemIds {
    public static ResourceKey<Item> create(String name) {
        return ResourceKey.create(Registries.ITEM, Rubis.id(name));
    }

    public static final ResourceKey<Item> RUBY = create("ruby");
    public static final ResourceKey<Item> RUBY_HELMET = create("ruby_helmet");
    public static final ResourceKey<Item> RUBY_CHESTPLATE = create("ruby_chestplate");
    public static final ResourceKey<Item> RUBY_LEGGINGS = create("ruby_leggings");
    public static final ResourceKey<Item> RUBY_BOOTS = create("ruby_boots");
}
