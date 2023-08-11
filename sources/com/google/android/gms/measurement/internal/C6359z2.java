package com.google.android.gms.measurement.internal;

import androidx.annotation.GuardedBy;
import p201q5.C9255b;

/* renamed from: com.google.android.gms.measurement.internal.z2 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
public final class C6359z2<V> {

    /* renamed from: h */
    private static final Object f8424h = new Object();

    /* renamed from: a */
    private final String f8425a;

    /* renamed from: b */
    private final C6337x2<V> f8426b;

    /* renamed from: c */
    private final V f8427c;

    /* renamed from: d */
    private final V f8428d;

    /* renamed from: e */
    private final Object f8429e = new Object();
    @GuardedBy("overrideLock")

    /* renamed from: f */
    private volatile V f8430f = null;
    @GuardedBy("cachingLock")

    /* renamed from: g */
    private volatile V f8431g = null;

    /* synthetic */ C6359z2(String str, Object obj, Object obj2, C6337x2 x2Var, C9255b bVar) {
        this.f8425a = str;
        this.f8427c = obj;
        this.f8428d = obj2;
        this.f8426b = x2Var;
    }

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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processHandlersOutBlocks(RegionMaker.java:1008)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:978)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0043 */
    /* renamed from: a */
    public final V mo35421a(V r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f8429e
            monitor-enter(r0)
            monitor-exit(r0)     // Catch:{ all -> 0x006d }
            if (r4 == 0) goto L_0x0007
            return r4
        L_0x0007:
            com.google.android.gms.measurement.internal.b r4 = com.google.android.gms.measurement.internal.C6348y2.f8406a
            if (r4 == 0) goto L_0x006a
            java.lang.Object r4 = f8424h
            monitor-enter(r4)
            boolean r0 = com.google.android.gms.measurement.internal.C6092b.m10462a()     // Catch:{ all -> 0x0067 }
            if (r0 == 0) goto L_0x001f
            V r0 = r3.f8431g     // Catch:{ all -> 0x0067 }
            if (r0 != 0) goto L_0x001b
            V r0 = r3.f8427c     // Catch:{ all -> 0x0067 }
            goto L_0x001d
        L_0x001b:
            V r0 = r3.f8431g     // Catch:{ all -> 0x0067 }
        L_0x001d:
            monitor-exit(r4)     // Catch:{ all -> 0x0067 }
            return r0
        L_0x001f:
            monitor-exit(r4)     // Catch:{ all -> 0x0067 }
            java.util.List r4 = com.google.android.gms.measurement.internal.C6084a3.f7568a     // Catch:{ SecurityException -> 0x0055 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ SecurityException -> 0x0055 }
        L_0x0028:
            boolean r0 = r4.hasNext()     // Catch:{ SecurityException -> 0x0055 }
            if (r0 == 0) goto L_0x0055
            java.lang.Object r0 = r4.next()     // Catch:{ SecurityException -> 0x0055 }
            com.google.android.gms.measurement.internal.z2 r0 = (com.google.android.gms.measurement.internal.C6359z2) r0     // Catch:{ SecurityException -> 0x0055 }
            boolean r1 = com.google.android.gms.measurement.internal.C6092b.m10462a()     // Catch:{ SecurityException -> 0x0055 }
            if (r1 != 0) goto L_0x004d
            r1 = 0
            com.google.android.gms.measurement.internal.x2<V> r2 = r0.f8426b     // Catch:{ IllegalStateException -> 0x0043 }
            if (r2 == 0) goto L_0x0043
            java.lang.Object r1 = r2.zza()     // Catch:{ IllegalStateException -> 0x0043 }
        L_0x0043:
            java.lang.Object r2 = f8424h     // Catch:{ SecurityException -> 0x0055 }
            monitor-enter(r2)     // Catch:{ SecurityException -> 0x0055 }
            r0.f8431g = r1     // Catch:{ all -> 0x004a }
            monitor-exit(r2)     // Catch:{ all -> 0x004a }
            goto L_0x0028
        L_0x004a:
            r4 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x004a }
            throw r4     // Catch:{ SecurityException -> 0x0055 }
        L_0x004d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ SecurityException -> 0x0055 }
            java.lang.String r0 = "Refreshing flag cache must be done on a worker thread."
            r4.<init>(r0)     // Catch:{ SecurityException -> 0x0055 }
            throw r4     // Catch:{ SecurityException -> 0x0055 }
        L_0x0055:
            com.google.android.gms.measurement.internal.x2<V> r4 = r3.f8426b
            if (r4 != 0) goto L_0x005c
            V r4 = r3.f8427c
            return r4
        L_0x005c:
            java.lang.Object r4 = r4.zza()     // Catch:{ SecurityException -> 0x0064, IllegalStateException -> 0x0061 }
            return r4
        L_0x0061:
            V r4 = r3.f8427c
            return r4
        L_0x0064:
            V r4 = r3.f8427c
            return r4
        L_0x0067:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0067 }
            throw r0
        L_0x006a:
            V r4 = r3.f8427c
            return r4
        L_0x006d:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x006d }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C6359z2.mo35421a(java.lang.Object):java.lang.Object");
    }

    /* renamed from: b */
    public final String mo35422b() {
        return this.f8425a;
    }
}
