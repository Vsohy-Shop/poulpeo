package p459xe;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p341fe.C11952i;
import p386lg.C12860b;
import p386lg.C12861c;
import p465ye.C13925g;
import p471ze.C14108c;
import p471ze.C14114h;

/* renamed from: xe.d */
/* compiled from: StrictSubscriber */
public class C13845d<T> extends AtomicInteger implements C11952i<T>, C12861c {
    private static final long serialVersionUID = -4945028590049415624L;

    /* renamed from: b */
    final C12860b<? super T> f22349b;

    /* renamed from: c */
    final C14108c f22350c = new C14108c();

    /* renamed from: d */
    final AtomicLong f22351d = new AtomicLong();

    /* renamed from: e */
    final AtomicReference<C12861c> f22352e = new AtomicReference<>();

    /* renamed from: f */
    final AtomicBoolean f22353f = new AtomicBoolean();

    /* renamed from: g */
    volatile boolean f22354g;

    public C13845d(C12860b<? super T> bVar) {
        this.f22349b = bVar;
    }

    /* renamed from: b */
    public void mo50772b() {
        this.f22354g = true;
        C14114h.m32760a(this.f22349b, this, this.f22350c);
    }

    public void cancel() {
        if (!this.f22354g) {
            C13925g.m32182a(this.f22352e);
        }
    }

    /* renamed from: d */
    public void mo50773d(T t) {
        C14114h.m32762c(this.f22349b, t, this, this.f22350c);
    }

    /* renamed from: e */
    public void mo49220e(C12861c cVar) {
        if (this.f22353f.compareAndSet(false, true)) {
            this.f22349b.mo49220e(this);
            C13925g.m32184c(this.f22352e, this.f22351d, cVar);
            return;
        }
        cVar.cancel();
        cancel();
        onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
    }

    /* renamed from: h */
    public void mo50776h(long j) {
        if (j <= 0) {
            cancel();
            onError(new IllegalArgumentException("§3.9 violated: positive request amount required but it was " + j));
            return;
        }
        C13925g.m32183b(this.f22352e, this.f22351d, j);
    }

    public void onError(Throwable th) {
        this.f22354g = true;
        C14114h.m32761b(this.f22349b, th, this, this.f22350c);
    }
}
