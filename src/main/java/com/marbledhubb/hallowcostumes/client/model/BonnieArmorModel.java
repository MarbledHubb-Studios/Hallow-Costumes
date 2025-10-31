package com.marbledhubb.hallowcostumes.client.model;

import com.marbledhubb.hallowcostumes.HallowCostumes;
import com.marbledhubb.hallowcostumes.init.item.BonnieArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class BonnieArmorModel extends GeoModel<BonnieArmorItem> {

    @Override
    public ResourceLocation getModelResource(BonnieArmorItem animatable) {
        return new ResourceLocation(HallowCostumes.MODID, "geo/bonnie_helmet.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(BonnieArmorItem animatable) {
        return new ResourceLocation(HallowCostumes.MODID, "textures/armor/bonnie_helmet.png");
    }

    @Override
    public ResourceLocation getAnimationResource(BonnieArmorItem animatable) {
        return new ResourceLocation(HallowCostumes.MODID, "animations/bonnie_helmet.animation.json");
    }
}
