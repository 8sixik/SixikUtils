package net.sixik.crafttweakersixikutils.integration.crafttweaker.Events.Entity;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker.api.item.IItemStack;
import com.blamejared.crafttweaker.api.item.MCItemStack;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.entity.LivingEntity;
import net.sixik.crafttweakersixikutils.source.events.LivingItemPickUpEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sixikutils/utils/events/entity/living/LivingItemPickUpEvent")
@NativeTypeRegistration(value = LivingItemPickUpEvent.class, zenCodeName = "mods.sixikutils.api.events.entity.LivingItemPickUpEvent")
public class ExpandLivingItemPickUp {

    @ZenCodeType.Method
    public static LivingEntity getEntity(LivingItemPickUpEvent event){
        return event.getEntity();
    }
    @ZenCodeType.Method
    public static IItemStack getItem(LivingItemPickUpEvent event){
        return new MCItemStack(event.getItemStack());
    }
}