package net.prangellplays.contentadditions;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Block;
import net.minecraft.item.ItemGroup;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.prangellplays.contentadditions.registry.ContentBlocks;
import net.prangellplays.contentadditions.registry.ContentItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ContentAdditions implements ModInitializer {
	public static final String MOD_ID = "contentadditions";
	public static final Logger LOGGER = LoggerFactory.getLogger("contentadditions");

	public static final ItemGroup CONTENT_GROUP = FabricItemGroupBuilder.create(id("contentadditions_group")).build();

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
