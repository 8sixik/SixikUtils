package net.sixik.crafttweakersixikutils;


import com.mojang.logging.LogUtils;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Crafttweakersixikutils.MODID)
public class Crafttweakersixikutils {

    public static final String MODID = "crafttweakersixikutils";
    public Crafttweakersixikutils() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();



        MinecraftForge.EVENT_BUS.register(this);

    }


}
