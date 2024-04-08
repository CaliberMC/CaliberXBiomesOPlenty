package com.calibermc.caliberxbiomesoplenty.data.datagen;

import com.calibermc.caliberlib.data.datagen.ModBlockTagProvider;
import com.calibermc.caliberxbiomesoplenty.CaliberXBiomesOPlenty;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class CaliberXBlockTagProvider extends ModBlockTagProvider {
    public CaliberXBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, "biomesoplenty", existingFileHelper);
    }
    @Override
    protected void addTags(HolderLookup.Provider pProvider) {

        super.addTags(pProvider);

    }
}



