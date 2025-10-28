package com.marbledhubb.hallowcostumes.client.renderer;

import com.marbledhubb.hallowcostumes.client.model.BonnieArmorModel;
import com.marbledhubb.hallowcostumes.client.model.ChicaArmorModel;
import com.marbledhubb.hallowcostumes.init.item.BonnieArmorItem;
import com.marbledhubb.hallowcostumes.init.item.ChicaArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class ChicaArmorRenderer extends GeoArmorRenderer<ChicaArmorItem> {
    public ChicaArmorRenderer() {
        super(new ChicaArmorModel());
    }
}
