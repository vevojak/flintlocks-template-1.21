package net.jack.flintlocks;

import net.fabricmc.api.ModInitializer;

import net.jack.flintlocks.block.modBlocks;
import net.jack.flintlocks.item.modItemGroups;
import net.jack.flintlocks.item.modItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Flintlocks implements ModInitializer {
	public static final String MOD_ID = "flintlocks";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");

		modItemGroups.registerItemGroups();
		modItems.RegisterModItems();
		modBlocks.RegisterModBlocks();
	}
}