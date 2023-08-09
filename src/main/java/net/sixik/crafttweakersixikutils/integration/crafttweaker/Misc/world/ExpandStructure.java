package net.sixik.crafttweakersixikutils.integration.crafttweaker.Misc.world;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.core.Holder;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.structure.Structure;
import org.openzen.zencode.java.ZenCodeType;

import java.util.ArrayList;
import java.util.List;

@ZenRegister
@Document("mods/sixikutils/utils/world/Structure")
@NativeTypeRegistration(value = Structure.class, zenCodeName = "mods.sixikutils.api.misc.world.Structure")
public class ExpandStructure {

    @ZenCodeType.Method
    public static List<Biome> getBiomes(Structure internal){
        List<Biome> biomes = new ArrayList<>();
        for (Holder<Biome> biome : internal.biomes()){
            biomes.add(biome.get());
        }
        return biomes;
    }
    @ZenCodeType.Method
    public static String toString(Structure internal){
        return internal.toString();
    }
}
