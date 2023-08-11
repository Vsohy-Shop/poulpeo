package p465ye;

import androidx.core.location.LocationRequestCompat;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p386lg.C12861c;
import p397ne.C13016b;
import p471ze.C14109d;

/* renamed from: ye.f */
/* compiled from: SubscriptionArbiter */
public class C13924f extends AtomicInteger implements C12861c {
    private static final long serialVersionUID = -2189523197179400958L;

    /* renamed from: b */
    C12861c f22831b;

    /* renamed from: c */
    long f22832c;

    /* renamed from: d */
    final AtomicReference<C12861c> f22833d = new AtomicReference<>();

    /* renamed from: e */
    final AtomicLong f22834e = new AtomicLong();

    /* renamed from: f */
    final AtomicLong f22835f = new AtomicLong();

    /* renamed from: g */
    volatile boolean f22836g;

    /* renamed from: h */
    protected boolean f22837h;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo53659a() {
        if (getAndIncrement() == 0) {
            mo53660c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo53660c() {
        int i = 1;
        long j = 0;
        C12861c cVar = null;
        do {
            C12861c cVar2 = this.f22833d.get();
            if (cVar2 != null) {
                cVar2 = this.f22833d.getAndSet((Object) null);
            }
            long j2 = this.f22834e.get();
            if (j2 != 0) {
                j2 = this.f22834e.getAndSet(0);
            }
            long j3 = this.f22835f.get();
            if (j3 != 0) {
                j3 = this.f22835f.getAndSet(0);
            }
            C12861c cVar3 = this.f22831b;
            if (this.f22836g) {
                if (cVar3 != null) {
                    cVar3.cancel();
                    this.f22831b = null;
                }
                if (cVar2 != null) {
                    cVar2.cancel();
                }
            } else {
                long j4 = this.f22832c;
                if (j4 != LocationRequestCompat.PASSIVE_INTERVAL) {
                    j4 = C14109d.m32753c(j4, j2);
                    if (j4 != LocationRequestCompat.PASSIVE_INTERVAL) {
                        j4 -= j3;
                        if (j4 < 0) {
                            C13925g.m32185d(j4);
                            j4 = 0;
                        }
                    }
                    this.f22832c = j4;
                }
                if (cVar2 != null) {
                    if (cVar3 != null) {
                        cVar3.cancel();
                    }
                    this.f22831b = cVar2;
                    if (j4 != 0) {
                        j = C14109d.m32753c(j, j4);
                        cVar = cVar2;
                    }
                } else if (!(cVar3 == null || j2 == 0)) {
                    j = C14109d.m32753c(j, j2);
                    cVar = cVar3;
                }
            }
            i = addAndGet(-i);
        } while (i != 0);
        if (j != 0) {
            cVar.mo50776h(j);
        }
    }

    public void cancel() {
        if (!this.f22836g) {
            this.f22836g = true;
            mo53659a();
        }
    }

    /* renamed from: g */
    public final boolean mo53661g() {
        return this.f22837h;
    }

    /* renamed from: h */
    public final void mo50776h(long j) {
        if (C13925g.m32188g(j) && !this.f22837h) {
            if (get() != 0 || !compareAndSet(0, 1)) {
                C14109d.m32751a(this.f22834e, j);
                mo53659a();
                return;
            }
            long j2 = this.f22832c;
            if (j2 != LocationRequestCompat.PASSIVE_INTERVAL) {
                long c = C14109d.m32753c(j2, j);
                this.f22832c = c;
                if (c == LocationRequestCompat.PASSIVE_INTERVAL) {
                    this.f22837h = true;
                }
            }
            C12861c cVar = this.f22831b;
            if (decrementAndGet() != 0) {
                mo53660c();
            }
            if (cVar != null) {
                cVar.mo50776h(j);
            }
        }
    }

    /* renamed from: i */
    public final void mo53662i(long j) {
        if (!this.f22837h) {
            if (get() != 0 || !compareAndSet(0, 1)) {
                C14109d.m32751a(this.f22835f, j);
                mo53659a();
                return;
            }
            long j2 = this.f22832c;
            if (j2 != LocationRequestCompat.PASSIVE_INTERVAL) {
                long j3 = j2 - j;
                if (j3 < 0) {
                    C13925g.m32185d(j3);
                    j3 = 0;
                }
                this.f22832c = j3;
            }
            if (decrementAndGet() != 0) {
                mo53660c();
            }
        }
    }

    /* renamed from: j */
    public final void mo53663j(C12861c cVar) {
        if (this.f22836g) {
            cVar.cancel();
            return;
        }
        C13016b.m29390d(cVar, "s is null");
        if (get() != 0 || !compareAndSet(0, 1)) {
            C12861c andSet = this.f22833d.getAndSet(cVar);
            if (andSet != null) {
                andSet.cancel();
            }
            mo53659a();
            return;
        }
        C12861c cVar2 = this.f22831b;
        if (cVar2 != null) {
            cVar2.cancel();
        }
        this.f22831b = cVar;
        long j = this.f22832c;
        if (decrementAndGet() != 0) {
            mo53660c();
        }
        if (j != 0) {
            cVar.mo50776h(j);
        }
    }
}
