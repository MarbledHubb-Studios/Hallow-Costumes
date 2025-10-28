package com.marbledhubb.hallowcostumes.client.model;

import com.marbledhubb.hallowcostumes.HallowCostumes;
import com.marbledhubb.hallowcostumes.init.item.BonnieArmorItem;
import com.marbledhubb.hallowcostumes.init.item.FoxyArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class FoxyArmorModel extends GeoModel<FoxyArmorItem> {

    @Override
    public ResourceLocation getModelResource(FoxyArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(HallowCostumes.MODID, "geo/foxy_helmet.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(FoxyArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(HallowCostumes.MODID, "textures/armor/foxy_helmet.png");
    }

    @Override
    public ResourceLocation getAnimationResource(FoxyArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(HallowCostumes.MODID, "animations/foxy_helmet.animation.json");
    }
}
