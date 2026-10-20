package com.marbledhubb.hallowcostumes.world.item;

import com.marbledhubb.hallowcostumes.HallowCostumes;
import com.marbledhubb.hallowcostumes.world.item.custom.DefaultedGeoArmorItem;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, HallowCostumes.MOD_ID);

    //items
    public static final RegistryObject<Item> PROP_KNIFE = ITEMS.register("prop_knife", () -> new SwordItem(Tiers.WOOD,0, -2.4F,new Item.Properties().durability(64)));
    public static final RegistryObject<Item> PROP_KITCHEN_KNIFE = ITEMS.register("prop_kitchen_knife", () -> new SwordItem(Tiers.WOOD, 0, -2.4F,new Item.Properties().durability(64)));
    public static final RegistryObject<Item> FREDDYS_MICROPHONE = ITEMS.register("freddys_microphone", () -> new Item(new Item.Properties()));
//    public static final RegistryObject<Item> BONNIES_GUITAR = ITEMS.register("bonnies_guitar", () -> new Item(new Item.Properties()));
//    public static final RegistryObject<Item> CHICAS_CUPCAKE = ITEMS.register("chicas_cupcake", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FOXYS_HOOK = ITEMS.register("foxys_hook", () -> new SwordItem(Tiers.WOOD, 0, -2.4F,new Item.Properties().durability(64)));

    //armors
    public static final RegistryObject<Item> GHOSTFACE_HELMET = ITEMS.register("ghostface_helmet", () -> new DefaultedGeoArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Properties(), "ghostface_armor", "ghostface_armor"));
    public static final RegistryObject<Item> GHOSTFACE_CHESTPLATE = ITEMS.register("ghostface_chestplate", () -> new DefaultedGeoArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.CHESTPLATE, new Item.Properties(), "ghostface_armor", "ghostface_armor"));
    public static final RegistryObject<Item> GHOSTFACE_LEGGINGS = ITEMS.register("ghostface_leggings", () -> new DefaultedGeoArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.LEGGINGS, new Item.Properties(), "ghostface_armor", "ghostface_armor"));
    public static final RegistryObject<Item> GHOSTFACE_BOOTS = ITEMS.register("ghostface_boots", () -> new DefaultedGeoArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.BOOTS, new Item.Properties(), "ghostface_armor", "ghostface_armor"));

    public static final RegistryObject<Item> MICHAEL_MYERS_HELMET = ITEMS.register("michael_myers_helmet", () -> new DefaultedGeoArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Properties(), "michael_myers_armor", "michael_myers_armor"));
    public static final RegistryObject<Item> MICHAEL_MYERS_CHESTPLATE = ITEMS.register("michael_myers_chestplate", () -> new DefaultedGeoArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.CHESTPLATE, new Item.Properties(), "michael_myers_armor", "michael_myers_armor"));
    public static final RegistryObject<Item> MICHAEL_MYERS_LEGGINGS = ITEMS.register("michael_myers_leggings", () -> new DefaultedGeoArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.LEGGINGS, new Item.Properties(), "michael_myers_armor", "michael_myers_armor"));
    public static final RegistryObject<Item> MICHAEL_MYERS_BOOTS = ITEMS.register("michael_myers_boots", () -> new DefaultedGeoArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.BOOTS, new Item.Properties(), "michael_myers_armor", "michael_myers_armor"));

    public static final RegistryObject<Item> MUMMY_HELMET = ITEMS.register("mummy_helmet", () -> new DefaultedGeoArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Properties(), "mummy_armor", "mummy_armor"));
    public static final RegistryObject<Item> MUMMY_CHESTPLATE = ITEMS.register("mummy_chestplate", () -> new DefaultedGeoArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.CHESTPLATE, new Item.Properties(), "mummy_armor", "mummy_armor"));
    public static final RegistryObject<Item> MUMMY_LEGGINGS = ITEMS.register("mummy_leggings", () -> new DefaultedGeoArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.LEGGINGS, new Item.Properties(), "mummy_armor", "mummy_armor"));
    public static final RegistryObject<Item> MUMMY_BOOTS = ITEMS.register("mummy_boots", () -> new DefaultedGeoArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.BOOTS, new Item.Properties(), "mummy_armor", "mummy_armor"));

    public static final RegistryObject<Item> CLOWN_HELMET = ITEMS.register("clown_helmet", () -> new DefaultedGeoArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Properties(), "clown_armor", "clown_armor"));
    public static final RegistryObject<Item> CLOWN_CHESTPLATE = ITEMS.register("clown_chestplate", () -> new DefaultedGeoArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.CHESTPLATE, new Item.Properties(), "clown_armor", "clown_armor"));
    public static final RegistryObject<Item> CLOWN_LEGGINGS = ITEMS.register("clown_leggings", () -> new DefaultedGeoArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.LEGGINGS, new Item.Properties(), "clown_armor", "clown_armor"));
    public static final RegistryObject<Item> CLOWN_BOOTS = ITEMS.register("clown_boots", () -> new DefaultedGeoArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.BOOTS, new Item.Properties(), "clown_armor", "clown_armor"));

    public static final RegistryObject<Item> FRANKENSTEINS_MONSTER_HELMET = ITEMS.register("frankensteins_monster_helmet", () -> new DefaultedGeoArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Properties(), "frankensteins_monster_helmet", "frankensteins_monster_helmet"));

    public static final RegistryObject<Item> GHOST_HELMET = ITEMS.register("ghost_helmet", () -> new DefaultedGeoArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Properties(), "ghost_armor", "ghost_armor"));
    public static final RegistryObject<Item> GHOST_CHESTPLATE = ITEMS.register("ghost_chestplate", () -> new DefaultedGeoArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.CHESTPLATE, new Item.Properties(), "ghost_armor", "ghost_armor"));

    public static final RegistryObject<Item> FREDDY_HELMET = ITEMS.register("freddy_helmet", () -> new DefaultedGeoArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Properties(), "freddy_helmet", "freddy_helmet"));
    public static final RegistryObject<Item> BONNIE_HELMET = ITEMS.register("bonnie_helmet", () -> new DefaultedGeoArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Properties(), "bonnie_helmet", "bonnie_helmet"));
    public static final RegistryObject<Item> BONNIE_ALT_HELMET = ITEMS.register("bonnie_alt_helmet", () -> new DefaultedGeoArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Properties(), "bonnie_helmet", "bonnie_alt_helmet"));
    public static final RegistryObject<Item> CHICA_HELMET = ITEMS.register("chica_helmet", () -> new DefaultedGeoArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Properties(), "chica_helmet", "chica_helmet"));
    public static final RegistryObject<Item> FOXY_HELMET = ITEMS.register("foxy_helmet", () -> new DefaultedGeoArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Properties(), "foxy_helmet", "foxy_helmet"));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
