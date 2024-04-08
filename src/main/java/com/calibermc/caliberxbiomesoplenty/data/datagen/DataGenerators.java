package com.calibermc.caliberxbiomesoplenty.data.datagen;

import com.calibermc.caliberxbiomesoplenty.block.BiomesOPlentyBlocks;
import com.calibermc.caliberxbiomesoplenty.data.datagen.loot.CaliberXBlockLootTables;
import com.calibermc.caliberxbiomesoplenty.data.datagen.recipes.CaliberXRecipeProvider;
import com.calibermc.caliberxbiomesoplenty.data.datagen.recipes.ItemRecipeProvider;
import com.calibermc.caliberxbiomesoplenty.data.datagen.recipes.MiscRecipeProvider;
import com.calibermc.caliberxbiomesoplenty.util.compat.ModCompats;
import com.calibermc.caliberlib.data.datagen.ModBlockStateProvider;
import com.calibermc.caliberlib.data.datagen.ModItemModelProvider;
import com.calibermc.caliberlib.data.datagen.ModLootTableProvider;
import com.calibermc.caliberlib.data.datagen.loot.ModBlockLootTables;
import com.calibermc.caliberxbiomesoplenty.CaliberXBiomesOPlenty;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = CaliberXBiomesOPlenty.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
        boolean run = true;

        // BlockStates, Loot and Models
        generator.addProvider(event.includeClient(), new CaliberXBlockStateProvider(generator, existingFileHelper));
        generator.addProvider(event.includeClient(), new CaliberXItemModelProvider(generator, existingFileHelper));
        generator.addProvider(event.includeServer(), new ModLootTableProvider(generator, CaliberXBlockLootTables::new));
        // Recipes
        generator.addProvider(event.includeServer(), new CaliberXRecipeProvider(generator));
        generator.addProvider(event.includeServer(), new MiscRecipeProvider(generator));
        generator.addProvider(event.includeServer(), new ItemRecipeProvider(generator));

        // Tags
        CaliberXBlockTagProvider blockTagGenerator = generator.addProvider(event.includeServer(), new CaliberXBlockTagProvider(packOutput, lookupProvider, existingFileHelper));
        generator.addProvider(event.includeServer(), new CaliberXItemTagProvider(packOutput, lookupProvider, blockTagGenerator.contentsGetter(), existingFileHelper));

        if (ModCompats.BOP) {
            generator.addProvider(event.includeClient(), new ModBlockStateProvider(generator, "biomesoplenty", existingFileHelper));
            generator.addProvider(event.includeClient(), new ModItemModelProvider(generator, "biomesoplenty", existingFileHelper));
            generator.addProvider(event.includeServer(), new ModLootTableProvider(generator, () -> new ModBlockLootTables("biomesoplenty") {
                @Override
                protected Iterable<Block> getKnownBlocks() {
                    return BiomesOPlentyBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
                }
            }));
        }
    }
}
