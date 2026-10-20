package com.marbledhubb.hallowcostumes.world.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static com.marbledhubb.hallowcostumes.HallowCostumes.MOD_ID;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID);

    public static final Supplier<CreativeModeTab> HALLOW_COSTUMES = CREATIVE_MODE_TABS.register("hallowcostumes_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup." + MOD_ID + ".hallowcostumes_tab"))
            .icon(() -> new ItemStack(ModItems.GHOSTFACE_HELMET.get()))
            .displayItems((params, output) -> {
                //items
                output.accept(ModItems.PROP_KNIFE.get());
                output.accept(ModItems.PROP_KITCHEN_KNIFE.get());
                output.accept(ModItems.FREDDYS_MICROPHONE);
                output.accept(ModItems.FOXYS_HOOK);

                //armors
                output.accept(ModItems.GHOSTFACE_HELMET);
                output.accept(ModItems.GHOSTFACE_CHESTPLATE);
                output.accept(ModItems.GHOSTFACE_LEGGINGS);
                output.accept(ModItems.GHOSTFACE_BOOTS);

                output.accept(ModItems.MICHAEL_MYERS_HELMET);
                output.accept(ModItems.MICHAEL_MYERS_CHESTPLATE);
                output.accept(ModItems.MICHAEL_MYERS_LEGGINGS);
                output.accept(ModItems.MICHAEL_MYERS_BOOTS);

                output.accept(ModItems.MUMMY_HELMET);
                output.accept(ModItems.MUMMY_CHESTPLATE);
                output.accept(ModItems.MUMMY_LEGGINGS);
                output.accept(ModItems.MUMMY_BOOTS);

                output.accept(ModItems.CLOWN_HELMET);
                output.accept(ModItems.CLOWN_CHESTPLATE);
                output.accept(ModItems.CLOWN_LEGGINGS);
                output.accept(ModItems.CLOWN_BOOTS);

                output.accept(ModItems.FRANKENSTEINS_MONSTER_HELMET);

                output.accept(ModItems.GHOST_HELMET);
                output.accept(ModItems.GHOST_CHESTPLATE);

                output.accept(ModItems.FREDDY_HELMET);
                output.accept(ModItems.BONNIE_HELMET);
                output.accept(ModItems.BONNIE_ALT_HELMET);
                output.accept(ModItems.CHICA_HELMET);
                output.accept(ModItems.FOXY_HELMET);
            })
            .build()
    );

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
