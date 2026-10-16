package com.marbledhubb.hallowcostumes.client.renderer.entity;

import com.marbledhubb.hallowcostumes.HallowCostumes;
import com.marbledhubb.hallowcostumes.world.item.custom.DefaultedGeoArmorItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import software.bernie.geckolib.model.GeoModel;

public class GeoArmorRenderer {
    private final software.bernie.geckolib.renderer.GeoArmorRenderer<DefaultedGeoArmorItem> renderer;

    public GeoArmorRenderer(String modelName, EquipmentSlot slot) {
        this(modelName, modelName, slot);
    }

    public GeoArmorRenderer(String modelName, String textureName, EquipmentSlot slot) {
        this.renderer = new software.bernie.geckolib.renderer.GeoArmorRenderer<>(new GeoModel<>() {
            @Override
            public ResourceLocation getModelResource(DefaultedGeoArmorItem animatable) {
                return ResourceLocation.fromNamespaceAndPath(HallowCostumes.MOD_ID, "geo/armor/%s.geo.json".formatted(modelName));
            }

            @Override
            public ResourceLocation getTextureResource(DefaultedGeoArmorItem animatable) {
                return ResourceLocation.fromNamespaceAndPath(HallowCostumes.MOD_ID, "textures/armor/%s.png".formatted(textureName));
            }

            @Override
            public ResourceLocation getAnimationResource(DefaultedGeoArmorItem animatable) {
                return null;
            }
        });

    }
}
