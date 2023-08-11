package androidx.compose.foundation.layout;

import androidx.compose.runtime.DisposableEffectResult;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/WindowInsetsConnection_androidKt$rememberWindowInsetsConnection$1\n*L\n1#1,483:1\n121#2,2:484\n*E\n"})
/* renamed from: androidx.compose.foundation.layout.WindowInsetsConnection_androidKt$rememberWindowInsetsConnection$1$invoke$$inlined$onDispose$1 */
/* compiled from: Effects.kt */
public final class C0470x1464449d implements DisposableEffectResult {
    final /* synthetic */ WindowInsetsNestedScrollConnection $connection$inlined;

    public C0470x1464449d(WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection) {
        this.$connection$inlined = windowInsetsNestedScrollConnection;
    }

    public void dispose() {
        this.$connection$inlined.dispose();
    }
}
