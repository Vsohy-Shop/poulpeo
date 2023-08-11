package androidx.compose.runtime;

import kotlin.coroutines.jvm.internal.C12735b;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.functions.Function1;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;
import p466yf.C13995l0;
import p466yf.C14041v0;

@C12739f(mo50609c = "androidx.compose.runtime.SdkStubsFallbackFrameClock$withFrameNanos$2", mo50610f = "ActualAndroid.android.kt", mo50611l = {52}, mo50612m = "invokeSuspend")
/* compiled from: ActualAndroid.android.kt */
final class SdkStubsFallbackFrameClock$withFrameNanos$2 extends C12746l implements C13088o<C13995l0, C12074d<? super R>, Object> {
    final /* synthetic */ Function1<Long, R> $onFrame;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SdkStubsFallbackFrameClock$withFrameNanos$2(Function1<? super Long, ? extends R> function1, C12074d<? super SdkStubsFallbackFrameClock$withFrameNanos$2> dVar) {
        super(2, dVar);
        this.$onFrame = function1;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        return new SdkStubsFallbackFrameClock$withFrameNanos$2(this.$onFrame, dVar);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C12150d.m26492c();
        int i = this.label;
        if (i == 0) {
            C11910n.m25701b(obj);
            this.label = 1;
            if (C14041v0.m32563a(16, this) == c) {
                return c;
            }
        } else if (i == 1) {
            C11910n.m25701b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return this.$onFrame.invoke(C12735b.m28561d(System.nanoTime()));
    }

    public final Object invoke(C13995l0 l0Var, C12074d<? super R> dVar) {
        return ((SdkStubsFallbackFrameClock$withFrameNanos$2) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
    }
}
