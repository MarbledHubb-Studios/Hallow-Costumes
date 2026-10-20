package com.marbledhubb.hallowcostumes.world.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import static com.marbledhubb.hallowcostumes.HallowCostumes.MOD_ID;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID);

    public static final RegistryObject<CreativeModeTab> HALLOW_COSTUMES_TAB = CREATIVE_MODE_TABS.register("hallowcostumes_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup." + MOD_ID + ".hallowcostumes_tab"))
                    .icon(() -> new ItemStack(ModItems.GHOSTFACE_HELMET.get()))
                    .displayItems((displayParameters, output) -> {

                        //items
                        output.accept(ModItems.PROP_KNIFE.get());
                        output.accept(ModItems.PROP_KITCHEN_KNIFE.get());
                        output.accept(ModItems.FREDDYS_MICROPHONE.get());
                        output.accept(ModItems.FOXYS_HOOK.get());

                        //armors
                        output.accept(ModItems.GHOSTFACE_HELMET.get());
                        output.accept(ModItems.GHOSTFACE_CHESTPLATE.get());
                        output.accept(ModItems.GHOSTFACE_LEGGINGS.get());
                        output.accept(ModItems.GHOSTFACE_BOOTS.get());

                        output.accept(ModItems.MICHAEL_MYERS_HELMET.get());
                        output.accept(ModItems.MICHAEL_MYERS_CHESTPLATE.get());
                        output.accept(ModItems.MICHAEL_MYERS_LEGGINGS.get());
                        output.accept(ModItems.MICHAEL_MYERS_BOOTS.get());

                        output.accept(ModItems.MUMMY_HELMET.get());
                        output.accept(ModItems.MUMMY_CHESTPLATE.get());
                        output.accept(ModItems.MUMMY_LEGGINGS.get());
                        output.accept(ModItems.MUMMY_BOOTS.get());

                        output.accept(ModItems.CLOWN_HELMET.get());
                        output.accept(ModItems.CLOWN_CHESTPLATE.get());
                        output.accept(ModItems.CLOWN_LEGGINGS.get());
                        output.accept(ModItems.CLOWN_BOOTS.get());

                        output.accept(ModItems.FRANKENSTEINS_MONSTER_HELMET.get());

                        output.accept(ModItems.GHOST_HELMET.get());
                        output.accept(ModItems.GHOST_CHESTPLATE.get());

                        output.accept(ModItems.FREDDY_HELMET.get());
                        output.accept(ModItems.BONNIE_HELMET.get());
                        output.accept(ModItems.BONNIE_ALT_HELMET.get());
                        output.accept(ModItems.CHICA_HELMET.get());
                        output.accept(ModItems.FOXY_HELMET.get());

                    })
                    .build()
    );

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
