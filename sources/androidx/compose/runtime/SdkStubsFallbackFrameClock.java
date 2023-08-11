package androidx.compose.runtime;

import androidx.compose.runtime.MonotonicFrameClock;
import kotlin.jvm.functions.Function1;
import p355hf.C12074d;
import p355hf.C12079g;
import p404of.C13088o;
import p466yf.C13933b1;
import p466yf.C13970h;

/* compiled from: ActualAndroid.android.kt */
final class SdkStubsFallbackFrameClock implements MonotonicFrameClock {
    private static final long DefaultFrameDelay = 16;
    public static final SdkStubsFallbackFrameClock INSTANCE = new SdkStubsFallbackFrameClock();

    private SdkStubsFallbackFrameClock() {
    }

    public <R> R fold(R r, C13088o<? super R, ? super C12079g.C12082b, ? extends R> oVar) {
        return MonotonicFrameClock.DefaultImpls.fold(this, r, oVar);
    }

    public <E extends C12079g.C12082b> E get(C12079g.C12084c<E> cVar) {
        return MonotonicFrameClock.DefaultImpls.get(this, cVar);
    }

    public C12079g minusKey(C12079g.C12084c<?> cVar) {
        return MonotonicFrameClock.DefaultImpls.minusKey(this, cVar);
    }

    public C12079g plus(C12079g gVar) {
        return MonotonicFrameClock.DefaultImpls.plus(this, gVar);
    }

    public <R> Object withFrameNanos(Function1<? super Long, ? extends R> function1, C12074d<? super R> dVar) {
        return C13970h.m32378g(C13933b1.m32212c(), new SdkStubsFallbackFrameClock$withFrameNanos$2(function1, (C12074d<? super SdkStubsFallbackFrameClock$withFrameNanos$2>) null), dVar);
    }
}
