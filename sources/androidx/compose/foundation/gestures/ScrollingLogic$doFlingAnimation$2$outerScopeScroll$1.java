package androidx.compose.foundation.gestures;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.input.nestedscroll.NestedScrollSource;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;

/* compiled from: Scrollable.kt */
final class ScrollingLogic$doFlingAnimation$2$outerScopeScroll$1 extends C12777p implements Function1<Offset, Offset> {
    final /* synthetic */ ScrollScope $$this$scroll;
    final /* synthetic */ ScrollingLogic this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ScrollingLogic$doFlingAnimation$2$outerScopeScroll$1(ScrollingLogic scrollingLogic, ScrollScope scrollScope) {
        super(1);
        this.this$0 = scrollingLogic;
        this.$$this$scroll = scrollScope;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Offset.m35411boximpl(m33146invokeMKHz9U(((Offset) obj).m35432unboximpl()));
    }

    /* renamed from: invoke-MK-Hz9U  reason: not valid java name */
    public final long m33146invokeMKHz9U(long j) {
        ScrollingLogic scrollingLogic = this.this$0;
        return scrollingLogic.m33138reverseIfNeededMKHz9U(scrollingLogic.m33134dispatchScroll3eAAhYA(this.$$this$scroll, scrollingLogic.m33138reverseIfNeededMKHz9U(j), NestedScrollSource.Companion.m37069getFlingWNlRxjI()));
    }
}
