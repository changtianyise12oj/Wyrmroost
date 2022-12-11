package com.github.shannieann.wyrmroost.client.render.entity.dragon;

import com.github.shannieann.wyrmroost.client.model.entity.dragon.ModelRoyalRed;
import com.github.shannieann.wyrmroost.client.render.entity.dragon.layer.RiderLayer;
import com.github.shannieann.wyrmroost.entities.dragon.RoyalRedEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class RenderRoyalRed extends GeoEntityRenderer<RoyalRedEntity> {
    public RenderRoyalRed(EntityRendererProvider.Context renderManager) {
        super(renderManager, new ModelRoyalRed());
        this.addLayer(new RiderLayer<>(this));
        //TODO: Shadow?
    }
    //TODO: Scale upwards based on age

    @Override
    public RenderType getRenderType(RoyalRedEntity animatable, float partialTick, PoseStack poseStack, @Nullable MultiBufferSource bufferSource, @Nullable VertexConsumer buffer, int packedLight, ResourceLocation texture) {
        return RenderType.entityCutoutNoCull(texture);
    }
}