package androidx.compose.material;

import androidx.compose.animation.core.SpringSpec;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Set;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nSwipeable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material/SwipeableDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,890:1\n154#2:891\n*S KotlinDebug\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material/SwipeableDefaults\n*L\n812#1:891\n*E\n"})
/* compiled from: Swipeable.kt */
public final class SwipeableDefaults {
    public static final int $stable = 0;
    private static final SpringSpec<Float> AnimationSpec = new SpringSpec(0.0f, 0.0f, (Object) null, 7, (DefaultConstructorMarker) null);
    public static final SwipeableDefaults INSTANCE = new SwipeableDefaults();
    public static final float StandardResistanceFactor = 10.0f;
    public static final float StiffResistanceFactor = 20.0f;
    private static final float VelocityThreshold = C1232Dp.m38468constructorimpl((float) 125);

    private SwipeableDefaults() {
    }

    public static /* synthetic */ ResistanceConfig resistanceConfig$default(SwipeableDefaults swipeableDefaults, Set set, float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 10.0f;
        }
        if ((i & 4) != 0) {
            f2 = 10.0f;
        }
        return swipeableDefaults.resistanceConfig(set, f, f2);
    }

    public final SpringSpec<Float> getAnimationSpec() {
        return AnimationSpec;
    }

    /* renamed from: getVelocityThreshold-D9Ej5fM  reason: not valid java name */
    public final float m34138getVelocityThresholdD9Ej5fM() {
        return VelocityThreshold;
    }

    public final ResistanceConfig resistanceConfig(Set<Float> set, float f, float f2) {
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
