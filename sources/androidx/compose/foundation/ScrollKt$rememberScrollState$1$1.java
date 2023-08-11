package androidx.compose.foundation;

import kotlin.jvm.internal.C12777p;
import p404of.C13074a;

/* compiled from: Scroll.kt */
final class ScrollKt$rememberScrollState$1$1 extends C12777p implements C13074a<ScrollState> {
    final /* synthetic */ int $initial;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ScrollKt$rememberScrollState$1$1(int i) {
        super(0);
        this.$initial = i;
    }

    public final ScrollState invoke() {
        return new ScrollState(this.$initial);
    }
}
