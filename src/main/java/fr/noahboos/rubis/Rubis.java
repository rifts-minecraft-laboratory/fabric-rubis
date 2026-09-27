package fr.noahboos.rubis;

import fr.noahboos.rubis.blocks.RubisBlocks;
import fr.noahboos.rubis.items.RubisItems;
import fr.noahboos.rubis.worldgen.RubisWorldgen;
import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Rubis implements ModInitializer {
	public static final String MOD_ID = "rubis";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing {} on the server side.", MOD_ID);
		RubisBlocks.initialize();
		RubisItems.initialize();
		RubisWorldgen.initialize();
		LOGGER.info("Initialized {} on the server side.", MOD_ID);
	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}
