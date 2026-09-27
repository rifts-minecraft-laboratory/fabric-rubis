package fr.noahboos.rubis.blocks;

import fr.noahboos.rubis.Rubis;
import net.minecraft.references.BlockItemId;

public class RubisBlockItemIds {
    public static BlockItemId create(String name) {
        return BlockItemId.create(Rubis.id(name), Rubis.id(name));
    }

    public static final BlockItemId RUBY_BLOCK = create("ruby_block");
    public static final BlockItemId RUBY_ORE = create("ruby_ore");
    public static final BlockItemId DEEPSLATE_RUBY_ORE = create("deepslate_ruby_ore");
}
