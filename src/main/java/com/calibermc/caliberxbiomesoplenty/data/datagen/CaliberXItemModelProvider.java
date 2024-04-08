package com.calibermc.caliberxbiomesoplenty.data.datagen;

import com.calibermc.buildify.item.custom.Hammer;
import com.calibermc.caliberlib.data.datagen.ModItemModelProvider;
import com.calibermc.caliberxbiomesoplenty.CaliberXBiomesOPlenty;
import com.calibermc.caliberxbiomesoplenty.item.BiomesOPlentyItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class CaliberXItemModelProvider extends ModItemModelProvider {
    public CaliberXItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, CaliberXBiomesOPlenty.MOD_ID, existingFileHelper);
    }


    @Override
    protected void registerModels() {
        super.registerModels();
        itemModels();
    }


    private void itemModels() {
        // Register Item Models
        BiomesOPlentyItems.ITEMS.getEntries().stream()
                .filter(itemRegistryObject -> {
                    // Check if the item's registry name is in the Caliber.MOD_ID namespace
                    ResourceLocation registryName = itemRegistryObject.getId();
                    return registryName != null && CaliberXBiomesOPlenty.MOD_ID.equals(registryName.getNamespace());
                })
                .forEach(itemRegistryObject -> {
                    // Determine if the item is a tool
                    Item item = itemRegistryObject.get();
                    boolean genItem = item instanceof Hammer ||
                            item instanceof SwordItem ||
                            item instanceof PickaxeItem ||
                            item instanceof ShovelItem ||
                            item instanceof AxeItem ||
                            item instanceof HoeItem;

                    // Use handheldItem for tools
                    if (genItem) {
                        handheldItem(itemRegistryObject);
                    }
                    // Use simpleItem for items that are exactly instances of Item.class or ArmorItem.class
                    else if (item.getClass() == Item.class ||
                            item.getClass() == ArmorItem.class  ||
                            item.getClass() == SignItem.class ||
                            item.getClass() == HangingSignItem.class) {
                        simpleItem(itemRegistryObject);
                    }
                });
    }


    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(CaliberXBiomesOPlenty.MOD_ID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(CaliberXBiomesOPlenty.MOD_ID,"item/" + item.getId().getPath()));
    }
}
