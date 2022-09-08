package xyz.merith.bariputer;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import xyz.merith.bariputer.client.Keybind;


// create an public value for the logger that contains the current modid
public class BariputerInit implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("bariputer");

	@Override
	public void onInitialize() {
		// log that the mod is initializing
		LOGGER.info("Initializing Bariputer");
		Keybind.register();
	}
}