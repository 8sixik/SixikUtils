package net.sixik.crafttweakersixikutils.integration.crafttweaker.Misc.world;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.levelgen.structure.StructureStart;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sixikutils/utils/world/StructureStart")
@NativeTypeRegistration(value = StructureStart.class, zenCodeName = "mods.sixikutils.api.misc.world.StructureStart")
public class ExpandStructureStart {

    @ZenCodeType.Method
    public static boolean canBeReferenced(StructureStart internal){
        return internal.canBeReferenced();
    }
    @ZenCodeType.Method
    public static boolean isValid(StructureStart internal){
        return internal.isValid();
    }
    @ZenCodeType.Method
    public static ChunkPos getChunkPos(StructureStart internal){
        return internal.getChunkPos();
    }
    @ZenCodeType.Method
    public static int getReferences(StructureStart internal){
        return internal.getReferences();
    }
}
