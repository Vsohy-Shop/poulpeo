package androidx.compose.material3;

import androidx.compose.runtime.DisposableEffectResult;

/* renamed from: androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$3$invoke$$inlined$onDispose$1 */
/* compiled from: Effects.kt */
public final class C0853xbe6ea54d implements DisposableEffectResult {
    final /* synthetic */ OnGlobalLayoutListener $listener$inlined;

    public C0853xbe6ea54d(OnGlobalLayoutListener onGlobalLayoutListener) {
        this.$listener$inlined = onGlobalLayoutListener;
    }

    public void dispose() {
        this.$listener$inlined.dispose();
    }
}
