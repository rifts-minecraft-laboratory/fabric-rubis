package fr.noahboos.rubis.tags;

import fr.noahboos.rubis.Rubis;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class RubisItemTags {
    public static final TagKey<Item> REPAIRS_RUBY_ARMOR = TagKey.create(
        Registries.ITEM,
        Rubis.id("repairs_ruby_armor")
    );
}
