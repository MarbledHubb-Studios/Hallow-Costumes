package com.marbledhubb.hallowcostumes.client.renderer;

import com.marbledhubb.hallowcostumes.client.model.GhostFaceArmorModel;
import com.marbledhubb.hallowcostumes.init.item.GhostFaceArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class GhostFaceArmorRenderer extends GeoArmorRenderer<GhostFaceArmorItem> {
    public GhostFaceArmorRenderer() {
        super(new GhostFaceArmorModel());
    }
}
