package androidx.compose.foundation.text;

import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;

/* compiled from: LongPressTextDragObserver.kt */
final class LongPressTextDragObserverKt$detectDragGesturesWithObserver$3 extends C12777p implements C13074a<C11921v> {
    final /* synthetic */ TextDragObserver $observer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LongPressTextDragObserverKt$detectDragGesturesWithObserver$3(TextDragObserver textDragObserver) {
        super(0);
        this.$observer = textDragObserver;
    }

    public final void invoke() {
        this.$observer.onStop();
    }
}
