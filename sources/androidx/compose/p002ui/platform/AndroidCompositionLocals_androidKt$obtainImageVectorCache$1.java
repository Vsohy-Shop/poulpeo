package androidx.compose.p002ui.platform;

import android.content.Context;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nAndroidCompositionLocals.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCompositionLocals.android.kt\nandroidx/compose/ui/platform/AndroidCompositionLocals_androidKt$obtainImageVectorCache$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,170:1\n62#2,5:171\n*S KotlinDebug\n*F\n+ 1 AndroidCompositionLocals.android.kt\nandroidx/compose/ui/platform/AndroidCompositionLocals_androidKt$obtainImageVectorCache$1\n*L\n160#1:171,5\n*E\n"})
/* renamed from: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$obtainImageVectorCache$1 */
/* compiled from: AndroidCompositionLocals.android.kt */
final class AndroidCompositionLocals_androidKt$obtainImageVectorCache$1 extends C12777p implements Function1<DisposableEffectScope, DisposableEffectResult> {
    final /* synthetic */ C1091x477bcb35 $callbacks;
    final /* synthetic */ Context $context;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidCompositionLocals_androidKt$obtainImageVectorCache$1(Context context, C1091x477bcb35 androidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1) {
        super(1);
        this.$context = context;
        this.$callbacks = androidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1;
    }

    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        C12775o.m28639i(disposableEffectScope, "$this$DisposableEffect");
        this.$context.getApplicationContext().registerComponentCallbacks(this.$callbacks);
        return new C1085x90949336(this.$context, this.$callbacks);
    }
}
