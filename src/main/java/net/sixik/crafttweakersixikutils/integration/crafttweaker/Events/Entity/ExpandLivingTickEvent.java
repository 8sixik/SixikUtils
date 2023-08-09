package net.sixik.crafttweakersixikutils.integration.crafttweaker.Events.Entity;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.entity.LivingEntity;
import net.sixik.crafttweakersixikutils.source.events.LivingEntityTickEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sixikutils/utils/events/entity/living/LivingTickEvent")
@NativeTypeRegistration(value = LivingEntityTickEvent.class, zenCodeName = "mods.sixikutils.api.events.entity.LivingTickEvent")
public class ExpandLivingTickEvent {

    @ZenCodeType.Method
    @ZenCodeType.Getter("entityLiving")
    public static LivingEntity getEntity(LivingEntityTickEvent event){
        return event.getEntity();
    }
}
