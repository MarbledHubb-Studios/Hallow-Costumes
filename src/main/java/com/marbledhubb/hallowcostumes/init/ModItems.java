package com.marbledhubb.hallowcostumes.init;

import com.marbledhubb.hallowcostumes.HallowCostumes;
import com.marbledhubb.hallowcostumes.init.armoritems.GhostFaceArmorItem;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, HallowCostumes.MODID);

    public static final RegistryObject<Item> GHOST_FACE_HELMET = ITEMS.register("ghost_face_helmet", () -> new GhostFaceArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> GHOST_FACE_CHESTPLATE = ITEMS.register("ghost_face_chestplate", () -> new GhostFaceArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> GHOST_FACE_LEGGINGS = ITEMS.register("ghost_face_leggings", () -> new GhostFaceArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> GHOST_FACE_BOOTS = ITEMS.register("ghost_face_boots", () -> new GhostFaceArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> MICHAEL_MYERS_HELMET = ITEMS.register("michael_myers_helmet", () -> new ArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> MICHAEL_MYERS_CHESTPLATE = ITEMS.register("michael_myers_chestplate", () -> new ArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> MICHAEL_MYERS_LEGGINGS = ITEMS.register("michael_myers_leggings", () -> new ArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> MICHAEL_MYERS_BOOTS = ITEMS.register("michael_myers_boots", () -> new ArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> FREDDY_HELMET = ITEMS.register("freddy_helmet", () -> new ArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Properties()));
    //public static final RegistryObject<Item> BONNIE_HELMET = ITEMS.register("freddy_helmet", () -> new ArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Properties()));
    //public static final RegistryObject<Item> CHICA_HELMET = ITEMS.register("freddy_helmet", () -> new ArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Properties()));
    //public static final RegistryObject<Item> FOXY_HELMET = ITEMS.register("freddy_helmet", () -> new ArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
