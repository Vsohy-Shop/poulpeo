package p250v1;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import p250v1.C9917d;

/* renamed from: v1.i */
/* compiled from: ThumbnailRequestCoordinator */
public class C9924i implements C9917d, C9916c {
    @Nullable

    /* renamed from: a */
    private final C9917d f14918a;

    /* renamed from: b */
    private final Object f14919b;

    /* renamed from: c */
    private volatile C9916c f14920c;

    /* renamed from: d */
    private volatile C9916c f14921d;
    @GuardedBy("requestLock")

    /* renamed from: e */
    private C9917d.C9918a f14922e;
    @GuardedBy("requestLock")

    /* renamed from: f */
    private C9917d.C9918a f14923f;
    @GuardedBy("requestLock")

    /* renamed from: g */
    private boolean f14924g;

    public C9924i(Object obj, @Nullable C9917d dVar) {
        C9917d.C9918a aVar = C9917d.C9918a.CLEARED;
        this.f14922e = aVar;
        this.f14923f = aVar;
        this.f14919b = obj;
        this.f14918a = dVar;
    }

    @GuardedBy("requestLock")
    /* renamed from: k */
    private boolean m20717k() {
        C9917d dVar = this.f14918a;
        if (dVar == null || dVar.mo44481b(this)) {
            return true;
        }
        return false;
    }

    @GuardedBy("requestLock")
    /* renamed from: l */
    private boolean m20718l() {
        C9917d dVar = this.f14918a;
        if (dVar == null || dVar.mo44490i(this)) {
            return true;
        }
        return false;
    }

    @GuardedBy("requestLock")
    /* renamed from: m */
    private boolean m20719m() {
        C9917d dVar = this.f14918a;
        if (dVar == null || dVar.mo44480a(this)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo44480a(C9916c cVar) {
        boolean z;
        synchronized (this.f14919b) {
            if (!m20719m() || (!cVar.equals(this.f14920c) && this.f14922e == C9917d.C9918a.SUCCESS)) {
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
        synchronized (this.f14919b) {
            if (!m20717k() || !cVar.equals(this.f14920c) || this.f14922e == C9917d.C9918a.PAUSED) {
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
        synchronized (this.f14919b) {
            if (!this.f14921d.mo44482c()) {
                if (!this.f14920c.mo44482c()) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    public void clear() {
        synchronized (this.f14919b) {
            this.f14924g = false;
            C9917d.C9918a aVar = C9917d.C9918a.CLEARED;
            this.f14922e = aVar;
            this.f14923f = aVar;
            this.f14921d.clear();
            this.f14920c.clear();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo44484d(p250v1.C9916c r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f14919b
            monitor-enter(r0)
            v1.c r1 = r2.f14920c     // Catch:{ all -> 0x001e }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x001e }
            if (r3 != 0) goto L_0x0011
            v1.d$a r3 = p250v1.C9917d.C9918a.FAILED     // Catch:{ all -> 0x001e }
            r2.f14923f = r3     // Catch:{ all -> 0x001e }
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            return
        L_0x0011:
            v1.d$a r3 = p250v1.C9917d.C9918a.FAILED     // Catch:{ all -> 0x001e }
            r2.f14922e = r3     // Catch:{ all -> 0x001e }
            v1.d r3 = r2.f14918a     // Catch:{ all -> 0x001e }
            if (r3 == 0) goto L_0x001c
            r3.mo44484d(r2)     // Catch:{ all -> 0x001e }
        L_0x001c:
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            return
        L_0x001e:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p250v1.C9924i.mo44484d(v1.c):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002d A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo44485e(p250v1.C9916c r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof p250v1.C9924i
            r1 = 0
            if (r0 == 0) goto L_0x002e
            v1.i r4 = (p250v1.C9924i) r4
            v1.c r0 = r3.f14920c
            if (r0 != 0) goto L_0x0010
            v1.c r0 = r4.f14920c
            if (r0 != 0) goto L_0x002e
            goto L_0x001a
        L_0x0010:
            v1.c r0 = r3.f14920c
            v1.c r2 = r4.f14920c
            boolean r0 = r0.mo44485e(r2)
            if (r0 == 0) goto L_0x002e
        L_0x001a:
            v1.c r0 = r3.f14921d
            if (r0 != 0) goto L_0x0023
            v1.c r4 = r4.f14921d
            if (r4 != 0) goto L_0x002e
            goto L_0x002d
        L_0x0023:
            v1.c r0 = r3.f14921d
            v1.c r4 = r4.f14921d
            boolean r4 = r0.mo44485e(r4)
            if (r4 == 0) goto L_0x002e
        L_0x002d:
            r1 = 1
        L_0x002e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p250v1.C9924i.mo44485e(v1.c):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002a, code lost:
        return;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo44486f(p250v1.C9916c r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f14919b
            monitor-enter(r0)
            v1.c r1 = r2.f14921d     // Catch:{ all -> 0x002b }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x002b }
            if (r3 == 0) goto L_0x0011
            v1.d$a r3 = p250v1.C9917d.C9918a.SUCCESS     // Catch:{ all -> 0x002b }
            r2.f14923f = r3     // Catch:{ all -> 0x002b }
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x0011:
            v1.d$a r3 = p250v1.C9917d.C9918a.SUCCESS     // Catch:{ all -> 0x002b }
            r2.f14922e = r3     // Catch:{ all -> 0x002b }
            v1.d r3 = r2.f14918a     // Catch:{ all -> 0x002b }
            if (r3 == 0) goto L_0x001c
            r3.mo44486f(r2)     // Catch:{ all -> 0x002b }
        L_0x001c:
            v1.d$a r3 = r2.f14923f     // Catch:{ all -> 0x002b }
            boolean r3 = r3.mo44495a()     // Catch:{ all -> 0x002b }
            if (r3 != 0) goto L_0x0029
            v1.c r3 = r2.f14921d     // Catch:{ all -> 0x002b }
            r3.clear()     // Catch:{ all -> 0x002b }
        L_0x0029:
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x002b:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p250v1.C9924i.mo44486f(v1.c):void");
    }

    /* renamed from: g */
    public boolean mo44487g() {
        boolean z;
        synchronized (this.f14919b) {
            if (this.f14922e == C9917d.C9918a.CLEARED) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public C9917d getRoot() {
        C9917d dVar;
        synchronized (this.f14919b) {
            C9917d dVar2 = this.f14918a;
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
        C9917d.C9918a aVar;
        C9917d.C9918a aVar2;
        synchronized (this.f14919b) {
            this.f14924g = true;
            try {
                if (!(this.f14922e == C9917d.C9918a.SUCCESS || this.f14923f == (aVar2 = C9917d.C9918a.RUNNING))) {
                    this.f14923f = aVar2;
                    this.f14921d.mo44489h();
                }
                if (this.f14924g && this.f14922e != (aVar = C9917d.C9918a.RUNNING)) {
                    this.f14922e = aVar;
                    this.f14920c.mo44489h();
                }
            } finally {
                this.f14924g = false;
            }
        }
    }

    /* renamed from: i */
    public boolean mo44490i(C9916c cVar) {
        boolean z;
        synchronized (this.f14919b) {
            if (!m20718l() || !cVar.equals(this.f14920c) || mo44482c()) {
                z = false;
            } else {
                z = true;
            }
        }
        return z;
    }

    public boolean isRunning() {
        boolean z;
        synchronized (this.f14919b) {
            if (this.f14922e == C9917d.C9918a.RUNNING) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: j */
    public boolean mo44492j() {
        boolean z;
        synchronized (this.f14919b) {
            if (this.f14922e == C9917d.C9918a.SUCCESS) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: n */
    public void mo44502n(C9916c cVar, C9916c cVar2) {
        this.f14920c = cVar;
        this.f14921d = cVar2;
    }

    public void pause() {
        synchronized (this.f14919b) {
            if (!this.f14923f.mo44495a()) {
                this.f14923f = C9917d.C9918a.PAUSED;
                this.f14921d.pause();
            }
            if (!this.f14922e.mo44495a()) {
                this.f14922e = C9917d.C9918a.PAUSED;
                this.f14920c.pause();
            }
        }
    }
}
