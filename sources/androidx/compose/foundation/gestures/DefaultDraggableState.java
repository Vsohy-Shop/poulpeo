package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;
import p466yf.C13999m0;

/* compiled from: Draggable.kt */
final class DefaultDraggableState implements DraggableState {
    /* access modifiers changed from: private */
    public final DragScope dragScope = new DefaultDraggableState$dragScope$1(this);
    private final Function1<Float, C11921v> onDelta;
    /* access modifiers changed from: private */
    public final MutatorMutex scrollMutex = new MutatorMutex();

    public DefaultDraggableState(Function1<? super Float, C11921v> function1) {
        C12775o.m28639i(function1, "onDelta");
        this.onDelta = function1;
    }

    public void dispatchRawDelta(float f) {
        this.onDelta.invoke(Float.valueOf(f));
    }

    public Object drag(MutatePriority mutatePriority, C13088o<? super DragScope, ? super C12074d<? super C11921v>, ? extends Object> oVar, C12074d<? super C11921v> dVar) {
        Object e = C13999m0.m32451e(new DefaultDraggableState$drag$2(this, mutatePriority, oVar, (C12074d<? super DefaultDraggableState$drag$2>) null), dVar);
        if (e == C12150d.m26492c()) {
            return e;
        }
        return C11921v.f18618a;
    }

    public final Function1<Float, C11921v> getOnDelta() {
        return this.onDelta;
    }
}
