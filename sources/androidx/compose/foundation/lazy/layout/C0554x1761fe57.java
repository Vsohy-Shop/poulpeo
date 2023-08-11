package androidx.compose.foundation.lazy.layout;

import kotlin.jvm.internal.C12777p;
import p404of.C13074a;

/* renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt$lazyLayoutSemantics$1$accessibilityScrollState$1 */
/* compiled from: LazyLayoutSemantics.kt */
final class C0554x1761fe57 extends C12777p implements C13074a<Float> {
    final /* synthetic */ LazyLayoutSemanticState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0554x1761fe57(LazyLayoutSemanticState lazyLayoutSemanticState) {
        super(0);
        this.$state = lazyLayoutSemanticState;
    }

    public final Float invoke() {
        return Float.valueOf(this.$state.getCurrentPosition());
    }
}
