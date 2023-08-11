package androidx.compose.foundation;

import kotlin.jvm.internal.C12777p;
import p404of.C13074a;

/* compiled from: Scroll.kt */
final class ScrollKt$scroll$2$semantics$1$accessibilityScrollState$2 extends C12777p implements C13074a<Float> {
    final /* synthetic */ ScrollState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ScrollKt$scroll$2$semantics$1$accessibilityScrollState$2(ScrollState scrollState) {
        super(0);
        this.$state = scrollState;
    }

    public final Float invoke() {
        return Float.valueOf((float) this.$state.getMaxValue());
    }
}
