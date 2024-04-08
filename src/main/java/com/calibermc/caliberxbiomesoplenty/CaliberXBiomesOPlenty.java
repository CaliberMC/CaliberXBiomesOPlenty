package com.calibermc.caliberxbiomesoplenty;

import com.calibermc.caliber.crafting.CaliberRecipeSerializers;
import com.calibermc.caliberxbiomesoplenty.block.BiomesOPlentyBlocks;
import com.calibermc.caliberxbiomesoplenty.item.BiomesOPlentyItems;
import com.calibermc.caliberxbiomesoplenty.item.CreativeTabs;
import com.calibermc.caliberxbiomesoplenty.util.compat.BuildifyBlockPicker;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(CaliberXBiomesOPlenty.MOD_ID)
public class CaliberXBiomesOPlenty {
    public static final String MOD_ID = "caliberxbiomesoplenty";

    public static final Logger LOGGER = LogManager.getLogger();

    public CaliberXBiomesOPlenty() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        BiomesOPlentyItems.register(eventBus);
        BiomesOPlentyBlocks.register(eventBus);

        CreativeTabs.register(eventBus);

        eventBus.addListener(this::setup);

//        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, CaliberXClientConfigs.SPEC, "caliberxbiomeoplenty-client.toml");
//        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, CaliberXCommonConfigs.SPEC, "caliberxbiomeoplenty-common.toml");

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        LOGGER.info("Loading Caliber x Biomes O' Plenty");

        BiomesOPlentyBlocks.printBlockCounts();
        BuildifyBlockPicker.init();
    }


}
