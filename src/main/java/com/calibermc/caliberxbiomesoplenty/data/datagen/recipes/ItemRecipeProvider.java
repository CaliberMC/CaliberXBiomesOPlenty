package com.calibermc.caliberxbiomesoplenty.data.datagen.recipes;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ItemRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public ItemRecipeProvider(DataGenerator pGenerator) {
        super(pGenerator.getPackOutput());
    }
    
    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        consumableRecipes(pFinishedRecipeConsumer);
    }

    private void consumableRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        /* Consumables */
    }

}
