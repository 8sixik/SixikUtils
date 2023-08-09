package net.sixik.crafttweakersixikutils.integration.crafttweaker.Misc.world;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.levelgen.NoiseRouter;
import net.minecraft.world.level.levelgen.PositionalRandomFactory;
import net.minecraft.world.level.levelgen.RandomState;
import net.minecraft.world.level.levelgen.SurfaceSystem;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sixikutils/utils/world/RandomState")
@NativeTypeRegistration(value = RandomState.class, zenCodeName = "mods.sixikutils.api.misc.world.RandomState")
public class ExpandRandomState {


    @ZenCodeType.Method
    public static PositionalRandomFactory aquiferRandom(RandomState internal){
        return internal.aquiferRandom();
    }
    @ZenCodeType.Method
    public static PositionalRandomFactory oreRandom(RandomState internal){
        return internal.oreRandom();
    }
    @ZenCodeType.Method
    public static PositionalRandomFactory getOrCreateRandomFactory(RandomState internal, ResourceLocation rs){
        return internal.getOrCreateRandomFactory(rs);
    }
    @ZenCodeType.Method
    public static long legacyLevelSeed(RandomState internal){
        return internal.legacyLevelSeed();
    }
    @ZenCodeType.Method
    public static NoiseRouter router(RandomState internal){
        return internal.router();
    }
    @ZenCodeType.Method
    public static Climate.Sampler sampler(RandomState internal){
        return internal.sampler();
    }
    @ZenCodeType.Method
    public static SurfaceSystem surfaceSystem(RandomState internal){
        return internal.surfaceSystem();
    }
}
