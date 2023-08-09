package net.sixik.crafttweakersixikutils.integration.crafttweaker.Misc.world;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.StructureManager;
import net.minecraft.world.level.levelgen.structure.Structure;
import net.minecraft.world.level.levelgen.structure.StructureStart;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sixikutils/utils/world/StructureManager")
@NativeTypeRegistration(value = StructureManager.class, zenCodeName = "mods.sixikutils.api.misc.world.StructureManager")
public class ExpandStructureManager {

    @ZenCodeType.Method
    public static StructureStart getStructureAt(StructureManager internal, BlockPos pos, Structure structure){
        return internal.getStructureAt(pos, structure);
    }
    @ZenCodeType.Method
    public static StructureStart getStructureWithPieceAt(StructureManager internal, BlockPos pos, Structure structure){
        return internal.getStructureWithPieceAt(pos, structure);
    }

}
