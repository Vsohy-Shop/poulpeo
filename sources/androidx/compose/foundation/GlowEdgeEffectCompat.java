package androidx.compose.foundation;

import android.content.Context;
import android.widget.EdgeEffect;
import androidx.compose.p002ui.unit.AndroidDensity_androidKt;
import androidx.compose.p002ui.unit.C1232Dp;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nEdgeEffectCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EdgeEffectCompat.kt\nandroidx/compose/foundation/GlowEdgeEffectCompat\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,156:1\n1#2:157\n154#3:158\n*S KotlinDebug\n*F\n+ 1 EdgeEffectCompat.kt\nandroidx/compose/foundation/GlowEdgeEffectCompat\n*L\n88#1:158\n*E\n"})
/* compiled from: EdgeEffectCompat.kt */
final class GlowEdgeEffectCompat extends EdgeEffect {
    private float oppositeReleaseDelta;
    private final float oppositeReleaseDeltaThreshold;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GlowEdgeEffectCompat(Context context) {
        super(context);
        C12775o.m28639i(context, "context");
        this.oppositeReleaseDeltaThreshold = AndroidDensity_androidKt.Density(context).m38449toPx0680j_4(C1232Dp.m38468constructorimpl((float) 1));
    }

    public void onAbsorb(int i) {
        this.oppositeReleaseDelta = 0.0f;
        super.onAbsorb(i);
    }

    public void onPull(float f, float f2) {
        this.oppositeReleaseDelta = 0.0f;
        super.onPull(f, f2);
    }

    public void onRelease() {
        this.oppositeReleaseDelta = 0.0f;
        super.onRelease();
    }

    public final void releaseWithOppositeDelta(float f) {
        float f2 = this.oppositeReleaseDelta + f;
        this.oppositeReleaseDelta = f2;
        if (Math.abs(f2) > this.oppositeReleaseDeltaThreshold) {
            onRelease();
        }
    }

    public void onPull(float f) {
        this.oppositeReleaseDelta = 0.0f;
        super.onPull(f);
    }
}
