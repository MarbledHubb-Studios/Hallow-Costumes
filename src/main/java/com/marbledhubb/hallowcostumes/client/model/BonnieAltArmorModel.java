package com.marbledhubb.hallowcostumes.client.model;

import com.marbledhubb.hallowcostumes.HallowCostumes;
import com.marbledhubb.hallowcostumes.init.item.BonnieAltArmorItem;
import com.marbledhubb.hallowcostumes.init.item.BonnieArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class BonnieAltArmorModel extends GeoModel<BonnieAltArmorItem> {

    @Override
    public ResourceLocation getModelResource(BonnieAltArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(HallowCostumes.MODID, "geo/bonnie_helmet.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(BonnieAltArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(HallowCostumes.MODID, "textures/armor/bonnie_alt_helmet.png");
    }

    @Override
    public ResourceLocation getAnimationResource(BonnieAltArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(HallowCostumes.MODID, "animations/bonnie_helmet.animation.json");
    }
}
