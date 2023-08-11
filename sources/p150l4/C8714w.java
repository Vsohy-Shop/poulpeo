package p150l4;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.cast.C4968j0;
import java.util.Locale;

/* renamed from: l4.w */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class C8714w {

    /* renamed from: f */
    private static final C8675b f12523f = new C8675b("RequestTracker");

    /* renamed from: g */
    public static final Object f12524g = new Object();

    /* renamed from: a */
    private final long f12525a;

    /* renamed from: b */
    private final Handler f12526b = new C4968j0(Looper.getMainLooper());

    /* renamed from: c */
    long f12527c = -1;
    @Nullable

    /* renamed from: d */
    C8712u f12528d;
    @Nullable

    /* renamed from: e */
    Runnable f12529e;

    public C8714w(long j) {
        this.f12525a = j;
    }

    /* renamed from: a */
    public static /* synthetic */ void m17635a(C8714w wVar) {
        synchronized (f12524g) {
            if (wVar.f12527c != -1) {
                wVar.m17637h(15, (Object) null);
            }
        }
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: g */
    private final void m17636g(int r4, @androidx.annotation.Nullable java.lang.Object r5, java.lang.String r6) {
        /*
            r3 = this;
            l4.b r0 = f12523f
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r0.mo42754a(r6, r1)
            java.lang.Object r6 = f12524g
            monitor-enter(r6)
            l4.u r0 = r3.f12528d     // Catch:{ all -> 0x002f }
            if (r0 == 0) goto L_0x0014
            long r1 = r3.f12527c     // Catch:{ all -> 0x002f }
            r0.mo32239b(r1, r4, r5)     // Catch:{ all -> 0x002f }
        L_0x0014:
            r4 = -1
            r3.f12527c = r4     // Catch:{ all -> 0x002f }
            r4 = 0
            r3.f12528d = r4     // Catch:{ all -> 0x002f }
            monitor-enter(r6)     // Catch:{ all -> 0x002f }
            java.lang.Runnable r5 = r3.f12529e     // Catch:{ all -> 0x002c }
            if (r5 != 0) goto L_0x0022
            monitor-exit(r6)     // Catch:{ all -> 0x002c }
            goto L_0x002a
        L_0x0022:
            android.os.Handler r0 = r3.f12526b     // Catch:{ all -> 0x002c }
            r0.removeCallbacks(r5)     // Catch:{ all -> 0x002c }
            r3.f12529e = r4     // Catch:{ all -> 0x002c }
            monitor-exit(r6)     // Catch:{ all -> 0x002c }
        L_0x002a:
            monitor-exit(r6)     // Catch:{ all -> 0x002f }
            return
        L_0x002c:
            r4 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x002c }
            throw r4     // Catch:{ all -> 0x002f }
        L_0x002f:
            r4 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x002f }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p150l4.C8714w.m17636g(int, java.lang.Object, java.lang.String):void");
    }

    /* renamed from: h */
    private final boolean m17637h(int i, @Nullable Object obj) {
        synchronized (f12524g) {
            long j = this.f12527c;
            if (j == -1) {
                return false;
            }
            m17636g(i, (Object) null, String.format(Locale.ROOT, "clearing request %d", new Object[]{Long.valueOf(j)}));
            return true;
        }
    }

    /* renamed from: b */
    public final void mo42834b(long j, @Nullable C8712u uVar) {
        C8712u uVar2;
        long j2;
        Object obj = f12524g;
        synchronized (obj) {
            uVar2 = this.f12528d;
            j2 = this.f12527c;
            this.f12527c = j;
            this.f12528d = uVar;
        }
        if (uVar2 != null) {
            uVar2.mo32238a(j2);
        }
        synchronized (obj) {
            Runnable runnable = this.f12529e;
            if (runnable != null) {
                this.f12526b.removeCallbacks(runnable);
            }
            C8713v vVar = new C8713v(this);
            this.f12529e = vVar;
            this.f12526b.postDelayed(vVar, this.f12525a);
        }
    }

    /* renamed from: c */
    public final boolean mo42835c(int i) {
        return m17637h(2002, (Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        return false;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo42836d(long r6, int r8, @androidx.annotation.Nullable java.lang.Object r9) {
        /*
            r5 = this;
            java.lang.Object r0 = f12524g
            monitor-enter(r0)
            long r1 = r5.f12527c     // Catch:{ all -> 0x0028 }
            r3 = -1
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r4 = 0
            if (r3 == 0) goto L_0x0026
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 != 0) goto L_0x0026
            java.util.Locale r1 = java.util.Locale.ROOT     // Catch:{ all -> 0x0028 }
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ all -> 0x0028 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0028 }
            r3[r4] = r6     // Catch:{ all -> 0x0028 }
            java.lang.String r6 = "request %d completed"
            java.lang.String r6 = java.lang.String.format(r1, r6, r3)     // Catch:{ all -> 0x0028 }
            r5.m17636g(r8, r9, r6)     // Catch:{ all -> 0x0028 }
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return r2
        L_0x0026:
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return r4
        L_0x0028:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p150l4.C8714w.mo42836d(long, int, java.lang.Object):boolean");
    }

    /* renamed from: e */
    public final boolean mo42837e() {
        boolean z;
        synchronized (f12524g) {
            if (this.f12527c != -1) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: f */
    public final boolean mo42838f(long j) {
        boolean z;
        synchronized (f12524g) {
            long j2 = this.f12527c;
            z = false;
            if (j2 != -1 && j2 == j) {
                z = true;
            }
        }
        return z;
    }
}
