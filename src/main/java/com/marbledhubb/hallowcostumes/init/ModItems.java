package com.marbledhubb.hallowcostumes.init;

import com.marbledhubb.hallowcostumes.HallowCostumes;
import com.marbledhubb.hallowcostumes.init.item.GhostFaceArmorItem;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, HallowCostumes.MODID);

    public static final RegistryObject<Item> GHOST_FACE_HELMET = ITEMS.register("ghostface_helmet", () -> new GhostFaceArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> GHOST_FACE_CHESTPLATE = ITEMS.register("ghostface_chestplate", () -> new GhostFaceArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> GHOST_FACE_LEGGINGS = ITEMS.register("ghostface_leggings", () -> new GhostFaceArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> GHOST_FACE_BOOTS = ITEMS.register("ghostface_boots", () -> new GhostFaceArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> MICHAEL_MYERS_HELMET = ITEMS.register("michael_myers_helmet", () -> new ArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> MICHAEL_MYERS_CHESTPLATE = ITEMS.register("michael_myers_chestplate", () -> new ArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> MICHAEL_MYERS_LEGGINGS = ITEMS.register("michael_myers_leggings", () -> new ArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> MICHAEL_MYERS_BOOTS = ITEMS.register("michael_myers_boots", () -> new ArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> MUMMY_HELMET = ITEMS.register("mummy_helmet", () -> new ArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> MUMMY_CHESTPLATE = ITEMS.register("mummy_chestplate", () -> new ArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> MUMMY_LEGGINGS = ITEMS.register("mummy_leggings", () -> new ArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> MUMMY_BOOTS = ITEMS.register("mummy_boots", () -> new ArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> FREDDY_HELMET = ITEMS.register("freddy_helmet", () -> new ArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> BONNIE_HELMET = ITEMS.register("bonnie_helmet", () -> new ArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> BONNIE_ALT_HELMET = ITEMS.register("bonnie_alt_helmet", () -> new ArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> CHICA_HELMET = ITEMS.register("chica_helmet", () -> new ArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> FOXY_HELMET = ITEMS.register("foxy_helmet", () -> new ArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
