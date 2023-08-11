package p391me;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import p361ie.C12141b;
import p364io.reactivex.exceptions.CompositeException;
import p369je.C12620a;
import p397ne.C13016b;
import p471ze.C14112g;

/* renamed from: me.d */
/* compiled from: ListCompositeDisposable */
public final class C12938d implements C12141b, C12935a {

    /* renamed from: b */
    List<C12141b> f20719b;

    /* renamed from: c */
    volatile boolean f20720c;

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
            boolean r0 = r2.f20720c
            r1 = 0
            if (r0 == 0) goto L_0x000b
            return r1
        L_0x000b:
            monitor-enter(r2)
            boolean r0 = r2.f20720c     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x0012
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            return r1
        L_0x0012:
            java.util.List<ie.b> r0 = r2.f20719b     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x0020
            boolean r3 = r0.remove(r3)     // Catch:{ all -> 0x0022 }
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
        throw new UnsupportedOperationException("Method not decompiled: p391me.C12938d.mo49581a(ie.b):boolean");
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
        if (!this.f20720c) {
            synchronized (this) {
                if (!this.f20720c) {
                    List list = this.f20719b;
                    if (list == null) {
                        list = new LinkedList();
                        this.f20719b = list;
                    }
                    list.add(bVar);
                    return true;
                }
            }
        }
        bVar.dispose();
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo50866d(List<C12141b> list) {
        if (list != null) {
            ArrayList arrayList = null;
            for (C12141b dispose : list) {
                try {
                    dispose.dispose();
                } catch (Throwable th) {
                    C12620a.m28007b(th);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th);
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
        if (!this.f20720c) {
            synchronized (this) {
                if (!this.f20720c) {
                    this.f20720c = true;
                    List<C12141b> list = this.f20719b;
                    this.f20719b = null;
                    mo50866d(list);
                }
            }
        }
    }

    public boolean isDisposed() {
        return this.f20720c;
    }
}
