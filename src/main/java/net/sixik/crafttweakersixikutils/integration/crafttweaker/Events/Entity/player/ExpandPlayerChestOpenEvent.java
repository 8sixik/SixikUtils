package net.sixik.crafttweakersixikutils.integration.crafttweaker.Events.Entity.player;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.sixik.crafttweakersixikutils.source.events.players.PlayerChestOpenEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sixikutils/utils/events/entity/player/PlayerChestOpenEvent")
@NativeTypeRegistration(value = PlayerChestOpenEvent.class, zenCodeName = "mods.sixikutils.api.events.entity.player.PlayerChestOpenEvent")
public class ExpandPlayerChestOpenEvent {

    @ZenCodeType.Method
    @ZenCodeType.Getter("player")
    public static Player getPlayer(PlayerChestOpenEvent event){
        return event.getEntity();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("block")
    public static BlockEntity getBlockEntity(PlayerChestOpenEvent event){
        return event.getBlock();
    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("openCount")
    public static int getOpenCount(PlayerChestOpenEvent event){
        return event.getOpenCount();
    }
}
