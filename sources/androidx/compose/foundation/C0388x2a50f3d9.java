package androidx.compose.foundation;

import androidx.compose.runtime.DisposableEffectResult;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 SystemGestureExclusion.kt\nandroidx/compose/foundation/SystemGestureExclusionKt$excludeFromSystemGestureQ$1\n*L\n1#1,484:1\n84#2,2:485\n*E\n"})
/* renamed from: androidx.compose.foundation.SystemGestureExclusionKt$excludeFromSystemGestureQ$1$invoke$$inlined$onDispose$1 */
/* compiled from: Effects.kt */
public final class C0388x2a50f3d9 implements DisposableEffectResult {
    final /* synthetic */ ExcludeFromSystemGestureModifier $modifier$inlined;

    public C0388x2a50f3d9(ExcludeFromSystemGestureModifier excludeFromSystemGestureModifier) {
        this.$modifier$inlined = excludeFromSystemGestureModifier;
    }

    public void dispose() {
        this.$modifier$inlined.removeRect();
    }
}
