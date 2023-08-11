package androidx.compose.p002ui.window;

import androidx.compose.runtime.DisposableEffectResult;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt$Popup$2\n*L\n1#1,484:1\n272#2,4:485\n*E\n"})
/* renamed from: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2$invoke$$inlined$onDispose$1 */
/* compiled from: Effects.kt */
public final class AndroidPopup_androidKt$Popup$2$invoke$$inlined$onDispose$1 implements DisposableEffectResult {
    final /* synthetic */ PopupLayout $popupLayout$inlined;

    public AndroidPopup_androidKt$Popup$2$invoke$$inlined$onDispose$1(PopupLayout popupLayout) {
        this.$popupLayout$inlined = popupLayout;
    }

    public void dispose() {
        this.$popupLayout$inlined.disposeComposition();
        this.$popupLayout$inlined.dismiss();
    }
}
