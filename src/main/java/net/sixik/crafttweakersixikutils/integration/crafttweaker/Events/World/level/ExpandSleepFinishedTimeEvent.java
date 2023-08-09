package net.sixik.crafttweakersixikutils.integration.crafttweaker.Events.World.level;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraftforge.event.level.SleepFinishedTimeEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sixikutils/utils/events/level/server/SleepFinishedTimeEvent")
@NativeTypeRegistration(value = SleepFinishedTimeEvent.class,zenCodeName = "mods.crafttweakerutils.api.events.world.level.SleepFinishedTimeEvent")
public class ExpandSleepFinishedTimeEvent {
    @ZenCodeType.Method
    public static long getNewTime(SleepFinishedTimeEvent event){
        return event.getNewTime();
    }
    @ZenCodeType.Method
    public static boolean setTimeAddition(SleepFinishedTimeEvent event, long l){
       return event.setTimeAddition(l);
    }
}
