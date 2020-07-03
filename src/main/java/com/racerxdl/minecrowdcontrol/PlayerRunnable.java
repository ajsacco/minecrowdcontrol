package com.racerxdl.minecrowdcontrol;

import net.minecraft.entity.player.PlayerEntity;

@FunctionalInterface
public interface PlayerRunnable {
    boolean run(PlayerEntity player);
}