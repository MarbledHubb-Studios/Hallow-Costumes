package com.marbledhubb.hallowcostumes.world.item.custom;

import com.marbledhubb.hallowcostumes.HallowCostumes;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.animatable.client.GeoRenderProvider;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animation.AnimatableManager;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;
import software.bernie.geckolib.util.GeckoLibUtil;

import java.util.function.Consumer;

public class DefaultedGeoArmorItem extends ArmorItem implements GeoItem {
    private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);
    private final String modelName;
    private final String textureName;

    public DefaultedGeoArmorItem(Holder<ArmorMaterial> armorMaterial, Type type, Properties properties, String modelName) {
        this(armorMaterial, type, properties, modelName, modelName);
    }


    public DefaultedGeoArmorItem(Holder<ArmorMaterial> armorMaterial, Type type, Properties properties, String modelName, String textureName) {
        super(armorMaterial, type, properties);
        this.modelName = modelName;
        this.textureName = textureName;
    }

    @Override
    public void createGeoRenderer(Consumer<GeoRenderProvider> consumer)  {
        consumer.accept(new GeoRenderProvider() {
            private GeoArmorRenderer<DefaultedGeoArmorItem> renderer;

            @Override
            public <T extends LivingEntity> HumanoidModel<?> getGeoArmorRenderer(T livingEntity, ItemStack itemStack, EquipmentSlot equipmentSlot, HumanoidModel<T> original) {
                if (renderer == null)
                    renderer = new GeoArmorRenderer<>(new GeoModel<>() {
                        @Override
                        public ResourceLocation getModelResource(DefaultedGeoArmorItem animatable) {
                            return ResourceLocation.fromNamespaceAndPath(HallowCostumes.MOD_ID, "geo/armor/%s.geo.json".formatted(modelName));
                        }

                        @Override
                        public ResourceLocation getTextureResource(DefaultedGeoArmorItem animatable) {
                            return ResourceLocation.fromNamespaceAndPath(HallowCostumes.MOD_ID, "textures/armor/%s.png".formatted(textureName));
                        }

                        @Override
                        public ResourceLocation getAnimationResource(DefaultedGeoArmorItem animatable) {
                            return null;
                        }
                    });

                return renderer;
            }
        });
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {

    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.cache;
    }
}
