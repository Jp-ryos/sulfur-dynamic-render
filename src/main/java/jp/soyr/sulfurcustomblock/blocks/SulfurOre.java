package jp.soyr.sulfurcustomblock.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.phys.BlockHitResult;

public class SulfurOre extends Block {
    public SulfurOre() {
        super(Properties.of()
                .strength(1.0f)
                .requiresCorrectToolForDrops()
                .instrument(NoteBlockInstrument.BANJO)
                .pushReaction(PushReaction.DESTROY));
    }

    /* explode ??????????????????????????????????????????????? explode */
    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand interactionHand, BlockHitResult result) {
        if (level.isClientSide) {
            level.explode(null, pos.getX() + .5, pos.getX() + .5, pos.getZ() + .5,  2.0f, false, Level.ExplosionInteraction.MOB);
             return InteractionResult.SUCCESS;
        }
        return InteractionResult.PASS;
    }
}
