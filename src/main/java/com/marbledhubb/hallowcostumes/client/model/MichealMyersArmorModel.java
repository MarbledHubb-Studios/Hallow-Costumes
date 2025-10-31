package com.marbledhubb.hallowcostumes.client.model;

import com.marbledhubb.hallowcostumes.HallowCostumes;
import com.marbledhubb.hallowcostumes.init.item.MichealMyersArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class MichealMyersArmorModel extends GeoModel<MichealMyersArmorItem> {

    @Override
    public ResourceLocation getModelResource(MichealMyersArmorItem animatable) {
        return new ResourceLocation(HallowCostumes.MODID, "geo/michael_myers_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(MichealMyersArmorItem animatable) {
        return new ResourceLocation(HallowCostumes.MODID, "textures/armor/michael_myers_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(MichealMyersArmorItem animatable) {
        return new ResourceLocation(HallowCostumes.MODID, "animations/michael_myers_armor.animation.json");
    }
}
