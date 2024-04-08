package com.calibermc.caliberxbiomesoplenty.item;

import com.calibermc.caliber.block.CaliberBlocks;
import com.calibermc.caliber.util.compat.ModCompats;
import com.calibermc.caliberxbiomesoplenty.CaliberXBiomesOPlenty;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CreativeTabs {

    private static final DeferredRegister<CreativeModeTab> CREATIVE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CaliberXBiomesOPlenty.MOD_ID);

    public static final RegistryObject<CreativeModeTab> CALIBER_TAB = CREATIVE_TABS.register("caliberxbiomesoplenty",
            () -> CreativeModeTab.builder().title(Component.translatable("itemGroup.caliberxbiomesoplenty"))
                    .withTabsBefore(CreativeModeTabs.SPAWN_EGGS)
                    .icon(() -> new ItemStack(CaliberBlocks.POLISHED_DIORITE.baseBlock()))
                    .displayItems((pParameters, pOutput) -> {
                        if (ModCompats.BOP) {
                            for (RegistryObject<Item> entry : BiomesOPlentyItems.ITEMS.getEntries()) {
                                pOutput.accept(entry.get());
                            }
                        }
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_TABS.register(eventBus);
    }
}
