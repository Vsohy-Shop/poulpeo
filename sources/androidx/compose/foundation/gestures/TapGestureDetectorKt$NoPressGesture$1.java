package androidx.compose.foundation.gestures;

import androidx.compose.p002ui.geometry.Offset;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13089p;

@C12739f(mo50609c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$NoPressGesture$1", mo50610f = "TapGestureDetector.kt", mo50611l = {}, mo50612m = "invokeSuspend")
/* compiled from: TapGestureDetector.kt */
final class TapGestureDetectorKt$NoPressGesture$1 extends C12746l implements C13089p<PressGestureScope, Offset, C12074d<? super C11921v>, Object> {
    int label;

    TapGestureDetectorKt$NoPressGesture$1(C12074d<? super TapGestureDetectorKt$NoPressGesture$1> dVar) {
        super(3, dVar);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m33148invoked4ec7I((PressGestureScope) obj, ((Offset) obj2).m35432unboximpl(), (C12074d) obj3);
    }

    /* renamed from: invoke-d-4ec7I  reason: not valid java name */
    public final Object m33148invoked4ec7I(PressGestureScope pressGestureScope, long j, C12074d<? super C11921v> dVar) {
        return new TapGestureDetectorKt$NoPressGesture$1(dVar).invokeSuspend(C11921v.f18618a);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = C12150d.m26492c();
        if (this.label == 0) {
            C11910n.m25701b(obj);
            return C11921v.f18618a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
