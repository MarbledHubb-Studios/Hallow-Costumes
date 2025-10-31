package com.marbledhubb.hallowcostumes.client.model;

import com.marbledhubb.hallowcostumes.HallowCostumes;
import com.marbledhubb.hallowcostumes.init.item.MummyArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class MummyArmorModel extends GeoModel<MummyArmorItem> {

    @Override
    public ResourceLocation getModelResource(MummyArmorItem animatable) {
        return new ResourceLocation(HallowCostumes.MODID, "geo/mummy_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(MummyArmorItem animatable) {
        return new ResourceLocation(HallowCostumes.MODID, "textures/armor/mummy_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(MummyArmorItem animatable) {
        return new ResourceLocation(HallowCostumes.MODID, "animations/mummy_armor.animation.json");
    }
}
