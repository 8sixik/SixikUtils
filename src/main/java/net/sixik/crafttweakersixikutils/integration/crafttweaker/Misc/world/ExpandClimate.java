package net.sixik.crafttweakersixikutils.integration.crafttweaker.Misc.world;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.levelgen.DensityFunction;
import org.openzen.zencode.java.ZenCodeType;

import java.util.List;

@ZenRegister
@Document("mods/sixikutils/utils/world/Climate")
@NativeTypeRegistration(value = Climate.class, zenCodeName = "mods.sixikutils.api.misc.world.Climate")
public class ExpandClimate {

    @ZenRegister
    @Document("mods/sixikutils/utils/world/ClimateSampler")
    @NativeTypeRegistration(value = Climate.Sampler.class, zenCodeName = "mods.sixikutils.api.misc.world.ClimateSampler")
    public static class ExpandSampler extends Climate{

        @ZenCodeType.Method
        public static DensityFunction getContinentalness(Climate.Sampler internal){
            return internal.continentalness();
        }
        @ZenCodeType.Method
        public static DensityFunction getDepth(Climate.Sampler internal){
            return internal.depth();
        }
        @ZenCodeType.Method
        public static DensityFunction getTemperature(Climate.Sampler internal){
            return internal.temperature();
        }
        @ZenCodeType.Method
        public static DensityFunction getErosion(Climate.Sampler internal){
            return internal.erosion();
        }
        @ZenCodeType.Method
        public static DensityFunction getWeirdness(Climate.Sampler internal){
            return internal.weirdness();
        }
        @ZenCodeType.Method
        public static DensityFunction getHumidity(Climate.Sampler internal){
            return internal.humidity();
        }
        @ZenCodeType.Method
        public static BlockPos findSpawnPosition(Climate.Sampler internal){
            return internal.findSpawnPosition();
        }
        @ZenCodeType.Method
        public static List<Climate.ParameterPoint> spawnTarget(Climate.Sampler internal){
            return internal.spawnTarget();
        }
    }

    @ZenRegister
    @Document("mods/sixikutils/utils/world/ClimateParameterPoint")
    @NativeTypeRegistration(value = Climate.ParameterPoint.class, zenCodeName = "mods.sixikutils.api.misc.world.ClimateParameterPoint")
    public static class ExpandParameterPoint extends Climate{

        @ZenCodeType.Method
        public static long offset(Climate.ParameterPoint internal){
            return internal.offset();
        }

        @ZenCodeType.Method
        public static Climate.Parameter getContinentalness(Climate.ParameterPoint internal){
            return internal.continentalness();
        }
        @ZenCodeType.Method
        public static Climate.Parameter getDepth(Climate.ParameterPoint internal){
            return internal.depth();
        }
        @ZenCodeType.Method
        public static Climate.Parameter getTemperature(Climate.ParameterPoint internal){
            return internal.temperature();
        }
        @ZenCodeType.Method
        public static Climate.Parameter getErosion(Climate.ParameterPoint internal){
            return internal.erosion();
        }
        @ZenCodeType.Method
        public static Climate.Parameter getWeirdness(Climate.ParameterPoint internal){
            return internal.weirdness();
        }
        @ZenCodeType.Method
        public static Climate.Parameter getHumidity(Climate.ParameterPoint internal){
            return internal.humidity();
        }
    }
}
