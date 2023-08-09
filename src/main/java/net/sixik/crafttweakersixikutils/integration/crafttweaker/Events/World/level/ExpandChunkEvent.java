package net.sixik.crafttweakersixikutils.integration.crafttweaker.Events.World.level;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.level.chunk.ChunkAccess;
import net.minecraftforge.event.level.ChunkEvent;
import org.openzen.zencode.java.ZenCodeType;


@ZenRegister
@Document("mods/sixikutils/utils/events/level/server/ChunkEvent")
@NativeTypeRegistration(value = ChunkEvent.class, zenCodeName = "mods.crafttweakerutils.api.events.world.level.ChunkEvent")
public class ExpandChunkEvent {

    @ZenCodeType.Method
    @ZenCodeType.Getter("chunk")
    public static ChunkAccess getChunk(ChunkEvent event){
       return event.getChunk();
    }
}
