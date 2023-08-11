package androidx.compose.foundation.text;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.input.pointer.PointerInputChange;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* compiled from: LongPressTextDragObserver.kt */
final class LongPressTextDragObserverKt$detectDragGesturesWithObserver$5 extends C12777p implements C13088o<PointerInputChange, Offset, C11921v> {
    final /* synthetic */ TextDragObserver $observer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LongPressTextDragObserverKt$detectDragGesturesWithObserver$5(TextDragObserver textDragObserver) {
        super(2);
        this.$observer = textDragObserver;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        m33671invokeUv8p0NA((PointerInputChange) obj, ((Offset) obj2).m35432unboximpl());
        return C11921v.f18618a;
    }

    /* renamed from: invoke-Uv8p0NA  reason: not valid java name */
    public final void m33671invokeUv8p0NA(PointerInputChange pointerInputChange, long j) {
        C12775o.m28639i(pointerInputChange, "<anonymous parameter 0>");
        this.$observer.m33711onDragk4lQ0M(j);
    }
}
