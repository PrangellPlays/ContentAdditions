package net.prangellplays.contentadditions.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.YOffset;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class SummonerOfTheAirshipBlock extends Block {

    public SummonerOfTheAirshipBlock(Settings settings) {
        super(settings);
    }



    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (!world.isClient) {
            world.setBlockState(this.getDefaultState(pos), Blocks.AIR.getDefaultState());
            Entity customEntity = ((EntityType<Entity>) EntityType.get("expedition:airship").get()).create(world);
            customEntity.setPosition(pos.getX(), 100, pos.getZ());
            world.spawnEntity(customEntity);
        }

        return ActionResult.SUCCESS;
    }

    private BlockPos getDefaultState(BlockPos pos) {
        return pos;
    }
}
