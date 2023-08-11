package androidx.compose.material.pullrefresh;

import kotlin.coroutines.jvm.internal.C12735b;
import kotlin.jvm.internal.C12747a;
import p355hf.C12074d;
import p404of.C13088o;

/* compiled from: PullRefresh.kt */
/* synthetic */ class PullRefreshKt$pullRefresh$2$2 extends C12747a implements C13088o<Float, C12074d<? super Float>, Object> {
    PullRefreshKt$pullRefresh$2$2(Object obj) {
        super(2, obj, PullRefreshState.class, "onRelease", "onRelease$material_release(F)F", 4);
    }

    public final Object invoke(float f, C12074d<? super Float> dVar) {
        return C12735b.m28559b(((PullRefreshState) this.receiver).onRelease$material_release(f));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).floatValue(), (C12074d<? super Float>) (C12074d) obj2);
    }
}
