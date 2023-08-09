package net.sixik.crafttweakersixikutils.integration.crafttweaker.Misc.world;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.level.LevelHeightAccessor;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sixikutils/utils/world/LevelHeightAccessor")
@NativeTypeRegistration(value = LevelHeightAccessor.class, zenCodeName = "mods.sixikutils.api.misc.world.LevelHeightAccessor")
public class ExpandLevelHeightAccessor {

    @ZenCodeType.Method
    public static int getHeight(LevelHeightAccessor internal){
        return internal.getHeight();
    }
    @ZenCodeType.Method
    public static int getMaxBuildHeight(LevelHeightAccessor internal){
        return internal.getMaxBuildHeight();
    }
    @ZenCodeType.Method
    public static int getMinBuildHeight(LevelHeightAccessor internal){
        return internal.getMinBuildHeight();
    }
    @ZenCodeType.Method
    public static int getMaxSection(LevelHeightAccessor internal){
        return internal.getMaxSection();
    }
    @ZenCodeType.Method
    public static int getSectionsCount(LevelHeightAccessor internal){
        return internal.getSectionsCount();
    }
    @ZenCodeType.Method
    public static int getSectionIndexFromSectionY(LevelHeightAccessor internal, int index){
        return internal.getSectionIndexFromSectionY(index);
    }
    @ZenCodeType.Method
    public static int getSectionYFromSectionIndex(LevelHeightAccessor internal, int index){
        return internal.getSectionYFromSectionIndex(index);
    }
    @ZenCodeType.Method
    public static int getSectionIndex(LevelHeightAccessor internal, int index){
        return internal.getSectionIndex(index);
    }
}
