package com.calibermc.caliberxbiomesoplenty.util.compat;

import com.calibermc.buildify.util.BlockPickerStatesJson;
import com.calibermc.caliberlib.data.ModBlockFamily;
import com.calibermc.caliberxbiomesoplenty.data.BiomesOPlentyBlockFamilies;

import java.util.ArrayList;

public class BuildifyBlockPicker {

    public static void init() {
        for (ModBlockFamily modBlockFamily : BiomesOPlentyBlockFamilies.getAllFamilies().toList()) {
            BlockPickerStatesJson.registerBlockFamily(modBlockFamily.getBaseBlock(), () ->
                    new ArrayList<>(modBlockFamily.getVariants().entrySet().stream()
                            .filter(p -> !p.getKey().equals(ModBlockFamily.Variant.WALL_SIGN))
                            .filter(p -> !p.getKey().equals(ModBlockFamily.Variant.WALL_HANGING_SIGN))
                            .map(p -> p.getValue().asItem().getDefaultInstance()).toList()));
        }
    }
}

