package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.saveable.SaveableStateRegistry;
import kotlin.jvm.internal.C12777p;
import p404of.C13074a;

/* renamed from: androidx.compose.foundation.lazy.layout.LazySaveableStateHolderKt$LazySaveableStateHolderProvider$holder$1 */
/* compiled from: LazySaveableStateHolder.kt */
final class C0563xbfffdb03 extends C12777p implements C13074a<LazySaveableStateHolder> {
    final /* synthetic */ SaveableStateRegistry $currentRegistry;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0563xbfffdb03(SaveableStateRegistry saveableStateRegistry) {
        super(0);
        this.$currentRegistry = saveableStateRegistry;
    }

    public final LazySaveableStateHolder invoke() {
        return new LazySaveableStateHolder(this.$currentRegistry, C12716r0.m28416g());
    }
}
