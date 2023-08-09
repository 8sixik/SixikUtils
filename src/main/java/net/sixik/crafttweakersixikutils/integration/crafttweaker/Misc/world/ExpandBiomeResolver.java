package net.sixik.crafttweakersixikutils.integration.crafttweaker.Misc.world;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.BiomeResolver;
import net.minecraft.world.level.biome.Climate;
import org.openzen.zencode.java.ZenCodeType;

import java.util.ArrayList;
import java.util.List;

@ZenRegister
@Document("mods/sixikutils/utils/world/BiomeResolver")
@NativeTypeRegistration(value = BiomeResolver.class, zenCodeName = "mods.sixikutils.api.misc.world.BiomeResolver")
public class ExpandBiomeResolver {

    @ZenCodeType.Method
    public static Biome getNoiseBiome(BiomeResolver internal, int x, int y, int z, Climate.Sampler sampler){
        return internal.getNoiseBiome(x,y,z,sampler).get();
    }
}
