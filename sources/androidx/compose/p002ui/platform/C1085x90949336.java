package androidx.compose.p002ui.platform;

import android.content.Context;
import androidx.compose.runtime.DisposableEffectResult;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 AndroidCompositionLocals.android.kt\nandroidx/compose/ui/platform/AndroidCompositionLocals_androidKt$obtainImageVectorCache$1\n*L\n1#1,484:1\n161#2,2:485\n*E\n"})
/* renamed from: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$obtainImageVectorCache$1$invoke$$inlined$onDispose$1 */
/* compiled from: Effects.kt */
public final class C1085x90949336 implements DisposableEffectResult {
    final /* synthetic */ C1091x477bcb35 $callbacks$inlined;
    final /* synthetic */ Context $context$inlined;

    public C1085x90949336(Context context, C1091x477bcb35 androidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1) {
        this.$context$inlined = context;
        this.$callbacks$inlined = androidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1;
    }

    public void dispose() {
        this.$context$inlined.getApplicationContext().unregisterComponentCallbacks(this.$callbacks$inlined);
    }
}
