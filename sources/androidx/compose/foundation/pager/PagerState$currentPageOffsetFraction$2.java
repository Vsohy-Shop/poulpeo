package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.LazyListItemInfo;
import kotlin.jvm.internal.C12777p;
import p404of.C13074a;

/* compiled from: PagerState.kt */
final class PagerState$currentPageOffsetFraction$2 extends C12777p implements C13074a<Float> {
    final /* synthetic */ PagerState this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PagerState$currentPageOffsetFraction$2(PagerState pagerState) {
        super(0);
        this.this$0 = pagerState;
    }

    public final Float invoke() {
        float f;
        LazyListItemInfo access$getClosestPageToSnappedPosition = this.this$0.getClosestPageToSnappedPosition();
        boolean z = false;
        int offset = access$getClosestPageToSnappedPosition != null ? access$getClosestPageToSnappedPosition.getOffset() : 0;
        float access$getPageAvailableSpace = (float) this.this$0.getPageAvailableSpace();
        if (access$getPageAvailableSpace == 0.0f) {
            z = true;
        }
        if (z) {
            f = this.this$0.getInitialPageOffsetFraction();
        } else {
            f = C13537l.m30885l(((float) (-offset)) / access$getPageAvailableSpace, -0.5f, 0.5f);
        }
        return Float.valueOf(f);
    }
}
