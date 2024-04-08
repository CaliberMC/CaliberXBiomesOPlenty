package com.calibermc.caliberxbiomesoplenty.block;

import biomesoplenty.api.block.BOPBlocks;
import com.calibermc.caliberlib.block.management.BlockManager;
import com.calibermc.caliberxbiomesoplenty.block.management.CaliberXBlockManager;
import com.calibermc.caliberxbiomesoplenty.item.BiomesOPlentyItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static com.calibermc.caliberlib.block.management.ModBlockHelper.*;

public class BiomesOPlentyBlocks {
    private static int blockCount = 0;
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, "biomesoplenty");

    /* Stone */
    public static final BlockManager BLACK_SANDSTONE = CaliberXBlockManager.registerBOP("black_sandstone", () -> BlockBehaviour.Properties.copy(BOPBlocks.BLACK_SANDSTONE.get()), () -> BOPBlocks.BLACK_SANDSTONE.get(), STONE_VARIANTS_WITHOUT_STAIRS_WALL);
    public static final BlockManager BRIMSTONE = CaliberXBlockManager.registerBOP("brimstone", () -> BlockBehaviour.Properties.copy(BOPBlocks.BRIMSTONE.get()), () -> BOPBlocks.BRIMSTONE.get(), STONE_VARIANTS);
    public static final BlockManager BRIMSTONE_BRICK = CaliberXBlockManager.registerBOP("brimstone_bricks", () -> BlockBehaviour.Properties.copy(BOPBlocks.BRIMSTONE_BRICKS.get()), () -> BOPBlocks.BRIMSTONE_BRICKS.get(), STONE_VARIANTS_WITHOUT_STAIRS_WALL);
    public static final BlockManager CHISELED_BLACK_SANDSTONE = CaliberXBlockManager.registerBOP("chiseled_black_sandstone", () -> BlockBehaviour.Properties.copy(BOPBlocks.CHISELED_BLACK_SANDSTONE.get()), () -> BOPBlocks.CHISELED_BLACK_SANDSTONE.get(), STONE_VARIANTS);
    public static final BlockManager CHISELED_BRIMSTONE_BRICK = CaliberXBlockManager.registerBOP("chiseled_brimstone_bricks", () -> BlockBehaviour.Properties.copy(BOPBlocks.CHISELED_BRIMSTONE_BRICKS.get()), () -> BOPBlocks.CHISELED_BRIMSTONE_BRICKS.get(), STONE_VARIANTS);
    public static final BlockManager CHISELED_ORANGE_SANDSTONE = CaliberXBlockManager.registerBOP("chiseled_orange_sandstone", () -> BlockBehaviour.Properties.copy(BOPBlocks.CHISELED_ORANGE_SANDSTONE.get()), () -> BOPBlocks.CHISELED_ORANGE_SANDSTONE.get(), STONE_VARIANTS);
    public static final BlockManager CHISELED_WHITE_SANDSTONE = CaliberXBlockManager.registerBOP("chiseled_white_sandstone", () -> BlockBehaviour.Properties.copy(BOPBlocks.CHISELED_WHITE_SANDSTONE.get()), () -> BOPBlocks.CHISELED_WHITE_SANDSTONE.get(), STONE_VARIANTS);
    public static final BlockManager CUT_BLACK_SANDSTONE = CaliberXBlockManager.registerBOP("cut_black_sandstone", () -> BlockBehaviour.Properties.copy(BOPBlocks.CUT_BLACK_SANDSTONE.get()), () -> BOPBlocks.CUT_BLACK_SANDSTONE.get(), STONE_VARIANTS);
    public static final BlockManager CUT_ORANGE_SANDSTONE = CaliberXBlockManager.registerBOP("cut_orange_sandstone", () -> BlockBehaviour.Properties.copy(BOPBlocks.CUT_ORANGE_SANDSTONE.get()), () -> BOPBlocks.CUT_ORANGE_SANDSTONE.get(), STONE_VARIANTS);
    public static final BlockManager CUT_WHITE_SANDSTONE = CaliberXBlockManager.registerBOP("cut_white_sandstone", () -> BlockBehaviour.Properties.copy(BOPBlocks.CUT_WHITE_SANDSTONE.get()), () -> BOPBlocks.CUT_WHITE_SANDSTONE.get(), STONE_VARIANTS);

    /* Planks */
    public static final BlockManager DEAD = CaliberXBlockManager.registerBOP("dead_planks", () -> BlockBehaviour.Properties.copy(BOPBlocks.DEAD_PLANKS.get()), () -> BOPBlocks.DEAD_PLANKS.get(), VANILLA_PLANK_VARIANTS);
    public static final BlockManager FIR = CaliberXBlockManager.registerBOP("fir_planks", () -> BlockBehaviour.Properties.copy(BOPBlocks.FIR_PLANKS.get()), () -> BOPBlocks.FIR_PLANKS.get(), VANILLA_PLANK_VARIANTS);
    public static final BlockManager HELLBARK = CaliberXBlockManager.registerBOP("hellbark_planks", () -> BlockBehaviour.Properties.copy(BOPBlocks.HELLBARK_PLANKS.get()), () -> BOPBlocks.HELLBARK_PLANKS.get(), VANILLA_PLANK_VARIANTS);
    public static final BlockManager JACARANDA = CaliberXBlockManager.registerBOP("jacaranda_planks", () -> BlockBehaviour.Properties.copy(BOPBlocks.JACARANDA_PLANKS.get()), () -> BOPBlocks.JACARANDA_PLANKS.get(), VANILLA_PLANK_VARIANTS);
    public static final BlockManager MAGIC = CaliberXBlockManager.registerBOP("magic_planks", () -> BlockBehaviour.Properties.copy(BOPBlocks.MAGIC_PLANKS.get()), () -> BOPBlocks.MAGIC_PLANKS.get(), VANILLA_PLANK_VARIANTS);
    public static final BlockManager MAHOGANY = CaliberXBlockManager.registerBOP("mahogany_planks", () -> BlockBehaviour.Properties.copy(BOPBlocks.MAHOGANY_PLANKS.get()), () -> BOPBlocks.MAHOGANY_PLANKS.get(), VANILLA_PLANK_VARIANTS);
//    public static final BlockManager MAPLE = CaliberXBlockManager.registerBOP("maple_planks", () -> BlockBehaviour.Properties.copy(BOPBlocks.MAPLE_PLANKS.get()), () -> BOPBlocks.MAPLE_PLANKS.get(), VANILLA_PLANK_VARIANTS);
    public static final BlockManager PALM = CaliberXBlockManager.registerBOP("palm_planks", () -> BlockBehaviour.Properties.copy(BOPBlocks.PALM_PLANKS.get()), () -> BOPBlocks.PALM_PLANKS.get(), VANILLA_PLANK_VARIANTS);
//    public static final BlockManager PINE = CaliberXBlockManager.registerBOP("pine_planks", () -> BlockBehaviour.Properties.copy(BOPBlocks.PINE_PLANKS.get()), () -> BOPBlocks.PINE_PLANKS.get(), VANILLA_PLANK_VARIANTS);
    public static final BlockManager REDWOOD = CaliberXBlockManager.registerBOP("redwood_planks", () -> BlockBehaviour.Properties.copy(BOPBlocks.REDWOOD_PLANKS.get()), () -> BOPBlocks.REDWOOD_PLANKS.get(), VANILLA_PLANK_VARIANTS);
    public static final BlockManager UMBRAN = CaliberXBlockManager.registerBOP("umbran_planks", () -> BlockBehaviour.Properties.copy(BOPBlocks.UMBRAN_PLANKS.get()), () -> BOPBlocks.UMBRAN_PLANKS.get(), VANILLA_PLANK_VARIANTS);
    public static final BlockManager WILLOW = CaliberXBlockManager.registerBOP("willow_planks", () -> BlockBehaviour.Properties.copy(BOPBlocks.WILLOW_PLANKS.get()), () -> BOPBlocks.WILLOW_PLANKS.get(), VANILLA_PLANK_VARIANTS);

    /* Shingles */
    public static final BlockManager DEAD_SHINGLES = CaliberXBlockManager.registerBOP("dead_shingle", () -> BlockBehaviour.Properties.copy(BOPBlocks.DEAD_PLANKS.get()), () -> BOPBlocks.DEAD_PLANKS.get(), ROOF_VARIANTS);
    public static final BlockManager FIR_SHINGLES = CaliberXBlockManager.registerBOP("fir_shingle", () -> BlockBehaviour.Properties.copy(BOPBlocks.FIR_PLANKS.get()), () -> BOPBlocks.FIR_PLANKS.get(), ROOF_VARIANTS);
    public static final BlockManager HELLBARK_SHINGLES = CaliberXBlockManager.registerBOP("hellbark_shingle", () -> BlockBehaviour.Properties.copy(BOPBlocks.HELLBARK_PLANKS.get()), () -> BOPBlocks.HELLBARK_PLANKS.get(), ROOF_VARIANTS);
    public static final BlockManager JACARANDA_SHINGLES = CaliberXBlockManager.registerBOP("jacaranda_shingle", () -> BlockBehaviour.Properties.copy(BOPBlocks.JACARANDA_PLANKS.get()), () -> BOPBlocks.JACARANDA_PLANKS.get(), ROOF_VARIANTS);
    public static final BlockManager MAGIC_SHINGLES = CaliberXBlockManager.registerBOP("magic_shingle", () -> BlockBehaviour.Properties.copy(BOPBlocks.MAGIC_PLANKS.get()), () -> BOPBlocks.MAGIC_PLANKS.get(), ROOF_VARIANTS);
    public static final BlockManager MAHOGANY_SHINGLES = CaliberXBlockManager.registerBOP("mahogany_shingle", () -> BlockBehaviour.Properties.copy(BOPBlocks.MAHOGANY_PLANKS.get()), () -> BOPBlocks.MAHOGANY_PLANKS.get(), ROOF_VARIANTS);
//    public static final BlockManager MAPLE_SHINGLES = CaliberXBlockManager.registerBOP("maple_shingle", () -> BlockBehaviour.Properties.copy(BOPBlocks.MAPLE_PLANKS.get()), () -> BOPBlocks.MAPLE_PLANKS.get(), ROOF_VARIANTS);
    public static final BlockManager PALM_SHINGLES = CaliberXBlockManager.registerBOP("palm_shingle", () -> BlockBehaviour.Properties.copy(BOPBlocks.PALM_PLANKS.get()), () -> BOPBlocks.PALM_PLANKS.get(), ROOF_VARIANTS);
//    public static final BlockManager PINE_SHINGLES = CaliberXBlockManager.registerBOP("pine_shingle", () -> BlockBehaviour.Properties.copy(BOPBlocks.PINE_PLANKS.get()), () -> BOPBlocks.PINE_PLANKS.get(), ROOF_VARIANTS);
    public static final BlockManager REDWOOD_SHINGLES = CaliberXBlockManager.registerBOP("redwood_shingle", () -> BlockBehaviour.Properties.copy(BOPBlocks.REDWOOD_PLANKS.get()), () -> BOPBlocks.REDWOOD_PLANKS.get(), ROOF_VARIANTS);
    public static final BlockManager UMBRAN_SHINGLES = CaliberXBlockManager.registerBOP("umbran_shingle", () -> BlockBehaviour.Properties.copy(BOPBlocks.UMBRAN_PLANKS.get()), () -> BOPBlocks.UMBRAN_PLANKS.get(), ROOF_VARIANTS);
    public static final BlockManager WILLOW_SHINGLES = CaliberXBlockManager.registerBOP("willow_shingle", () -> BlockBehaviour.Properties.copy(BOPBlocks.WILLOW_PLANKS.get()), () -> BOPBlocks.WILLOW_PLANKS.get(), ROOF_VARIANTS);

    /* Stripped Wood */
    public static final BlockManager STRIPPED_DEAD = CaliberXBlockManager.registerBOP("stripped_dead_wood", () -> BlockBehaviour.Properties.copy(BOPBlocks.STRIPPED_DEAD_WOOD.get()), () -> BOPBlocks.STRIPPED_DEAD_WOOD.get(), STRIPPED_WOOD_VARIANTS);
    public static final BlockManager STRIPPED_FIR = CaliberXBlockManager.registerBOP("stripped_fir_wood", () -> BlockBehaviour.Properties.copy(BOPBlocks.STRIPPED_FIR_WOOD.get()), () -> BOPBlocks.STRIPPED_FIR_WOOD.get(), STRIPPED_WOOD_VARIANTS);
    public static final BlockManager STRIPPED_HELLBARK = CaliberXBlockManager.registerBOP("stripped_hellbark_wood", () -> BlockBehaviour.Properties.copy(BOPBlocks.STRIPPED_HELLBARK_WOOD.get()), () -> BOPBlocks.STRIPPED_HELLBARK_WOOD.get(), STRIPPED_WOOD_VARIANTS);
    public static final BlockManager STRIPPED_JACARANDA = CaliberXBlockManager.registerBOP("stripped_jacaranda_wood", () -> BlockBehaviour.Properties.copy(BOPBlocks.STRIPPED_JACARANDA_WOOD.get()), () -> BOPBlocks.STRIPPED_JACARANDA_WOOD.get(), STRIPPED_WOOD_VARIANTS);
    public static final BlockManager STRIPPED_MAGIC = CaliberXBlockManager.registerBOP("stripped_magic_wood", () -> BlockBehaviour.Properties.copy(BOPBlocks.STRIPPED_MAGIC_WOOD.get()), () -> BOPBlocks.STRIPPED_MAGIC_WOOD.get(), STRIPPED_WOOD_VARIANTS);
    public static final BlockManager STRIPPED_MAHOGANY = CaliberXBlockManager.registerBOP("stripped_mahogany_wood", () -> BlockBehaviour.Properties.copy(BOPBlocks.STRIPPED_MAHOGANY_WOOD.get()), () -> BOPBlocks.STRIPPED_MAHOGANY_WOOD.get(), STRIPPED_WOOD_VARIANTS);
//    public static final BlockManager STRIPPED_MAPLE = CaliberXBlockManager.registerBOP("stripped_maple_wood", () -> BlockBehaviour.Properties.copy(BOPBlocks.STRIPPED_MAPLE_WOOD.get()), () -> BOPBlocks.STRIPPED_MAPLE_WOOD.get(), STRIPPED_WOOD_VARIANTS);
    public static final BlockManager STRIPPED_PALM = CaliberXBlockManager.registerBOP("stripped_palm_wood", () -> BlockBehaviour.Properties.copy(BOPBlocks.STRIPPED_PALM_WOOD.get()), () -> BOPBlocks.STRIPPED_PALM_WOOD.get(), STRIPPED_WOOD_VARIANTS);
//    public static final BlockManager STRIPPED_PINE = CaliberXBlockManager.registerBOP("stripped_pine_wood", () -> BlockBehaviour.Properties.copy(BOPBlocks.STRIPPED_PINE_WOOD.get()), () -> BOPBlocks.STRIPPED_PINE_WOOD.get(), STRIPPED_WOOD_VARIANTS);
    public static final BlockManager STRIPPED_REDWOOD = CaliberXBlockManager.registerBOP("stripped_redwood_wood", () -> BlockBehaviour.Properties.copy(BOPBlocks.STRIPPED_REDWOOD_WOOD.get()), () -> BOPBlocks.STRIPPED_REDWOOD_WOOD.get(), STRIPPED_WOOD_VARIANTS);
    public static final BlockManager STRIPPED_UMBRAN = CaliberXBlockManager.registerBOP("stripped_umbran_wood", () -> BlockBehaviour.Properties.copy(BOPBlocks.STRIPPED_UMBRAN_WOOD.get()), () -> BOPBlocks.STRIPPED_UMBRAN_WOOD.get(), STRIPPED_WOOD_VARIANTS);
    public static final BlockManager STRIPPED_WILLOW = CaliberXBlockManager.registerBOP("stripped_willow_wood", () -> BlockBehaviour.Properties.copy(BOPBlocks.STRIPPED_WILLOW_WOOD.get()), () -> BOPBlocks.STRIPPED_WILLOW_WOOD.get(), STRIPPED_WOOD_VARIANTS);


    public static void printBlockCounts() {
        System.out.println("Biomes O Plenty blocks registered: " + blockCount);
    }

    private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        blockCount++;
        return BLOCKS.register(name, block);
    }

    public static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        blockCount++;
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        BiomesOPlentyItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}

