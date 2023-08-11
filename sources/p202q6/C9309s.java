package p202q6;

import androidx.annotation.GuardedBy;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import p193p7.C9071a;
import p193p7.C9072b;
import p193p7.C9073c;
import p193p7.C9074d;

/* renamed from: q6.s */
/* compiled from: EventBus */
class C9309s implements C9074d, C9073c {
    @GuardedBy("this")

    /* renamed from: a */
    private final Map<Class<?>, ConcurrentHashMap<C9072b<Object>, Executor>> f13671a = new HashMap();
    @GuardedBy("this")

    /* renamed from: b */
    private Queue<C9071a<?>> f13672b = new ArrayDeque();

    /* renamed from: c */
    private final Executor f13673c;

    C9309s(Executor executor) {
        this.f13673c = executor;
    }

    /* renamed from: f */
    private synchronized Set<Map.Entry<C9072b<Object>, Executor>> m19152f(C9071a<?> aVar) {
        Set<Map.Entry<C9072b<Object>, Executor>> set;
        Map map = this.f13671a.get(aVar.mo43281b());
        if (map == null) {
            set = Collections.emptySet();
        } else {
            set = map.entrySet();
        }
        return set;
    }

    /* renamed from: a */
    public synchronized <T> void mo43283a(Class<T> cls, Executor executor, C9072b<? super T> bVar) {
        C9316z.m19176b(cls);
        C9316z.m19176b(bVar);
        C9316z.m19176b(executor);
        if (!this.f13671a.containsKey(cls)) {
            this.f13671a.put(cls, new ConcurrentHashMap());
        }
        this.f13671a.get(cls).put(bVar, executor);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized <T> void mo43284b(java.lang.Class<T> r2, p193p7.C9072b<? super T> r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            p202q6.C9316z.m19176b(r2)     // Catch:{ all -> 0x0029 }
            p202q6.C9316z.m19176b(r3)     // Catch:{ all -> 0x0029 }
            java.util.Map<java.lang.Class<?>, java.util.concurrent.ConcurrentHashMap<p7.b<java.lang.Object>, java.util.concurrent.Executor>> r0 = r1.f13671a     // Catch:{ all -> 0x0029 }
            boolean r0 = r0.containsKey(r2)     // Catch:{ all -> 0x0029 }
            if (r0 != 0) goto L_0x0011
            monitor-exit(r1)
            return
        L_0x0011:
            java.util.Map<java.lang.Class<?>, java.util.concurrent.ConcurrentHashMap<p7.b<java.lang.Object>, java.util.concurrent.Executor>> r0 = r1.f13671a     // Catch:{ all -> 0x0029 }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x0029 }
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0     // Catch:{ all -> 0x0029 }
            r0.remove(r3)     // Catch:{ all -> 0x0029 }
            boolean r3 = r0.isEmpty()     // Catch:{ all -> 0x0029 }
            if (r3 == 0) goto L_0x0027
            java.util.Map<java.lang.Class<?>, java.util.concurrent.ConcurrentHashMap<p7.b<java.lang.Object>, java.util.concurrent.Executor>> r3 = r1.f13671a     // Catch:{ all -> 0x0029 }
            r3.remove(r2)     // Catch:{ all -> 0x0029 }
        L_0x0027:
            monitor-exit(r1)
            return
        L_0x0029:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p202q6.C9309s.mo43284b(java.lang.Class, p7.b):void");
    }

    /* renamed from: c */
    public <T> void mo43285c(Class<T> cls, C9072b<? super T> bVar) {
        mo43283a(cls, this.f13673c, bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo43605e() {
        Queue<C9071a<?>> queue;
        synchronized (this) {
            queue = this.f13672b;
            if (queue != null) {
                this.f13672b = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            for (C9071a<?> h : queue) {
                mo43606h(h);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        if (r0.hasNext() == false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        r1 = r0.next();
        ((java.util.concurrent.Executor) r1.getValue()).execute(new p202q6.C9308r(r1, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000e, code lost:
        r0 = m19152f(r5).iterator();
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo43606h(p193p7.C9071a<?> r5) {
        /*
            r4 = this;
            p202q6.C9316z.m19176b(r5)
            monitor-enter(r4)
            java.util.Queue<p7.a<?>> r0 = r4.f13672b     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x000d
            r0.add(r5)     // Catch:{ all -> 0x0032 }
            monitor-exit(r4)     // Catch:{ all -> 0x0032 }
            return
        L_0x000d:
            monitor-exit(r4)     // Catch:{ all -> 0x0032 }
            java.util.Set r0 = r4.m19152f(r5)
            java.util.Iterator r0 = r0.iterator()
        L_0x0016:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0031
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2
            q6.r r3 = new q6.r
            r3.<init>(r1, r5)
            r2.execute(r3)
            goto L_0x0016
        L_0x0031:
            return
        L_0x0032:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0032 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p202q6.C9309s.mo43606h(p7.a):void");
    }
}
