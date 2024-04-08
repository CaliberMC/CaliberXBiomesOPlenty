package com.calibermc.caliberxbiomesoplenty.block.management;

import com.calibermc.caliberxbiomesoplenty.block.BiomesOPlentyBlocks;
import com.calibermc.caliberlib.block.management.BlockManager;
import com.calibermc.caliberlib.data.ModBlockFamily;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;

import java.util.Collection;
import java.util.function.Supplier;

/**
 * Created to reduce the code in CaliberBlocks, for optimization and easier register of complex blocks
 */
public class CaliberXBlockManager {

    public static BlockManager registerBOP(String name, Supplier<BlockBehaviour.Properties> properties, Supplier<Block> blockSupplier, Collection<ModBlockFamily.Variant> variants) {
        return BlockManager.register(name, (b) -> {
            BlockSetType.values().forEach((type) -> {
                if (name.contains(type.name())) {
                    b.type(type);
                }

            });
        }, BiomesOPlentyBlocks.BLOCKS, properties, blockSupplier, variants).registerBlockFunc(BiomesOPlentyBlocks::registerBlock).build();
    }

//    public static BlockManager registerRU(String name, Supplier<BlockBehaviour.Properties> properties, Supplier<Block> blockSupplier, Collection<ModBlockFamily.Variant> variants) {
//        return BlockManager.register(name, (b) -> {
//            BlockSetType.values().forEach((type) -> {
//                if (name.contains(type.name())) {
//                    b.type(type);
//                }
//
//            });
//        }, RegionsUnexploredBlocks.BLOCKS, properties, blockSupplier, variants).registerBlockFunc(RegionsUnexploredBlocks::registerBlock).build();
//    }

}
