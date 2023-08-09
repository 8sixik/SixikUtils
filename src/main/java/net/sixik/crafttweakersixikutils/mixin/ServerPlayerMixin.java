package net.sixik.crafttweakersixikutils.mixin;

import net.minecraft.network.chat.ChatType;
import net.minecraft.network.chat.OutgoingPlayerChatMessage;
import net.minecraft.server.level.ServerPlayer;
import net.minecraftforge.common.MinecraftForge;
import net.sixik.crafttweakersixikutils.source.events.players.PlayerSendMessageEvent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ServerPlayer.class)
public class ServerPlayerMixin {


    @Inject(method = "sendChatMessage", at = @At("HEAD"))
    public void onInventoryChange(OutgoingPlayerChatMessage p_243284_, boolean p_243285_, ChatType.Bound p_243314_, CallbackInfo ci){
        MinecraftForge.EVENT_BUS.post(new PlayerSendMessageEvent((ServerPlayer)(Object)this, p_243284_.toString()));
    }

}
