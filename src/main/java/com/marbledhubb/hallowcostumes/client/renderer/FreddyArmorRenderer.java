package com.marbledhubb.hallowcostumes.client.renderer;

import com.marbledhubb.hallowcostumes.client.model.FreddyArmorModel;
import com.marbledhubb.hallowcostumes.client.model.GhostFaceArmorModel;
import com.marbledhubb.hallowcostumes.init.item.FreddyArmorItem;
import com.marbledhubb.hallowcostumes.init.item.GhostFaceArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class FreddyArmorRenderer extends GeoArmorRenderer<FreddyArmorItem> {
    public FreddyArmorRenderer() {
        super(new FreddyArmorModel());
    }
}
