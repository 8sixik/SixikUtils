package net.sixik.crafttweakersixikutils.integration.crafttweaker.Misc.world;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.level.levelgen.DensityFunction;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sixikutils/utils/world/DensityFunction")
@NativeTypeRegistration(value = DensityFunction.class, zenCodeName = "mods.sixikutils.api.misc.world.DensityFunction")
public class ExpandDensityFunction {
    @ZenCodeType.Method
    public static DensityFunction abs(DensityFunction internal){
        return internal.abs();
    }
    @ZenCodeType.Method
    public static DensityFunction clamp(DensityFunction internal, double d1, double d2){
        return internal.clamp(d1, d2);
    }
    @ZenCodeType.Method
    public static DensityFunction square(DensityFunction internal){
        return internal.square();
    }
    @ZenCodeType.Method
    public static DensityFunction cube(DensityFunction internal){
        return internal.cube();
    }
    @ZenCodeType.Method
    public static DensityFunction halfNegative(DensityFunction internal){
        return internal.halfNegative();
    }
    @ZenCodeType.Method
    public static DensityFunction quarterNegative(DensityFunction internal){
        return internal.quarterNegative();
    }
    @ZenCodeType.Method
    public static double minValue(DensityFunction internal){
        return internal.minValue();
    }
    @ZenCodeType.Method
    public static double maxValue(DensityFunction internal){
        return internal.maxValue();
    }
}
