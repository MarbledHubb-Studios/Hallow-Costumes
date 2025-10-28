package com.marbledhubb.hallowcostumes.client.renderer;

import com.marbledhubb.hallowcostumes.client.model.BonnieAltArmorModel;
import com.marbledhubb.hallowcostumes.client.model.BonnieArmorModel;
import com.marbledhubb.hallowcostumes.init.item.BonnieAltArmorItem;
import com.marbledhubb.hallowcostumes.init.item.BonnieArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class BonnieAltArmorRenderer extends GeoArmorRenderer<BonnieAltArmorItem> {
    public BonnieAltArmorRenderer() {
        super(new BonnieAltArmorModel());
    }
}
