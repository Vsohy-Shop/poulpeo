package androidx.compose.foundation.lazy.layout;

import kotlin.jvm.internal.C12777p;
import p404of.C13074a;

/* renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt$lazyLayoutSemantics$1$accessibilityScrollState$2 */
/* compiled from: LazyLayoutSemantics.kt */
final class C0555x1761fe58 extends C12777p implements C13074a<Float> {
    final /* synthetic */ LazyLayoutItemProvider $itemProvider;
    final /* synthetic */ LazyLayoutSemanticState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0555x1761fe58(LazyLayoutSemanticState lazyLayoutSemanticState, LazyLayoutItemProvider lazyLayoutItemProvider) {
        super(0);
        this.$state = lazyLayoutSemanticState;
        this.$itemProvider = lazyLayoutItemProvider;
    }

    public final Float invoke() {
        float f;
        if (this.$state.getCanScrollForward()) {
            f = ((float) this.$itemProvider.getItemCount()) + 1.0f;
        } else {
            f = this.$state.getCurrentPosition();
        }
        return Float.valueOf(f);
    }
}
