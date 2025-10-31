package com.marbledhubb.hallowcostumes.init;

import com.marbledhubb.hallowcostumes.HallowCostumes;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import static com.marbledhubb.hallowcostumes.HallowCostumes.MODID;

public class ModTabs {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, HallowCostumes.MODID);

    public static final RegistryObject<CreativeModeTab> HALLOW_COSTUMES = TABS.register("hallow_costumes",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup." + MODID + ".hallow_costumes"))
                    .icon(() -> new ItemStack(ModItems.GHOST_FACE_HELMET.get()))
                    .displayItems((displayParameters, output) -> {


                        output.accept(ModItems.GHOST_FACE_HELMET.get());
                        output.accept(ModItems.GHOST_FACE_CHESTPLATE.get());
                        output.accept(ModItems.GHOST_FACE_LEGGINGS.get());
                        output.accept(ModItems.GHOST_FACE_BOOTS.get());

                        output.accept(ModItems.MICHAEL_MYERS_HELMET.get());
                        output.accept(ModItems.MICHAEL_MYERS_CHESTPLATE.get());
                        output.accept(ModItems.MICHAEL_MYERS_LEGGINGS.get());
                        output.accept(ModItems.MICHAEL_MYERS_BOOTS.get());

                        output.accept(ModItems.MUMMY_HELMET.get());
                        output.accept(ModItems.MUMMY_CHESTPLATE.get());
                        output.accept(ModItems.MUMMY_LEGGINGS.get());
                        output.accept(ModItems.MUMMY_BOOTS.get());

                        output.accept(ModItems.FREDDY_HELMET.get());
                        output.accept(ModItems.BONNIE_HELMET.get());
                        output.accept(ModItems.BONNIE_ALT_HELMET.get());
                        output.accept(ModItems.CHICA_HELMET.get());
                        output.accept(ModItems.FOXY_HELMET.get());
                    })
                    .build()
    );
    public static void register(IEventBus eventBus) {
        TABS.register(eventBus);
    }
}
