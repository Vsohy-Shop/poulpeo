package androidx.compose.p002ui.text.input;

import androidx.compose.p002ui.text.input.PlatformTextInputPluginRegistryImpl;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p466yf.C13995l0;

@SourceDebugExtension({"SMAP\nPlatformTextInputAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformTextInputAdapter.kt\nandroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl$rememberAdapter$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,335:1\n62#2,5:336\n*S KotlinDebug\n*F\n+ 1 PlatformTextInputAdapter.kt\nandroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl$rememberAdapter$1\n*L\n174#1:336,5\n*E\n"})
/* renamed from: androidx.compose.ui.text.input.PlatformTextInputPluginRegistryImpl$rememberAdapter$1 */
/* compiled from: PlatformTextInputAdapter.kt */
final class PlatformTextInputPluginRegistryImpl$rememberAdapter$1 extends C12777p implements Function1<DisposableEffectScope, DisposableEffectResult> {
    final /* synthetic */ PlatformTextInputPluginRegistryImpl.AdapterHandle<T> $adapterHandle;
    final /* synthetic */ C13995l0 $scope;
    final /* synthetic */ PlatformTextInputPluginRegistryImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PlatformTextInputPluginRegistryImpl$rememberAdapter$1(PlatformTextInputPluginRegistryImpl.AdapterHandle<T> adapterHandle, C13995l0 l0Var, PlatformTextInputPluginRegistryImpl platformTextInputPluginRegistryImpl) {
        super(1);
        this.$adapterHandle = adapterHandle;
        this.$scope = l0Var;
        this.this$0 = platformTextInputPluginRegistryImpl;
    }

    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        C12775o.m28639i(disposableEffectScope, "$this$DisposableEffect");
        return new C1226x47d96d1d(this.$adapterHandle, this.$scope, this.this$0);
    }
}
