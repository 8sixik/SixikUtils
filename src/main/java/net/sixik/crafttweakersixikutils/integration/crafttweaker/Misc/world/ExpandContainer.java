package net.sixik.crafttweakersixikutils.integration.crafttweaker.Misc.world;

import com.blamejared.crafttweaker.api.CraftTweakerAPI;
import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker.api.item.IItemStack;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.blamejared.crafttweaker_annotations.annotations.TypedExpansion;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.RandomizableContainerBlockEntity;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.LootTable;
import org.openzen.zencode.java.ZenCodeType;

import java.util.HashMap;
import java.util.Map;

@ZenRegister
@Document("mods/sixikutils/utils/world/ExpandContainer")
@NativeTypeRegistration(value = Container.class, zenCodeName = "crafttweaker.api.world.Container")
@ZenCodeType.Expansion("crafttweaker.api.world.Container")
@TypedExpansion(Container.class)
public class ExpandContainer {

    public static void set(Container container, Player player){
        container.stopOpen(player);

    }

    @ZenCodeType.Method
    public static boolean fill(Container container, Level level, ResourceLocation rs, LootContext context){
        try {
            LootTable lootTable = level.getServer().getLootTables().get(rs);
            lootTable.fill(container, context);
            return true;
        } catch (NullPointerException e){
            return false;
        }
    }

    /** Allows you to transfer items from one container to another
     * @param container - Container from which to transfer items
     * @param container2 - Container to transfer items to
     * @return True or False
     */
    @ZenCodeType.Method
    public static boolean splitContainer(Container container, Container container2){
        if(!container.isEmpty()){
            Map<Integer, ItemStack> itemsContainer1 = new HashMap<>();
            for(int i = 0; i < container.getContainerSize(); i++){
                itemsContainer1.put(i,container.getItem(i));
                container.setChanged();
            }
            for(int i = 0; i < container2.getContainerSize(); i++){
                if(i > container.getContainerSize()) return true;
                container2.setItem(i,itemsContainer1.get(i));
                container2.setChanged();
            }
            return true;
        }
        return false;
    }

    /** Allows you to transfer items from one container to another
     * @param container - Container from which to transfer items
     * @param container2 - Container to transfer items to
     * @param bool - If you need to remove items from a portable container
     * @return True or False
     */
    @ZenCodeType.Method
    public static boolean splitContainer(Container container, Container container2, boolean bool){
        if(!container.isEmpty()){
            Map<Integer, ItemStack> itemsContainer1 = new HashMap<>();
            for(int i = 0; i < container.getContainerSize(); i++){
                if(i > container.getContainerSize()) return true;
                itemsContainer1.put(i,container.getItem(i));
                if(bool){
                    container.setItem(i, Items.AIR.getDefaultInstance());
                    container.setChanged();
                }
            }
            for(int i = 0; i < container2.getContainerSize(); i++){
                container2.setItem(i,itemsContainer1.get(i));
                container2.setChanged();
            }
            return true;
        }
        return false;
    }
}
