package androidx.compose.material;

import androidx.compose.animation.core.SpringSpec;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.runtime.Stable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13088o;

@ExperimentalMaterialApi
@SourceDebugExtension({"SMAP\nSwipeableV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeableV2.kt\nandroidx/compose/material/SwipeableV2Defaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,655:1\n154#2:656\n154#2:657\n*S KotlinDebug\n*F\n+ 1 SwipeableV2.kt\nandroidx/compose/material/SwipeableV2Defaults\n*L\n541#1:656\n548#1:657\n*E\n"})
@Stable
/* compiled from: SwipeableV2.kt */
public final class SwipeableV2Defaults {
    private static final SpringSpec<Float> AnimationSpec = new SpringSpec(0.0f, 0.0f, (Object) null, 7, (DefaultConstructorMarker) null);
    public static final SwipeableV2Defaults INSTANCE = new SwipeableV2Defaults();
    private static final C13088o<Density, Float, Float> PositionalThreshold = SwipeableV2Kt.m34147fixedPositionalThreshold0680j_4(C1232Dp.m38468constructorimpl((float) 56));
    private static final float VelocityThreshold = C1232Dp.m38468constructorimpl((float) 125);

    private SwipeableV2Defaults() {
    }

    @ExperimentalMaterialApi
    public final <T> AnchorChangeHandler<T> ReconcileAnimationOnAnchorChangeHandler$material_release(SwipeableV2State<T> swipeableV2State, C13088o<? super T, ? super Float, C11921v> oVar, Function1<? super T, C11921v> function1) {
        C12775o.m28639i(swipeableV2State, "state");
        C12775o.m28639i(oVar, "animate");
        C12775o.m28639i(function1, "snap");
        return new SwipeableV2Defaults$ReconcileAnimationOnAnchorChangeHandler$1(oVar, swipeableV2State, function1);
    }

    public final SpringSpec<Float> getAnimationSpec() {
        return AnimationSpec;
    }

    public final C13088o<Density, Float, Float> getPositionalThreshold() {
        return PositionalThreshold;
    }

    /* renamed from: getVelocityThreshold-D9Ej5fM  reason: not valid java name */
    public final float m34146getVelocityThresholdD9Ej5fM() {
        return VelocityThreshold;
    }

    @ExperimentalMaterialApi
    public static /* synthetic */ void getAnimationSpec$annotations() {
    }

    @ExperimentalMaterialApi
    public static /* synthetic */ void getPositionalThreshold$annotations() {
    }

    @ExperimentalMaterialApi
    /* renamed from: getVelocityThreshold-D9Ej5fM$annotations  reason: not valid java name */
    public static /* synthetic */ void m34145getVelocityThresholdD9Ej5fM$annotations() {
    }
}
