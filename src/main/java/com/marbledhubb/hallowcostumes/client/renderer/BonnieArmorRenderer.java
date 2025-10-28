package com.marbledhubb.hallowcostumes.client.renderer;

import com.marbledhubb.hallowcostumes.client.model.BonnieArmorModel;
import com.marbledhubb.hallowcostumes.client.model.FreddyArmorModel;
import com.marbledhubb.hallowcostumes.init.item.BonnieArmorItem;
import com.marbledhubb.hallowcostumes.init.item.FreddyArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class BonnieArmorRenderer extends GeoArmorRenderer<BonnieArmorItem> {
    public BonnieArmorRenderer() {
        super(new BonnieArmorModel());
    }
}
