package p250v1;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import p250v1.C9917d;

/* renamed from: v1.b */
/* compiled from: ErrorRequestCoordinator */
public final class C9915b implements C9917d, C9916c {

    /* renamed from: a */
    private final Object f14868a;
    @Nullable

    /* renamed from: b */
    private final C9917d f14869b;

    /* renamed from: c */
    private volatile C9916c f14870c;

    /* renamed from: d */
    private volatile C9916c f14871d;
    @GuardedBy("requestLock")

    /* renamed from: e */
    private C9917d.C9918a f14872e;
    @GuardedBy("requestLock")

    /* renamed from: f */
    private C9917d.C9918a f14873f;

    public C9915b(Object obj, @Nullable C9917d dVar) {
        C9917d.C9918a aVar = C9917d.C9918a.CLEARED;
        this.f14872e = aVar;
        this.f14873f = aVar;
        this.f14868a = obj;
        this.f14869b = dVar;
    }

    @GuardedBy("requestLock")
    /* renamed from: k */
    private boolean m20655k(C9916c cVar) {
        if (cVar.equals(this.f14870c) || (this.f14872e == C9917d.C9918a.FAILED && cVar.equals(this.f14871d))) {
            return true;
        }
        return false;
    }

    @GuardedBy("requestLock")
    /* renamed from: l */
    private boolean m20656l() {
        C9917d dVar = this.f14869b;
        if (dVar == null || dVar.mo44481b(this)) {
            return true;
        }
        return false;
    }

    @GuardedBy("requestLock")
    /* renamed from: m */
    private boolean m20657m() {
        C9917d dVar = this.f14869b;
        if (dVar == null || dVar.mo44490i(this)) {
            return true;
        }
        return false;
    }

    @GuardedBy("requestLock")
    /* renamed from: n */
    private boolean m20658n() {
        C9917d dVar = this.f14869b;
        if (dVar == null || dVar.mo44480a(this)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo44480a(C9916c cVar) {
        boolean z;
        synchronized (this.f14868a) {
            if (!m20658n() || !m20655k(cVar)) {
                z = false;
            } else {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: b */
    public boolean mo44481b(C9916c cVar) {
        boolean z;
        synchronized (this.f14868a) {
            if (!m20656l() || !m20655k(cVar)) {
                z = false;
            } else {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: c */
    public boolean mo44482c() {
        boolean z;
        synchronized (this.f14868a) {
            if (!this.f14870c.mo44482c()) {
                if (!this.f14871d.mo44482c()) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    public void clear() {
        synchronized (this.f14868a) {
            C9917d.C9918a aVar = C9917d.C9918a.CLEARED;
            this.f14872e = aVar;
            this.f14870c.clear();
            if (this.f14873f != aVar) {
                this.f14873f = aVar;
                this.f14871d.clear();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo44484d(p250v1.C9916c r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f14868a
            monitor-enter(r0)
            v1.c r1 = r2.f14871d     // Catch:{ all -> 0x002b }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x002b }
            if (r3 != 0) goto L_0x001e
            v1.d$a r3 = p250v1.C9917d.C9918a.FAILED     // Catch:{ all -> 0x002b }
            r2.f14872e = r3     // Catch:{ all -> 0x002b }
            v1.d$a r3 = r2.f14873f     // Catch:{ all -> 0x002b }
            v1.d$a r1 = p250v1.C9917d.C9918a.RUNNING     // Catch:{ all -> 0x002b }
            if (r3 == r1) goto L_0x001c
            r2.f14873f = r1     // Catch:{ all -> 0x002b }
            v1.c r3 = r2.f14871d     // Catch:{ all -> 0x002b }
            r3.mo44489h()     // Catch:{ all -> 0x002b }
        L_0x001c:
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x001e:
            v1.d$a r3 = p250v1.C9917d.C9918a.FAILED     // Catch:{ all -> 0x002b }
            r2.f14873f = r3     // Catch:{ all -> 0x002b }
            v1.d r3 = r2.f14869b     // Catch:{ all -> 0x002b }
            if (r3 == 0) goto L_0x0029
            r3.mo44484d(r2)     // Catch:{ all -> 0x002b }
        L_0x0029:
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x002b:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p250v1.C9915b.mo44484d(v1.c):void");
    }

    /* renamed from: e */
    public boolean mo44485e(C9916c cVar) {
        if (!(cVar instanceof C9915b)) {
            return false;
        }
        C9915b bVar = (C9915b) cVar;
        if (!this.f14870c.mo44485e(bVar.f14870c) || !this.f14871d.mo44485e(bVar.f14871d)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public void mo44486f(C9916c cVar) {
        synchronized (this.f14868a) {
            if (cVar.equals(this.f14870c)) {
                this.f14872e = C9917d.C9918a.SUCCESS;
            } else if (cVar.equals(this.f14871d)) {
                this.f14873f = C9917d.C9918a.SUCCESS;
            }
            C9917d dVar = this.f14869b;
            if (dVar != null) {
                dVar.mo44486f(this);
            }
        }
    }

    /* renamed from: g */
    public boolean mo44487g() {
        boolean z;
        synchronized (this.f14868a) {
            C9917d.C9918a aVar = this.f14872e;
            C9917d.C9918a aVar2 = C9917d.C9918a.CLEARED;
            if (aVar == aVar2 && this.f14873f == aVar2) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public C9917d getRoot() {
        C9917d dVar;
        synchronized (this.f14868a) {
            C9917d dVar2 = this.f14869b;
            if (dVar2 != null) {
                dVar = dVar2.getRoot();
            } else {
                dVar = this;
            }
        }
        return dVar;
    }

    /* renamed from: h */
    public void mo44489h() {
        synchronized (this.f14868a) {
            C9917d.C9918a aVar = this.f14872e;
            C9917d.C9918a aVar2 = C9917d.C9918a.RUNNING;
            if (aVar != aVar2) {
                this.f14872e = aVar2;
                this.f14870c.mo44489h();
            }
        }
    }

    /* renamed from: i */
    public boolean mo44490i(C9916c cVar) {
        boolean z;
        synchronized (this.f14868a) {
            if (!m20657m() || !m20655k(cVar)) {
                z = false;
            } else {
                z = true;
            }
        }
        return z;
    }

    public boolean isRunning() {
        boolean z;
        synchronized (this.f14868a) {
            C9917d.C9918a aVar = this.f14872e;
            C9917d.C9918a aVar2 = C9917d.C9918a.RUNNING;
            if (aVar != aVar2) {
                if (this.f14873f != aVar2) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: j */
    public boolean mo44492j() {
        boolean z;
        synchronized (this.f14868a) {
            C9917d.C9918a aVar = this.f14872e;
            C9917d.C9918a aVar2 = C9917d.C9918a.SUCCESS;
            if (aVar != aVar2) {
                if (this.f14873f != aVar2) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: o */
    public void mo44493o(C9916c cVar, C9916c cVar2) {
        this.f14870c = cVar;
        this.f14871d = cVar2;
    }

    public void pause() {
        synchronized (this.f14868a) {
            C9917d.C9918a aVar = this.f14872e;
            C9917d.C9918a aVar2 = C9917d.C9918a.RUNNING;
            if (aVar == aVar2) {
                this.f14872e = C9917d.C9918a.PAUSED;
                this.f14870c.pause();
            }
            if (this.f14873f == aVar2) {
                this.f14873f = C9917d.C9918a.PAUSED;
                this.f14871d.pause();
            }
        }
    }
}
