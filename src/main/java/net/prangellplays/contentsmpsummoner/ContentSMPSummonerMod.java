package net.prangellplays.contentsmpsummoner;

import net.fabricmc.api.ModInitializer;
import net.prangellplays.contentsmpsummoner.block.ModBlocks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ContentSMPSummonerMod implements ModInitializer {
	public static final String MOD_ID = "contentsmpsummoner";
	public static final Logger LOGGER = LoggerFactory.getLogger("contentsmpsummoner");

	@Override
	public void onInitialize() {

		ModBlocks.registerModBlocks();

	}
}
