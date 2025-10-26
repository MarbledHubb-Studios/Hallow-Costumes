package com.marbledhubb.hallowcostumes.init;

import com.marbledhubb.hallowcostumes.HallowCostumes;
import com.marbledhubb.hallowcostumes.init.armoritem.GhostFaceArmorItem;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(HallowCostumes.MODID);

    public static final DeferredItem<Item> GHOST_FACE_HELMET = ITEMS.register("ghost_face_helmet", () -> new GhostFaceArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final DeferredItem<Item> GHOST_FACE_CHESTPLATE = ITEMS.register("ghost_face_chestplate", () -> new GhostFaceArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final DeferredItem<Item> GHOST_FACE_LEGGINGS = ITEMS.register("ghost_face_leggings", () -> new GhostFaceArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final DeferredItem<Item> GHOST_FACE_BOOTS = ITEMS.register("ghost_face_boots", () -> new GhostFaceArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.BOOTS, new Item.Properties()));;

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
