package com.calibermc.caliberxbiomesoplenty.data;

import biomesoplenty.api.block.BOPBlocks;
import com.calibermc.caliberlib.data.ModBlockFamily;
import com.calibermc.caliberxbiomesoplenty.block.BiomesOPlentyBlocks;
import com.google.common.collect.Maps;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Map;
import java.util.stream.Stream;

public class BiomesOPlentyBlockFamilies {
    private static final Map<Block, ModBlockFamily> MAP = Maps.newHashMap();


    /* Stone */
    public static final ModBlockFamily BLACK_SANDSTONE = familyBuilder(BOPBlocks.BLACK_SANDSTONE.get())
            .fromManager(BiomesOPlentyBlocks.BLACK_SANDSTONE)
            .slab(BOPBlocks.BLACK_SANDSTONE_SLAB.get())
            .stairs(BOPBlocks.BLACK_SANDSTONE_STAIRS.get())
            .wall(BOPBlocks.BLACK_SANDSTONE_WALL.get())
            .getFamily();

    public static final ModBlockFamily BRIMSTONE = familyBuilder(BOPBlocks.BRIMSTONE.get())
            .fromManager(BiomesOPlentyBlocks.BRIMSTONE)
            .getFamily();

    public static final ModBlockFamily BRIMSTONE_BRICKS = familyBuilder(BOPBlocks.BRIMSTONE_BRICKS.get())
            .fromManager(BiomesOPlentyBlocks.BRIMSTONE_BRICK)
            .slab(BOPBlocks.BRIMSTONE_BRICK_SLAB.get())
            .stairs(BOPBlocks.BRIMSTONE_BRICK_STAIRS.get())
            .wall(BOPBlocks.BRIMSTONE_BRICK_WALL.get())
            .getFamily();

    public static final ModBlockFamily CHISELED_BLACK_SANDSTONE = familyBuilder(BOPBlocks.CHISELED_BLACK_SANDSTONE.get())
            .fromManager(BiomesOPlentyBlocks.CHISELED_BLACK_SANDSTONE)
            .getFamily();

    public static final ModBlockFamily CHISELED_BRIMSTONE_BRICKS = familyBuilder(BOPBlocks.CHISELED_BRIMSTONE_BRICKS.get())
            .fromManager(BiomesOPlentyBlocks.CHISELED_BRIMSTONE_BRICK)
            .getFamily();

    public static final ModBlockFamily CHISELED_ORANGE_SANDSTONE = familyBuilder(BOPBlocks.CHISELED_ORANGE_SANDSTONE.get())
            .fromManager(BiomesOPlentyBlocks.CHISELED_ORANGE_SANDSTONE)
            .getFamily();

    public static final ModBlockFamily CHISELED_WHITE_SANDSTONE = familyBuilder(BOPBlocks.CHISELED_WHITE_SANDSTONE.get())
            .fromManager(BiomesOPlentyBlocks.CHISELED_WHITE_SANDSTONE)
            .getFamily();

    public static final ModBlockFamily CUT_BLACK_SANDSTONE = familyBuilder(BOPBlocks.CUT_BLACK_SANDSTONE.get())
            .fromManager(BiomesOPlentyBlocks.CUT_BLACK_SANDSTONE)
            .slab(BOPBlocks.CUT_BLACK_SANDSTONE_SLAB.get())
            .getFamily();

    public static final ModBlockFamily CUT_ORANGE_SANDSTONE = familyBuilder(BOPBlocks.CUT_ORANGE_SANDSTONE.get())
            .fromManager(BiomesOPlentyBlocks.CUT_ORANGE_SANDSTONE)
            .slab(BOPBlocks.CUT_ORANGE_SANDSTONE_SLAB.get())
            .getFamily();

    public static final ModBlockFamily CUT_WHITE_SANDSTONE = familyBuilder(BOPBlocks.CUT_WHITE_SANDSTONE.get())
            .fromManager(BiomesOPlentyBlocks.CUT_WHITE_SANDSTONE)
            .slab(BOPBlocks.CUT_WHITE_SANDSTONE_SLAB.get())
            .getFamily();

    /* Planks */
    public static final ModBlockFamily DEAD_PLANKS = familyBuilder(BOPBlocks.DEAD_PLANKS.get())
            .fromManager(BiomesOPlentyBlocks.DEAD)
            .button(BOPBlocks.DEAD_BUTTON.get())
            .door(BOPBlocks.DEAD_DOOR.get())
            .fence(BOPBlocks.DEAD_FENCE.get())
            .fenceGate(BOPBlocks.DEAD_FENCE_GATE.get())
            .pressurePlate(BOPBlocks.DEAD_PRESSURE_PLATE.get())
            .sign(BOPBlocks.DEAD_SIGN.get(), BOPBlocks.DEAD_WALL_SIGN.get())
            .stairs(BOPBlocks.DEAD_STAIRS.get())
            .trapdoor(BOPBlocks.DEAD_TRAPDOOR.get())
            .fromManager(BiomesOPlentyBlocks.DEAD_SHINGLES)
            .getFamily();

    public static final ModBlockFamily FIR_PLANKS = familyBuilder(BOPBlocks.FIR_PLANKS.get())
            .fromManager(BiomesOPlentyBlocks.FIR)
            .button(BOPBlocks.FIR_BUTTON.get())
            .door(BOPBlocks.FIR_DOOR.get())
            .fence(BOPBlocks.FIR_FENCE.get())
            .fenceGate(BOPBlocks.FIR_FENCE_GATE.get())
            .pressurePlate(BOPBlocks.FIR_PRESSURE_PLATE.get())
            .sign(BOPBlocks.FIR_SIGN.get(), BOPBlocks.FIR_WALL_SIGN.get())
            .stairs(BOPBlocks.FIR_STAIRS.get())
            .trapdoor(BOPBlocks.FIR_TRAPDOOR.get())
            .fromManager(BiomesOPlentyBlocks.FIR_SHINGLES)
            .getFamily();

    public static final ModBlockFamily HELLBARK_PLANKS = familyBuilder(BOPBlocks.HELLBARK_PLANKS.get())
            .fromManager(BiomesOPlentyBlocks.HELLBARK)
            .button(BOPBlocks.HELLBARK_BUTTON.get())
            .door(BOPBlocks.HELLBARK_DOOR.get())
            .fence(BOPBlocks.HELLBARK_FENCE.get())
            .fenceGate(BOPBlocks.HELLBARK_FENCE_GATE.get())
            .pressurePlate(BOPBlocks.HELLBARK_PRESSURE_PLATE.get())
            .sign(BOPBlocks.HELLBARK_SIGN.get(), BOPBlocks.HELLBARK_WALL_SIGN.get())
            .stairs(BOPBlocks.HELLBARK_STAIRS.get())
            .trapdoor(BOPBlocks.HELLBARK_TRAPDOOR.get())
            .fromManager(BiomesOPlentyBlocks.HELLBARK_SHINGLES)
            .getFamily();
    
    public static final ModBlockFamily JACARANDA_PLANKS = familyBuilder(BOPBlocks.JACARANDA_PLANKS.get())
            .fromManager(BiomesOPlentyBlocks.JACARANDA)
            .button(BOPBlocks.JACARANDA_BUTTON.get())
            .door(BOPBlocks.JACARANDA_DOOR.get())
            .fence(BOPBlocks.JACARANDA_FENCE.get())
            .fenceGate(BOPBlocks.JACARANDA_FENCE_GATE.get())
            .pressurePlate(BOPBlocks.JACARANDA_PRESSURE_PLATE.get())
            .sign(BOPBlocks.JACARANDA_SIGN.get(), BOPBlocks.JACARANDA_WALL_SIGN.get())
            .stairs(BOPBlocks.JACARANDA_STAIRS.get())
            .trapdoor(BOPBlocks.JACARANDA_TRAPDOOR.get())
            .fromManager(BiomesOPlentyBlocks.JACARANDA_SHINGLES)
            .getFamily();
    
    public static final ModBlockFamily MAGIC_PLANKS = familyBuilder(BOPBlocks.MAGIC_PLANKS.get())
            .fromManager(BiomesOPlentyBlocks.MAGIC)
            .button(BOPBlocks.MAGIC_BUTTON.get())
            .door(BOPBlocks.MAGIC_DOOR.get())
            .fence(BOPBlocks.MAGIC_FENCE.get())
            .fenceGate(BOPBlocks.MAGIC_FENCE_GATE.get())
            .pressurePlate(BOPBlocks.MAGIC_PRESSURE_PLATE.get())
            .sign(BOPBlocks.MAGIC_SIGN.get(), BOPBlocks.MAGIC_WALL_SIGN.get())
            .stairs(BOPBlocks.MAGIC_STAIRS.get())
            .trapdoor(BOPBlocks.MAGIC_TRAPDOOR.get())
            .fromManager(BiomesOPlentyBlocks.MAGIC_SHINGLES)
            .getFamily();
    
    public static final ModBlockFamily MAHOGANY_PLANKS = familyBuilder(BOPBlocks.MAHOGANY_PLANKS.get())
            .fromManager(BiomesOPlentyBlocks.MAHOGANY)
            .button(BOPBlocks.MAHOGANY_BUTTON.get())
            .door(BOPBlocks.MAHOGANY_DOOR.get())
            .fence(BOPBlocks.MAHOGANY_FENCE.get())
            .fenceGate(BOPBlocks.MAHOGANY_FENCE_GATE.get())
            .pressurePlate(BOPBlocks.MAHOGANY_PRESSURE_PLATE.get())
            .sign(BOPBlocks.MAHOGANY_SIGN.get(), BOPBlocks.MAHOGANY_WALL_SIGN.get())
            .stairs(BOPBlocks.MAHOGANY_STAIRS.get())
            .trapdoor(BOPBlocks.MAHOGANY_TRAPDOOR.get())
            .fromManager(BiomesOPlentyBlocks.MAHOGANY_SHINGLES)
            .getFamily();

//    public static final ModBlockFamily MAPLE_PLANKS = familyBuilder(BOPBlocks.MAPLE_PLANKS.get())
//            .fromManager(BiomesOPlentyBlocks.MAPLE)
//            .button(BOPBlocks.MAPLE_BUTTON.get())
//            .door(BOPBlocks.MAPLE_DOOR.get())
//            .fence(BOPBlocks.MAPLE_FENCE.get())
//            .fenceGate(BOPBlocks.MAPLE_FENCE_GATE.get())
//            .pressurePlate(BOPBlocks.MAPLE_PRESSURE_PLATE.get())
//            .sign(BOPBlocks.MAPLE_SIGN.get(), BOPBlocks.MAPLE_WALL_SIGN.get())
//            .stairs(BOPBlocks.MAPLE_STAIRS.get())
//            .trapdoor(BOPBlocks.MAPLE_TRAPDOOR.get())
//            .fromManager(BiomesOPlentyBlocks.MAPLE_SHINGLES)
//            .getFamily();
    
    public static final ModBlockFamily PALM_PLANKS = familyBuilder(BOPBlocks.PALM_PLANKS.get())
            .fromManager(BiomesOPlentyBlocks.PALM)
            .button(BOPBlocks.PALM_BUTTON.get())
            .door(BOPBlocks.PALM_DOOR.get())
            .fence(BOPBlocks.PALM_FENCE.get())
            .fenceGate(BOPBlocks.PALM_FENCE_GATE.get())
            .pressurePlate(BOPBlocks.PALM_PRESSURE_PLATE.get())
            .sign(BOPBlocks.PALM_SIGN.get(), BOPBlocks.PALM_WALL_SIGN.get())
            .stairs(BOPBlocks.PALM_STAIRS.get())
            .trapdoor(BOPBlocks.PALM_TRAPDOOR.get())
            .fromManager(BiomesOPlentyBlocks.PALM_SHINGLES)
            .getFamily();

//    public static final ModBlockFamily PINE_PLANKS = familyBuilder(BOPBlocks.PINE_PLANKS.get())
//            .fromManager(BiomesOPlentyBlocks.PINE)
//            .button(BOPBlocks.PINE_BUTTON.get())
//            .door(BOPBlocks.PINE_DOOR.get())
//            .fence(BOPBlocks.PINE_FENCE.get())
//            .fenceGate(BOPBlocks.PINE_FENCE_GATE.get())
//            .pressurePlate(BOPBlocks.PINE_PRESSURE_PLATE.get())
//            .sign(BOPBlocks.PINE_SIGN.get(), BOPBlocks.PINE_WALL_SIGN.get())
//            .stairs(BOPBlocks.PINE_STAIRS.get())
//            .trapdoor(BOPBlocks.PINE_TRAPDOOR.get())
//            .fromManager(BiomesOPlentyBlocks.PINE_SHINGLES)
//            .getFamily();
    
    public static final ModBlockFamily REDWOOD_PLANKS = familyBuilder(BOPBlocks.REDWOOD_PLANKS.get())
            .fromManager(BiomesOPlentyBlocks.REDWOOD)
            .button(BOPBlocks.REDWOOD_BUTTON.get())
            .door(BOPBlocks.REDWOOD_DOOR.get())
            .fence(BOPBlocks.REDWOOD_FENCE.get())
            .fenceGate(BOPBlocks.REDWOOD_FENCE_GATE.get())
            .pressurePlate(BOPBlocks.REDWOOD_PRESSURE_PLATE.get())
            .sign(BOPBlocks.REDWOOD_SIGN.get(), BOPBlocks.REDWOOD_WALL_SIGN.get())
            .stairs(BOPBlocks.REDWOOD_STAIRS.get())
            .trapdoor(BOPBlocks.REDWOOD_TRAPDOOR.get())
            .fromManager(BiomesOPlentyBlocks.REDWOOD_SHINGLES)
            .getFamily();
    
    public static final ModBlockFamily UMBRAN_PLANKS = familyBuilder(BOPBlocks.UMBRAN_PLANKS.get())
            .fromManager(BiomesOPlentyBlocks.UMBRAN)
            .button(BOPBlocks.UMBRAN_BUTTON.get())
            .door(BOPBlocks.UMBRAN_DOOR.get())
            .fence(BOPBlocks.UMBRAN_FENCE.get())
            .fenceGate(BOPBlocks.UMBRAN_FENCE_GATE.get())
            .pressurePlate(BOPBlocks.UMBRAN_PRESSURE_PLATE.get())
            .sign(BOPBlocks.UMBRAN_SIGN.get(), BOPBlocks.UMBRAN_WALL_SIGN.get())
            .stairs(BOPBlocks.UMBRAN_STAIRS.get())
            .trapdoor(BOPBlocks.UMBRAN_TRAPDOOR.get())
            .fromManager(BiomesOPlentyBlocks.UMBRAN_SHINGLES)
            .getFamily();
    
    public static final ModBlockFamily WILLOW_PLANKS = familyBuilder(BOPBlocks.WILLOW_PLANKS.get())
            .fromManager(BiomesOPlentyBlocks.WILLOW)
            .button(BOPBlocks.WILLOW_BUTTON.get())
            .door(BOPBlocks.WILLOW_DOOR.get())
            .fence(BOPBlocks.WILLOW_FENCE.get())
            .fenceGate(BOPBlocks.WILLOW_FENCE_GATE.get())
            .pressurePlate(BOPBlocks.WILLOW_PRESSURE_PLATE.get())
            .sign(BOPBlocks.WILLOW_SIGN.get(), BOPBlocks.WILLOW_WALL_SIGN.get())
            .stairs(BOPBlocks.WILLOW_STAIRS.get())
            .trapdoor(BOPBlocks.WILLOW_TRAPDOOR.get())
            .fromManager(BiomesOPlentyBlocks.WILLOW_SHINGLES)
            .getFamily();
    
    /* Stripped Wood */
    public static final ModBlockFamily STRIPPED_DEAD_WOOD = familyBuilder(BOPBlocks.STRIPPED_DEAD_WOOD.get())
            .fromManager(BiomesOPlentyBlocks.STRIPPED_DEAD)
            .getFamily();
    
    public static final ModBlockFamily STRIPPED_FIR_WOOD = familyBuilder(BOPBlocks.STRIPPED_FIR_WOOD.get())
            .fromManager(BiomesOPlentyBlocks.STRIPPED_FIR)
            .getFamily();
    
    public static final ModBlockFamily STRIPPED_HELLBARK_WOOD = familyBuilder(BOPBlocks.STRIPPED_HELLBARK_WOOD.get())
            .fromManager(BiomesOPlentyBlocks.STRIPPED_HELLBARK)
            .getFamily();
    
    public static final ModBlockFamily STRIPPED_JACARANDA_WOOD = familyBuilder(BOPBlocks.STRIPPED_JACARANDA_WOOD.get())
            .fromManager(BiomesOPlentyBlocks.STRIPPED_JACARANDA)
            .getFamily();
    
    public static final ModBlockFamily STRIPPED_MAGIC_WOOD = familyBuilder(BOPBlocks.STRIPPED_MAGIC_WOOD.get())
            .fromManager(BiomesOPlentyBlocks.STRIPPED_MAGIC)
            .getFamily();
    
    public static final ModBlockFamily STRIPPED_MAHOGANY_WOOD = familyBuilder(BOPBlocks.STRIPPED_MAHOGANY_WOOD.get())
            .fromManager(BiomesOPlentyBlocks.STRIPPED_MAHOGANY)
            .getFamily();

//    public static final ModBlockFamily STRIPPED_MAPLE_WOOD = familyBuilder(BOPBlocks.STRIPPED_MAPLE_WOOD.get())
//            .fromManager(BiomesOPlentyBlocks.STRIPPED_MAPLE)
//            .getFamily();
    
    public static final ModBlockFamily STRIPPED_PALM_WOOD = familyBuilder(BOPBlocks.STRIPPED_PALM_WOOD.get())
            .fromManager(BiomesOPlentyBlocks.STRIPPED_PALM)
            .getFamily();

//    public static final ModBlockFamily STRIPPED_PINE_WOOD = familyBuilder(BOPBlocks.STRIPPED_PINE_WOOD.get())
//            .fromManager(BiomesOPlentyBlocks.STRIPPED_PINE)
//            .getFamily();
    
    public static final ModBlockFamily STRIPPED_REDWOOD_WOOD = familyBuilder(BOPBlocks.STRIPPED_REDWOOD_WOOD.get())
            .fromManager(BiomesOPlentyBlocks.STRIPPED_REDWOOD)
            .getFamily();
    
    public static final ModBlockFamily STRIPPED_UMBRAN_WOOD = familyBuilder(BOPBlocks.STRIPPED_UMBRAN_WOOD.get())
            .fromManager(BiomesOPlentyBlocks.STRIPPED_UMBRAN)
            .getFamily();
    
    public static final ModBlockFamily STRIPPED_WILLOW_WOOD = familyBuilder(BOPBlocks.STRIPPED_WILLOW_WOOD.get())
            .fromManager(BiomesOPlentyBlocks.STRIPPED_WILLOW)
            .getFamily();


    public static ModBlockFamily.Builder familyBuilder(Block pBaseBlock) {
        ModBlockFamily.Builder modBlockFamily$builder = new ModBlockFamily.Builder(pBaseBlock);
        ModBlockFamily modBlockFamily = MAP.put(pBaseBlock, modBlockFamily$builder.getFamily());
        if (modBlockFamily != null) {
            throw new IllegalStateException("Duplicate family definition for " + ForgeRegistries.BLOCKS.getKey(pBaseBlock));
        } else {
            return modBlockFamily$builder;
        }
    }

    public static Stream<ModBlockFamily> getAllFamilies() {
        return MAP.values().stream();
    }
}

