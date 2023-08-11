package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory;
import androidx.compose.runtime.DisposableEffectResult;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 LazyLayoutItemContentFactory.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1$2\n*L\n1#1,484:1\n106#2,2:485\n*E\n"})
/* renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1$2$invoke$$inlined$onDispose$1 */
/* compiled from: Effects.kt */
public final class C0549x1f642295 implements DisposableEffectResult {
    final /* synthetic */ LazyLayoutItemContentFactory.CachedItemContent this$0;

    public C0549x1f642295(LazyLayoutItemContentFactory.CachedItemContent cachedItemContent) {
        this.this$0 = cachedItemContent;
    }

    public void dispose() {
        this.this$0._content = null;
    }
}
