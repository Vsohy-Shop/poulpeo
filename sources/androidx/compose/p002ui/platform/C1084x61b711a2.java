package androidx.compose.p002ui.platform;

import androidx.compose.runtime.DisposableEffectResult;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 AndroidCompositionLocals.android.kt\nandroidx/compose/ui/platform/AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$2\n*L\n1#1,484:1\n109#2,2:485\n*E\n"})
/* renamed from: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$2$invoke$$inlined$onDispose$1 */
/* compiled from: Effects.kt */
public final class C1084x61b711a2 implements DisposableEffectResult {
    final /* synthetic */ DisposableSaveableStateRegistry $saveableStateRegistry$inlined;

    public C1084x61b711a2(DisposableSaveableStateRegistry disposableSaveableStateRegistry) {
        this.$saveableStateRegistry$inlined = disposableSaveableStateRegistry;
    }

    public void dispose() {
        this.$saveableStateRegistry$inlined.dispose();
    }
}
