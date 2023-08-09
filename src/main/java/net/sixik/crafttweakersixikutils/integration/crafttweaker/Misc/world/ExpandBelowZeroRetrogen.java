package net.sixik.crafttweakersixikutils.integration.crafttweaker.Misc.world;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.level.chunk.ChunkStatus;
import net.minecraft.world.level.levelgen.BelowZeroRetrogen;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sixikutils/utils/world/BelowZeroRetrogen")
@NativeTypeRegistration(value = BelowZeroRetrogen.class, zenCodeName = "mods.sixikutils.api.misc.world.BelowZeroRetrogen")
public class ExpandBelowZeroRetrogen {

    @ZenCodeType.Method
    public static boolean hasBedrockHole(BelowZeroRetrogen internal){
        return internal.hasBedrockHoles();
    }
    @ZenCodeType.Method
    public static boolean hasBedrockHole(BelowZeroRetrogen internal, int x, int z){
        return internal.hasBedrockHole(x,z);
    }
    @ZenCodeType.Method
    public static ChunkStatus targetStatus(BelowZeroRetrogen internal){
        return internal.targetStatus();
    }
}
