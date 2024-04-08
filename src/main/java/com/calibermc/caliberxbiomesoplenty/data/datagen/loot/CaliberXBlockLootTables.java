package com.calibermc.caliberxbiomesoplenty.data.datagen.loot;

import com.calibermc.caliberlib.block.shapes.doors.TallDoorPart;
import com.calibermc.caliberlib.data.datagen.loot.ModBlockLootTables;
import com.calibermc.caliberxbiomesoplenty.CaliberXBiomesOPlenty;
import com.calibermc.caliberxbiomesoplenty.block.BiomesOPlentyBlocks;

public class CaliberXBlockLootTables extends ModBlockLootTables {
    public CaliberXBlockLootTables() {
        super(CaliberXBiomesOPlenty.MOD_ID);
    }

    @Override
    protected void generate() {
        tallDoors();
        super.generate();
    }

    private void tallDoors() {
//        this.add(BiomesOPlentyBlocks.STAINED_ACACIA_TALL_DOOR.get(), (block) -> createSinglePropConditionTable(NCBlocks.STAINED_ACACIA_TALL_DOOR.get(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM));
//        this.add(BiomesOPlentyBlocks.STAINED_BIRCH_TALL_DOOR.get(), (block) -> createSinglePropConditionTable(NCBlocks.STAINED_BIRCH_TALL_DOOR.get(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM));
//        this.add(BiomesOPlentyBlocks.STAINED_DARK_OAK_TALL_DOOR.get(), (block) -> createSinglePropConditionTable(NCBlocks.STAINED_DARK_OAK_TALL_DOOR.get(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM));
//        this.add(BiomesOPlentyBlocks.STAINED_JUNGLE_TALL_DOOR.get(), (block) -> createSinglePropConditionTable(NCBlocks.STAINED_JUNGLE_TALL_DOOR.get(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM));
//        this.add(BiomesOPlentyBlocks.STAINED_OAK_TALL_DOOR.get(), (block) -> createSinglePropConditionTable(NCBlocks.STAINED_OAK_TALL_DOOR.get(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM));
//        this.add(BiomesOPlentyBlocks.STAINED_SPRUCE_TALL_DOOR.get(), (block) -> createSinglePropConditionTable(NCBlocks.STAINED_SPRUCE_TALL_DOOR.get(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM));
    }
}