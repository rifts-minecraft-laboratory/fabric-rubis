package fr.noahboos.rubis.items;

import fr.noahboos.rubis.Rubis;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

public class RubisItemsIds {
    public static ResourceKey<Item> create(String name) {
        return ResourceKey.create(Registries.ITEM, Rubis.id(name));
    }

    public static final ResourceKey<Item> RUBY = create("ruby");
}
