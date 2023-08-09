package net.sixik.crafttweakersixikutils.integration.crafttweaker.Events.World.level;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.level.storage.ServerLevelData;
import net.minecraftforge.event.level.LevelEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sixikutils/utils/events/level/server/ChunkCreateSpawnPositionEvent")
@NativeTypeRegistration(value = LevelEvent.CreateSpawnPosition.class, zenCodeName = "mods.crafttweakerutils.api.events.world.level.ChunkCreateSpawnPositionEvent")
public class ExpandChunkCreateSpawnPositionEvent {

    @ZenCodeType.Method
    @ZenCodeType.Getter("levelData")
    public static ServerLevelData getLevelData(LevelEvent.CreateSpawnPosition event){
        return event.getSettings();
    }
}
