package androidx.compose.material;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.gestures.DragScope;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;
import p466yf.C13999m0;

@SourceDebugExtension({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderDraggableState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1189:1\n76#2:1190\n102#2,2:1191\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderDraggableState\n*L\n1168#1:1190\n1168#1:1191,2\n*E\n"})
/* compiled from: Slider.kt */
final class SliderDraggableState implements DraggableState {
    /* access modifiers changed from: private */
    public final DragScope dragScope = new SliderDraggableState$dragScope$1(this);
    private final MutableState isDragging$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, (SnapshotMutationPolicy) null, 2, (Object) null);
    private final Function1<Float, C11921v> onDelta;
    /* access modifiers changed from: private */
    public final MutatorMutex scrollMutex = new MutatorMutex();

    public SliderDraggableState(Function1<? super Float, C11921v> function1) {
        C12775o.m28639i(function1, "onDelta");
        this.onDelta = function1;
    }

    /* access modifiers changed from: private */
    public final void setDragging(boolean z) {
        this.isDragging$delegate.setValue(Boolean.valueOf(z));
    }

    public void dispatchRawDelta(float f) {
        this.onDelta.invoke(Float.valueOf(f));
    }

    public Object drag(MutatePriority mutatePriority, C13088o<? super DragScope, ? super C12074d<? super C11921v>, ? extends Object> oVar, C12074d<? super C11921v> dVar) {
        Object e = C13999m0.m32451e(new SliderDraggableState$drag$2(this, mutatePriority, oVar, (C12074d<? super SliderDraggableState$drag$2>) null), dVar);
        if (e == C12150d.m26492c()) {
            return e;
        }
        return C11921v.f18618a;
    }

    public final Function1<Float, C11921v> getOnDelta() {
        return this.onDelta;
    }

    public final boolean isDragging() {
        return ((Boolean) this.isDragging$delegate.getValue()).booleanValue();
    }
}
