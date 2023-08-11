package androidx.compose.foundation.gestures;

import androidx.compose.p002ui.geometry.Offset;
import kotlin.jvm.functions.Function1;

/* compiled from: Scrollable.kt */
public final class ScrollingLogic$doFlingAnimation$2$scope$1 implements ScrollScope {
    final /* synthetic */ Function1<Offset, Offset> $outerScopeScroll;
    final /* synthetic */ ScrollingLogic this$0;

    ScrollingLogic$doFlingAnimation$2$scope$1(ScrollingLogic scrollingLogic, Function1<? super Offset, Offset> function1) {
        this.this$0 = scrollingLogic;
        this.$outerScopeScroll = function1;
    }

    public float scrollBy(float f) {
        ScrollingLogic scrollingLogic = this.this$0;
        return scrollingLogic.m33142toFloatk4lQ0M(this.$outerScopeScroll.invoke(Offset.m35411boximpl(scrollingLogic.m33143toOffsettuRUvjQ(f))).m35432unboximpl());
    }
}
