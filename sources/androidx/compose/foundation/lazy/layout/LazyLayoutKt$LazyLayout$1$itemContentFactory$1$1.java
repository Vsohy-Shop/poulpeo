package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.State;
import kotlin.jvm.internal.C12777p;
import p404of.C13074a;

/* compiled from: LazyLayout.kt */
final class LazyLayoutKt$LazyLayout$1$itemContentFactory$1$1 extends C12777p implements C13074a<LazyLayoutItemProvider> {
    final /* synthetic */ State<LazyLayoutItemProvider> $currentItemProvider;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazyLayoutKt$LazyLayout$1$itemContentFactory$1$1(State<? extends LazyLayoutItemProvider> state) {
        super(0);
        this.$currentItemProvider = state;
    }

    public final LazyLayoutItemProvider invoke() {
        return this.$currentItemProvider.getValue();
    }
}
