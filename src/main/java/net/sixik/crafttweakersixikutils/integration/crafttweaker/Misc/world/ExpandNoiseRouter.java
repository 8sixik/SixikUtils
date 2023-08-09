package net.sixik.crafttweakersixikutils.integration.crafttweaker.Misc.world;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.level.levelgen.DensityFunction;
import net.minecraft.world.level.levelgen.NoiseRouter;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sixikutils/utils/world/NoiseRouter")
@NativeTypeRegistration(value = NoiseRouter.class, zenCodeName = "mods.sixikutils.api.misc.world.NoiseRouter")
public class ExpandNoiseRouter {

    @ZenCodeType.Method
    public static String toString(NoiseRouter internal){
        return internal.toString();
    }
    @ZenCodeType.Method
    public static DensityFunction barrierNoise(NoiseRouter internal){
        return internal.barrierNoise();
    }
    @ZenCodeType.Method
    public static DensityFunction lavaNoise(NoiseRouter internal){
        return internal.lavaNoise();
    }
    @ZenCodeType.Method
    public static DensityFunction continents(NoiseRouter internal){
        return internal.continents();
    }
    @ZenCodeType.Method
    public static DensityFunction depth(NoiseRouter internal){
        return internal.depth();
    }
    @ZenCodeType.Method
    public static DensityFunction erosion(NoiseRouter internal){
        return internal.erosion();
    }
    @ZenCodeType.Method
    public static DensityFunction finalDensity(NoiseRouter internal){
        return internal.finalDensity();
    }
    @ZenCodeType.Method
    public static DensityFunction fluidLevelFloodednessNoise(NoiseRouter internal){
        return internal.fluidLevelFloodednessNoise();
    }
    @ZenCodeType.Method
    public static DensityFunction fluidLevelSpreadNoise(NoiseRouter internal){
        return internal.fluidLevelSpreadNoise();
    }
    @ZenCodeType.Method
    public static DensityFunction initialDensityWithoutJaggedness(NoiseRouter internal){
        return internal.initialDensityWithoutJaggedness();
    }
    @ZenCodeType.Method
    public static DensityFunction ridges(NoiseRouter internal){
        return internal.ridges();
    }
    @ZenCodeType.Method
    public static DensityFunction temperature(NoiseRouter internal){
        return internal.temperature();
    }
    @ZenCodeType.Method
    public static DensityFunction vegetation(NoiseRouter internal){
        return internal.vegetation();
    }
    @ZenCodeType.Method
    public static DensityFunction veinGap(NoiseRouter internal){
        return internal.veinGap();
    }
    @ZenCodeType.Method
    public static DensityFunction veinRidged(NoiseRouter internal){
        return internal.veinRidged();
    }
    @ZenCodeType.Method
    public static DensityFunction veinToggle(NoiseRouter internal){
        return internal.veinToggle();
    }
}
