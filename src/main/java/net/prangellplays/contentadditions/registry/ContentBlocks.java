package net.prangellplays.contentadditions.registry;

import net.minecraft.block.*;
import net.minecraft.item.ItemStack;
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

    public static final Block METAL_SCAFFOLDING = registerBlock("metal_scaffolding", ContentItems.MOD_ITEMS, new CustomScaffoldingItem(21, new MetalScaffoldingBlock(FabricBlockSettings.of(Material.METAL, MapColor.IRON_GRAY).noCollision().sounds(BlockSoundGroup.METAL).dynamicBounds())));

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

    public static final Block BLACK_WOOL_STAIRS = registerBlock("black_wool_stairs", ContentItems.MOD_ITEMS, new StairsBlock(Blocks.BLACK_WOOL.getDefaultState(), FabricBlockSettings.copyOf(Blocks.BLACK_WOOL)));
    public static final Block BLACK_WOOL_SLAB = registerBlock("black_wool_slab", ContentItems.MOD_ITEMS, new SlabBlock(FabricBlockSettings.copyOf(Blocks.BLACK_WOOL)));
    public static final Block BLUE_WOOL_STAIRS = registerBlock("blue_wool_stairs", ContentItems.MOD_ITEMS, new StairsBlock(Blocks.BLUE_WOOL.getDefaultState(), FabricBlockSettings.copyOf(Blocks.BLUE_WOOL)));
    public static final Block BLUE_WOOL_SLAB = registerBlock("blue_wool_slab", ContentItems.MOD_ITEMS, new SlabBlock(FabricBlockSettings.copyOf(Blocks.BLUE_WOOL)));
    public static final Block BROWN_WOOL_STAIRS = registerBlock("brown_wool_stairs", ContentItems.MOD_ITEMS, new StairsBlock(Blocks.BROWN_WOOL.getDefaultState(), FabricBlockSettings.copyOf(Blocks.BROWN_WOOL)));
    public static final Block BROWN_WOOL_SLAB = registerBlock("brown_wool_slab", ContentItems.MOD_ITEMS, new SlabBlock(FabricBlockSettings.copyOf(Blocks.BROWN_WOOL)));
    public static final Block CYAN_WOOL_STAIRS = registerBlock("cyan_wool_stairs", ContentItems.MOD_ITEMS, new StairsBlock(Blocks.CYAN_WOOL.getDefaultState(), FabricBlockSettings.copyOf(Blocks.CYAN_WOOL)));
    public static final Block CYAN_WOOL_SLAB = registerBlock("cyan_wool_slab", ContentItems.MOD_ITEMS, new SlabBlock(FabricBlockSettings.copyOf(Blocks.CYAN_WOOL)));
    public static final Block GRAY_WOOL_STAIRS = registerBlock("gray_wool_stairs", ContentItems.MOD_ITEMS, new StairsBlock(Blocks.GRAY_WOOL.getDefaultState(), FabricBlockSettings.copyOf(Blocks.GRAY_WOOL)));
    public static final Block GRAY_WOOL_SLAB = registerBlock("gray_wool_slab", ContentItems.MOD_ITEMS, new SlabBlock(FabricBlockSettings.copyOf(Blocks.GRAY_WOOL)));
    public static final Block GREEN_WOOL_STAIRS = registerBlock("green_wool_stairs", ContentItems.MOD_ITEMS, new StairsBlock(Blocks.GREEN_WOOL.getDefaultState(), FabricBlockSettings.copyOf(Blocks.GREEN_WOOL)));
    public static final Block GREEN_WOOL_SLAB = registerBlock("green_wool_slab", ContentItems.MOD_ITEMS, new SlabBlock(FabricBlockSettings.copyOf(Blocks.GREEN_WOOL)));
    public static final Block LIGHT_BLUE_WOOL_STAIRS = registerBlock("light_blue_wool_stairs", ContentItems.MOD_ITEMS, new StairsBlock(Blocks.LIGHT_BLUE_WOOL.getDefaultState(), FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_WOOL)));
    public static final Block LIGHT_BLUE_WOOL_SLAB = registerBlock("light_blue_wool_slab", ContentItems.MOD_ITEMS, new SlabBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_WOOL)));
    public static final Block LIGHT_GRAY_WOOL_STAIRS = registerBlock("light_gray_wool_stairs", ContentItems.MOD_ITEMS, new StairsBlock(Blocks.LIGHT_GRAY_WOOL.getDefaultState(), FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_WOOL)));
    public static final Block LIGHT_GRAY_WOOL_SLAB = registerBlock("light_gray_wool_slab", ContentItems.MOD_ITEMS, new SlabBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_WOOL)));
    public static final Block LIME_WOOL_STAIRS = registerBlock("lime_wool_stairs", ContentItems.MOD_ITEMS, new StairsBlock(Blocks.LIME_WOOL.getDefaultState(), FabricBlockSettings.copyOf(Blocks.LIME_WOOL)));
    public static final Block LIME_WOOL_SLAB = registerBlock("lime_wool_slab", ContentItems.MOD_ITEMS, new SlabBlock(FabricBlockSettings.copyOf(Blocks.LIME_WOOL)));
    public static final Block MAGENTA_WOOL_STAIRS = registerBlock("magenta_wool_stairs", ContentItems.MOD_ITEMS, new StairsBlock(Blocks.MAGENTA_WOOL.getDefaultState(), FabricBlockSettings.copyOf(Blocks.MAGENTA_WOOL)));
    public static final Block MAGENTA_WOOL_SLAB = registerBlock("magenta_wool_slab", ContentItems.MOD_ITEMS, new SlabBlock(FabricBlockSettings.copyOf(Blocks.MAGENTA_WOOL)));
    public static final Block ORANGE_WOOL_STAIRS = registerBlock("orange_wool_stairs", ContentItems.MOD_ITEMS, new StairsBlock(Blocks.ORANGE_WOOL.getDefaultState(), FabricBlockSettings.copyOf(Blocks.ORANGE_WOOL)));
    public static final Block ORANGE_WOOL_SLAB = registerBlock("orange_wool_slab", ContentItems.MOD_ITEMS, new SlabBlock(FabricBlockSettings.copyOf(Blocks.ORANGE_WOOL)));
    public static final Block PINK_WOOL_STAIRS = registerBlock("pink_wool_stairs", ContentItems.MOD_ITEMS, new StairsBlock(Blocks.PINK_WOOL.getDefaultState(), FabricBlockSettings.copyOf(Blocks.PINK_WOOL)));
    public static final Block PINK_WOOL_SLAB = registerBlock("pink_wool_slab", ContentItems.MOD_ITEMS, new SlabBlock(FabricBlockSettings.copyOf(Blocks.PINK_WOOL)));
    public static final Block PURPLE_WOOL_STAIRS = registerBlock("purple_wool_stairs", ContentItems.MOD_ITEMS, new StairsBlock(Blocks.PURPLE_WOOL.getDefaultState(), FabricBlockSettings.copyOf(Blocks.PURPLE_WOOL)));
    public static final Block PURPLE_WOOL_SLAB = registerBlock("purple_wool_slab", ContentItems.MOD_ITEMS, new SlabBlock(FabricBlockSettings.copyOf(Blocks.PURPLE_WOOL)));
    public static final Block RED_WOOL_STAIRS = registerBlock("red_wool_stairs", ContentItems.MOD_ITEMS, new StairsBlock(Blocks.RED_WOOL.getDefaultState(), FabricBlockSettings.copyOf(Blocks.RED_WOOL)));
    public static final Block RED_WOOL_SLAB = registerBlock("red_wool_slab", ContentItems.MOD_ITEMS, new SlabBlock(FabricBlockSettings.copyOf(Blocks.RED_WOOL)));
    public static final Block WHITE_WOOL_STAIRS = registerBlock("white_wool_stairs", ContentItems.MOD_ITEMS, new StairsBlock(Blocks.WHITE_WOOL.getDefaultState(), FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block WHITE_WOOL_SLAB = registerBlock("white_wool_slab", ContentItems.MOD_ITEMS, new SlabBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block YELLOW_WOOL_STAIRS = registerBlock("yellow_wool_stairs", ContentItems.MOD_ITEMS, new StairsBlock(Blocks.YELLOW_WOOL.getDefaultState(), FabricBlockSettings.copyOf(Blocks.YELLOW_WOOL)));
    public static final Block YELLOW_WOOL_SLAB = registerBlock("yellow_wool_slab", ContentItems.MOD_ITEMS, new SlabBlock(FabricBlockSettings.copyOf(Blocks.YELLOW_WOOL)));

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