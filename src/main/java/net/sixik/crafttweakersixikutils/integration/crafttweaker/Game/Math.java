package net.sixik.crafttweakersixikutils.integration.crafttweaker.Game;

import com.blamejared.crafttweaker.api.CraftTweakerAPI;
import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sixikutils/utils/game/Math")
@ZenCodeType.Name("mods.sixikutils.misc.Math")
public class Math {

    @ZenCodeType.Method
    public double getPercent(double num, int percent, int type){
        switch (type) {
            case 1 -> {
                String t = null;
                if (percent < 10) {
                    t = ("0.0" + percent);
                } else t = ("0." + percent);
                return num * Double.parseDouble(t);
            }
            case 2 -> {
                return num * percent / 100;
            }
            case 3 -> {
                return num / 100 * percent;
            }
            default -> {
                CraftTweakerAPI.LOGGER.error("(getPercent) -> Not Found Type");
                return -1;
            }
        }
    }

    @ZenCodeType.Method
    public static double getPercentageRatio(double num1, double num2, boolean rounding){
        if(rounding){
            return (double) (int) num1/num2 * 100;
        }
        else return num1/num2 * 100;
    }
}
