package net.sixik.crafttweakersixikutils.integration.crafttweaker.Misc.world;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.level.chunk.LevelChunk;

@ZenRegister
@Document("mods/sixikutils/utils/world/LevelChunk")
@NativeTypeRegistration(value = LevelChunk.class,zenCodeName = "mods.sixikutils.api.misc.world.LevelChunk")
public class ExpandLevelChunk {

}
