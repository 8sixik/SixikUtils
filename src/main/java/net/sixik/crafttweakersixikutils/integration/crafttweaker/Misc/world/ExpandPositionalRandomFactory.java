package net.sixik.crafttweakersixikutils.integration.crafttweaker.Misc.world;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.levelgen.PositionalRandomFactory;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sixikutils/utils/world/PositionalRandomFactory")
@NativeTypeRegistration(value = PositionalRandomFactory.class, zenCodeName = "mods.sixikutils.api.misc.world.PositionalRandomFactory")
public class ExpandPositionalRandomFactory {

    @ZenCodeType.Method
    public static RandomSource at(PositionalRandomFactory internal, BlockPos pos){
        return internal.at(pos);
    }

    @ZenCodeType.Method
    public static RandomSource fromHashOf(PositionalRandomFactory internal, ResourceLocation rs){
        return internal.fromHashOf(rs);
    }
    @ZenCodeType.Method
    public static RandomSource fromHashOf(PositionalRandomFactory internal, String rs){
        return internal.fromHashOf(rs);
    }
    @ZenCodeType.Method
    public static String toString(PositionalRandomFactory internal){
        return internal.toString();
    }
}
