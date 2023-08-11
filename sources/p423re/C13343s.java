package p423re;

import androidx.core.location.LocationRequestCompat;
import java.util.concurrent.atomic.AtomicLong;
import p341fe.C11949f;
import p341fe.C11952i;
import p364io.reactivex.exceptions.MissingBackpressureException;
import p369je.C12620a;
import p384le.C12850a;
import p386lg.C12860b;
import p386lg.C12861c;
import p403oe.C13072i;
import p447ve.C13639a;
import p447ve.C13640b;
import p465ye.C13919a;
import p465ye.C13925g;
import p471ze.C14109d;

/* renamed from: re.s */
/* compiled from: FlowableOnBackpressureBuffer */
public final class C13343s<T> extends C13287a<T, T> {

    /* renamed from: d */
    final int f21354d;

    /* renamed from: e */
    final boolean f21355e;

    /* renamed from: f */
    final boolean f21356f;

    /* renamed from: g */
    final C12850a f21357g;

    /* renamed from: re.s$a */
    /* compiled from: FlowableOnBackpressureBuffer */
    static final class C13344a<T> extends C13919a<T> implements C11952i<T> {
        private static final long serialVersionUID = -2514538129242366402L;

        /* renamed from: b */
        final C12860b<? super T> f21358b;

        /* renamed from: c */
        final C13072i<T> f21359c;

        /* renamed from: d */
        final boolean f21360d;

        /* renamed from: e */
        final C12850a f21361e;

        /* renamed from: f */
        C12861c f21362f;

        /* renamed from: g */
        volatile boolean f21363g;

        /* renamed from: h */
        volatile boolean f21364h;

        /* renamed from: i */
        Throwable f21365i;

        /* renamed from: j */
        final AtomicLong f21366j = new AtomicLong();

        /* renamed from: k */
        boolean f21367k;

        C13344a(C12860b<? super T> bVar, int i, boolean z, boolean z2, C12850a aVar) {
            C13072i<T> iVar;
            this.f21358b = bVar;
            this.f21361e = aVar;
            this.f21360d = z2;
            if (z) {
                iVar = new C13640b<>(i);
            } else {
                iVar = new C13639a<>(i);
            }
            this.f21359c = iVar;
        }

        /* renamed from: b */
        public void mo50772b() {
            this.f21364h = true;
            if (this.f21367k) {
                this.f21358b.mo50772b();
            } else {
                mo52975j();
            }
        }

        public void cancel() {
            if (!this.f21363g) {
                this.f21363g = true;
                this.f21362f.cancel();
                if (getAndIncrement() == 0) {
                    this.f21359c.clear();
                }
            }
        }

        public void clear() {
            this.f21359c.clear();
        }

        /* renamed from: d */
        public void mo50773d(T t) {
            if (!this.f21359c.offer(t)) {
                this.f21362f.cancel();
                MissingBackpressureException missingBackpressureException = new MissingBackpressureException("Buffer is full");
                try {
                    this.f21361e.run();
                } catch (Throwable th) {
                    C12620a.m28007b(th);
                    missingBackpressureException.initCause(th);
                }
                onError(missingBackpressureException);
            } else if (this.f21367k) {
                this.f21358b.mo50773d(null);
            } else {
                mo52975j();
            }
        }

        /* renamed from: e */
        public void mo49220e(C12861c cVar) {
            if (C13925g.m32189i(this.f21362f, cVar)) {
                this.f21362f = cVar;
                this.f21358b.mo49220e(this);
                cVar.mo50776h(LocationRequestCompat.PASSIVE_INTERVAL);
            }
        }

        /* renamed from: g */
        public int mo50862g(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.f21367k = true;
            return 2;
        }

        /* renamed from: h */
        public void mo50776h(long j) {
            if (!this.f21367k && C13925g.m32188g(j)) {
                C14109d.m32751a(this.f21366j, j);
                mo52975j();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public boolean mo52974i(boolean z, boolean z2, C12860b<? super T> bVar) {
            if (this.f21363g) {
                this.f21359c.clear();
                return true;
            } else if (!z) {
                return false;
            } else {
                if (!this.f21360d) {
                    Throwable th = this.f21365i;
                    if (th != null) {
                        this.f21359c.clear();
                        bVar.onError(th);
                        return true;
                    } else if (!z2) {
                        return false;
                    } else {
                        bVar.mo50772b();
                        return true;
                    }
                } else if (!z2) {
                    return false;
                } else {
                    Throwable th2 = this.f21365i;
                    if (th2 != null) {
                        bVar.onError(th2);
                    } else {
                        bVar.mo50772b();
                    }
                    return true;
                }
            }
        }

        public boolean isEmpty() {
            return this.f21359c.isEmpty();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo52975j() {
            int i;
            boolean z;
            if (getAndIncrement() == 0) {
                C13072i<T> iVar = this.f21359c;
                C12860b<? super T> bVar = this.f21358b;
                int i2 = 1;
                while (!mo52974i(this.f21364h, iVar.isEmpty(), bVar)) {
                    long j = this.f21366j.get();
                    long j2 = 0;
                    while (true) {
                        i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
                        if (i == 0) {
                            break;
                        }
                        boolean z2 = this.f21364h;
                        T poll = iVar.poll();
                        if (poll == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!mo52974i(z2, z, bVar)) {
                            if (z) {
                                break;
                            }
                            bVar.mo50773d(poll);
                            j2++;
                        } else {
                            return;
                        }
                    }
                    if (i != 0 || !mo52974i(this.f21364h, iVar.isEmpty(), bVar)) {
                        if (!(j2 == 0 || j == LocationRequestCompat.PASSIVE_INTERVAL)) {
                            this.f21366j.addAndGet(-j2);
                        }
                        i2 = addAndGet(-i2);
                        if (i2 == 0) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
        }

        public void onError(Throwable th) {
            this.f21365i = th;
            this.f21364h = true;
            if (this.f21367k) {
                this.f21358b.onError(th);
            } else {
                mo52975j();
            }
        }

        public T poll() {
            return this.f21359c.poll();
        }
    }

    public C13343s(C11949f<T> fVar, int i, boolean z, boolean z2, C12850a aVar) {
        super(fVar);
        this.f21354d = i;
        this.f21355e = z;
        this.f21356f = z2;
        this.f21357g = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public void mo49200I(C12860b<? super T> bVar) {
        this.f21182c.mo49199H(new C13344a(bVar, this.f21354d, this.f21355e, this.f21356f, this.f21357g));
    }
}
