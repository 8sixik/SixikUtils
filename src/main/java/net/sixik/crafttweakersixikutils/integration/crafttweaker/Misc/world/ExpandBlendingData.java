package net.sixik.crafttweakersixikutils.integration.crafttweaker.Misc.world;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.level.LevelHeightAccessor;
import net.minecraft.world.level.levelgen.blending.BlendingData;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sixikutils/utils/world/BlendingData")
@NativeTypeRegistration(value = BlendingData.class, zenCodeName = "mods.sixikutils.api.misc.world.BlendingData")
public class ExpandBlendingData {

    @ZenCodeType.Method
    public static LevelHeightAccessor getAreaWithOldGeneration(BlendingData internal){
        return internal.getAreaWithOldGeneration();
    }
}
