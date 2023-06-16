package net.prangellplays.contentsmpsummoner.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.prangellplays.contentsmpsummoner.ContentSMPSummonerMod;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.prangellplays.contentsmpsummoner.block.custom.SummonerOfTheAirshipFunction;

public class ModBlocks {
    public static final Block SUMMONER_OF_THE_AIRSHIP = registerBlock("summoner_of_the_airship",
            new SummonerOfTheAirshipFunction(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    
        public static final Block METAL_SCAFFOLDING = registerBlock("metal_scaffolding",
            new metalscaffolding(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()), ItemGroup.BUILDING_BLOCKS);

    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(ContentSMPSummonerMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(ContentSMPSummonerMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks() {
        ContentSMPSummonerMod.LOGGER.debug("Registering ModBlocks for " + ContentSMPSummonerMod.MOD_ID);
    }
}
