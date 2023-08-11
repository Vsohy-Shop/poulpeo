package androidx.compose.material.pullrefresh;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12771l;

/* compiled from: PullRefresh.kt */
/* synthetic */ class PullRefreshKt$pullRefresh$2$1 extends C12771l implements Function1<Float, Float> {
    PullRefreshKt$pullRefresh$2$1(Object obj) {
        super(1, obj, PullRefreshState.class, "onPull", "onPull$material_release(F)F", 0);
    }

    public final Float invoke(float f) {
        return Float.valueOf(((PullRefreshState) this.receiver).onPull$material_release(f));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).floatValue());
    }
}
