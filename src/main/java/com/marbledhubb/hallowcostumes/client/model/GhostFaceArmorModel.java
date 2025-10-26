package com.marbledhubb.hallowcostumes.client.model;

import com.marbledhubb.hallowcostumes.HallowCostumes;
import com.marbledhubb.hallowcostumes.init.armoritems.GhostFaceArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class GhostFaceArmorModel extends GeoModel<GhostFaceArmorItem> {

    @Override
    public ResourceLocation getModelResource(GhostFaceArmorItem animatable) {
        return new ResourceLocation(HallowCostumes.MODID, "geo/ghillie_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(GhostFaceArmorItem animatable) {
        return new ResourceLocation(HallowCostumes.MODID, "textures/armor/acacia_ghillie_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(GhostFaceArmorItem animatable) {
        return new ResourceLocation(HallowCostumes.MODID, "animations/ghillie_armor.animation.json");
    }
}
