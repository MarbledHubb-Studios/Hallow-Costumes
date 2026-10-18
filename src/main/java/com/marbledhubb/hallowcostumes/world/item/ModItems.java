package com.marbledhubb.hallowcostumes.world.item;

import com.marbledhubb.hallowcostumes.HallowCostumes;
import com.marbledhubb.hallowcostumes.world.item.custom.DefaultedGeoArmorItem;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(HallowCostumes.MOD_ID);

    //items
    public static final DeferredItem<Item> PROP_KNIFE = ITEMS.register("prop_knife", () -> new SwordItem(Tiers.WOOD,new Item.Properties().durability(64).attributes(SwordItem.createAttributes(Tiers.WOOD, 0, -2.4F))));
    public static final DeferredItem<Item> PROP_KITCHEN_KNIFE = ITEMS.register("prop_kitchen_knife", () -> new SwordItem(Tiers.WOOD,new Item.Properties().durability(64).attributes(SwordItem.createAttributes(Tiers.WOOD, 1, -2.4F))));
    public static final DeferredItem<Item> FREDDYS_MICROPHONE = ITEMS.registerSimpleItem("freddys_microphone");
    public static final DeferredItem<Item> BONNIES_GUITAR = ITEMS.registerSimpleItem("bonnies_guitar");
    public static final DeferredItem<Item> CHICAS_CUPCAKE = ITEMS.registerSimpleItem("chicas_cupcake");
    public static final DeferredItem<Item> FOXYS_HOOK = ITEMS.register("foxys_hook", () -> new SwordItem(Tiers.WOOD,new Item.Properties().durability(64).attributes(SwordItem.createAttributes(Tiers.WOOD, 0, -2.4F))));

    //armors
    public static final DeferredItem<Item> GHOSTFACE_HELMET = ITEMS.register("ghostface_helmet", () -> new DefaultedGeoArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Properties(), "ghostface_armor"));
    public static final DeferredItem<Item> GHOSTFACE_CHESTPLATE = ITEMS.register("ghostface_chestplate", () -> new DefaultedGeoArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.CHESTPLATE, new Item.Properties(), "ghostface_armor"));
    public static final DeferredItem<Item> GHOSTFACE_LEGGINGS = ITEMS.register("ghostface_leggings", () -> new DefaultedGeoArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.LEGGINGS, new Item.Properties(), "ghostface_armor"));
    public static final DeferredItem<Item> GHOSTFACE_BOOTS = ITEMS.register("ghostface_boots", () -> new DefaultedGeoArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.BOOTS, new Item.Properties(), "ghostface_armor"));

    public static final DeferredItem<Item> MICHAEL_MYERS_HELMET = ITEMS.register("michael_myers_helmet", () -> new DefaultedGeoArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Properties(), "michael_myers_armor"));
    public static final DeferredItem<Item> MICHAEL_MYERS_CHESTPLATE = ITEMS.register("michael_myers_chestplate", () -> new DefaultedGeoArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.CHESTPLATE, new Item.Properties(), "michael_myers_armor"));
    public static final DeferredItem<Item> MICHAEL_MYERS_LEGGINGS = ITEMS.register("michael_myers_leggings", () -> new DefaultedGeoArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.LEGGINGS, new Item.Properties(), "michael_myers_armor"));
    public static final DeferredItem<Item> MICHAEL_MYERS_BOOTS = ITEMS.register("michael_myers_boots", () -> new DefaultedGeoArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.BOOTS, new Item.Properties(), "michael_myers_armor"));

    public static final DeferredItem<Item> MUMMY_HELMET = ITEMS.register("mummy_helmet", () -> new DefaultedGeoArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Properties(), "mummy_armor"));
    public static final DeferredItem<Item> MUMMY_CHESTPLATE = ITEMS.register("mummy_chestplate", () -> new DefaultedGeoArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.CHESTPLATE, new Item.Properties(), "mummy_armor"));
    public static final DeferredItem<Item> MUMMY_LEGGINGS = ITEMS.register("mummy_leggings", () -> new DefaultedGeoArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.LEGGINGS, new Item.Properties(), "mummy_armor"));
    public static final DeferredItem<Item> MUMMY_BOOTS = ITEMS.register("mummy_boots", () -> new DefaultedGeoArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.BOOTS, new Item.Properties(), "mummy_armor"));

    public static final DeferredItem<Item> CLOWN_HELMET = ITEMS.register("clown_helmet", () -> new DefaultedGeoArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Properties(), "clown_armor"));
    public static final DeferredItem<Item> CLOWN_CHESTPLATE = ITEMS.register("clown_chestplate", () -> new DefaultedGeoArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.CHESTPLATE, new Item.Properties(), "clown_armor"));
    public static final DeferredItem<Item> CLOWN_LEGGINGS = ITEMS.register("clown_leggings", () -> new DefaultedGeoArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.LEGGINGS, new Item.Properties(), "clown_armor"));
    public static final DeferredItem<Item> CLOWN_BOOTS = ITEMS.register("clown_boots", () -> new DefaultedGeoArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.BOOTS, new Item.Properties(), "clown_armor"));

    public static final DeferredItem<Item> FRANKENSTEINS_MONSTER_HELMET = ITEMS.register("frankensteins_monster_helmet", () -> new DefaultedGeoArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Properties(), "frankensteins_monster_helmet"));

    public static final DeferredItem<Item> GHOST_HELMET = ITEMS.register("ghost_helmet", () -> new DefaultedGeoArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Properties(), "ghost_armor"));
    public static final DeferredItem<Item> GHOST_CHESTPLATE = ITEMS.register("ghost_chestplate", () -> new DefaultedGeoArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.CHESTPLATE, new Item.Properties(), "ghost_armor"));

    public static final DeferredItem<Item> FREDDY_HELMET = ITEMS.register("freddy_helmet", () -> new DefaultedGeoArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Properties(), "freddy_helmet"));
    public static final DeferredItem<Item> BONNIE_HELMET = ITEMS.register("bonnie_helmet", () -> new DefaultedGeoArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Properties(), "bonnie_helmet"));
    public static final DeferredItem<Item> BONNIE_ALT_HELMET = ITEMS.register("bonnie_alt_helmet", () -> new DefaultedGeoArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Properties(), "bonnie_helmet"));
    public static final DeferredItem<Item> CHICA_HELMET = ITEMS.register("chica_helmet", () -> new DefaultedGeoArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Properties(), "chica_helmet"));
    public static final DeferredItem<Item> FOXY_HELMET = ITEMS.register("foxy_helmet", () -> new DefaultedGeoArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Properties(), "foxy_helmet"));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
