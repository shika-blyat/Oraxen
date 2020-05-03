package io.th0rgal.oraxen.mechanics.provided.freeze;

import org.bukkit.event.Listener;

import net.minecraft.server.v1_14_R1.EntityPlayer;
import net.minecraft.server.v1_14_R1.World;
import net.minecraft.server.v1_14_R1.EnumHand;

public class FreezeMechanicManager implements Listener {
    private final FreezeMechanicFactory factory;

    public FreezeMechanicManager(FreezeMechanicFactory factory) {
        this.factory = factory;
    }

    public void onItemRightClick(World world, EntityPlayer player, EnumHand hand) {
        if (EnumHand.MAIN_HAND == hand) {
            System.out.println("right clicked");
        }
    }
}