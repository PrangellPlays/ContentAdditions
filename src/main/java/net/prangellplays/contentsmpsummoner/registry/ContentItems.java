package net.prangellplays.contentsmpsummoner.registry;

import net.prangellplays.contentsmpsummoner.ContentSMPSummonerMod;
import net.prangellplays.contentsmpsummoner.item.*;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;

import java.util.ArrayList;

@SuppressWarnings("unused")
public class ContentItems {
    public static final ArrayList<Item> MOD_ITEMS = new ArrayList<>();
    public static final ArrayList<Item> CREATIVE_ITEMS = new ArrayList<>();
    public static final ArrayList<Item> POTION_ITEMS = new ArrayList<>();

    public static void init() {}

    public static Item registerItem(String name, ArrayList<Item> list, Item item) {
        Registry.register(Registry.ITEM, ContentSMPSummonerMod.id(name), item);
        list.add(item);
        return item;
    }

}