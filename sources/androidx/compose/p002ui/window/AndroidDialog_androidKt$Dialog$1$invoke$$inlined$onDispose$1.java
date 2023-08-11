package androidx.compose.p002ui.window;

import androidx.compose.runtime.DisposableEffectResult;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 AndroidDialog.android.kt\nandroidx/compose/ui/window/AndroidDialog_androidKt$Dialog$1\n*L\n1#1,484:1\n187#2,3:485\n*E\n"})
/* renamed from: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$1$invoke$$inlined$onDispose$1 */
/* compiled from: Effects.kt */
public final class AndroidDialog_androidKt$Dialog$1$invoke$$inlined$onDispose$1 implements DisposableEffectResult {
    final /* synthetic */ DialogWrapper $dialog$inlined;

    public AndroidDialog_androidKt$Dialog$1$invoke$$inlined$onDispose$1(DialogWrapper dialogWrapper) {
        this.$dialog$inlined = dialogWrapper;
    }

    public void dispose() {
        this.$dialog$inlined.dismiss();
        this.$dialog$inlined.disposeComposition();
    }
}
