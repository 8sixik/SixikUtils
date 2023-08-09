package net.sixik.crafttweakersixikutils.integration.crafttweaker.Entity.type.player.inventory;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker.api.item.IItemStack;
import com.blamejared.crafttweaker.api.item.MCItemStack;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.blamejared.crafttweaker_annotations.annotations.TypedExpansion;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.block.entity.BlockEntity;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sixikutils/utils/entity/type/player/inventory/ExpandInventory")
@NativeTypeRegistration(value = Inventory.class, zenCodeName = "crafttweaker.api.entity.type.player.Inventory")
@ZenCodeType.Expansion("crafttweaker.api.entity.type.player.Inventory")
@TypedExpansion(Inventory.class)
public class ExpandPlayerInventory extends Inventory{

    public ExpandPlayerInventory(Player p_35983_) {
        super(p_35983_);
    }

    @ZenCodeType.Method
    public static int getItemSlot(Inventory inventory, IItemStack item){
        for(int i = 0; i < inventory.getContainerSize(); i++){
            if(inventory.getItem(i).equals(item.getInternal())){
                return i;
            }
        }
        return -1;
    }
    @ZenCodeType.Method
    public static boolean isArmor(Inventory inventory, int slot, IItemStack item){
        if(inventory.armor.get(slot) == item.getInternal()) return true;
        else return false;
    }
    @ZenCodeType.Method
    public static void setArrmor(Inventory inventory, int slot, IItemStack item){
        inventory.armor.set(slot, item.getInternal());
    }

    /** Allows you to get the index of the slot that the player has now selected.
     *
     * @return Selected Index
     */
    @ZenCodeType.Method
    public static int getSelectedIndex(Inventory inventory){
        return inventory.selected;
    }

}