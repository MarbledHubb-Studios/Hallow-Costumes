package com.marbledhubb.hallowcostumes.client.model;

import com.marbledhubb.hallowcostumes.HallowCostumes;
import com.marbledhubb.hallowcostumes.init.item.GhostFaceArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class GhostFaceArmorModel extends GeoModel<GhostFaceArmorItem> {

    @Override
    public ResourceLocation getModelResource(GhostFaceArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(HallowCostumes.MODID, "geo/ghostface_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(GhostFaceArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(HallowCostumes.MODID, "textures/armor/ghostface_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(GhostFaceArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(HallowCostumes.MODID, "animations/ghostface_armor.animation.json");
    }
}
