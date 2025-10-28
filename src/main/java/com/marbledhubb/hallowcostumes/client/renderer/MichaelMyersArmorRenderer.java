package com.marbledhubb.hallowcostumes.client.renderer;

import com.marbledhubb.hallowcostumes.client.model.GhostFaceArmorModel;
import com.marbledhubb.hallowcostumes.client.model.MichaelMyersArmorModel;
import com.marbledhubb.hallowcostumes.init.item.GhostFaceArmorItem;
import com.marbledhubb.hallowcostumes.init.item.MichaelMyersArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class MichaelMyersArmorRenderer extends GeoArmorRenderer<MichaelMyersArmorItem> {
    public MichaelMyersArmorRenderer() {
        super(new MichaelMyersArmorModel());
    }
}
