package fr.noahboos.rubis.trims;

import fr.noahboos.rubis.Rubis;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.equipment.trim.TrimMaterial;

public class RubisTrimMaterials {
    public static final ResourceKey<TrimMaterial> RUBY_TRIM_MATERIAL = ResourceKey.create(
        Registries.TRIM_MATERIAL,
        Rubis.id("ruby")
    );
}
