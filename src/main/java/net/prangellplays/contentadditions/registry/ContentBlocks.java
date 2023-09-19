package net.prangellplays.contentadditions.registry;

import net.minecraft.block.*;
import net.prangellplays.contentadditions.ContentAdditions;
import net.prangellplays.contentadditions.block.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Rarity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.BlockView;
import net.prangellplays.contentadditions.item.CustomScaffoldingItem;

import java.util.ArrayList;

public class ContentBlocks {

    public static final Block METAL_SCAFFOLDING = registerBlock("metal_scaffolding", ContentItems.MOD_ITEMS, new CustomScaffoldingItem(21, new MetalScaffoldingBlock(FabricBlockSettings.of(Material.METAL, MapColor.IRON_GRAY).noCollision().sounds(BlockSoundGroup.METAL).dynamicBounds()), new FabricItemSettings().rarity(Rarity.RARE).group(ItemGroup.BUILDING_BLOCKS)));
    public static final Block SUMMONER_OF_THE_AIRSHIP = registerBlock("summoner_of_the_airship", ContentItems.MOD_ITEMS, new SummonerOfTheAirshipBlock(FabricBlockSettings.of(Material.METAL, MapColor.IRON_GRAY).sounds(BlockSoundGroup.METAL)));
    public static final Block TUFF_STAIRS = registerBlock("tuff_stairs", ContentItems.MOD_ITEMS, new StairsBlock(Blocks.TUFF.getDefaultState(), FabricBlockSettings.copyOf(Blocks.TUFF)));
    public static final Block TUFF_SLAB = registerBlock("tuff_slab", ContentItems.MOD_ITEMS, new SlabBlock(FabricBlockSettings.copyOf(Blocks.TUFF)));
    public static final Block TUFF_WALL = registerBlock("tuff_wall", ContentItems.MOD_ITEMS, new WallBlock(FabricBlockSettings.copyOf(Blocks.TUFF)));
    public static final Block POLISHED_TUFF = registerBlock("polished_tuff", ContentItems.MOD_ITEMS, new Block(FabricBlockSettings.copyOf(Blocks.TUFF)));
    public static final Block POLISHED_TUFF_STAIRS = registerBlock("polished_tuff_stairs", ContentItems.MOD_ITEMS, new StairsBlock(ContentBlocks.POLISHED_TUFF.getDefaultState(), FabricBlockSettings.copyOf(Blocks.TUFF)));
    public static final Block POLISHED_TUFF_SLAB = registerBlock("polished_tuff_slab", ContentItems.MOD_ITEMS, new SlabBlock(FabricBlockSettings.copyOf(Blocks.TUFF)));
    public static final Block POLISHED_TUFF_WALL = registerBlock("polished_tuff_wall", ContentItems.MOD_ITEMS, new WallBlock(FabricBlockSettings.copyOf(Blocks.TUFF)));
    public static final Block TUFF_BRICKS = registerBlock("tuff_bricks", ContentItems.MOD_ITEMS, new Block(FabricBlockSettings.copyOf(Blocks.TUFF)));
    public static final Block TUFF_BRICK_STAIRS = registerBlock("tuff_brick_stairs", ContentItems.MOD_ITEMS, new StairsBlock(ContentBlocks.TUFF_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.TUFF)));
    public static final Block TUFF_BRICK_SLAB = registerBlock("tuff_brick_slab", ContentItems.MOD_ITEMS, new SlabBlock(FabricBlockSettings.copyOf(Blocks.TUFF)));
    public static final Block TUFF_BRICK_WALL = registerBlock("tuff_brick_wall", ContentItems.MOD_ITEMS, new WallBlock(FabricBlockSettings.copyOf(Blocks.TUFF)));



    public static void init() {}

    private static Block registerBlock(String name, ArrayList<Item> list, Block block) {
        ItemGroup group = ContentAdditions.CONTENT_GROUP;

        return registerBlock(name, list, new BlockItem(block, new FabricItemSettings().group(group)));
    }

    private static Block registerBlock(String name, ArrayList<Item> list, BlockItem block) {
        Registry.register(Registry.BLOCK, ContentAdditions.id(name), block.getBlock());
        ContentItems.registerItem(name, list, block);
        return block.getBlock();
    }

    private static Block registerBlock(String name, Block block) {
        Registry.register(Registry.BLOCK, ContentAdditions.id(name), block);
        return block;
    }

    private static boolean never(BlockState state, BlockView world, BlockPos pos) {
        return false;
    }
}