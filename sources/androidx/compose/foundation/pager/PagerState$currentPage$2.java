package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.LazyListItemInfo;
import kotlin.jvm.internal.C12777p;
import p404of.C13074a;

/* compiled from: PagerState.kt */
final class PagerState$currentPage$2 extends C12777p implements C13074a<Integer> {
    final /* synthetic */ PagerState this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PagerState$currentPage$2(PagerState pagerState) {
        super(0);
        this.this$0 = pagerState;
    }

    public final Integer invoke() {
        LazyListItemInfo access$getClosestPageToSnappedPosition = this.this$0.getClosestPageToSnappedPosition();
        return Integer.valueOf(access$getClosestPageToSnappedPosition != null ? access$getClosestPageToSnappedPosition.getIndex() : this.this$0.getInitialPage());
    }
}
