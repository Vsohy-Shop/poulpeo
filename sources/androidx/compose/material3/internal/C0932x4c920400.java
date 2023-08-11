package androidx.compose.material3.internal;

import androidx.compose.runtime.DisposableEffectResult;

/* renamed from: androidx.compose.material3.internal.ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$1$invoke$$inlined$onDispose$1 */
/* compiled from: Effects.kt */
public final class C0932x4c920400 implements DisposableEffectResult {
    final /* synthetic */ PopupLayout $popupLayout$inlined;

    public C0932x4c920400(PopupLayout popupLayout) {
        this.$popupLayout$inlined = popupLayout;
    }

    public void dispose() {
        this.$popupLayout$inlined.disposeComposition();
        this.$popupLayout$inlined.dismiss();
    }
}
