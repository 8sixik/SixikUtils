package net.sixik.crafttweakersixikutils.integration.crafttweaker.Events.Entity.player;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.event.entity.player.PlayerEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sixikutils/utils/events/entity/player/PlayerBreakSpeedEvent")
@NativeTypeRegistration(value = PlayerEvent.BreakSpeed.class, zenCodeName = "mods.sixikutils.api.misc.world.PlayerBreakSpeedEvent")
public class ExpandPlayerBreakSpeedEvent {

    @ZenCodeType.Method
    public static BlockState getState(PlayerEvent.BreakSpeed event){
        return event.getState();
    }
    @ZenCodeType.Method
    public static float getNewSpeed(PlayerEvent.BreakSpeed event){
        return event.getNewSpeed();
    }
    @ZenCodeType.Method
    public static float getOriginalSpeed(PlayerEvent.BreakSpeed event){
        return event.getOriginalSpeed();
    }
    @ZenCodeType.Method
    public static BlockPos getPosition(PlayerEvent.BreakSpeed event){
        return event.getPosition().get();
    }
    @ZenCodeType.Method
    public static void setNewSpeed(PlayerEvent.BreakSpeed event, float speed){
        event.setNewSpeed(speed);
    }
}
