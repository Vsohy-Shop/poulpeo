package androidx.compose.material;

import androidx.compose.runtime.DisposableEffectResult;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 ExposedDropdownMenu.kt\nandroidx/compose/material/ExposedDropdownMenuKt$ExposedDropdownMenuBox$5\n*L\n1#1,484:1\n150#2:485\n*E\n"})
/* renamed from: androidx.compose.material.ExposedDropdownMenuKt$ExposedDropdownMenuBox$5$invoke$$inlined$onDispose$1 */
/* compiled from: Effects.kt */
public final class C0731x110e6e4f implements DisposableEffectResult {
    final /* synthetic */ OnGlobalLayoutListener $listener$inlined;

    public C0731x110e6e4f(OnGlobalLayoutListener onGlobalLayoutListener) {
        this.$listener$inlined = onGlobalLayoutListener;
    }

    public void dispose() {
        this.$listener$inlined.dispose();
    }
}
