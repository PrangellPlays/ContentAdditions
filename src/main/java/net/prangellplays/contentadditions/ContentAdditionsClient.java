package net.prangellplays.contentadditions;

import net.prangellplays.contentadditions.registry.ContentBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.DyeableItem;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtElement;

public class ContentAdditionsClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ContentBlocks.METAL_SCAFFOLDING, RenderLayer.getCutout());
    }

    public int getColorOr(ItemStack stack, int base) {
        NbtCompound nbtCompound = stack.getSubNbt(DyeableItem.DISPLAY_KEY);
        if (nbtCompound != null && nbtCompound.contains(DyeableItem.COLOR_KEY, NbtElement.NUMBER_TYPE)) {
            return nbtCompound.getInt(DyeableItem.COLOR_KEY);
        }
        return base;
    }

}