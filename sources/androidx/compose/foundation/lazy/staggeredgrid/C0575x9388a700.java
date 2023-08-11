package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.p002ui.semantics.CollectionInfo;
import p336ef.C11921v;
import p355hf.C12074d;

/* renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSemanticsKt$rememberLazyStaggeredGridSemanticState$1$1 */
/* compiled from: LazyStaggeredGridSemantics.kt */
public final class C0575x9388a700 implements LazyLayoutSemanticState {
    final /* synthetic */ LazyStaggeredGridState $state;

    C0575x9388a700(LazyStaggeredGridState lazyStaggeredGridState) {
        this.$state = lazyStaggeredGridState;
    }

    public Object animateScrollBy(float f, C12074d<? super C11921v> dVar) {
        Object animateScrollBy$default = ScrollExtensionsKt.animateScrollBy$default(this.$state, f, (AnimationSpec) null, dVar, 2, (Object) null);
        if (animateScrollBy$default == C12150d.m26492c()) {
            return animateScrollBy$default;
        }
        return C11921v.f18618a;
    }

    public CollectionInfo collectionInfo() {
        return new CollectionInfo(-1, -1);
    }

    public boolean getCanScrollForward() {
        return this.$state.getCanScrollForward();
    }

    public float getCurrentPosition() {
        return ((float) this.$state.getFirstVisibleItemIndex()) + (((float) this.$state.getFirstVisibleItemScrollOffset()) / 100000.0f);
    }

    public Object scrollToItem(int i, C12074d<? super C11921v> dVar) {
        Object scrollToItem$default = LazyStaggeredGridState.scrollToItem$default(this.$state, i, 0, dVar, 2, (Object) null);
        if (scrollToItem$default == C12150d.m26492c()) {
            return scrollToItem$default;
        }
        return C11921v.f18618a;
    }
}
