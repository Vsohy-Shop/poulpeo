package androidx.compose.foundation.gestures;

import androidx.compose.runtime.State;
import kotlin.jvm.internal.C12777p;
import p404of.C13074a;

/* compiled from: Scrollable.kt */
final class ScrollableKt$pointerScrollable$2$1 extends C12777p implements C13074a<Boolean> {
    final /* synthetic */ State<ScrollingLogic> $scrollLogic;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ScrollableKt$pointerScrollable$2$1(State<ScrollingLogic> state) {
        super(0);
        this.$scrollLogic = state;
    }

    public final Boolean invoke() {
        return Boolean.valueOf(this.$scrollLogic.getValue().shouldScrollImmediately());
    }
}
