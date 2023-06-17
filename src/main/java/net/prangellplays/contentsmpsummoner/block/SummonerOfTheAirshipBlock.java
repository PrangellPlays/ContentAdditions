package net.prangellplays.contentsmpsummoner.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SummonerOfTheAirshipBlock extends Block {

    public SummonerOfTheAirshipBlock(Settings settings) {
        super(settings);
    }



    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (!world.isClient) {
            world.setBlockState(this.getDefaultState(pos), Blocks.AIR.getDefaultState());
            Entity customEntity = ((EntityType<Entity>) EntityType.get("expedition:airship").get()).create(world);
            customEntity.setPosition(0, 100, 0);
            world.spawnEntity(customEntity);
        }

        return ActionResult.SUCCESS;
    }

    private BlockPos getDefaultState(BlockPos pos) {
        return pos;
    }
}
