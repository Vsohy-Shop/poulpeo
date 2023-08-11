package androidx.compose.foundation;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import kotlin.jvm.internal.C12775o;

/* compiled from: EdgeEffectCompat.kt */
public final class EdgeEffectCompat {
    public static final EdgeEffectCompat INSTANCE = new EdgeEffectCompat();

    private EdgeEffectCompat() {
    }

    public final EdgeEffect create(Context context, AttributeSet attributeSet) {
        C12775o.m28639i(context, "context");
        if (Build.VERSION.SDK_INT >= 31) {
            return Api31Impl.INSTANCE.create(context, attributeSet);
        }
        return new GlowEdgeEffectCompat(context);
    }

    public final float getDistanceCompat(EdgeEffect edgeEffect) {
        C12775o.m28639i(edgeEffect, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            return Api31Impl.INSTANCE.getDistance(edgeEffect);
        }
        return 0.0f;
    }

    public final void onAbsorbCompat(EdgeEffect edgeEffect, int i) {
        C12775o.m28639i(edgeEffect, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            edgeEffect.onAbsorb(i);
        } else if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(i);
        }
    }

    public final float onPullDistanceCompat(EdgeEffect edgeEffect, float f, float f2) {
        C12775o.m28639i(edgeEffect, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            return Api31Impl.INSTANCE.onPullDistance(edgeEffect, f, f2);
        }
        edgeEffect.onPull(f, f2);
        return f;
    }

    public final void onReleaseWithOppositeDelta(EdgeEffect edgeEffect, float f) {
        C12775o.m28639i(edgeEffect, "<this>");
        if (edgeEffect instanceof GlowEdgeEffectCompat) {
            ((GlowEdgeEffectCompat) edgeEffect).releaseWithOppositeDelta(f);
        } else {
            edgeEffect.onRelease();
        }
    }
}
