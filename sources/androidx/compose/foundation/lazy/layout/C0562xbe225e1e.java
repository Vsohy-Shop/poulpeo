package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.DisposableEffectResult;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 LazySaveableStateHolder.kt\nandroidx/compose/foundation/lazy/layout/LazySaveableStateHolder$SaveableStateProvider$1\n*L\n1#1,484:1\n88#2,2:485\n*E\n"})
/* renamed from: androidx.compose.foundation.lazy.layout.LazySaveableStateHolder$SaveableStateProvider$1$invoke$$inlined$onDispose$1 */
/* compiled from: Effects.kt */
public final class C0562xbe225e1e implements DisposableEffectResult {
    final /* synthetic */ Object $key$inlined;
    final /* synthetic */ LazySaveableStateHolder this$0;

    public C0562xbe225e1e(LazySaveableStateHolder lazySaveableStateHolder, Object obj) {
        this.this$0 = lazySaveableStateHolder;
        this.$key$inlined = obj;
    }

    public void dispose() {
        this.this$0.previouslyComposedKeys.add(this.$key$inlined);
    }
}
