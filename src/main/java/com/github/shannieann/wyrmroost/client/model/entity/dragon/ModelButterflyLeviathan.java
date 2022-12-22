package com.github.shannieann.wyrmroost.client.model.entity.dragon;

import com.github.shannieann.wyrmroost.Wyrmroost;
import com.github.shannieann.wyrmroost.entities.dragon.EntityButterflyLeviathan;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

public class ModelButterflyLeviathan extends AnimatedGeoModel<EntityButterflyLeviathan>
{
    private static final ResourceLocation ANIMATION_RESOURCE = new ResourceLocation(Wyrmroost.MOD_ID, "animations/entity/dragon/butterfly_leviathan/butterfly_leviathan.json");

    //TODO: All model variants
    //TODO: Conduits
    @Override
    public ResourceLocation getModelLocation(EntityButterflyLeviathan object) {
        String modelLocation = "geo/entity/dragon/butterfly_leviathan/butterfly_leviathan.geo.json";
        return new ResourceLocation(Wyrmroost.MOD_ID, modelLocation);
    }

    @Override
    public ResourceLocation getTextureLocation(EntityButterflyLeviathan object) {
        int variant = object.getVariant();
        if (variant < -1) {
            variant = 0;
        } else if (variant > 1) {
            variant = 0;
        }
        String textureLocation = "textures/entity/dragon/butterfly_leviathan/butterfly_leviathan_" + object.getVariant() +".png";
        return new ResourceLocation(Wyrmroost.MOD_ID, textureLocation);
    }

    @Override
    public ResourceLocation getAnimationFileLocation(EntityButterflyLeviathan animatable) {
        return ANIMATION_RESOURCE;
    }

    @Override
    public void setCustomAnimations(EntityButterflyLeviathan animatable, int instanceId, AnimationEvent animationEvent) {
        super.setCustomAnimations(animatable, instanceId, animationEvent);
        float rotationYawMultiplier = 1.4F;
        float rotationPitchMultiplier = 10.0F;


        IBone head = this.getAnimationProcessor().getBone("head");
        EntityModelData extraData = (EntityModelData) animationEvent.getExtraDataOfType(EntityModelData.class).get(0);
        if (head != null) {
            head.setRotationY(extraData.netHeadYaw * Mth.DEG_TO_RAD);
            if (!animatable.isUsingSwimmingNavigator()) {
                head.setRotationX(extraData.headPitch * Mth.DEG_TO_RAD);
            }
        }


        float setPitchValue;
        if (animatable.isUsingSwimmingNavigator()) {
            if (!animatable.getBreaching()) {
                setPitchValue = (animatable.currentPitchRadians+(animatable.targetPitchRadians-animatable.currentPitchRadians)*animationEvent.getPartialTick());
            } else {
                setPitchValue = animatable.currentPitchRadians;
            }
            this.getAnimationProcessor().getBone("ibody1").setRotationX(-setPitchValue);
        }

        if (animatable.isUsingSwimmingNavigator() && !animatable.getBreaching()) {
            //deltaYaw operations
            float setYawValue = animatable.prevSetYaw+(animatable.setYaw-animatable.prevSetYaw)*animationEvent.getPartialTick();
            this.getAnimationProcessor().getBone("ibody2").setRotationY(setYawValue * rotationYawMultiplier);
            this.getAnimationProcessor().getBone("itail1").setRotationY(setYawValue * rotationYawMultiplier);
            this.getAnimationProcessor().getBone("itail2").setRotationY(setYawValue * rotationYawMultiplier);
            this.getAnimationProcessor().getBone("itail3").setRotationY(setYawValue * rotationYawMultiplier);
            this.getAnimationProcessor().getBone("itail4").setRotationY(setYawValue * rotationYawMultiplier);
            this.getAnimationProcessor().getBone("itail5").setRotationY(setYawValue * rotationYawMultiplier);
            this.getAnimationProcessor().getBone("itail7").setRotationY(setYawValue * rotationYawMultiplier);
            this.getAnimationProcessor().getBone("itail6").setRotationY(setYawValue * rotationYawMultiplier);
            this.getAnimationProcessor().getBone("ineck1").setRotationY(-setYawValue * rotationYawMultiplier);
            this.getAnimationProcessor().getBone("ineck2").setRotationY(-setYawValue * rotationYawMultiplier);
            this.getAnimationProcessor().getBone("ineck3").setRotationY(-setYawValue * rotationYawMultiplier);
            this.getAnimationProcessor().getBone("ineck4").setRotationY(-setYawValue * rotationYawMultiplier);
            //deltaPitch operations
            float setExtremityPitchValue = animatable.prevSetExtremityPitch+(animatable.setExtremityPitch-animatable.prevSetExtremityPitch)*animationEvent.getPartialTick();
            this.getAnimationProcessor().getBone("ineck1").setRotationX(-setExtremityPitchValue * rotationPitchMultiplier);
            this.getAnimationProcessor().getBone("itail1").setRotationX(-setExtremityPitchValue * rotationPitchMultiplier);
        }
    }
}