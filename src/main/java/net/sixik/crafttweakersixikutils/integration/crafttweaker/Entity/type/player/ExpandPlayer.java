package net.sixik.crafttweakersixikutils.integration.crafttweaker.Entity.type.player;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.client.Camera;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.PlayerEnderChestContainer;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;

import org.openzen.zencode.java.ZenCodeType;

import java.util.HashMap;
import java.util.Map;

@ZenRegister
@Document("mods/sixikutils/utils/entity/type/player/ExpandPlayer")
@NativeTypeRegistration(value = Player.class, zenCodeName = "crafttweaker.api.entity.type.player.Player")
@ZenCodeType.Expansion("crafttweaker.api.entity.type.player.Player")
public class ExpandPlayer{


    @ZenCodeType.Method
    public static boolean isShiftKeyDown(Player player) {
        return player.isShiftKeyDown();
    }


    @ZenCodeType.Method
    public static float getExperienceProgress(Player player) {
        return player.experienceProgress;
    }



    @ZenCodeType.Method
    @ZenCodeType.Getter("xrot")
    public static float getxRot(Player player) {
        return player.xRotO;
    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("yrot")
    public static float getyRot(Player player) {
        return player.yRotO;
    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("headrot")
    public static float getyHeadRot(Player player) {
        return player.yHeadRot;
    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("bodyrot")
    public static float getyBodyRot(Player player) {
        return player.yBodyRot;
    }

    @ZenCodeType.Method
    @ZenCodeType.Setter("xrot")
    public static void setxRot(Player player, float rot) {
        player.xRotO = rot;
    }

    @ZenCodeType.Method
    @ZenCodeType.Setter("yrot")
    public static void setyRot(Player player, float yaw) {
        player.yRotO = yaw;
    }
    @ZenCodeType.Method
    @ZenCodeType.Setter("headrot")
    public static void setyHeadRot(Player player, float yaw) {
        player.yHeadRot = yaw;
    }
    @ZenCodeType.Method
    @ZenCodeType.Setter("yHeadRotO")
    public static void setyHeadRotO(Player player, float yaw) {
        player.yHeadRotO = yaw;
    }
    @ZenCodeType.Method
    @ZenCodeType.Setter("bodyrot")
    public static void setyBodyRot(Player player, float yaw) {
        player.yBodyRot = yaw;
    }
    @ZenCodeType.Method
    @ZenCodeType.Setter("yBodyRotO")
    public static void setyBodyRotO(Player player, float yaw) {
        player.yBodyRotO = yaw;
    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("enderChest")
    public static PlayerEnderChestContainer getEnderChestInventory(Player player) {
        return player.getEnderChestInventory();
    }

    @ZenCodeType.Method
    public static BlockPos getRespawnPosition(Player player) {
        BlockPos playerPos = new BlockPos(0, 0, 0);
        if (player instanceof ServerPlayer) {
            ServerPlayer Splayer = (ServerPlayer) player;
            try {
                if (Splayer.getRespawnPosition() != null) {
                    playerPos = Splayer.getRespawnPosition();
                    return playerPos;
                } else {
                    playerPos = new BlockPos(-1, -1, -1);
                    return playerPos;
                }
            } catch (java.lang.NullPointerException e) {
                return new BlockPos(-1, -1, -1);
            }
        } else return new BlockPos(-1, -1, -1);
    }

    @ZenCodeType.Method
    public static ResourceLocation getRespawnDimension(Player player) {
        if (player instanceof ServerPlayer) {
            ServerPlayer Splayer = (ServerPlayer) player;
            return Splayer.getRespawnDimension().registry();
        }
        return null;
    }

    @ZenCodeType.Method
    public static float getRespawnAngle(Player player) {
        if (player instanceof ServerPlayer) {
            ServerPlayer Splayer = (ServerPlayer) player;
            return Splayer.getRespawnAngle();
        }
        return -1.0f;
    }

    @ZenCodeType.Method
    public static long getLastActionTime(Player player) {
        if (player instanceof ServerPlayer) {
            ServerPlayer Splayer = (ServerPlayer) player;
            return Splayer.getLastActionTime();
        }
        return -1;
    }

    @ZenCodeType.Method
    public static boolean isRespawnForced(Player player) {
        if (player instanceof ServerPlayer) {
            ServerPlayer Splayer = (ServerPlayer) player;
            return Splayer.isRespawnForced();
        }
        return false;
    }



    @ZenCodeType.Method
    public static void setRespawnPosition(Player player, ResourceLocation res, BlockPos pos, float respawnAngle, boolean respawnForced, boolean flag) {
        if (player instanceof ServerPlayer) {
            ServerPlayer Splayer = (ServerPlayer) player;
            ResourceKey<Level> world = ResourceKey.create(Registry.DIMENSION_REGISTRY, res);
            Splayer.setRespawnPosition(world, pos, respawnAngle, respawnForced, flag);
        } else return;
    }

    @ZenCodeType.Method
    public static void changeDimension(Player player, ResourceLocation res, boolean t) {
        ServerPlayer sPlayer = (ServerPlayer) player;
        ServerLevel serverlevel = (sPlayer.getLevel()).getServer().getLevel((ResourceKey.create(Registry.DIMENSION_REGISTRY, res)));
        if (serverlevel != null) {
            if (t) {
                player.changeDimension(serverlevel, serverlevel.getPortalForcer());
            } else {
                player.changeDimension(serverlevel);
            }
        }
//            player.changeDimension(player.getServer().getLevel(ResourceKey.create(Registry.DIMENSION_REGISTRY, res)));
    }

    @ZenCodeType.Method
    public static void playerDropItemIndex(Player player, int i, boolean t) {
        if (player.level.isClientSide()) return;
        player.drop(player.getInventory().getItem(i), t);
        player.getInventory().setItem(i, new ItemStack(Items.AIR));
    }

    @ZenCodeType.Method
    public static void randomTeleport(Player player, BlockPos pos, boolean flag) {
        player.randomTeleport(pos.getX(), pos.getY(), pos.getZ(), flag);
    }

//    public static void changeDimension(Player player, BlockPos pos, boolean flag){
//        player.changeDimension();
//    }

    @ZenCodeType.Method
    public static Camera getClient(Player player){
        if(player == Minecraft.getInstance().cameraEntity){
            return Minecraft.getInstance().getEntityRenderDispatcher().camera;
        }

        return null;
    }

    @ZenCodeType.Method
    public static ExpandStatsCounter getStatisticsManager(Player player) {
        if (player instanceof ServerPlayer sPlayer) {
            return new ExpandStatsCounter(sPlayer.getStats(), sPlayer);
        } else return null;
    }
}
