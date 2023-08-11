package p308ag;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.JobCancellationException;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12079g;
import p466yf.C13926a;
import p466yf.C13956f2;

@SourceDebugExtension({"SMAP\nChannelCoroutine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChannelCoroutine.kt\nkotlinx/coroutines/channels/ChannelCoroutine\n+ 2 JobSupport.kt\nkotlinx/coroutines/JobSupport\n*L\n1#1,41:1\n705#2,2:42\n705#2,2:44\n705#2,2:46\n*S KotlinDebug\n*F\n+ 1 ChannelCoroutine.kt\nkotlinx/coroutines/channels/ChannelCoroutine\n*L\n21#1:42,2\n26#1:44,2\n32#1:46,2\n*E\n"})
/* renamed from: ag.e */
/* compiled from: ChannelCoroutine.kt */
public class C10896e<E> extends C13926a<C11921v> implements C10894d<E> {

    /* renamed from: e */
    private final C10894d<E> f16817e;

    public C10896e(C12079g gVar, C10894d<E> dVar, boolean z, boolean z2) {
        super(gVar, z, z2);
        this.f16817e = dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: L0 */
    public final C10894d<E> mo45909L0() {
        return this.f16817e;
    }

    /* renamed from: b */
    public Object mo45883b(C12074d<? super E> dVar) {
        return this.f16817e.mo45883b(dVar);
    }

    public final void cancel(CancellationException cancellationException) {
        if (!mo53710a0()) {
            if (cancellationException == null) {
                cancellationException = new JobCancellationException(mo53664C(), (Throwable) null, this);
            }
            mo45910y(cancellationException);
        }
    }

    /* renamed from: d */
    public Object mo45885d() {
        return this.f16817e.mo45885d();
    }

    /* renamed from: e */
    public boolean mo45886e(Throwable th) {
        return this.f16817e.mo45886e(th);
    }

    /* renamed from: g */
    public void mo45888g(Function1<? super Throwable, C11921v> function1) {
        this.f16817e.mo45888g(function1);
    }

    public boolean isEmpty() {
        return this.f16817e.isEmpty();
    }

    public C10897f<E> iterator() {
        return this.f16817e.iterator();
    }

    /* renamed from: l */
    public Object mo45893l(E e, C12074d<? super C11921v> dVar) {
        return this.f16817e.mo45893l(e, dVar);
    }

    /* renamed from: m */
    public Object mo45894m(E e) {
        return this.f16817e.mo45894m(e);
    }

    /* renamed from: n */
    public boolean mo45895n() {
        return this.f16817e.mo45895n();
    }

    /* renamed from: y */
    public void mo45910y(Throwable th) {
        CancellationException A0 = C13956f2.m32265A0(this, th, (String) null, 1, (Object) null);
        this.f16817e.cancel(A0);
        mo53725w(A0);
    }
}
