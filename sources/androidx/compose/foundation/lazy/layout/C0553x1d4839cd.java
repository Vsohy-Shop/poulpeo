package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.DisposableEffectResult;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 LazyLayoutPinnableItem.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPinnableItemKt$LazyLayoutPinnableItem$1$1\n*L\n1#1,484:1\n52#2:485\n*E\n"})
/* renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt$LazyLayoutPinnableItem$1$1$invoke$$inlined$onDispose$1 */
/* compiled from: Effects.kt */
public final class C0553x1d4839cd implements DisposableEffectResult {
    final /* synthetic */ LazyLayoutPinnableItem $pinnableItem$inlined;

    public C0553x1d4839cd(LazyLayoutPinnableItem lazyLayoutPinnableItem) {
        this.$pinnableItem$inlined = lazyLayoutPinnableItem;
    }

    public void dispose() {
        this.$pinnableItem$inlined.onDisposed();
    }
}
