package net.sixik.crafttweakersixikutils.integration.crafttweaker.Events.Entity.player;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.level.chunk.LevelChunk;
import net.sixik.crafttweakersixikutils.source.events.players.PlayerChunkEvents;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sixikutils/utils/events/entity/player/PlayerBeforeLoadedChunkEvent")
@NativeTypeRegistration(value = PlayerChunkEvents.PlayerBeforeLoadedChunkEvent.class, zenCodeName = "mods.sixikutils.api.misc.world.PlayerBeforeLoadedChunkEvent")
public class ExpandPlayerBeforeLoadedChunkEvent {

    @ZenCodeType.Method
    public static LevelChunk getChunk(PlayerChunkEvents.PlayerBeforeLoadedChunkEvent event){
        return event.getLevelChunk();
    }
}
