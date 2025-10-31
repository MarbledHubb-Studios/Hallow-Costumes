package com.marbledhubb.hallowcostumes.client.renderer;

import com.marbledhubb.hallowcostumes.client.model.MichealMyersArmorModel;
import com.marbledhubb.hallowcostumes.init.item.MichealMyersArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class MichealMyersArmorRenderer extends GeoArmorRenderer<MichealMyersArmorItem> {
    public MichealMyersArmorRenderer() {
        super(new MichealMyersArmorModel());
    }
}
