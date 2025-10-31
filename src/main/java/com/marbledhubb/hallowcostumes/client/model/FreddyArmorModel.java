package com.marbledhubb.hallowcostumes.client.model;

import com.marbledhubb.hallowcostumes.HallowCostumes;
import com.marbledhubb.hallowcostumes.init.item.FreddyArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class FreddyArmorModel extends GeoModel<FreddyArmorItem> {

    @Override
    public ResourceLocation getModelResource(FreddyArmorItem animatable) {
        return new ResourceLocation(HallowCostumes.MODID, "geo/freddy_helmet.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(FreddyArmorItem animatable) {
        return new ResourceLocation(HallowCostumes.MODID, "textures/armor/freddy_helmet.png");
    }

    @Override
    public ResourceLocation getAnimationResource(FreddyArmorItem animatable) {
        return new ResourceLocation(HallowCostumes.MODID, "animations/freddy_helmet.animation.json");
    }
}
