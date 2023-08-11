package androidx.compose.foundation;

import androidx.compose.p002ui.unit.Velocity;
import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import p355hf.C12074d;
import p404of.C13088o;

@C12739f(mo50609c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect", mo50610f = "AndroidOverscroll.kt", mo50611l = {219, 244}, mo50612m = "applyToFling-BMRW4eQ")
/* compiled from: AndroidOverscroll.kt */
final class AndroidEdgeEffectOverscrollEffect$applyToFling$1 extends C12737d {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidEdgeEffectOverscrollEffect this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidEdgeEffectOverscrollEffect$applyToFling$1(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, C12074d<? super AndroidEdgeEffectOverscrollEffect$applyToFling$1> dVar) {
        super(dVar);
        this.this$0 = androidEdgeEffectOverscrollEffect;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m32951applyToFlingBMRW4eQ(0, (C13088o<? super Velocity, ? super C12074d<? super Velocity>, ? extends Object>) null, this);
    }
}
