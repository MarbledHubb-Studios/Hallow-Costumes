package com.marbledhubb.hallowcostumes.client.renderer;

import com.marbledhubb.hallowcostumes.client.model.FoxyArmorModel;
import com.marbledhubb.hallowcostumes.init.item.FoxyArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class FoxyArmorRenderer extends GeoArmorRenderer<FoxyArmorItem> {
    public FoxyArmorRenderer() {
        super(new FoxyArmorModel());
    }
}
