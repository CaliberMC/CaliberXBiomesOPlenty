package com.calibermc.caliberxbiomesoplenty.data.datagen.recipes;

import com.calibermc.caliber.block.CaliberBlocks;
import com.calibermc.caliberlib.data.ModBlockFamily;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class MiscRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public MiscRecipeProvider(DataGenerator pGenerator) {
        super(pGenerator.getPackOutput());
    }
    
    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        planksRecipes(pFinishedRecipeConsumer);
    }


    private void planksRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        /* Tall Planks Doors */
//        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  CaliberBlocks.ACACIA.get(ModBlockFamily.Variant.TALL_DOOR), 1).define('X', Blocks.ACACIA_DOOR).define('#', CaliberBlocks.ACACIA.baseBlock()).pattern("X").pattern("#").unlockedBy("has_acacia",
//                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberBlocks.ACACIA.baseBlock()).build())).save(pFinishedRecipeConsumer, "acacia_tall_door_from_acacia_door_and_acacia_shaped");
//        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, CaliberBlocks.BAMBOO.get(ModBlockFamily.Variant.TALL_DOOR), 1).define('X', Blocks.BAMBOO_DOOR).define('#', CaliberBlocks.BAMBOO.baseBlock()).pattern("X").pattern("#").unlockedBy("has_bamboo",
//                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberBlocks.BAMBOO.baseBlock()).build())).save(pFinishedRecipeConsumer, "bamboo_tall_door_from_bamboo_door_and_bamboo_shaped");
//        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  CaliberBlocks.BIRCH.get(ModBlockFamily.Variant.TALL_DOOR), 1).define('X', Blocks.BIRCH_DOOR).define('#', CaliberBlocks.BIRCH.baseBlock()).pattern("X").pattern("#").unlockedBy("has_birch",
//                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberBlocks.BIRCH.baseBlock()).build())).save(pFinishedRecipeConsumer, "birch_tall_door_from_birch_door_and_birch_shaped");
//        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  CaliberBlocks.CHERRY.get(ModBlockFamily.Variant.TALL_DOOR), 1).define('X', Blocks.CHERRY_DOOR).define('#', CaliberBlocks.CHERRY.baseBlock()).pattern("X").pattern("#").unlockedBy("has_cherry",
//                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberBlocks.CHERRY.baseBlock()).build())).save(pFinishedRecipeConsumer, "cherry_tall_door_from_cherry_door_and_cherry_shaped");
//        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  CaliberBlocks.DARK_OAK.get(ModBlockFamily.Variant.TALL_DOOR), 1).define('X', Blocks.DARK_OAK_DOOR).define('#', CaliberBlocks.DARK_OAK.baseBlock()).pattern("X").pattern("#").unlockedBy("has_dark_oak",
//                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberBlocks.DARK_OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "dark_oak_tall_door_from_dark_oak_door_and_dark_oak_shaped");
//        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  CaliberBlocks.JUNGLE.get(ModBlockFamily.Variant.TALL_DOOR), 1).define('X', Blocks.JUNGLE_DOOR).define('#', CaliberBlocks.JUNGLE.baseBlock()).pattern("X").pattern("#").unlockedBy("has_jungle",
//                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberBlocks.JUNGLE.baseBlock()).build())).save(pFinishedRecipeConsumer, "jungle_tall_door_from_jungle_door_and_jungle_shaped");
//        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  CaliberBlocks.MANGROVE.get(ModBlockFamily.Variant.TALL_DOOR), 1).define('X', Blocks.MANGROVE_DOOR).define('#', CaliberBlocks.MANGROVE.baseBlock()).pattern("X").pattern("#").unlockedBy("has_mangrove",
//                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberBlocks.MANGROVE.baseBlock()).build())).save(pFinishedRecipeConsumer, "mangrove_tall_door_from_mangrove_door_and_mangrove_shaped");
//        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  CaliberBlocks.OAK.get(ModBlockFamily.Variant.TALL_DOOR), 1).define('X', Blocks.OAK_DOOR).define('#', CaliberBlocks.OAK.baseBlock()).pattern("X").pattern("#").unlockedBy("has_oak",
//                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberBlocks.OAK.baseBlock()).build())).save(pFinishedRecipeConsumer, "oak_tall_door_from_oak_door_and_oak_shaped");
//        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  CaliberBlocks.SPRUCE.get(ModBlockFamily.Variant.TALL_DOOR), 1).define('X', Blocks.SPRUCE_DOOR).define('#', CaliberBlocks.SPRUCE.baseBlock()).pattern("X").pattern("#").unlockedBy("has_spruce",
//                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberBlocks.SPRUCE.baseBlock()).build())).save(pFinishedRecipeConsumer, "spruce_tall_door_from_spruce_door_and_spruce_shaped");
//        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  CaliberBlocks.CRIMSON.get(ModBlockFamily.Variant.TALL_DOOR), 1).define('X', Blocks.CRIMSON_DOOR).define('#', CaliberBlocks.CRIMSON.baseBlock()).pattern("X").pattern("#").unlockedBy("has_crimson",
//                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberBlocks.CRIMSON.baseBlock()).build())).save(pFinishedRecipeConsumer, "crimson_tall_door_from_crimson_door_and_crimson_shaped");
//        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE,  CaliberBlocks.WARPED.get(ModBlockFamily.Variant.TALL_DOOR), 1).define('X', Blocks.WARPED_DOOR).define('#', CaliberBlocks.WARPED.baseBlock()).pattern("X").pattern("#").unlockedBy("has_warped",
//                inventoryTrigger(ItemPredicate.Builder.item().of(CaliberBlocks.WARPED.baseBlock()).build())).save(pFinishedRecipeConsumer, "warped_tall_door_from_warped_door_and_warped_shaped");
    }
}
