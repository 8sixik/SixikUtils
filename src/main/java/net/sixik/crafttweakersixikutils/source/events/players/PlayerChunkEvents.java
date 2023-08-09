package net.sixik.crafttweakersixikutils.source.events.players;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.chunk.LevelChunk;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.Event;

public class PlayerChunkEvents {

    public static class PlayerBeforeLoadedChunkEvent extends PlayerEvent {
        private LevelChunk _chunkLevel;

        public PlayerBeforeLoadedChunkEvent(Player player, LevelChunk _chunkLevel) {
            super(player);
            this._chunkLevel = _chunkLevel;
        }

        public LevelChunk getLevelChunk() {
            return _chunkLevel;
        }
    }

    public static class PlayerAfterLoadedChunkEvent extends PlayerEvent{
        private LevelChunk _chunkLevel;
        public PlayerAfterLoadedChunkEvent(Player player, LevelChunk _chunkLevel) {
            super(player);
            this._chunkLevel = _chunkLevel;
        }
        public LevelChunk getLevelChunk() {
            return _chunkLevel;
        }
    }
}
