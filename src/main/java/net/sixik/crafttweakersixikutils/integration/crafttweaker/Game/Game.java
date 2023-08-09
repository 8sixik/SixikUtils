package net.sixik.crafttweakersixikutils.integration.crafttweaker.Game;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import net.minecraft.client.Minecraft;
import org.openzen.zencode.java.ZenCodeType;

import java.util.Date;

@ZenRegister
@Document("mods/sixikutils/utils/game/Game")
@ZenCodeType.Name("mods.crafttweakerutils.game.Game")
public class Game {

    /**
     * @return The selected language of the player RU/EN/UA/...
     */
    @ZenCodeType.Method
    public static String getLang(){
        return Minecraft.getInstance().getLocale().getLanguage();
    }

    /**
     * @return The selected language of the player ru_RU/en_EN/ua_UA/...
     */
    @ZenCodeType.Method
    public static String getLanguageTag(){
        return Minecraft.getInstance().getLocale().toLanguageTag();
    }

    /**
     * @return Full real time HH:mm:ss
     */
    @ZenCodeType.Method
    public static long getTime(){
        Date date1 = new Date();
        return date1.getTime();
    }

    /**
     * @return Full real date yyyy/MM/dd
     */
    @ZenCodeType.Method
    public static int getDate(){
        Date date1 = new Date();
        return date1.getDate();
    }

    /**
     * @return Real Day
     */
    @ZenCodeType.Method
    public static int getDay(){
        Date date1 = new Date();
        return date1.getDay();
    }

    /**
     * @return Real Hours
     */
    @ZenCodeType.Method
    public static int getHours(){
        Date date1 = new Date();
        return date1.getHours();
    }

    /**
     * @return Real Minutes
     */
    @ZenCodeType.Method
    public static int getMinutes(){
        Date date1 = new Date();
        return date1.getMinutes();
    }

    /**
     * @return Real Seconds
     */
    @ZenCodeType.Method
    public static int getSeconds(){
        Date date1 = new Date();
        return date1.getSeconds();
    }

    /**
     * @return Real Month
     */
    @ZenCodeType.Method
    public static int getMonth(){
        Date date1 = new Date();
        return date1.getMonth();
    }

    /**
     * @return Real Year
     */
    @ZenCodeType.Method
    public static int getYear(){
        Date date1 = new Date();
        return date1.getYear();
    }

    /**
     * @return Real TimezoneOffset
     */
    @ZenCodeType.Method
    public static int getTimezoneOffset(){
        Date date1 = new Date();
        return date1.getTimezoneOffset();
    }
}
