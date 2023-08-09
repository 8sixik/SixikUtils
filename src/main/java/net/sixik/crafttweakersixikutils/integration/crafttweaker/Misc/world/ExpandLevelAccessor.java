package net.sixik.crafttweakersixikutils.integration.crafttweaker.Misc.world;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.chunk.ChunkSource;
import net.minecraft.world.level.storage.LevelData;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sixikutils/utils/world/LevelAccessor")
@NativeTypeRegistration(value = LevelAccessor.class, zenCodeName = "mods.sixikutils.api.misc.world.LevelAccessor")
public class ExpandLevelAccessor {

    @ZenCodeType.Method
    @ZenCodeType.Getter("levelData")
    public static LevelData getLevelData(LevelAccessor internal){
       return internal.getLevelData();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("chunkSource")
    public static ChunkSource getChunkSource(LevelAccessor internal){
       return internal.getChunkSource();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("server")
    public static MinecraftServer getServer(LevelAccessor internal){
       return internal.getServer();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("level")
    public static Level getLevel(LevelAccessor internal){
       return (Level) internal;
    }
}
