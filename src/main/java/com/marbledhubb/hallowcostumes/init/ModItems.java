package com.marbledhubb.hallowcostumes.init;

import com.marbledhubb.hallowcostumes.HallowCostumes;
import com.marbledhubb.hallowcostumes.init.item.FreddyArmorItem;
import com.marbledhubb.hallowcostumes.init.item.GhostFaceArmorItem;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(HallowCostumes.MODID);

    //items
    public static final DeferredItem<Item> PROP_KNIFE = ITEMS.register("prop_knife", () -> new SwordItem(Tiers.WOOD,new Item.Properties().durability(64).attributes(SwordItem.createAttributes(Tiers.WOOD, 0, -2.4F))));

    //armors
    public static final DeferredItem<Item> GHOSTFACE_HELMET = ITEMS.register("ghostface_helmet", () -> new GhostFaceArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final DeferredItem<Item> GHOSTFACE_CHESTPLATE = ITEMS.register("ghostface_chestplate", () -> new GhostFaceArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final DeferredItem<Item> GHOSTFACE_LEGGINGS = ITEMS.register("ghostface_leggings", () -> new GhostFaceArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final DeferredItem<Item> GHOSTFACE_BOOTS = ITEMS.register("ghostface_boots", () -> new GhostFaceArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.BOOTS, new Item.Properties()));;

    public static final DeferredItem<Item> FREDDY_HELMET = ITEMS.register("freddy_helmet", () -> new FreddyArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
