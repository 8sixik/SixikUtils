package net.sixik.crafttweakersixikutils.integration.crafttweaker.Game;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import net.minecraft.server.MinecraftServer;
import net.minecraftforge.server.ServerLifecycleHooks;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sixikutils/utils/game/Utils")
@ZenCodeType.Name("mods.sixikutils.misc.Utils")
public class Utils {

    @ZenCodeType.Method
    public static MinecraftServer getServer(){
        return ServerLifecycleHooks.getCurrentServer();
    }
}
