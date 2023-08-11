package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.content.IntentFilter;
import com.adjust.sdk.Constants;

/* renamed from: com.google.android.gms.internal.gtm.e4 */
final class C5321e4 extends C5306d4 {
    /* access modifiers changed from: private */

    /* renamed from: n */
    public static final Object f5955n = new Object();

    /* renamed from: o */
    private static C5321e4 f5956o;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Context f5957a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C5290c3 f5958b;

    /* renamed from: c */
    private volatile C5636z2 f5959c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public int f5960d = Constants.THIRTY_MINUTES;

    /* renamed from: e */
    private boolean f5961e = true;

    /* renamed from: f */
    private boolean f5962f = false;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f5963g = false;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f5964h = true;

    /* renamed from: i */
    private boolean f5965i = true;

    /* renamed from: j */
    private C5305d3 f5966j = new C5336f4(this);

    /* renamed from: k */
    private C5367h4 f5967k;

    /* renamed from: l */
    private C5456n3 f5968l;

    /* renamed from: m */
    private boolean f5969m = false;

    private C5321e4() {
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final boolean m7879d() {
        if (this.f5969m || !this.f5964h || this.f5960d <= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public static C5321e4 m7887n() {
        if (f5956o == null) {
            f5956o = new C5321e4();
        }
        return f5956o;
    }

    /* renamed from: a */
    public final synchronized void mo33169a(boolean z) {
        mo33188g(this.f5969m, z);
    }

    /* renamed from: b */
    public final synchronized void mo33170b() {
        if (!m7879d()) {
            this.f5967k.mo33233a();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo33186c() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f5962f     // Catch:{ all -> 0x0021 }
            r1 = 1
            if (r0 != 0) goto L_0x000f
            java.lang.String r0 = "Dispatch call queued. Dispatch will run once initialization is complete."
            com.google.android.gms.internal.gtm.C5426l3.m8133c(r0)     // Catch:{ all -> 0x0021 }
            r2.f5961e = r1     // Catch:{ all -> 0x0021 }
            monitor-exit(r2)
            return
        L_0x000f:
            boolean r0 = r2.f5963g     // Catch:{ all -> 0x0021 }
            if (r0 != 0) goto L_0x001f
            r2.f5963g = r1     // Catch:{ all -> 0x0021 }
            com.google.android.gms.internal.gtm.z2 r0 = r2.f5959c     // Catch:{ all -> 0x0021 }
            com.google.android.gms.internal.gtm.g4 r1 = new com.google.android.gms.internal.gtm.g4     // Catch:{ all -> 0x0021 }
            r1.<init>(r2)     // Catch:{ all -> 0x0021 }
            r0.mo33094a(r1)     // Catch:{ all -> 0x0021 }
        L_0x001f:
            monitor-exit(r2)
            return
        L_0x0021:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.C5321e4.mo33186c():void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0014, code lost:
        return;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo33187f(android.content.Context r2, com.google.android.gms.internal.gtm.C5636z2 r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            android.content.Context r0 = r1.f5957a     // Catch:{ all -> 0x0015 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r1)
            return
        L_0x0007:
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ all -> 0x0015 }
            r1.f5957a = r2     // Catch:{ all -> 0x0015 }
            com.google.android.gms.internal.gtm.z2 r2 = r1.f5959c     // Catch:{ all -> 0x0015 }
            if (r2 != 0) goto L_0x0013
            r1.f5959c = r3     // Catch:{ all -> 0x0015 }
        L_0x0013:
            monitor-exit(r1)
            return
        L_0x0015:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.C5321e4.mo33187f(android.content.Context, com.google.android.gms.internal.gtm.z2):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final synchronized void mo33188g(boolean z, boolean z2) {
        boolean d = m7879d();
        this.f5969m = z;
        this.f5964h = z2;
        if (m7879d() != d) {
            if (m7879d()) {
                this.f5967k.cancel();
                C5426l3.m8133c("PowerSaveMode initiated.");
                return;
            }
            this.f5967k.mo33234b((long) this.f5960d);
            C5426l3.m8133c("PowerSaveMode terminated.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final synchronized C5290c3 mo33189o() {
        if (this.f5958b == null) {
            if (this.f5957a != null) {
                this.f5958b = new C5471o3(this.f5966j, this.f5957a);
            } else {
                throw new IllegalStateException("Cant get a store unless we have a context");
            }
        }
        if (this.f5967k == null) {
            C5382i4 i4Var = new C5382i4(this, (C5336f4) null);
            this.f5967k = i4Var;
            int i = this.f5960d;
            if (i > 0) {
                i4Var.mo33234b((long) i);
            }
        }
        this.f5962f = true;
        if (this.f5961e) {
            mo33186c();
            this.f5961e = false;
        }
        if (this.f5968l == null && this.f5965i) {
            C5456n3 n3Var = new C5456n3(this);
            this.f5968l = n3Var;
            Context context = this.f5957a;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            context.registerReceiver(n3Var, intentFilter);
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addAction("com.google.analytics.RADIO_POWERED");
            intentFilter2.addCategory(context.getPackageName());
            context.registerReceiver(n3Var, intentFilter2);
        }
        return this.f5958b;
    }
}
