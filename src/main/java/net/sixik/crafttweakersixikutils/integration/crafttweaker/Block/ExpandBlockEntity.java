package net.sixik.crafttweakersixikutils.integration.crafttweaker.Block;

import com.blamejared.crafttweaker.api.CraftTweakerAPI;
import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.blamejared.crafttweaker_annotations.annotations.TypedExpansion;
import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BaseContainerBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntity;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sixikutils/utils/block/ExpandBlockEntity")
@NativeTypeRegistration(value = BlockEntity.class, zenCodeName = "crafttweaker.api.block.entity.BlockEntity")
@TypedExpansion(BlockEntity.class)
public class ExpandBlockEntity {


    @ZenCodeType.Method
    public static boolean isHaveContainer(BlockEntity entity){
        if(entity != null){
            if(!onHaveContainer(entity)) return false;
            if(entity instanceof BaseContainerBlockEntity block){
                return true;
            }
        }
        return false;
    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("container")
    public static Container getContainer(BlockEntity entity){
        try {
            if(entity instanceof BaseContainerBlockEntity block){
                return block;
            }
        } catch (NullPointerException ct){
            CraftTweakerAPI.LOGGER.error("Cold not find Container on " + entity.getBlockState().getBlock().getName());
        }
        return null;
    }
    private static boolean onHaveContainer(BlockEntity blockEntity){
        if(blockEntity == null) return false;
        return blockEntity instanceof BaseContainerBlockEntity;
    }

    /** The same method as getContainerSize, only with a different execution logic. Use it if you have any problems
     *
     * @return Сontainer Size
     */
    @ZenCodeType.Method
    public static int testSixik(BlockEntity blockEntity){
        if(blockEntity instanceof BaseContainerBlockEntity baseContainer){
            Container container = (Container) baseContainer;
            return container.getContainerSize();
        }
        return -1;
    }
}
