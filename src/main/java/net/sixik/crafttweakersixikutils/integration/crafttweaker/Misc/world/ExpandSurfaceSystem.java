package net.sixik.crafttweakersixikutils.integration.crafttweaker.Misc.world;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.level.levelgen.SurfaceSystem;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sixikutils/utils/world/SurfaceSystem")
@NativeTypeRegistration(value = SurfaceSystem.class, zenCodeName = "mods.sixikutils.api.misc.world.SurfaceSystem")
public class ExpandSurfaceSystem {

    @ZenCodeType.Method
    public static String toString(SurfaceSystem internal){
        return internal.toString();
    }
}
