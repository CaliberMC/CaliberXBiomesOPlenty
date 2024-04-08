package com.calibermc.caliberxbiomesoplenty.data.datagen;


import com.calibermc.caliberlib.data.datagen.ModBlockStateProvider;
import com.calibermc.caliberxbiomesoplenty.CaliberXBiomesOPlenty;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;

public class CaliberXBlockStateProvider extends ModBlockStateProvider {
    public CaliberXBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, CaliberXBiomesOPlenty.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        super.registerStatesAndModels();
    }

}
