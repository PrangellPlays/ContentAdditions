package net.prangellplays.contentadditions.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.BlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.prangellplays.contentadditions.ContentAdditions;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;

import java.util.ArrayList;

@SuppressWarnings("unused")
public class ContentItems {

    public static final Item ICON = registerItem("icon", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(ContentAdditions.MOD_ID, name), item);
    }

    public static final ArrayList<Item> MOD_ITEMS = new ArrayList<>();

    public static void init() {}

    public static Item registerItem(String name, ArrayList<Item> list, Item item) {
        Registry.register(Registry.ITEM, ContentAdditions.id(name), item);
        list.add(item);
        return item;
    }

}