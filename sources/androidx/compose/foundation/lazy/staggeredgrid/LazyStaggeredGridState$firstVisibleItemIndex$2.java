package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.collections.C12703l0;
import kotlin.jvm.internal.C12777p;
import p404of.C13074a;
import p436tf.C13528f;

/* compiled from: LazyStaggeredGridState.kt */
final class LazyStaggeredGridState$firstVisibleItemIndex$2 extends C12777p implements C13074a<Integer> {
    final /* synthetic */ LazyStaggeredGridState this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazyStaggeredGridState$firstVisibleItemIndex$2(LazyStaggeredGridState lazyStaggeredGridState) {
        super(0);
        this.this$0 = lazyStaggeredGridState;
    }

    public final Integer invoke() {
        Integer num;
        int[] indices = this.this$0.getScrollPosition$foundation_release().getIndices();
        int i = 0;
        if (indices.length == 0) {
            num = null;
        } else {
            int i2 = indices[0];
            if (i2 == -1) {
                i2 = 0;
            }
            Integer valueOf = Integer.valueOf(i2);
            C12703l0 r = new C13528f(1, C12710p.m28384L(indices)).iterator();
            while (r.hasNext()) {
                int i3 = indices[r.nextInt()];
                if (i3 == -1) {
                    i3 = 0;
                }
                Integer valueOf2 = Integer.valueOf(i3);
                if (valueOf.compareTo(valueOf2) > 0) {
                    valueOf = valueOf2;
                }
            }
            num = valueOf;
        }
        Integer num2 = num;
        if (num2 != null) {
            i = num2.intValue();
        }
        return Integer.valueOf(i);
    }
}
