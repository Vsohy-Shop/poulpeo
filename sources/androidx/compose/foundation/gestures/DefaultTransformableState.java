package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;
import p404of.C13089p;
import p466yf.C13999m0;

/* compiled from: TransformableState.kt */
final class DefaultTransformableState implements TransformableState {
    /* access modifiers changed from: private */
    public final MutableState<Boolean> isTransformingState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, (SnapshotMutationPolicy) null, 2, (Object) null);
    private final C13089p<Float, Offset, Float, C11921v> onTransformation;
    /* access modifiers changed from: private */
    public final MutatorMutex transformMutex = new MutatorMutex();
    /* access modifiers changed from: private */
    public final TransformScope transformScope = new DefaultTransformableState$transformScope$1(this);

    public DefaultTransformableState(C13089p<? super Float, ? super Offset, ? super Float, C11921v> pVar) {
        C12775o.m28639i(pVar, "onTransformation");
        this.onTransformation = pVar;
    }

    public final C13089p<Float, Offset, Float, C11921v> getOnTransformation() {
        return this.onTransformation;
    }

    public boolean isTransformInProgress() {
        return this.isTransformingState.getValue().booleanValue();
    }

    public Object transform(MutatePriority mutatePriority, C13088o<? super TransformScope, ? super C12074d<? super C11921v>, ? extends Object> oVar, C12074d<? super C11921v> dVar) {
        Object e = C13999m0.m32451e(new DefaultTransformableState$transform$2(this, mutatePriority, oVar, (C12074d<? super DefaultTransformableState$transform$2>) null), dVar);
        if (e == C12150d.m26492c()) {
            return e;
        }
        return C11921v.f18618a;
    }
}
