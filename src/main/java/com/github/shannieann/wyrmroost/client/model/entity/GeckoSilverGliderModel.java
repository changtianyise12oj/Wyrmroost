package com.github.shannieann.wyrmroost.client.model.entity;

import com.github.shannieann.wyrmroost.Wyrmroost;
import com.github.shannieann.wyrmroost.entities.dragon.SilverGliderEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

import static com.github.shannieann.wyrmroost.util.ModUtils.TEXTURE_FOLDER;

public class GeckoSilverGliderModel<T extends SilverGliderEntity> extends AnimatedGeoModel<T> {

    private static final ResourceLocation modelResource = new ResourceLocation(Wyrmroost.MOD_ID, "geo/entity/canari_wyvern.geo.json");
    private static final ResourceLocation animationResource = new ResourceLocation(Wyrmroost.MOD_ID, "animations/canari_wyvern.animation.json");

    @Override
    public ResourceLocation getModelLocation(T object) {
        return modelResource;
    }

    @Override
    public ResourceLocation getTextureLocation(SilverGliderEntity dragon) {
        if (dragon.hasCustomName() && dragon.getCustomName().getContents().equalsIgnoreCase("lady")){
            return new ResourceLocation(Wyrmroost.MOD_ID, TEXTURE_FOLDER + "canari_wyvern/lady.png");
        }
        String gender = dragon.isMale()? "m" : "f";
        int variant = dragon.getVariant();
        return new ResourceLocation(Wyrmroost.MOD_ID, TEXTURE_FOLDER + "canari_wyvern/body_" + gender + variant + ".png");
    }

    @Override
    public void setCustomAnimations(T animatable, int instanceId, AnimationEvent animationEvent) {
        super.setCustomAnimations(animatable, instanceId, animationEvent);
        IBone head = this.getAnimationProcessor().getBone("neck1");

        EntityModelData extraData = (EntityModelData) animationEvent.getExtraDataOfType(EntityModelData.class).get(0);
        if (head != null) {
            head.setRotationX(extraData.headPitch * Mth.DEG_TO_RAD);
            head.setRotationY(extraData.netHeadYaw * Mth.DEG_TO_RAD);
        }
    }

    @Override
    public ResourceLocation getAnimationFileLocation(T animatable) {
        return animationResource;
    }

}