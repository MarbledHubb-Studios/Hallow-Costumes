package com.marbledhubb.hallowcostumes.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static com.marbledhubb.hallowcostumes.HallowCostumes.MODID;

public class ModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

    public static final Supplier<CreativeModeTab> HALLOW_COSTUMES = CREATIVE_MODE_TABS.register("hallow_costumes", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup." + MODID + ".hallow_costumes"))
            .icon(() -> new ItemStack(ModItems.GHOST_FACE_HELMET.get()))
            .displayItems((params, output) -> {
                output.accept(ModItems.GHOST_FACE_HELMET.get());

            })
            .build()
    );

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
