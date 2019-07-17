package WolfShotz.Wyrmroost.content.entities.owdrake;

import WolfShotz.Wyrmroost.util.ModUtils;
import WolfShotz.Wyrmroost.util.animtools.BaseModel;
import WolfShotz.Wyrmroost.util.animtools.BaseRenderer;
import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.entity.Entity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * WR Overworld Drake - Ukan
 * Created using Tabula 7.0.1
 */
@OnlyIn(Dist.CLIENT)
public class OWDrakeModel<T extends Entity> extends BaseModel<T>
{
    public BaseRenderer body1;
    public BaseRenderer body2;
    public BaseRenderer neck1;
    public BaseRenderer arm1L;
    public BaseRenderer arm1R;
    public BaseRenderer tail1;
    public BaseRenderer leg1L;
    public BaseRenderer leg1R;
    public BaseRenderer tail2;
    public BaseRenderer tail3;
    public BaseRenderer tail4;
    public BaseRenderer tail5;
    public BaseRenderer leg2L;
    public BaseRenderer leg3L;
    public BaseRenderer footL;
    public BaseRenderer toe2L;
    public BaseRenderer toe1L;
    public BaseRenderer toe1L_1;
    public BaseRenderer leg2R;
    public BaseRenderer leg3R;
    public BaseRenderer footR;
    public BaseRenderer toe2R;
    public BaseRenderer toe1R;
    public BaseRenderer toe1R_1;
    public BaseRenderer neck2;
    public BaseRenderer head;
    public BaseRenderer snout;
    public BaseRenderer jaw;
    public BaseRenderer eyeL;
    public BaseRenderer eyeR;
    public BaseRenderer horn11L;
    public BaseRenderer horn11R;
    public BaseRenderer horn31L;
    public BaseRenderer horn31R;
    public BaseRenderer horn51;
    public BaseRenderer horn52;
    public BaseRenderer horn53;
    public BaseRenderer horn12L;
    public BaseRenderer horn12R;
    public BaseRenderer horn32L;
    public BaseRenderer horn33L;
    public BaseRenderer horn32R;
    public BaseRenderer horn33R;
    public BaseRenderer arm2L;
    public BaseRenderer palmL;
    public BaseRenderer claw21L;
    public BaseRenderer claw11L;
    public BaseRenderer claw22L;
    public BaseRenderer claw12L;
    public BaseRenderer arm2R;
    public BaseRenderer palmR;
    public BaseRenderer claw21R;
    public BaseRenderer claw11R;
    public BaseRenderer claw22R;
    public BaseRenderer claw12R;

    private BaseRenderer[] headArray;
    private BaseRenderer[] tailArray;

    public OWDrakeModel() {
        this.textureWidth = 200;
        this.textureHeight = 200;
        this.claw12L = new BaseRenderer(this, 129, 79);
        this.claw12L.setRotationPoint(-0.05F, -0.4F, -2.2F);
        this.claw12L.addBox(-0.5F, -1.0F, -3.0F, 1, 2, 3, 0.0F);
        this.setRotateAngle(claw12L, 0.9105382707654417F, 0.0F, 0.0F);
        this.arm2L = new BaseRenderer(this, 111, 76);
        this.arm2L.setRotationPoint(1.45F, 5.5F, 0.5F);
        this.arm2L.addBox(-1.5F, 0.0F, -2.0F, 3, 7, 3, 0.0F);
        this.setRotateAngle(arm2L, -0.36425021489121656F, 0.0F, 0.0F);
        this.leg3R = new BaseRenderer(this, 60, 94);
        this.leg3R.setRotationPoint(-0.05F, 4.0F, 1.8F);
        this.leg3R.addBox(-1.5F, 0.0F, -2.0F, 3, 6, 3, 0.0F);
        this.setRotateAngle(leg3R, -0.6829473363053812F, 0.0F, 0.0F);
        this.eyeR = new BaseRenderer(this, 67, 40);
        this.eyeR.mirror = true;
        this.eyeR.setRotationPoint(-3.5F, -2.0F, -4.0F);
        this.eyeR.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(eyeR, 0.0F, 0.8651597102135892F, 0.0F);
        this.claw22R = new BaseRenderer(this, 129, 79);
        this.claw22R.setRotationPoint(-0.05F, -0.4F, -2.2F);
        this.claw22R.addBox(-0.5F, -1.0F, -3.0F, 1, 2, 3, 0.0F);
        this.setRotateAngle(claw22R, 0.9105382707654417F, 0.0F, 0.0F);
        this.arm1R = new BaseRenderer(this, 111, 61);
        this.arm1R.mirror = true;
        this.arm1R.setRotationPoint(-2.0F, 1.3F, -2.0F);
        this.arm1R.addBox(-3.0F, -1.0F, -2.0F, 3, 8, 4, 0.0F);
        this.setRotateAngle(arm1R, -0.22759093446006054F, 0.31869712141416456F, 0.0F);
        this.tail2 = new BaseRenderer(this, 0, 55);
        this.tail2.setRotationPoint(0.0F, 0.15F, 6.0F);
        this.tail2.addBox(-3.0F, -3.0F, 0.0F, 6, 5, 8, 0.0F);
        this.setRotateAngle(tail2, -0.22759093446006054F, 0.0F, 0.0F);
        this.tail4 = new BaseRenderer(this, 0, 85);
        this.tail4.setRotationPoint(0.0F, -0.25F, 6.0F);
        this.tail4.addBox(-2.0F, -1.5F, 0.0F, 4, 3, 8, 0.0F);
        this.setRotateAngle(tail4, 0.18203784098300857F, 0.0F, 0.0F);
        this.toe1R_1 = new BaseRenderer(this, 77, 85);
        this.toe1R_1.setRotationPoint(-1.4F, -0.5F, -2.5F);
        this.toe1R_1.addBox(-0.5F, -0.5F, -3.5F, 1, 2, 4, 0.0F);
        this.setRotateAngle(toe1R_1, -0.8726646259971648F, 0.31869712141416456F, 0.0F);
        this.horn12R = new BaseRenderer(this, 95, 32);
        this.horn12R.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.horn12R.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 6, 0.0F);
        this.setRotateAngle(horn12R, -0.18203784098300857F, 0.22759093446006054F, 0.0F);
        this.toe2L = new BaseRenderer(this, 77, 85);
        this.toe2L.setRotationPoint(0.0F, -0.5F, -2.5F);
        this.toe2L.addBox(-0.5F, -0.5F, -3.5F, 1, 2, 4, 0.0F);
        this.setRotateAngle(toe2L, -0.8726646259971648F, 0.0F, 0.0F);
        this.toe1L_1 = new BaseRenderer(this, 77, 85);
        this.toe1L_1.setRotationPoint(-1.4F, -0.5F, -2.5F);
        this.toe1L_1.addBox(-0.5F, -0.5F, -3.5F, 1, 2, 4, 0.0F);
        this.setRotateAngle(toe1L_1, -0.8726646259971648F, 0.31869712141416456F, 0.0F);
        this.footR = new BaseRenderer(this, 60, 85);
        this.footR.setRotationPoint(-0.0F, 5.5F, -0.3F);
        this.footR.addBox(-2.0F, -1.0F, -3.0F, 4, 2, 4, 0.0F);
        this.setRotateAngle(footR, 0.8651597102135892F, 0.0F, 0.0F);
        this.claw12R = new BaseRenderer(this, 129, 79);
        this.claw12R.setRotationPoint(-0.05F, -0.4F, -2.2F);
        this.claw12R.addBox(-0.5F, -1.0F, -3.0F, 1, 2, 3, 0.0F);
        this.setRotateAngle(claw12R, 0.9105382707654417F, 0.0F, 0.0F);
        this.leg1L = new BaseRenderer(this, 42, 79);
        this.leg1L.mirror = true;
        this.leg1L.setRotationPoint(3.0F, 1.8F, 6.0F);
        this.leg1L.addBox(0.2F, -1.2F, -2.5F, 3, 7, 5, 0.0F);
        this.toe2R = new BaseRenderer(this, 77, 85);
        this.toe2R.setRotationPoint(0.0F, -0.5F, -2.5F);
        this.toe2R.addBox(-0.5F, -0.5F, -3.5F, 1, 2, 4, 0.0F);
        this.setRotateAngle(toe2R, -0.8726646259971648F, 0.0F, 0.0F);
        this.horn32R = new BaseRenderer(this, 95, 24);
        this.horn32R.setRotationPoint(0.0F, 0.0F, 3.2F);
        this.horn32R.addBox(-1.0F, -0.5F, 0.0F, 2, 1, 4, 0.0F);
        this.setRotateAngle(horn32R, 0.0F, -0.7740535232594852F, -0.18203784098300857F);
        this.horn52 = new BaseRenderer(this, 97, 10);
        this.horn52.setRotationPoint(0.05F, -3.6F, -0.2F);
        this.horn52.addBox(-1.0F, -3.0F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(horn52, -0.4553564018453205F, 0.0F, 0.0F);
        this.palmR = new BaseRenderer(this, 129, 61);
        this.palmR.setRotationPoint(-0.5F, 6.5F, 0.0F);
        this.palmR.addBox(-1.5F, -1.0F, -3.0F, 4, 2, 4, 0.0F);
        this.setRotateAngle(palmR, 0.3490658503988659F, 0.0F, 0.0F);
        this.leg2L = new BaseRenderer(this, 42, 94);
        this.leg2L.mirror = true;
        this.leg2L.setRotationPoint(1.65F, 4.5F, -1.3F);
        this.leg2L.addBox(-1.5F, 0.0F, -1.5F, 3, 5, 4, 0.0F);
        this.setRotateAngle(leg2L, 0.6373942428283291F, 0.0F, 0.0F);
        this.claw21R = new BaseRenderer(this, 129, 71);
        this.claw21R.setRotationPoint(-0.3F, 0.0F, -2.0F);
        this.claw21R.addBox(-0.5F, -1.0F, -3.0F, 1, 2, 3, 0.0F);
        this.setRotateAngle(claw21R, -0.31869712141416456F, 0.27314402793711257F, 0.0F);
        this.horn11R = new BaseRenderer(this, 79, 32);
        this.horn11R.setRotationPoint(-3.0F, -2.0F, -0.5F);
        this.horn11R.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 4, 0.0F);
        this.setRotateAngle(horn11R, 0.40980330836826856F, -0.27314402793711257F, -0.27314402793711257F);
        this.horn12L = new BaseRenderer(this, 95, 32);
        this.horn12L.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.horn12L.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 6, 0.0F);
        this.setRotateAngle(horn12L, -0.18203784098300857F, -0.22759093446006054F, 0.0F);
        this.neck1 = new BaseRenderer(this, 40, 0);
        this.neck1.setRotationPoint(0.0F, -0.5F, -3.0F);
        this.neck1.addBox(-3.5F, -3.0F, -5.0F, 7, 6, 5, 0.0F);
        this.setRotateAngle(neck1, -0.8196066167365371F, 0.0F, 0.0F);
        this.horn31L = new BaseRenderer(this, 79, 22);
        this.horn31L.setRotationPoint(2.6F, 0.5F, -0.9F);
        this.horn31L.addBox(-1.5F, -1.0F, 0.0F, 3, 2, 4, 0.0F);
        this.setRotateAngle(horn31L, -0.36425021489121656F, 2.0032889154390916F, 0.091106186954104F);
        this.horn51 = new BaseRenderer(this, 80, 7);
        this.horn51.setRotationPoint(0.0F, 0.0F, -2.6F);
        this.horn51.addBox(-1.0F, -4.0F, -1.5F, 2, 4, 3, 0.0F);
        this.setRotateAngle(horn51, 1.1383037381507017F, 0.0F, 0.0F);
        this.horn32L = new BaseRenderer(this, 95, 24);
        this.horn32L.setRotationPoint(0.0F, 0.0F, 3.2F);
        this.horn32L.addBox(-1.0F, -0.5F, 0.0F, 2, 1, 4, 0.0F);
        this.setRotateAngle(horn32L, 0.0F, 0.7740535232594852F, 0.18203784098300857F);
        this.claw22L = new BaseRenderer(this, 129, 79);
        this.claw22L.setRotationPoint(-0.05F, -0.4F, -2.2F);
        this.claw22L.addBox(-0.5F, -1.0F, -3.0F, 1, 2, 3, 0.0F);
        this.setRotateAngle(claw22L, 0.9105382707654417F, 0.0F, 0.0F);
        this.eyeL = new BaseRenderer(this, 67, 40);
        this.eyeL.setRotationPoint(3.5F, -2.0F, -4.0F);
        this.eyeL.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(eyeL, 0.0F, -0.8651597102135892F, 0.0F);
        this.body2 = new BaseRenderer(this, 0, 20);
        this.body2.setRotationPoint(0.0F, -1.55F, 4.0F);
        this.body2.addBox(-4.5F, -2.0F, 0.0F, 9, 7, 10, 0.0F);
        this.setRotateAngle(body2, -0.18203784098300857F, 0.0F, 0.0F);
        this.horn31R = new BaseRenderer(this, 79, 22);
        this.horn31R.setRotationPoint(-2.6F, 0.5F, -0.9F);
        this.horn31R.addBox(-1.5F, -1.0F, 0.0F, 3, 2, 4, 0.0F);
        this.setRotateAngle(horn31R, -0.36425021489121656F, -2.0032889154390916F, -0.091106186954104F);
        this.horn11L = new BaseRenderer(this, 79, 32);
        this.horn11L.setRotationPoint(3.0F, -2.0F, -0.5F);
        this.horn11L.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 4, 0.0F);
        this.setRotateAngle(horn11L, 0.40980330836826856F, 0.27314402793711257F, 0.27314402793711257F);
        this.tail5 = new BaseRenderer(this, 0, 102);
        this.tail5.setRotationPoint(0.0F, -0.25F, 6.0F);
        this.tail5.addBox(-1.5F, -1.0F, 0.0F, 3, 2, 8, 0.0F);
        this.setRotateAngle(tail5, 0.27314402793711257F, 0.0F, 0.0F);
        this.jaw = new BaseRenderer(this, 72, 46);
        this.jaw.setRotationPoint(0.0F, 1.35F, -4.0F);
        this.jaw.addBox(-3.0F, -1.0F, -5.0F, 6, 2, 6, 0.0F);
        this.setRotateAngle(jaw, 0.2F, 0.0F, 0.0F);
        this.head = new BaseRenderer(this, 40, 29);
        this.head.setRotationPoint(-0.05F, 0.05F, -4.0F);
        this.head.addBox(-4.0F, -3.0F, -4.0F, 8, 6, 4, 0.0F);
        this.setRotateAngle(head, 0.31869712141416456F, 0.0F, 0.0F);
        this.tail3 = new BaseRenderer(this, 0, 70);
        this.tail3.setRotationPoint(0.0F, -0.85F, 6.0F);
        this.tail3.addBox(-2.5F, -2.0F, 0.0F, 5, 4, 8, 0.0F);
        this.setRotateAngle(tail3, -0.136659280431156F, 0.0F, 0.0F);
        this.leg1R = new BaseRenderer(this, 42, 79);
        this.leg1R.setRotationPoint(-3.0F, 1.8F, 6.0F);
        this.leg1R.addBox(-3.2F, -1.2F, -2.5F, 3, 7, 5, 0.0F);
        this.arm2R = new BaseRenderer(this, 111, 76);
        this.arm2R.mirror = true;
        this.arm2R.setRotationPoint(-1.45F, 5.5F, 0.5F);
        this.arm2R.addBox(-1.5F, 0.0F, -2.0F, 3, 7, 3, 0.0F);
        this.setRotateAngle(arm2R, -0.36425021489121656F, 0.0F, 0.0F);
        this.toe1L = new BaseRenderer(this, 77, 85);
        this.toe1L.setRotationPoint(1.4F, -0.5F, -2.5F);
        this.toe1L.addBox(-0.5F, -0.5F, -3.5F, 1, 2, 4, 0.0F);
        this.setRotateAngle(toe1L, -0.8726646259971648F, -0.31869712141416456F, 0.0F);
        this.claw21L = new BaseRenderer(this, 129, 71);
        this.claw21L.setRotationPoint(-0.3F, 0.0F, -2.0F);
        this.claw21L.addBox(-0.5F, -1.0F, -3.0F, 1, 2, 3, 0.0F);
        this.setRotateAngle(claw21L, -0.31869712141416456F, 0.27314402793711257F, 0.0F);
        this.horn33R = new BaseRenderer(this, 105, 24);
        this.horn33R.mirror = true;
        this.horn33R.setRotationPoint(0.5F, 0.0F, 3.5F);
        this.horn33R.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(horn33R, 0.0F, -0.7740535232594852F, 0.18203784098300857F);
        this.body1 = new BaseRenderer(this, 0, 0);
        this.body1.setRotationPoint(0.0F, -2.2F, 0.0F);
        this.body1.addBox(-4.0F, -3.5F, -5.0F, 8, 8, 10, 0.0F);
        this.setRotateAngle(body1, 0.22759093446006054F, 0.0F, 0.0F);
        this.footL = new BaseRenderer(this, 60, 85);
        this.footL.setRotationPoint(-0.0F, 5.5F, -0.3F);
        this.footL.addBox(-2.0F, -1.0F, -3.0F, 4, 2, 4, 0.0F);
        this.setRotateAngle(footL, 0.8651597102135892F, 0.0F, 0.0F);
        this.leg3L = new BaseRenderer(this, 60, 94);
        this.leg3L.setRotationPoint(0.05F, 4.0F, 1.8F);
        this.leg3L.addBox(-1.5F, 0.0F, -2.0F, 3, 6, 3, 0.0F);
        this.setRotateAngle(leg3L, -0.6829473363053812F, 0.0F, 0.0F);
        this.toe1R = new BaseRenderer(this, 77, 85);
        this.toe1R.setRotationPoint(1.4F, -0.5F, -2.5F);
        this.toe1R.addBox(-0.5F, -0.5F, -3.5F, 1, 2, 4, 0.0F);
        this.setRotateAngle(toe1R, -0.8726646259971648F, -0.31869712141416456F, 0.0F);
        this.palmL = new BaseRenderer(this, 129, 61);
        this.palmL.setRotationPoint(-0.5F, 6.5F, 0.0F);
        this.palmL.addBox(-1.5F, -1.0F, -3.0F, 4, 2, 4, 0.0F);
        this.setRotateAngle(palmL, 0.3490658503988659F, 0.0F, 0.0F);
        this.horn33L = new BaseRenderer(this, 105, 24);
        this.horn33L.setRotationPoint(-0.5F, 0.0F, 3.5F);
        this.horn33L.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(horn33L, 0.0F, 0.7740535232594852F, -0.18203784098300857F);
        this.claw11R = new BaseRenderer(this, 129, 71);
        this.claw11R.setRotationPoint(1.3F, 0.0F, -2.0F);
        this.claw11R.addBox(-0.5F, -1.0F, -3.0F, 1, 2, 3, 0.0F);
        this.setRotateAngle(claw11R, -0.31869712141416456F, -0.27314402793711257F, 0.0F);
        this.neck2 = new BaseRenderer(this, 40, 15);
        this.neck2.setRotationPoint(0.05F, 0.05F, -4.0F);
        this.neck2.addBox(-3.5F, -3.0F, -5.0F, 7, 6, 5, 0.0F);
        this.setRotateAngle(neck2, 0.31869712141416456F, 0.0F, 0.0F);
        this.snout = new BaseRenderer(this, 40, 44);
        this.snout.setRotationPoint(-0.05F, -1.05F, -4.0F);
        this.snout.addBox(-3.5F, -1.5F, -6.0F, 7, 3, 7, 0.0F);
        this.setRotateAngle(snout, 0.18203784098300857F, 0.0F, 0.0F);
        this.arm1L = new BaseRenderer(this, 111, 61);
        this.arm1L.setRotationPoint(2.0F, 1.3F, -2.0F);
        this.arm1L.addBox(0.0F, -1.0F, -2.0F, 3, 8, 4, 0.0F);
        this.setRotateAngle(arm1L, -0.22759093446006054F, -0.31869712141416456F, 0.0F);
        this.leg2R = new BaseRenderer(this, 42, 94);
        this.leg2R.setRotationPoint(-1.65F, 4.5F, -1.3F);
        this.leg2R.addBox(-1.5F, 0.0F, -1.5F, 3, 5, 4, 0.0F);
        this.setRotateAngle(leg2R, 0.6373942428283291F, 0.0F, 0.0F);
        this.tail1 = new BaseRenderer(this, 0, 39);
        this.tail1.setRotationPoint(0.0F, 1.2F, 8.0F);
        this.tail1.addBox(-3.5F, -3.0F, 0.0F, 7, 6, 8, 0.0F);
        this.setRotateAngle(tail1, -0.136659280431156F, 0.0F, 0.0F);
        this.horn53 = new BaseRenderer(this, 107, 10);
        this.horn53.setRotationPoint(0.05F, -2.6F, -0.5F);
        this.horn53.addBox(-0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(horn53, -0.6829473363053812F, 0.0F, 0.0F);
        this.claw11L = new BaseRenderer(this, 129, 71);
        this.claw11L.setRotationPoint(1.3F, 0.0F, -2.0F);
        this.claw11L.addBox(-0.5F, -1.0F, -3.0F, 1, 2, 3, 0.0F);
        this.setRotateAngle(claw11L, -0.31869712141416456F, -0.27314402793711257F, 0.0F);
        this.claw11L.addChild(this.claw12L);
        this.arm1L.addChild(this.arm2L);
        this.leg2R.addChild(this.leg3R);
        this.head.addChild(this.eyeR);
        this.claw21R.addChild(this.claw22R);
        this.body1.addChild(this.arm1R);
        this.tail1.addChild(this.tail2);
        this.tail3.addChild(this.tail4);
        this.footR.addChild(this.toe1R_1);
        this.horn11R.addChild(this.horn12R);
        this.footL.addChild(this.toe2L);
        this.footL.addChild(this.toe1L_1);
        this.leg3R.addChild(this.footR);
        this.claw11R.addChild(this.claw12R);
        this.body2.addChild(this.leg1L);
        this.footR.addChild(this.toe2R);
        this.horn31R.addChild(this.horn32R);
        this.horn51.addChild(this.horn52);
        this.arm2R.addChild(this.palmR);
        this.leg1L.addChild(this.leg2L);
        this.palmR.addChild(this.claw21R);
        this.head.addChild(this.horn11R);
        this.horn11L.addChild(this.horn12L);
        this.body1.addChild(this.neck1);
        this.head.addChild(this.horn31L);
        this.snout.addChild(this.horn51);
        this.horn31L.addChild(this.horn32L);
        this.claw21L.addChild(this.claw22L);
        this.head.addChild(this.eyeL);
        this.body1.addChild(this.body2);
        this.head.addChild(this.horn31R);
        this.head.addChild(this.horn11L);
        this.tail4.addChild(this.tail5);
        this.head.addChild(this.jaw);
        this.neck2.addChild(this.head);
        this.tail2.addChild(this.tail3);
        this.body2.addChild(this.leg1R);
        this.arm1R.addChild(this.arm2R);
        this.footL.addChild(this.toe1L);
        this.palmL.addChild(this.claw21L);
        this.horn32R.addChild(this.horn33R);
        this.leg3L.addChild(this.footL);
        this.leg2L.addChild(this.leg3L);
        this.footR.addChild(this.toe1R);
        this.arm2L.addChild(this.palmL);
        this.horn32L.addChild(this.horn33L);
        this.palmR.addChild(this.claw11R);
        this.neck1.addChild(this.neck2);
        this.head.addChild(this.snout);
        this.body1.addChild(this.arm1L);
        this.leg1R.addChild(this.leg2R);
        this.body2.addChild(this.tail1);
        this.horn52.addChild(this.horn53);
        this.palmL.addChild(this.claw11L);
        setDefaultPoses();

        headArray = new BaseRenderer[] {neck1, neck2, head};
        tailArray = new BaseRenderer[] {tail1, tail2, tail3, tail4, tail5};
    }

    /** This is a helper function from Tabula to set the rotation of model parts */
    public void setRotateAngle(BaseRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void render(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        GlStateManager.pushMatrix();
        GlStateManager.scaled(1d / 0.5, 1d / 0.5d, 1d / 0.5d);
        this.body1.render(scale);
        GlStateManager.popMatrix();
    }

    @Override
    public void setLivingAnimations(T entityIn, float limbSwing, float limbSwingAmount, float partialTick) {
        restorePoses();
        float frame = entityIn.ticksExisted;

        //IDLE
        chainRotX(headArray, 0.45f - globalSpeed, 0.05f, 0d, frame, f);
        rotX(head, 0.45f - globalSpeed, 0.08f, false, 2.5f, 0f, frame, f);

        rotX(jaw, 0.45f - globalSpeed, 0.15f, false, 0f, 0.15f, frame, f);

        chainRotX(tailArray, 0.45f - globalSpeed, 0.043f, 0d, frame, f);
        chainRotY(tailArray, globalSpeed - 0.45f, 0.043f, 2d, frame, f);
    }

}