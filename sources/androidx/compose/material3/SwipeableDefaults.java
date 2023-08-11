package androidx.compose.material3;

import androidx.compose.animation.core.SpringSpec;
import androidx.compose.p002ui.unit.C1232Dp;
import java.util.Set;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: Swipeable.kt */
public final class SwipeableDefaults {
    private static final SpringSpec<Float> AnimationSpec = new SpringSpec(0.0f, 0.0f, (Object) null, 7, (DefaultConstructorMarker) null);
    public static final SwipeableDefaults INSTANCE = new SwipeableDefaults();
    public static final float StandardResistanceFactor = 10.0f;
    public static final float StiffResistanceFactor = 20.0f;
    private static final float VelocityThreshold = C1232Dp.m38468constructorimpl((float) 125);

    private SwipeableDefaults() {
    }

    public static /* synthetic */ ResistanceConfig resistanceConfig$material3_release$default(SwipeableDefaults swipeableDefaults, Set set, float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 10.0f;
        }
        if ((i & 4) != 0) {
            f2 = 10.0f;
        }
        return swipeableDefaults.resistanceConfig$material3_release(set, f, f2);
    }

    public final SpringSpec<Float> getAnimationSpec$material3_release() {
        return AnimationSpec;
    }

    /* renamed from: getVelocityThreshold-D9Ej5fM$material3_release  reason: not valid java name */
    public final float m34611getVelocityThresholdD9Ej5fM$material3_release() {
        return VelocityThreshold;
    }

    public final ResistanceConfig resistanceConfig$material3_release(Set<Float> set, float f, float f2) {
        C12775o.m28639i(set, "anchors");
        if (set.size() <= 1) {
            return null;
        }
        Float l0 = C12686e0.m28233l0(set);
        C12775o.m28636f(l0);
        float floatValue = l0.floatValue();
        Float n0 = C12686e0.m28235n0(set);
        C12775o.m28636f(n0);
        return new ResistanceConfig(floatValue - n0.floatValue(), f, f2);
    }
}
