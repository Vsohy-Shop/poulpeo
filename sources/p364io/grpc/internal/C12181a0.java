package p364io.grpc.internal;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import p364io.grpc.C12159b;
import p364io.grpc.C12161c;
import p364io.grpc.C12546k;
import p364io.grpc.C12564o;
import p364io.grpc.C12594t;
import p364io.grpc.internal.C12341k1;
import p364io.grpc.internal.C12402r;
import p458xd.C13783d0;
import p458xd.C13805j0;
import p458xd.C13815o;
import p458xd.C13841z;

/* renamed from: io.grpc.internal.a0 */
/* compiled from: DelayedClientTransport */
final class C12181a0 implements C12341k1 {

    /* renamed from: a */
    private final C13841z f19114a = C13841z.m31797a(C12181a0.class, (String) null);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f19115b = new Object();

    /* renamed from: c */
    private final Executor f19116c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C13805j0 f19117d;

    /* renamed from: e */
    private Runnable f19118e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Runnable f19119f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Runnable f19120g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C12341k1.C12342a f19121h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public Collection<C12186e> f19122i = new LinkedHashSet();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C12594t f19123j;

    /* renamed from: k */
    private C12546k.C12557i f19124k;

    /* renamed from: l */
    private long f19125l;

    /* renamed from: io.grpc.internal.a0$a */
    /* compiled from: DelayedClientTransport */
    class C12182a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C12341k1.C12342a f19126b;

        C12182a(C12341k1.C12342a aVar) {
            this.f19126b = aVar;
        }

        public void run() {
            this.f19126b.mo49863d(true);
        }
    }

    /* renamed from: io.grpc.internal.a0$b */
    /* compiled from: DelayedClientTransport */
    class C12183b implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C12341k1.C12342a f19128b;

        C12183b(C12341k1.C12342a aVar) {
            this.f19128b = aVar;
        }

        public void run() {
            this.f19128b.mo49863d(false);
        }
    }

    /* renamed from: io.grpc.internal.a0$c */
    /* compiled from: DelayedClientTransport */
    class C12184c implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C12341k1.C12342a f19130b;

        C12184c(C12341k1.C12342a aVar) {
            this.f19130b = aVar;
        }

        public void run() {
            this.f19130b.mo49862c();
        }
    }

    /* renamed from: io.grpc.internal.a0$d */
    /* compiled from: DelayedClientTransport */
    class C12185d implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C12594t f19132b;

        C12185d(C12594t tVar) {
            this.f19132b = tVar;
        }

        public void run() {
            C12181a0.this.f19121h.mo49860a(this.f19132b);
        }
    }

    /* renamed from: io.grpc.internal.a0$e */
    /* compiled from: DelayedClientTransport */
    private class C12186e extends C12191b0 {
        /* access modifiers changed from: private */

        /* renamed from: j */
        public final C12546k.C12553f f19134j;

        /* renamed from: k */
        private final C13815o f19135k;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public final C12161c[] f19136l;

        /* synthetic */ C12186e(C12181a0 a0Var, C12546k.C12553f fVar, C12161c[] cVarArr, C12182a aVar) {
            this(fVar, cVarArr);
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: private */
        /* renamed from: z */
        public Runnable m26630z(C12422s sVar) {
            C13815o b = this.f19135k.mo53475b();
            try {
                C12398q d = sVar.mo49699d(this.f19134j.mo50087c(), this.f19134j.mo50086b(), this.f19134j.mo50085a(), this.f19136l);
                this.f19135k.mo53477f(b);
                return mo49722v(d);
            } catch (Throwable th) {
                this.f19135k.mo53477f(b);
                throw th;
            }
        }

        /* renamed from: a */
        public void mo49660a(C12594t tVar) {
            super.mo49660a(tVar);
            synchronized (C12181a0.this.f19115b) {
                if (C12181a0.this.f19120g != null) {
                    boolean remove = C12181a0.this.f19122i.remove(this);
                    if (!C12181a0.this.mo49703q() && remove) {
                        C12181a0.this.f19117d.mo53456b(C12181a0.this.f19119f);
                        if (C12181a0.this.f19123j != null) {
                            C12181a0.this.f19117d.mo53456b(C12181a0.this.f19120g);
                            Runnable unused = C12181a0.this.f19120g = null;
                        }
                    }
                }
            }
            C12181a0.this.f19117d.mo53455a();
        }

        /* renamed from: h */
        public void mo49664h(C12460x0 x0Var) {
            if (this.f19134j.mo50085a().mo49625j()) {
                x0Var.mo50127a("wait_for_ready");
            }
            super.mo49664h(x0Var);
        }

        /* access modifiers changed from: protected */
        /* renamed from: t */
        public void mo49709t(C12594t tVar) {
            for (C12161c i : this.f19136l) {
                i.mo50051i(tVar);
            }
        }

        private C12186e(C12546k.C12553f fVar, C12161c[] cVarArr) {
            this.f19135k = C13815o.m31725e();
            this.f19134j = fVar;
            this.f19136l = cVarArr;
        }
    }

    C12181a0(Executor executor, C13805j0 j0Var) {
        this.f19116c = executor;
        this.f19117d = j0Var;
    }

    /* renamed from: o */
    private C12186e m26618o(C12546k.C12553f fVar, C12161c[] cVarArr) {
        C12186e eVar = new C12186e(this, fVar, cVarArr, (C12182a) null);
        this.f19122i.add(eVar);
        if (mo49702p() == 1) {
            this.f19117d.mo53456b(this.f19118e);
        }
        return eVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        r3.f19117d.mo53455a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002d, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49697b(p364io.grpc.C12594t r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f19115b
            monitor-enter(r0)
            io.grpc.t r1 = r3.f19123j     // Catch:{ all -> 0x002e }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            return
        L_0x0009:
            r3.f19123j = r4     // Catch:{ all -> 0x002e }
            xd.j0 r1 = r3.f19117d     // Catch:{ all -> 0x002e }
            io.grpc.internal.a0$d r2 = new io.grpc.internal.a0$d     // Catch:{ all -> 0x002e }
            r2.<init>(r4)     // Catch:{ all -> 0x002e }
            r1.mo53456b(r2)     // Catch:{ all -> 0x002e }
            boolean r4 = r3.mo49703q()     // Catch:{ all -> 0x002e }
            if (r4 != 0) goto L_0x0027
            java.lang.Runnable r4 = r3.f19120g     // Catch:{ all -> 0x002e }
            if (r4 == 0) goto L_0x0027
            xd.j0 r1 = r3.f19117d     // Catch:{ all -> 0x002e }
            r1.mo53456b(r4)     // Catch:{ all -> 0x002e }
            r4 = 0
            r3.f19120g = r4     // Catch:{ all -> 0x002e }
        L_0x0027:
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            xd.j0 r4 = r3.f19117d
            r4.mo53455a()
            return
        L_0x002e:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p364io.grpc.internal.C12181a0.mo49697b(io.grpc.t):void");
    }

    /* renamed from: c */
    public final void mo49698c(C12594t tVar) {
        Collection<C12186e> collection;
        Runnable runnable;
        mo49697b(tVar);
        synchronized (this.f19115b) {
            collection = this.f19122i;
            runnable = this.f19120g;
            this.f19120g = null;
            if (!collection.isEmpty()) {
                this.f19122i = Collections.emptyList();
            }
        }
        if (runnable != null) {
            for (C12186e next : collection) {
                Runnable v = next.mo49722v(new C12257f0(tVar, C12402r.C12403a.REFUSED, next.f19136l));
                if (v != null) {
                    v.run();
                }
            }
            this.f19117d.execute(runnable);
        }
    }

    /* renamed from: d */
    public final C12398q mo49699d(C13783d0<?, ?> d0Var, C12564o oVar, C12159b bVar, C12161c[] cVarArr) {
        C12398q f0Var;
        try {
            C12432t1 t1Var = new C12432t1(d0Var, oVar, bVar);
            C12546k.C12557i iVar = null;
            long j = -1;
            while (true) {
                synchronized (this.f19115b) {
                    if (this.f19123j == null) {
                        C12546k.C12557i iVar2 = this.f19124k;
                        if (iVar2 != null) {
                            if (iVar != null && j == this.f19125l) {
                                f0Var = m26618o(t1Var, cVarArr);
                                break;
                            }
                            j = this.f19125l;
                            C12422s j2 = C12404r0.m27331j(iVar2.mo48964a(t1Var), bVar.mo49625j());
                            if (j2 != null) {
                                f0Var = j2.mo49699d(t1Var.mo50087c(), t1Var.mo50086b(), t1Var.mo50085a(), cVarArr);
                                break;
                            }
                            iVar = iVar2;
                        } else {
                            f0Var = m26618o(t1Var, cVarArr);
                            break;
                        }
                    } else {
                        f0Var = new C12257f0(this.f19123j, cVarArr);
                        break;
                    }
                }
            }
            this.f19117d.mo53455a();
            return f0Var;
        } catch (Throwable th) {
            this.f19117d.mo53455a();
            throw th;
        }
    }

    /* renamed from: e */
    public final Runnable mo49700e(C12341k1.C12342a aVar) {
        this.f19121h = aVar;
        this.f19118e = new C12182a(aVar);
        this.f19119f = new C12183b(aVar);
        this.f19120g = new C12184c(aVar);
        return null;
    }

    /* renamed from: f */
    public C13841z mo49701f() {
        return this.f19114a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final int mo49702p() {
        int size;
        synchronized (this.f19115b) {
            size = this.f19122i.size();
        }
        return size;
    }

    /* renamed from: q */
    public final boolean mo49703q() {
        boolean z;
        synchronized (this.f19115b) {
            if (!this.f19122i.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        r0 = new java.util.ArrayList();
        r1 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
        if (r1.hasNext() == false) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        r2 = (p364io.grpc.internal.C12181a0.C12186e) r1.next();
        r3 = r8.mo48964a(p364io.grpc.internal.C12181a0.C12186e.m26628x(r2));
        r4 = p364io.grpc.internal.C12181a0.C12186e.m26628x(r2).mo50085a();
        r3 = p364io.grpc.internal.C12404r0.m27331j(r3, r4.mo49625j());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004b, code lost:
        if (r3 == null) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004d, code lost:
        r5 = r7.f19116c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0053, code lost:
        if (r4.mo49620e() == null) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0055, code lost:
        r5 = r4.mo49620e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0059, code lost:
        r3 = p364io.grpc.internal.C12181a0.C12186e.m26629y(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005d, code lost:
        if (r3 == null) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005f, code lost:
        r5.execute(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0062, code lost:
        r0.add(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0066, code lost:
        r8 = r7.f19115b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0068, code lost:
        monitor-enter(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006d, code lost:
        if (mo49703q() != false) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006f, code lost:
        monitor-exit(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0070, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0071, code lost:
        r7.f19122i.removeAll(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007c, code lost:
        if (r7.f19122i.isEmpty() == false) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007e, code lost:
        r7.f19122i = new java.util.LinkedHashSet();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0089, code lost:
        if (mo49703q() != false) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008b, code lost:
        r7.f19117d.mo53456b(r7.f19119f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0094, code lost:
        if (r7.f19123j == null) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0096, code lost:
        r0 = r7.f19120g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0098, code lost:
        if (r0 == null) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009a, code lost:
        r7.f19117d.mo53456b(r0);
        r7.f19120g = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a2, code lost:
        monitor-exit(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a3, code lost:
        r7.f19117d.mo53455a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a8, code lost:
        return;
     */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49704r(p364io.grpc.C12546k.C12557i r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f19115b
            monitor-enter(r0)
            r7.f19124k = r8     // Catch:{ all -> 0x00ae }
            long r1 = r7.f19125l     // Catch:{ all -> 0x00ae }
            r3 = 1
            long r1 = r1 + r3
            r7.f19125l = r1     // Catch:{ all -> 0x00ae }
            if (r8 == 0) goto L_0x00ac
            boolean r1 = r7.mo49703q()     // Catch:{ all -> 0x00ae }
            if (r1 != 0) goto L_0x0016
            goto L_0x00ac
        L_0x0016:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x00ae }
            java.util.Collection<io.grpc.internal.a0$e> r2 = r7.f19122i     // Catch:{ all -> 0x00ae }
            r1.<init>(r2)     // Catch:{ all -> 0x00ae }
            monitor-exit(r0)     // Catch:{ all -> 0x00ae }
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0027:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0066
            java.lang.Object r2 = r1.next()
            io.grpc.internal.a0$e r2 = (p364io.grpc.internal.C12181a0.C12186e) r2
            io.grpc.k$f r3 = r2.f19134j
            io.grpc.k$e r3 = r8.mo48964a(r3)
            io.grpc.k$f r4 = r2.f19134j
            io.grpc.b r4 = r4.mo50085a()
            boolean r5 = r4.mo49625j()
            io.grpc.internal.s r3 = p364io.grpc.internal.C12404r0.m27331j(r3, r5)
            if (r3 == 0) goto L_0x0027
            java.util.concurrent.Executor r5 = r7.f19116c
            java.util.concurrent.Executor r6 = r4.mo49620e()
            if (r6 == 0) goto L_0x0059
            java.util.concurrent.Executor r5 = r4.mo49620e()
        L_0x0059:
            java.lang.Runnable r3 = r2.m26630z(r3)
            if (r3 == 0) goto L_0x0062
            r5.execute(r3)
        L_0x0062:
            r0.add(r2)
            goto L_0x0027
        L_0x0066:
            java.lang.Object r8 = r7.f19115b
            monitor-enter(r8)
            boolean r1 = r7.mo49703q()     // Catch:{ all -> 0x00a9 }
            if (r1 != 0) goto L_0x0071
            monitor-exit(r8)     // Catch:{ all -> 0x00a9 }
            return
        L_0x0071:
            java.util.Collection<io.grpc.internal.a0$e> r1 = r7.f19122i     // Catch:{ all -> 0x00a9 }
            r1.removeAll(r0)     // Catch:{ all -> 0x00a9 }
            java.util.Collection<io.grpc.internal.a0$e> r0 = r7.f19122i     // Catch:{ all -> 0x00a9 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00a9 }
            if (r0 == 0) goto L_0x0085
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet     // Catch:{ all -> 0x00a9 }
            r0.<init>()     // Catch:{ all -> 0x00a9 }
            r7.f19122i = r0     // Catch:{ all -> 0x00a9 }
        L_0x0085:
            boolean r0 = r7.mo49703q()     // Catch:{ all -> 0x00a9 }
            if (r0 != 0) goto L_0x00a2
            xd.j0 r0 = r7.f19117d     // Catch:{ all -> 0x00a9 }
            java.lang.Runnable r1 = r7.f19119f     // Catch:{ all -> 0x00a9 }
            r0.mo53456b(r1)     // Catch:{ all -> 0x00a9 }
            io.grpc.t r0 = r7.f19123j     // Catch:{ all -> 0x00a9 }
            if (r0 == 0) goto L_0x00a2
            java.lang.Runnable r0 = r7.f19120g     // Catch:{ all -> 0x00a9 }
            if (r0 == 0) goto L_0x00a2
            xd.j0 r1 = r7.f19117d     // Catch:{ all -> 0x00a9 }
            r1.mo53456b(r0)     // Catch:{ all -> 0x00a9 }
            r0 = 0
            r7.f19120g = r0     // Catch:{ all -> 0x00a9 }
        L_0x00a2:
            monitor-exit(r8)     // Catch:{ all -> 0x00a9 }
            xd.j0 r8 = r7.f19117d
            r8.mo53455a()
            return
        L_0x00a9:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x00a9 }
            throw r0
        L_0x00ac:
            monitor-exit(r0)     // Catch:{ all -> 0x00ae }
            return
        L_0x00ae:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00ae }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p364io.grpc.internal.C12181a0.mo49704r(io.grpc.k$i):void");
    }
}
