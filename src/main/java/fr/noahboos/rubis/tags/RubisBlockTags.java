package fr.noahboos.rubis.tags;

import fr.noahboos.rubis.Rubis;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class RubisBlockTags {
    public static final TagKey<Block> INCORRECT_FOR_RUBY_TOOL = TagKey.create(
        Registries.BLOCK,
        Rubis.id("incorrect_for_ruby_tool")
    );
}
