package net.sixik.crafttweakersixikutils.integration.crafttweaker.Events.Entity;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.entity.Entity;
import net.minecraftforge.event.entity.EntityMobGriefingEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sixikutils/utils/events/entity/living/EntityMobGriefingEvent")
@NativeTypeRegistration(value = EntityMobGriefingEvent.class, zenCodeName = "mods.sixikutils.api.events.entity.EntityMobGriefingEvent")
public class ExpandEntityMobGriefingEvent {

    @ZenCodeType.Method
    public static Entity getEntity(EntityMobGriefingEvent event){
        return event.getEntity();
    }
}
