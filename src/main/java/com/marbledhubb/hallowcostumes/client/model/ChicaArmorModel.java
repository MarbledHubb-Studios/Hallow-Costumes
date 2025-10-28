package com.marbledhubb.hallowcostumes.client.model;

import com.marbledhubb.hallowcostumes.HallowCostumes;
import com.marbledhubb.hallowcostumes.init.item.BonnieArmorItem;
import com.marbledhubb.hallowcostumes.init.item.ChicaArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class ChicaArmorModel extends GeoModel<ChicaArmorItem> {

    @Override
    public ResourceLocation getModelResource(ChicaArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(HallowCostumes.MODID, "geo/chica_helmet.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ChicaArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(HallowCostumes.MODID, "textures/armor/chica_helmet.png");
    }

    @Override
    public ResourceLocation getAnimationResource(ChicaArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(HallowCostumes.MODID, "animations/chica_helmet.animation.json");
    }
}
