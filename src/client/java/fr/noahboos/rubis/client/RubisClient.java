package fr.noahboos.rubis.client;

import fr.noahboos.rubis.Rubis;
import net.fabricmc.api.ClientModInitializer;

public class RubisClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		Rubis.LOGGER.info("Initializing {} on the client side.", Rubis.MOD_ID);
		// This entrypoint is suitable for setting up client-specific logic, such as rendering.
		Rubis.LOGGER.info("Initialized {} on the client side.", Rubis.MOD_ID);
	}
}