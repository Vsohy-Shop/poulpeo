package p361ie;

import java.util.ArrayList;
import p364io.reactivex.exceptions.CompositeException;
import p369je.C12620a;
import p391me.C12935a;
import p397ne.C13016b;
import p471ze.C14112g;
import p471ze.C14117j;

/* renamed from: ie.a */
/* compiled from: CompositeDisposable */
public final class C12140a implements C12141b, C12935a {

    /* renamed from: b */
    C14117j<C12141b> f19021b;

    /* renamed from: c */
    volatile boolean f19022c;

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0021, code lost:
        return false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo49581a(p361ie.C12141b r3) {
        /*
            r2 = this;
            java.lang.String r0 = "Disposable item is null"
            p397ne.C13016b.m29390d(r3, r0)
            boolean r0 = r2.f19022c
            r1 = 0
            if (r0 == 0) goto L_0x000b
            return r1
        L_0x000b:
            monitor-enter(r2)
            boolean r0 = r2.f19022c     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x0012
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            return r1
        L_0x0012:
            ze.j<ie.b> r0 = r2.f19021b     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x0020
            boolean r3 = r0.mo53895e(r3)     // Catch:{ all -> 0x0022 }
            if (r3 != 0) goto L_0x001d
            goto L_0x0020
        L_0x001d:
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            r3 = 1
            return r3
        L_0x0020:
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            return r1
        L_0x0022:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p361ie.C12140a.mo49581a(ie.b):boolean");
    }

    /* renamed from: b */
    public boolean mo49582b(C12141b bVar) {
        if (!mo49581a(bVar)) {
            return false;
        }
        bVar.dispose();
        return true;
    }

    /* renamed from: c */
    public boolean mo49583c(C12141b bVar) {
        C13016b.m29390d(bVar, "d is null");
        if (!this.f19022c) {
            synchronized (this) {
                if (!this.f19022c) {
                    C14117j<C12141b> jVar = this.f19021b;
                    if (jVar == null) {
                        jVar = new C14117j<>();
                        this.f19021b = jVar;
                    }
                    jVar.mo53892a(bVar);
                    return true;
                }
            }
        }
        bVar.dispose();
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo49584d(C14117j<C12141b> jVar) {
        if (jVar != null) {
            ArrayList arrayList = null;
            for (Object obj : jVar.mo53893b()) {
                if (obj instanceof C12141b) {
                    try {
                        ((C12141b) obj).dispose();
                    } catch (Throwable th) {
                        C12620a.m28007b(th);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(th);
                    }
                }
            }
            if (arrayList == null) {
                return;
            }
            if (arrayList.size() == 1) {
                throw C14112g.m32759d((Throwable) arrayList.get(0));
            }
            throw new CompositeException((Iterable<? extends Throwable>) arrayList);
        }
    }

    public void dispose() {
        if (!this.f19022c) {
            synchronized (this) {
                if (!this.f19022c) {
                    this.f19022c = true;
                    C14117j<C12141b> jVar = this.f19021b;
                    this.f19021b = null;
                    mo49584d(jVar);
                }
            }
        }
    }

    public boolean isDisposed() {
        return this.f19022c;
    }
}
