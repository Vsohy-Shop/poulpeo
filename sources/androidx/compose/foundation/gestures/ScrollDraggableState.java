package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.p002ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nScrollable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/ScrollDraggableState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,579:1\n1#2:580\n*E\n"})
/* compiled from: Scrollable.kt */
final class ScrollDraggableState implements DraggableState, DragScope {
    private ScrollScope latestScrollScope = ScrollableKt.NoOpScrollScope;
    private final State<ScrollingLogic> scrollLogic;

    public ScrollDraggableState(State<ScrollingLogic> state) {
        C12775o.m28639i(state, "scrollLogic");
        this.scrollLogic = state;
    }

    public void dispatchRawDelta(float f) {
        ScrollingLogic value = this.scrollLogic.getValue();
        value.m33137performRawScrollMKHz9U(value.m33143toOffsettuRUvjQ(f));
    }

    public Object drag(MutatePriority mutatePriority, C13088o<? super DragScope, ? super C12074d<? super C11921v>, ? extends Object> oVar, C12074d<? super C11921v> dVar) {
        Object scroll = this.scrollLogic.getValue().getScrollableState().scroll(mutatePriority, new ScrollDraggableState$drag$2(this, oVar, (C12074d<? super ScrollDraggableState$drag$2>) null), dVar);
        if (scroll == C12150d.m26492c()) {
            return scroll;
        }
        return C11921v.f18618a;
    }

    public void dragBy(float f) {
        ScrollingLogic value = this.scrollLogic.getValue();
        value.m33134dispatchScroll3eAAhYA(this.latestScrollScope, value.m33143toOffsettuRUvjQ(f), NestedScrollSource.Companion.m37068getDragWNlRxjI());
    }

    public final ScrollScope getLatestScrollScope() {
        return this.latestScrollScope;
    }

    public final State<ScrollingLogic> getScrollLogic() {
        return this.scrollLogic;
    }

    public final void setLatestScrollScope(ScrollScope scrollScope) {
        C12775o.m28639i(scrollScope, "<set-?>");
        this.latestScrollScope = scrollScope;
    }
}
