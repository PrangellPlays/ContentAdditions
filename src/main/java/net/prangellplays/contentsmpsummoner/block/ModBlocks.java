package net.prangellplays.contentsmpsummoner.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.prangellplays.contentsmpsummoner.ContentSMPSummonerMod;

public class ModBlocks {



    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        Item item = Registry.register(Registry.ITEM, new Identifier(ContentSMPSummonerMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
        return item;
    }

    public static void registerModBlocks(){
        ContentSMPSummonerMod.LOGGER.info("Registering ModBlocks for " + ContentSMPSummonerMod.MOD_ID);
    }
}
