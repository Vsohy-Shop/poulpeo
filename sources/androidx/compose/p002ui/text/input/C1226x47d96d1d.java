package androidx.compose.p002ui.text.input;

import androidx.compose.p002ui.text.input.PlatformTextInputPluginRegistryImpl;
import androidx.compose.runtime.DisposableEffectResult;
import kotlin.jvm.internal.SourceDebugExtension;
import p355hf.C12074d;
import p466yf.C13995l0;
import p466yf.C13997l2;
import p466yf.C14004n0;
import p466yf.C14054y1;

@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 PlatformTextInputAdapter.kt\nandroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl$rememberAdapter$1\n*L\n1#1,483:1\n175#2,5:484\n190#2,3:489\n*E\n"})
/* renamed from: androidx.compose.ui.text.input.PlatformTextInputPluginRegistryImpl$rememberAdapter$1$invoke$$inlined$onDispose$1 */
/* compiled from: Effects.kt */
public final class C1226x47d96d1d implements DisposableEffectResult {
    final /* synthetic */ PlatformTextInputPluginRegistryImpl.AdapterHandle $adapterHandle$inlined;
    final /* synthetic */ C13995l0 $scope$inlined;
    final /* synthetic */ PlatformTextInputPluginRegistryImpl this$0;

    public C1226x47d96d1d(PlatformTextInputPluginRegistryImpl.AdapterHandle adapterHandle, C13995l0 l0Var, PlatformTextInputPluginRegistryImpl platformTextInputPluginRegistryImpl) {
        this.$adapterHandle$inlined = adapterHandle;
        this.$scope$inlined = l0Var;
        this.this$0 = platformTextInputPluginRegistryImpl;
    }

    public void dispose() {
        if (this.$adapterHandle$inlined.dispose()) {
            C14054y1 unused = C13985j.m32422d(this.$scope$inlined, C13997l2.f22924b, (C14004n0) null, new PlatformTextInputPluginRegistryImpl$rememberAdapter$1$1$1(this.this$0, (C12074d<? super PlatformTextInputPluginRegistryImpl$rememberAdapter$1$1$1>) null), 2, (Object) null);
        }
    }
}
