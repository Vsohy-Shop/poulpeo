package androidx.compose.material.internal;

import androidx.compose.runtime.DisposableEffectResult;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 ExposedDropdownMenuPopup.kt\nandroidx/compose/material/internal/ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$1\n*L\n1#1,484:1\n127#2,4:485\n*E\n"})
/* renamed from: androidx.compose.material.internal.ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$1$invoke$$inlined$onDispose$1 */
/* compiled from: Effects.kt */
public final class C0816x4c920400 implements DisposableEffectResult {
    final /* synthetic */ PopupLayout $popupLayout$inlined;

    public C0816x4c920400(PopupLayout popupLayout) {
        this.$popupLayout$inlined = popupLayout;
    }

    public void dispose() {
        this.$popupLayout$inlined.disposeComposition();
        this.$popupLayout$inlined.dismiss();
    }
}
