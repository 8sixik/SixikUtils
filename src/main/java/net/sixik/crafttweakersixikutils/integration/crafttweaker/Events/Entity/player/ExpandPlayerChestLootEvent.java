package net.sixik.crafttweakersixikutils.integration.crafttweaker.Events.Entity.player;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.storage.loot.LootContext;
import net.sixik.crafttweakersixikutils.source.events.players.PlayerChestLootEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sixikutils/utils/events/entity/player/PlayerChestLootEvent")
@NativeTypeRegistration(value = PlayerChestLootEvent.class, zenCodeName = "mods.sixikutils.api.events.entity.player.PlayerChestLootEvent")
public class ExpandPlayerChestLootEvent {

    @ZenCodeType.Method
    @ZenCodeType.Getter("player")
    public static Player getPlayer(PlayerChestLootEvent event){
        return event.getPlayer();
    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("pos")
    public static BlockPos getPos(PlayerChestLootEvent event){
        return event.getPos();
    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("inventory")
    public static Container getInventory(PlayerChestLootEvent event){
        return event.getInventory();
    }

    @ZenCodeType.Method
    public static ResourceLocation getQueriedLootTableId(PlayerChestLootEvent event){
      return event.getCtx().getQueriedLootTableId();
    }
    @ZenCodeType.Method
    public static LootContext getContext(PlayerChestLootEvent event){
      return event.getCtx();
    }
}
