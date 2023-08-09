package net.sixik.crafttweakersixikutils.integration.crafttweaker.Events.World.level;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.event.level.LevelEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sixikutils/utils/events/level/server/ChunkPotentialSpawnsEvent")
@NativeTypeRegistration(value = LevelEvent.PotentialSpawns.class, zenCodeName = "mods.crafttweakerutils.api.events.world.level.ChunkPotentialSpawnsEvent")
public class ExpandPotentialSpawnsEvent {

    @ZenCodeType.Method
    public static BlockPos getPos(LevelEvent.PotentialSpawns event){
       return event.getPos();
    }
    @ZenCodeType.Method
    public static MobCategory getMobCategory(LevelEvent.PotentialSpawns event){
       return event.getMobCategory();
    }

}
