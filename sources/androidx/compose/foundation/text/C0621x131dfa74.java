package androidx.compose.foundation.text;

import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;

/* renamed from: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDragGesturesAfterLongPressWithObserver$3 */
/* compiled from: LongPressTextDragObserver.kt */
final class C0621x131dfa74 extends C12777p implements C13074a<C11921v> {
    final /* synthetic */ TextDragObserver $observer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0621x131dfa74(TextDragObserver textDragObserver) {
        super(0);
        this.$observer = textDragObserver;
    }

    public final void invoke() {
        this.$observer.onStop();
    }
}
