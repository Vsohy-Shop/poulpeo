package androidx.compose.material3;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.input.nestedscroll.NestedScrollConnection;

/* compiled from: AppBar.kt */
public final class PinnedScrollBehavior$nestedScrollConnection$1 implements NestedScrollConnection {
    final /* synthetic */ PinnedScrollBehavior this$0;

    PinnedScrollBehavior$nestedScrollConnection$1(PinnedScrollBehavior pinnedScrollBehavior) {
        this.this$0 = pinnedScrollBehavior;
    }

    /* renamed from: onPostScroll-DzOQY0M  reason: not valid java name */
    public long m34539onPostScrollDzOQY0M(long j, long j2, int i) {
        boolean z;
        if (!this.this$0.getCanScroll().invoke().booleanValue()) {
            return Offset.Companion.m35438getZeroF1C5BW0();
        }
        if (Offset.m35423getYimpl(j) == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (!z || Offset.m35423getYimpl(j2) <= 0.0f) {
            TopAppBarState state = this.this$0.getState();
            state.setContentOffset(state.getContentOffset() + Offset.m35423getYimpl(j));
        } else {
            this.this$0.getState().setContentOffset(0.0f);
        }
        return Offset.Companion.m35438getZeroF1C5BW0();
    }
}
