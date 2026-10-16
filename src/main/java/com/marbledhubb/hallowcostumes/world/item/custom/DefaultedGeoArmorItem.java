package com.marbledhubb.hallowcostumes.world.item.custom;

import com.marbledhubb.hallowcostumes.HallowCostumes;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;
import org.jetbrains.annotations.NotNull;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animation.AnimatableManager;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;
import software.bernie.geckolib.util.GeckoLibUtil;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class DefaultedGeoArmorItem extends ArmorItem implements GeoItem {
    private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);
    protected final Supplier<GeoArmorRenderer<DefaultedGeoArmorItem>> rendererSupplier;

    public DefaultedGeoArmorItem(ArmorMaterial armorMaterial, Type type, Properties properties, String modelName) {
        this(armorMaterial, type, properties, modelName, modelName);
    }


    public DefaultedGeoArmorItem(ArmorMaterial armorMaterial, Type type, Properties properties, String modelName, String textureName) {
        this(armorMaterial, type, properties, () -> new GeoArmorRenderer<>(new GeoModel<>() {
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
        }));
    }

    public DefaultedGeoArmorItem(ArmorMaterial armorMaterial, Type type, Properties properties, Supplier<GeoArmorRenderer<DefaultedGeoArmorItem>> rendererSupplier) {
        super(armorMaterial, type, properties);
        this.rendererSupplier = rendererSupplier;
    }

    @Override
    public void initializeClient(Consumer<IClientItemExtensions> consumer) {
        consumer.accept(new IClientItemExtensions() {
            private GeoArmorRenderer<DefaultedGeoArmorItem> renderer;

            @Override
            public @NotNull HumanoidModel<?> getHumanoidArmorModel(LivingEntity livingEntity, ItemStack itemStack, EquipmentSlot equipmentSlot, HumanoidModel<?> original) {
                if (renderer == null) renderer = rendererSupplier.get();

                renderer.prepForRender(livingEntity, itemStack, equipmentSlot, original);
                return renderer;
            }
        });
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllerRegistrar) {

    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.cache;
    }
}
