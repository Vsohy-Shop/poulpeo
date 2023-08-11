package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.p002ui.unit.C1232Dp;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p336ef.C11921v;
import p355hf.C12074d;

/* compiled from: Elevation.kt */
public final class ElevationKt {
    /* access modifiers changed from: private */
    public static final TweenSpec<C1232Dp> DefaultIncomingSpec = new TweenSpec(120, 0, EasingKt.getFastOutSlowInEasing(), 2, (DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final TweenSpec<C1232Dp> DefaultOutgoingSpec = new TweenSpec(150, 0, new CubicBezierEasing(0.4f, 0.0f, 0.6f, 1.0f), 2, (DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final TweenSpec<C1232Dp> HoveredOutgoingSpec = new TweenSpec(120, 0, new CubicBezierEasing(0.4f, 0.0f, 0.6f, 1.0f), 2, (DefaultConstructorMarker) null);

    /* renamed from: animateElevation-rAjV9yQ  reason: not valid java name */
    public static final Object m34009animateElevationrAjV9yQ(Animatable<C1232Dp, ?> animatable, float f, Interaction interaction, Interaction interaction2, C12074d<? super C11921v> dVar) {
        AnimationSpec<C1232Dp> animationSpec;
        if (interaction2 != null) {
            animationSpec = ElevationDefaults.INSTANCE.incomingAnimationSpecForInteraction(interaction2);
        } else if (interaction != null) {
            animationSpec = ElevationDefaults.INSTANCE.outgoingAnimationSpecForInteraction(interaction);
        } else {
            animationSpec = null;
        }
        AnimationSpec<C1232Dp> animationSpec2 = animationSpec;
        if (animationSpec2 != null) {
            Object animateTo$default = Animatable.animateTo$default(animatable, C1232Dp.m38466boximpl(f), animationSpec2, (Object) null, (Function1) null, dVar, 12, (Object) null);
            if (animateTo$default == C12150d.m26492c()) {
                return animateTo$default;
            }
            return C11921v.f18618a;
        }
        Object snapTo = animatable.snapTo(C1232Dp.m38466boximpl(f), dVar);
        if (snapTo == C12150d.m26492c()) {
            return snapTo;
        }
        return C11921v.f18618a;
    }

    /* renamed from: animateElevation-rAjV9yQ$default  reason: not valid java name */
    public static /* synthetic */ Object m34010animateElevationrAjV9yQ$default(Animatable animatable, float f, Interaction interaction, Interaction interaction2, C12074d dVar, int i, Object obj) {
        if ((i & 2) != 0) {
            interaction = null;
        }
        if ((i & 4) != 0) {
            interaction2 = null;
        }
        return m34009animateElevationrAjV9yQ(animatable, f, interaction, interaction2, dVar);
    }
}
