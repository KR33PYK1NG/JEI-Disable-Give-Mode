package rmc.mixins.jei_disable_give_mode.inject;

import mezz.jei.network.packets.PacketGiveItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.network.PacketBuffer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

/**
 * Developed by RMC Team, 2021
 * @author KR33PY
 */
@Mixin(value = PacketGiveItemStack.class)
public abstract class PacketGiveItemStackMixin {

    @Overwrite
    public static void readPacketData(PacketBuffer buf, PlayerEntity player) {}

}
