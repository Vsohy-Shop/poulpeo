package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;
import p466yf.C13999m0;

/* compiled from: ScrollableState.kt */
final class DefaultScrollableState implements ScrollableState {
    /* access modifiers changed from: private */
    public final MutableState<Boolean> isScrollingState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, (SnapshotMutationPolicy) null, 2, (Object) null);
    private final Function1<Float, Float> onDelta;
    /* access modifiers changed from: private */
    public final MutatorMutex scrollMutex = new MutatorMutex();
    /* access modifiers changed from: private */
    public final ScrollScope scrollScope = new DefaultScrollableState$scrollScope$1(this);

    public DefaultScrollableState(Function1<? super Float, Float> function1) {
        C12775o.m28639i(function1, "onDelta");
        this.onDelta = function1;
    }

    public float dispatchRawDelta(float f) {
        return this.onDelta.invoke(Float.valueOf(f)).floatValue();
    }

    public final Function1<Float, Float> getOnDelta() {
        return this.onDelta;
    }

    public boolean isScrollInProgress() {
        return this.isScrollingState.getValue().booleanValue();
    }

    public Object scroll(MutatePriority mutatePriority, C13088o<? super ScrollScope, ? super C12074d<? super C11921v>, ? extends Object> oVar, C12074d<? super C11921v> dVar) {
        Object e = C13999m0.m32451e(new DefaultScrollableState$scroll$2(this, mutatePriority, oVar, (C12074d<? super DefaultScrollableState$scroll$2>) null), dVar);
        if (e == C12150d.m26492c()) {
            return e;
        }
        return C11921v.f18618a;
    }
}
