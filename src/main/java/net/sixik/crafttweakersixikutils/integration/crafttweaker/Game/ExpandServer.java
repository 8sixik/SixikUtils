package net.sixik.crafttweakersixikutils.integration.crafttweaker.Game;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.blamejared.crafttweaker_annotations.annotations.TypedExpansion;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sixikutils/utils/game/ExpandServer")
@NativeTypeRegistration(value = MinecraftServer.class, zenCodeName = "crafttweaker.api.game.Server")
@TypedExpansion(MinecraftServer.class)
public class ExpandServer {

    /**
     * Allows you to get the owner of the server if the server is started from the world. That is, it was open to the network
     */
    @ZenCodeType.Method
    @ZenCodeType.Getter("ownerPlayer")
    public static Player getOwnerPlayer(MinecraftServer event){
        for(Player player : event.getPlayerList().getPlayers()){
            if(event.isSingleplayerOwner(player.getGameProfile())){
                return player;
            }
        }

        return null;
    }

}
