package androidx.compose.foundation;

import kotlin.jvm.internal.C12777p;
import p404of.C13074a;

/* compiled from: Scroll.kt */
final class ScrollState$canScrollBackward$2 extends C12777p implements C13074a<Boolean> {
    final /* synthetic */ ScrollState this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ScrollState$canScrollBackward$2(ScrollState scrollState) {
        super(0);
        this.this$0 = scrollState;
    }

    public final Boolean invoke() {
        return Boolean.valueOf(this.this$0.getValue() > 0);
    }
}
