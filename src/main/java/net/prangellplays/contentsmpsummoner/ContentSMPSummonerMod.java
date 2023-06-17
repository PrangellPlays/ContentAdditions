package net.prangellplays.contentsmpsummoner;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.prangellplays.contentsmpsummoner.registry.ContentBlocks;
import net.prangellplays.contentsmpsummoner.registry.ContentItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

public class ContentSMPSummonerMod implements ModInitializer {
	public static final String MOD_ID = "contentsmpsummoner";
	public static final Logger LOGGER = LoggerFactory.getLogger("contentsmpsummoner");

	public static final ItemGroup PIECES_GROUP = FabricItemGroupBuilder.create(id("peculiarpieces_group")).build();
	public static final ItemGroup CREATIVE_GROUP = FabricItemGroupBuilder.create(id("peculiarpieces_creative_group")).build();

	public static final TagKey<Block> SCAFFOLDING = TagKey.of(Registry.BLOCK_KEY, id("scaffolding"));

	@Override
	public void onInitialize() {

		ContentBlocks.init();
		ContentItems.init();

	}
	public static Identifier id(String path) {
		return new Identifier(MOD_ID, path);
	}
}
