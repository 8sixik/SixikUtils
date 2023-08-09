package net.sixik.crafttweakersixikutils.source.events.players;

import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.entity.player.PlayerEvent;

public class PlayerSendMessageEvent extends PlayerEvent {
    private String _message;
    public PlayerSendMessageEvent(Player player, String _message) {
        super(player);
        this._message = _message;
    }

    public String getMessage() {
        return _message;
    }
}
