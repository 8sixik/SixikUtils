package net.sixik.crafttweakersixikutils.integration.crafttweaker.Misc.world;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.stats.ServerStatsCounter;
import net.minecraft.stats.Stats;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
//@Document("mods/sixikutils/utils/world/ServerStatsCounter")
@NativeTypeRegistration(value = ServerStatsCounter.class, zenCodeName = "mods.sixikutils.api.misc.world.ServerStatsCounter")
public class ExpandServerStatsCounter {

}
