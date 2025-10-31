package com.marbledhubb.hallowcostumes.client.renderer;

import com.marbledhubb.hallowcostumes.client.model.MummyArmorModel;
import com.marbledhubb.hallowcostumes.init.item.MummyArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class MummyArmorRenderer extends GeoArmorRenderer<MummyArmorItem> {
    public MummyArmorRenderer() {
        super(new MummyArmorModel());
    }
}
