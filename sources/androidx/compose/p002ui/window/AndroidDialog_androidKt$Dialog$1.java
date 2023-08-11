package androidx.compose.p002ui.window;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nAndroidDialog.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/AndroidDialog_androidKt$Dialog$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,456:1\n62#2,5:457\n*S KotlinDebug\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/AndroidDialog_androidKt$Dialog$1\n*L\n186#1:457,5\n*E\n"})
/* renamed from: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$1 */
/* compiled from: AndroidDialog.android.kt */
final class AndroidDialog_androidKt$Dialog$1 extends C12777p implements Function1<DisposableEffectScope, DisposableEffectResult> {
    final /* synthetic */ DialogWrapper $dialog;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidDialog_androidKt$Dialog$1(DialogWrapper dialogWrapper) {
        super(1);
        this.$dialog = dialogWrapper;
    }

    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        C12775o.m28639i(disposableEffectScope, "$this$DisposableEffect");
        this.$dialog.show();
        return new AndroidDialog_androidKt$Dialog$1$invoke$$inlined$onDispose$1(this.$dialog);
    }
}
