package com.marbledhubb.hallowcostumes.client.model;

import com.marbledhubb.hallowcostumes.HallowCostumes;
import com.marbledhubb.hallowcostumes.init.item.GhostFaceArmorItem;
import com.marbledhubb.hallowcostumes.init.item.MichaelMyersArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class MichaelMyersArmorModel extends GeoModel<MichaelMyersArmorItem> {

    @Override
    public ResourceLocation getModelResource(MichaelMyersArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(HallowCostumes.MODID, "geo/michael_myers_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(MichaelMyersArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(HallowCostumes.MODID, "textures/armor/michael_myers_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(MichaelMyersArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(HallowCostumes.MODID, "animations/michael_myers_armor.animation.json");
    }
}
