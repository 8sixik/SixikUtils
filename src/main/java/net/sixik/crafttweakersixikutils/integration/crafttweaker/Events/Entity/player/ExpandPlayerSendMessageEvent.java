package net.sixik.crafttweakersixikutils.integration.crafttweaker.Events.Entity.player;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.sixik.crafttweakersixikutils.source.events.players.PlayerPotionEvent;
import net.sixik.crafttweakersixikutils.source.events.players.PlayerSendMessageEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sixikutils/utils/events/entity/player/PlayerSendMessageEvent")
@NativeTypeRegistration(value = PlayerSendMessageEvent.class, zenCodeName = "mods.sixikutils.api.events.entity.player.PlayerSendMessageEvent")
public class ExpandPlayerSendMessageEvent {

    @ZenCodeType.Method
    public static String getMessage(PlayerSendMessageEvent event){
        return event.getMessage();
    }
}
