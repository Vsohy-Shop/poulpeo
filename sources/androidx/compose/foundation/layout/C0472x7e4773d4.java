package androidx.compose.foundation.layout;

import android.view.View;
import androidx.compose.runtime.DisposableEffectResult;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 WindowInsets.android.kt\nandroidx/compose/foundation/layout/WindowInsetsHolder$Companion$current$1\n*L\n1#1,483:1\n616#2,2:484\n*E\n"})
/* renamed from: androidx.compose.foundation.layout.WindowInsetsHolder$Companion$current$1$invoke$$inlined$onDispose$1 */
/* compiled from: Effects.kt */
public final class C0472x7e4773d4 implements DisposableEffectResult {
    final /* synthetic */ WindowInsetsHolder $insets$inlined;
    final /* synthetic */ View $view$inlined;

    public C0472x7e4773d4(WindowInsetsHolder windowInsetsHolder, View view) {
        this.$insets$inlined = windowInsetsHolder;
        this.$view$inlined = view;
    }

    public void dispose() {
        this.$insets$inlined.decrementAccessors(this.$view$inlined);
    }
}
