package androidx.compose.foundation.text;

import androidx.compose.p002ui.geometry.Offset;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: LongPressTextDragObserver.kt */
final class LongPressTextDragObserverKt$detectDragGesturesWithObserver$2 extends C12777p implements Function1<Offset, C11921v> {
    final /* synthetic */ TextDragObserver $observer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LongPressTextDragObserverKt$detectDragGesturesWithObserver$2(TextDragObserver textDragObserver) {
        super(1);
        this.$observer = textDragObserver;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m33670invokek4lQ0M(((Offset) obj).m35432unboximpl());
        return C11921v.f18618a;
    }

    /* renamed from: invoke-k-4lQ0M  reason: not valid java name */
    public final void m33670invokek4lQ0M(long j) {
        this.$observer.m33712onStartk4lQ0M(j);
    }
}
