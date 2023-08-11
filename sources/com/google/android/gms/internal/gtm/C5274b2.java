package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import p286y4.C10671e;
import p286y4.C10674h;

/* renamed from: com.google.android.gms.internal.gtm.b2 */
public final class C5274b2 {

    /* renamed from: m */
    private static Object f5849m = new Object();

    /* renamed from: n */
    private static C5274b2 f5850n;

    /* renamed from: a */
    private volatile long f5851a;

    /* renamed from: b */
    private volatile long f5852b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public volatile boolean f5853c;

    /* renamed from: d */
    private volatile boolean f5854d;

    /* renamed from: e */
    private volatile AdvertisingIdClient.Info f5855e;

    /* renamed from: f */
    private volatile long f5856f;

    /* renamed from: g */
    private volatile long f5857g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final Context f5858h;

    /* renamed from: i */
    private final C10671e f5859i;

    /* renamed from: j */
    private final Thread f5860j;

    /* renamed from: k */
    private final Object f5861k;

    /* renamed from: l */
    private C5319e2 f5862l;

    private C5274b2(Context context) {
        this(context, (C5319e2) null, C10674h.m22680c());
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000c */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m7776f() {
        /*
            r2 = this;
            monitor-enter(r2)
            r2.m7777g()     // Catch:{ InterruptedException -> 0x000c }
            r0 = 500(0x1f4, double:2.47E-321)
            r2.wait(r0)     // Catch:{ InterruptedException -> 0x000c }
            goto L_0x000c
        L_0x000a:
            r0 = move-exception
            goto L_0x000e
        L_0x000c:
            monitor-exit(r2)     // Catch:{ all -> 0x000a }
            return
        L_0x000e:
            monitor-exit(r2)     // Catch:{ all -> 0x000a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.C5274b2.m7776f():void");
    }

    /* renamed from: g */
    private final void m7777g() {
        if (this.f5859i.mo33547a() - this.f5856f > this.f5852b) {
            synchronized (this.f5861k) {
                this.f5861k.notify();
            }
            this.f5856f = this.f5859i.mo33547a();
        }
    }

    /* renamed from: h */
    private final void m7778h() {
        if (this.f5859i.mo33547a() - this.f5857g > 3600000) {
            this.f5855e = null;
        }
    }

    /* access modifiers changed from: private */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:368)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:172)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: i */
    public final void m7779i() {
        /*
            r4 = this;
            r0 = 10
            android.os.Process.setThreadPriority(r0)
        L_0x0005:
            boolean r0 = r4.f5853c
            if (r0 == 0) goto L_0x0010
            com.google.android.gms.internal.gtm.e2 r0 = r4.f5862l
            com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r0 = r0.mo33154a()
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            if (r0 == 0) goto L_0x0022
            r4.f5855e = r0
            y4.e r0 = r4.f5859i
            long r0 = r0.mo33547a()
            r4.f5857g = r0
            java.lang.String r0 = "Obtained fresh AdvertisingId info from GmsCore."
            com.google.android.gms.internal.gtm.C5426l3.m8136f(r0)
        L_0x0022:
            monitor-enter(r4)
            r4.notifyAll()     // Catch:{ all -> 0x003c }
            monitor-exit(r4)     // Catch:{ all -> 0x003c }
            java.lang.Object r0 = r4.f5861k     // Catch:{ InterruptedException -> 0x0036 }
            monitor-enter(r0)     // Catch:{ InterruptedException -> 0x0036 }
            java.lang.Object r1 = r4.f5861k     // Catch:{ all -> 0x0033 }
            long r2 = r4.f5851a     // Catch:{ all -> 0x0033 }
            r1.wait(r2)     // Catch:{ all -> 0x0033 }
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            goto L_0x0005
        L_0x0033:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            throw r1     // Catch:{ InterruptedException -> 0x0036 }
        L_0x0036:
            java.lang.String r0 = "sleep interrupted in AdvertiserDataPoller thread; continuing"
            com.google.android.gms.internal.gtm.C5426l3.m8136f(r0)
            goto L_0x0005
        L_0x003c:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x003c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.C5274b2.m7779i():void");
    }

    /* renamed from: j */
    public static C5274b2 m7780j(Context context) {
        if (f5850n == null) {
            synchronized (f5849m) {
                if (f5850n == null) {
                    C5274b2 b2Var = new C5274b2(context);
                    f5850n = b2Var;
                    b2Var.f5860j.start();
                }
            }
        }
        return f5850n;
    }

    /* renamed from: a */
    public final boolean mo33118a() {
        if (this.f5855e == null) {
            m7776f();
        } else {
            m7777g();
        }
        m7778h();
        if (this.f5855e == null) {
            return true;
        }
        return this.f5855e.isLimitAdTrackingEnabled();
    }

    /* renamed from: e */
    public final String mo33119e() {
        if (this.f5855e == null) {
            m7776f();
        } else {
            m7777g();
        }
        m7778h();
        if (this.f5855e == null) {
            return null;
        }
        return this.f5855e.getId();
    }

    private C5274b2(Context context, C5319e2 e2Var, C10671e eVar) {
        this.f5851a = 900000;
        this.f5852b = 30000;
        this.f5853c = true;
        this.f5854d = false;
        this.f5861k = new Object();
        this.f5862l = new C5289c2(this);
        this.f5859i = eVar;
        if (context != null) {
            this.f5858h = context.getApplicationContext();
        } else {
            this.f5858h = context;
        }
        this.f5856f = eVar.mo33547a();
        this.f5860j = new Thread(new C5304d2(this));
    }
}
