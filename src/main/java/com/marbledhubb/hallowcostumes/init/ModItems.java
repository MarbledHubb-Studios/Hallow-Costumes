package com.marbledhubb.hallowcostumes.init;

import com.marbledhubb.hallowcostumes.HallowCostumes;
import com.marbledhubb.hallowcostumes.init.item.*;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(HallowCostumes.MODID);

    //items
    public static final DeferredItem<Item> PROP_KNIFE = ITEMS.register("prop_knife", () -> new SwordItem(Tiers.WOOD,new Item.Properties().durability(64).attributes(SwordItem.createAttributes(Tiers.WOOD, 0, -2.4F))));
    public static final DeferredItem<Item> PROP_KITCHEN_KNIFE = ITEMS.register("prop_kitchen_knife", () -> new SwordItem(Tiers.WOOD,new Item.Properties().durability(64).attributes(SwordItem.createAttributes(Tiers.WOOD, 1, -2.4F))));
    public static final DeferredItem<Item> FREDDYS_MICROPHONE = ITEMS.registerSimpleItem("freddys_microphone");


    //armors
    public static final DeferredItem<Item> GHOSTFACE_HELMET = ITEMS.register("ghostface_helmet", () -> new GhostFaceArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final DeferredItem<Item> GHOSTFACE_CHESTPLATE = ITEMS.register("ghostface_chestplate", () -> new GhostFaceArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final DeferredItem<Item> GHOSTFACE_LEGGINGS = ITEMS.register("ghostface_leggings", () -> new GhostFaceArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final DeferredItem<Item> GHOSTFACE_BOOTS = ITEMS.register("ghostface_boots", () -> new GhostFaceArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.BOOTS, new Item.Properties()));;

    public static final DeferredItem<Item> MICHAEL_MYERS_HELMET = ITEMS.register("michael_myers_helmet", () -> new MichaelMyersArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final DeferredItem<Item> MICHAEL_MYERS_CHESTPLATE = ITEMS.register("michael_myers_chestplate", () -> new MichaelMyersArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final DeferredItem<Item> MICHAEL_MYERS_LEGGINGS = ITEMS.register("michael_myers_leggings", () -> new MichaelMyersArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final DeferredItem<Item> MICHAEL_MYERS_BOOTS = ITEMS.register("michael_myers_boots", () -> new MichaelMyersArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final DeferredItem<Item> MUMMY_HELMET = ITEMS.register("mummy_helmet", () -> new MummyArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final DeferredItem<Item> MUMMY_CHESTPLATE = ITEMS.register("mummy_chestplate", () -> new MummyArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final DeferredItem<Item> MUMMY_LEGGINGS = ITEMS.register("mummy_leggings", () -> new MummyArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final DeferredItem<Item> MUMMY_BOOTS = ITEMS.register("mummy_boots", () -> new MummyArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final DeferredItem<Item> FREDDY_HELMET = ITEMS.register("freddy_helmet", () -> new FreddyArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final DeferredItem<Item> BONNIE_HELMET = ITEMS.register("bonnie_helmet", () -> new BonnieArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final DeferredItem<Item> BONNIE_ALT_HELMET = ITEMS.register("bonnie_alt_helmet", () -> new BonnieAltArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final DeferredItem<Item> CHICA_HELMET = ITEMS.register("chica_helmet", () -> new ChicaArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final DeferredItem<Item> FOXY_HELMET = ITEMS.register("foxy_helmet", () -> new FoxyArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
