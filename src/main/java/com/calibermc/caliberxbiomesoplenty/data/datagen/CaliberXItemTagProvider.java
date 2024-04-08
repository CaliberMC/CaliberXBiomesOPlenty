package com.calibermc.caliberxbiomesoplenty.data.datagen;

import com.calibermc.caliberlib.data.datagen.ModItemTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class CaliberXItemTagProvider extends ModItemTagProvider {
    public CaliberXItemTagProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pLookupProvider,
                                   CompletableFuture<TagLookup<Block>> pBlockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(pOutput, pLookupProvider, pBlockTags, "biomesoplenty", existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {

        super.addTags(pProvider);

    }
}

