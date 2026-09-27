package fr.noahboos.rubis.blocks;

import fr.noahboos.rubis.Rubis;
import net.minecraft.references.BlockItemId;

public class RubisBlockItemIds {
    public static BlockItemId create(String name) {
        return BlockItemId.create(Rubis.id(name), Rubis.id(name));
    }
}
