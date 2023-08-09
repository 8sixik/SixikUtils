package net.sixik.crafttweakersixikutils.integration.crafttweaker.Events.Entity;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.sixik.crafttweakersixikutils.source.events.LivingEntityXpDropEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sixikutils/utils/events/entity/living/LivingEntityXpDropEvent")
@NativeTypeRegistration(value = LivingEntityXpDropEvent.class, zenCodeName = "mods.sixikutils.api.events.entity.LivingEntityXpDropEvent")
public class ExpandLivingEntityXpDropEvent {

    @ZenCodeType.Method
    @ZenCodeType.Getter("xp")
    public static int getXp(LivingEntityXpDropEvent event){
        return event.getReward();
    }
}
