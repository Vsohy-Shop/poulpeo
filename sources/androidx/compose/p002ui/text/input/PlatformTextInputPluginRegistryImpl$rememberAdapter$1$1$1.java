package androidx.compose.p002ui.text.input;

import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;
import p466yf.C13995l0;

@C12739f(mo50609c = "androidx.compose.ui.text.input.PlatformTextInputPluginRegistryImpl$rememberAdapter$1$1$1", mo50610f = "PlatformTextInputAdapter.kt", mo50611l = {}, mo50612m = "invokeSuspend")
/* renamed from: androidx.compose.ui.text.input.PlatformTextInputPluginRegistryImpl$rememberAdapter$1$1$1 */
/* compiled from: PlatformTextInputAdapter.kt */
final class PlatformTextInputPluginRegistryImpl$rememberAdapter$1$1$1 extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
    int label;
    final /* synthetic */ PlatformTextInputPluginRegistryImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PlatformTextInputPluginRegistryImpl$rememberAdapter$1$1$1(PlatformTextInputPluginRegistryImpl platformTextInputPluginRegistryImpl, C12074d<? super PlatformTextInputPluginRegistryImpl$rememberAdapter$1$1$1> dVar) {
        super(2, dVar);
        this.this$0 = platformTextInputPluginRegistryImpl;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        return new PlatformTextInputPluginRegistryImpl$rememberAdapter$1$1$1(this.this$0, dVar);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = C12150d.m26492c();
        if (this.label == 0) {
            C11910n.m25701b(obj);
            this.this$0.disposeTombstonedAdapters();
            return C11921v.f18618a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
        return ((PlatformTextInputPluginRegistryImpl$rememberAdapter$1$1$1) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
    }
}
