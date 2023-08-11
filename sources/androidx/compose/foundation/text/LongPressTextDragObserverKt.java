package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.p002ui.input.pointer.PointerInputScope;
import p336ef.C11921v;
import p355hf.C12074d;
import p466yf.C13999m0;

/* compiled from: LongPressTextDragObserver.kt */
public final class LongPressTextDragObserverKt {
    public static final Object detectDownAndDragGesturesWithObserver(PointerInputScope pointerInputScope, TextDragObserver textDragObserver, C12074d<? super C11921v> dVar) {
        Object e = C13999m0.m32451e(new C0617x3c48fd5d(pointerInputScope, textDragObserver, (C12074d<? super C0617x3c48fd5d>) null), dVar);
        if (e == C12150d.m26492c()) {
            return e;
        }
        return C11921v.f18618a;
    }

    public static final Object detectDragGesturesAfterLongPressWithObserver(PointerInputScope pointerInputScope, TextDragObserver textDragObserver, C12074d<? super C11921v> dVar) {
        Object detectDragGesturesAfterLongPress = DragGestureDetectorKt.detectDragGesturesAfterLongPress(pointerInputScope, new C0620x131dfa73(textDragObserver), new C0621x131dfa74(textDragObserver), new C0622x131dfa75(textDragObserver), new C0623x131dfa76(textDragObserver), dVar);
        if (detectDragGesturesAfterLongPress == C12150d.m26492c()) {
            return detectDragGesturesAfterLongPress;
        }
        return C11921v.f18618a;
    }

    /* access modifiers changed from: private */
    public static final Object detectDragGesturesWithObserver(PointerInputScope pointerInputScope, TextDragObserver textDragObserver, C12074d<? super C11921v> dVar) {
        Object detectDragGestures = DragGestureDetectorKt.detectDragGestures(pointerInputScope, new LongPressTextDragObserverKt$detectDragGesturesWithObserver$2(textDragObserver), new LongPressTextDragObserverKt$detectDragGesturesWithObserver$3(textDragObserver), new LongPressTextDragObserverKt$detectDragGesturesWithObserver$4(textDragObserver), new LongPressTextDragObserverKt$detectDragGesturesWithObserver$5(textDragObserver), dVar);
        if (detectDragGestures == C12150d.m26492c()) {
            return detectDragGestures;
        }
        return C11921v.f18618a;
    }

    /* access modifiers changed from: private */
    public static final Object detectPreDragGesturesWithObserver(PointerInputScope pointerInputScope, TextDragObserver textDragObserver, C12074d<? super C11921v> dVar) {
        Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2(textDragObserver, (C12074d<? super LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2>) null), dVar);
        if (awaitEachGesture == C12150d.m26492c()) {
            return awaitEachGesture;
        }
        return C11921v.f18618a;
    }
}
