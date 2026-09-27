package fr.noahboos.rubis.items.definitions.materials.tool;

import fr.noahboos.rubis.tags.RubisBlockTags;
import fr.noahboos.rubis.tags.RubisItemTags;
import net.minecraft.world.item.ToolMaterial;

public class RubyToolMaterial {
    public static final int DURABILITY = 1796;
    public static final float SPEED = 8.5f;
    public static final float ATTACK_DAMAGE_BONUS = 3.5f;
    public static final int ENCHANTMENT_VALUE = 15;

    public static ToolMaterial INSTANCE = new ToolMaterial(
        RubisBlockTags.INCORRECT_FOR_RUBY_TOOL,
        DURABILITY,
        SPEED,
        ATTACK_DAMAGE_BONUS,
        ENCHANTMENT_VALUE,
        RubisItemTags.REPAIRS_RUBY_ARMOR
    );
}
