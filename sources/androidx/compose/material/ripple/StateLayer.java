package androidx.compose.material.ripple;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.p002ui.geometry.Size;
import androidx.compose.p002ui.graphics.ClipOp;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.graphics.ColorFilter;
import androidx.compose.p002ui.graphics.drawscope.DrawContext;
import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import androidx.compose.p002ui.graphics.drawscope.DrawStyle;
import androidx.compose.runtime.State;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p355hf.C12074d;
import p355hf.C12079g;
import p466yf.C13995l0;
import p466yf.C14004n0;
import p466yf.C14054y1;

@SourceDebugExtension({"SMAP\nRipple.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ripple.kt\nandroidx/compose/material/ripple/StateLayer\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,355:1\n138#2:356\n214#3,8:357\n261#3,11:365\n*S KotlinDebug\n*F\n+ 1 Ripple.kt\nandroidx/compose/material/ripple/StateLayer\n*L\n304#1:356\n316#1:357,8\n316#1:365,11\n*E\n"})
/* compiled from: Ripple.kt */
final class StateLayer {
    /* access modifiers changed from: private */
    public final Animatable<Float, AnimationVector1D> animatedAlpha = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, (Object) null);
    private final boolean bounded;
    private Interaction currentInteraction;
    private final List<Interaction> interactions = new ArrayList();
    private final State<RippleAlpha> rippleAlpha;

    public StateLayer(boolean z, State<RippleAlpha> state) {
        C12775o.m28639i(state, "rippleAlpha");
        this.bounded = z;
        this.rippleAlpha = state;
    }

    /* renamed from: drawStateLayer-H2RKhps  reason: not valid java name */
    public final void m34239drawStateLayerH2RKhps(DrawScope drawScope, float f, long j) {
        float f2;
        DrawScope drawScope2 = drawScope;
        C12775o.m28639i(drawScope2, "$this$drawStateLayer");
        if (Float.isNaN(f)) {
            f2 = RippleAnimationKt.m34230getRippleEndRadiuscSwnlzA(drawScope2, this.bounded, drawScope.m36274getSizeNHjbRc());
        } else {
            f2 = drawScope.m38449toPx0680j_4(f);
        }
        float f3 = f2;
        float floatValue = this.animatedAlpha.getValue().floatValue();
        if (floatValue > 0.0f) {
            long r2 = Color.m35670copywmQWz5c$default(j, floatValue, 0.0f, 0.0f, 0.0f, 14, (Object) null);
            if (this.bounded) {
                float r9 = Size.m35491getWidthimpl(drawScope.m36274getSizeNHjbRc());
                float r10 = Size.m35488getHeightimpl(drawScope.m36274getSizeNHjbRc());
                int r11 = ClipOp.Companion.m35660getIntersectrtfAjoo();
                DrawContext drawContext = drawScope.getDrawContext();
                long r14 = drawContext.m36217getSizeNHjbRc();
                drawContext.getCanvas().save();
                drawContext.getTransform().m36329clipRectN_I0leg(0.0f, 0.0f, r9, r10, r11);
                DrawScope.m36237drawCircleVaOC9Bg$default(drawScope, r2, f3, 0, 0.0f, (DrawStyle) null, (ColorFilter) null, 0, 124, (Object) null);
                drawContext.getCanvas().restore();
                drawContext.m36218setSizeuvyYCjk(r14);
                return;
            }
            DrawScope.m36237drawCircleVaOC9Bg$default(drawScope, r2, f3, 0, 0.0f, (DrawStyle) null, (ColorFilter) null, 0, 124, (Object) null);
        }
    }

    public final void handleInteraction(Interaction interaction, C13995l0 l0Var) {
        float f;
        C12775o.m28639i(interaction, "interaction");
        C12775o.m28639i(l0Var, "scope");
        boolean z = interaction instanceof HoverInteraction.Enter;
        if (z) {
            this.interactions.add(interaction);
        } else if (interaction instanceof HoverInteraction.Exit) {
            this.interactions.remove(((HoverInteraction.Exit) interaction).getEnter());
        } else if (interaction instanceof FocusInteraction.Focus) {
            this.interactions.add(interaction);
        } else if (interaction instanceof FocusInteraction.Unfocus) {
            this.interactions.remove(((FocusInteraction.Unfocus) interaction).getFocus());
        } else if (interaction instanceof DragInteraction.Start) {
            this.interactions.add(interaction);
        } else if (interaction instanceof DragInteraction.Stop) {
            this.interactions.remove(((DragInteraction.Stop) interaction).getStart());
        } else if (interaction instanceof DragInteraction.Cancel) {
            this.interactions.remove(((DragInteraction.Cancel) interaction).getStart());
        } else {
            return;
        }
        Interaction interaction2 = (Interaction) C12686e0.m28232k0(this.interactions);
        if (!C12775o.m28634d(this.currentInteraction, interaction2)) {
            if (interaction2 != null) {
                if (z) {
                    f = this.rippleAlpha.getValue().getHoveredAlpha();
                } else if (interaction instanceof FocusInteraction.Focus) {
                    f = this.rippleAlpha.getValue().getFocusedAlpha();
                } else if (interaction instanceof DragInteraction.Start) {
                    f = this.rippleAlpha.getValue().getDraggedAlpha();
                } else {
                    f = 0.0f;
                }
                C14054y1 unused = C13985j.m32422d(l0Var, (C12079g) null, (C14004n0) null, new StateLayer$handleInteraction$1(this, f, RippleKt.incomingStateLayerAnimationSpecFor(interaction2), (C12074d<? super StateLayer$handleInteraction$1>) null), 3, (Object) null);
            } else {
                C14054y1 unused2 = C13985j.m32422d(l0Var, (C12079g) null, (C14004n0) null, new StateLayer$handleInteraction$2(this, RippleKt.outgoingStateLayerAnimationSpecFor(this.currentInteraction), (C12074d<? super StateLayer$handleInteraction$2>) null), 3, (Object) null);
            }
            this.currentInteraction = interaction2;
        }
    }
}
