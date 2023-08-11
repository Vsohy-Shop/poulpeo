package androidx.compose.foundation.gestures;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.input.nestedscroll.NestedScrollDispatcher;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;

/* compiled from: Scrollable.kt */
final class ScrollingLogic$dispatchScroll$performScroll$1 extends C12777p implements Function1<Offset, Offset> {
    final /* synthetic */ int $source;
    final /* synthetic */ ScrollScope $this_dispatchScroll;
    final /* synthetic */ ScrollingLogic this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ScrollingLogic$dispatchScroll$performScroll$1(ScrollingLogic scrollingLogic, int i, ScrollScope scrollScope) {
        super(1);
        this.this$0 = scrollingLogic;
        this.$source = i;
        this.$this_dispatchScroll = scrollScope;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Offset.m35411boximpl(m33145invokeMKHz9U(((Offset) obj).m35432unboximpl()));
    }

    /* renamed from: invoke-MK-Hz9U  reason: not valid java name */
    public final long m33145invokeMKHz9U(long j) {
        NestedScrollDispatcher value = this.this$0.getNestedScrollDispatcher().getValue();
        long r7 = value.m37055dispatchPreScrollOzD1aCk(j, this.$source);
        long r12 = Offset.m35426minusMKHz9U(j, r7);
        ScrollingLogic scrollingLogic = this.this$0;
        long r9 = scrollingLogic.m33138reverseIfNeededMKHz9U(scrollingLogic.m33143toOffsettuRUvjQ(this.$this_dispatchScroll.scrollBy(scrollingLogic.m33142toFloatk4lQ0M(scrollingLogic.m33138reverseIfNeededMKHz9U(r12)))));
        return Offset.m35427plusMKHz9U(Offset.m35427plusMKHz9U(r7, r9), value.m37053dispatchPostScrollDzOQY0M(r9, Offset.m35426minusMKHz9U(r12, r9), this.$source));
    }
}
