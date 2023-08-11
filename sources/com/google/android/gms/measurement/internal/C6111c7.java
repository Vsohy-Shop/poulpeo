package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.os.Bundle;
import androidx.annotation.GuardedBy;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import androidx.autofill.HintConstants;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.measurement.internal.c7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
public final class C6111c7 extends C6349y3 {

    /* renamed from: c */
    private volatile C6319v6 f7676c;

    /* renamed from: d */
    private volatile C6319v6 f7677d;

    /* renamed from: e */
    protected C6319v6 f7678e;

    /* renamed from: f */
    private final Map<Activity, C6319v6> f7679f = new ConcurrentHashMap();
    @GuardedBy("activityLock")

    /* renamed from: g */
    private Activity f7680g;
    @GuardedBy("activityLock")

    /* renamed from: h */
    private volatile boolean f7681h;

    /* renamed from: i */
    private volatile C6319v6 f7682i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C6319v6 f7683j;
    @GuardedBy("activityLock")

    /* renamed from: k */
    private boolean f7684k;

    /* renamed from: l */
    private final Object f7685l = new Object();
    @GuardedBy("this")

    /* renamed from: m */
    private C6319v6 f7686m;
    @GuardedBy("this")

    /* renamed from: n */
    private String f7687n;

    public C6111c7(C6251p4 p4Var) {
        super(p4Var);
    }

    @MainThread
    /* renamed from: H */
    private final C6319v6 m10492H(@NonNull Activity activity) {
        C9713p.m20275j(activity);
        C6319v6 v6Var = this.f7679f.get(activity);
        if (v6Var == null) {
            C6319v6 v6Var2 = new C6319v6((String) null, mo34792u(activity.getClass(), "Activity"), this.f7899a.mo35191N().mo35149r0());
            this.f7679f.put(activity, v6Var2);
            v6Var = v6Var2;
        }
        if (this.f7682i != null) {
            return this.f7682i;
        }
        return v6Var;
    }

    @MainThread
    /* renamed from: o */
    private final void m10493o(Activity activity, C6319v6 v6Var, boolean z) {
        C6319v6 v6Var2;
        C6319v6 v6Var3;
        String str;
        C6319v6 v6Var4 = v6Var;
        if (this.f7676c == null) {
            v6Var2 = this.f7677d;
        } else {
            v6Var2 = this.f7676c;
        }
        C6319v6 v6Var5 = v6Var2;
        if (v6Var4.f8324b == null) {
            if (activity != null) {
                str = mo34792u(activity.getClass(), "Activity");
            } else {
                str = null;
            }
            v6Var3 = new C6319v6(v6Var4.f8323a, str, v6Var4.f8325c, v6Var4.f8327e, v6Var4.f8328f);
        } else {
            v6Var3 = v6Var4;
        }
        this.f7677d = this.f7676c;
        this.f7676c = v6Var3;
        this.f7899a.mo34919a().mo35110z(new C6341x6(this, v6Var3, v6Var5, this.f7899a.mo34922c().mo33548b(), z));
    }

    /* access modifiers changed from: private */
    @WorkerThread
    /* renamed from: p */
    public final void m10494p(C6319v6 v6Var, C6319v6 v6Var2, long j, boolean z, Bundle bundle) {
        boolean z2;
        Bundle bundle2;
        String str;
        long j2;
        long j3;
        C6319v6 v6Var3 = v6Var;
        C6319v6 v6Var4 = v6Var2;
        long j4 = j;
        Bundle bundle3 = bundle;
        mo34778h();
        boolean z3 = false;
        if (v6Var4 == null || v6Var4.f8325c != v6Var3.f8325c || !C6234n9.m10925Z(v6Var4.f8324b, v6Var3.f8324b) || !C6234n9.m10925Z(v6Var4.f8323a, v6Var3.f8323a)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && this.f7678e != null) {
            z3 = true;
        }
        if (z2) {
            if (bundle3 != null) {
                bundle2 = new Bundle(bundle3);
            } else {
                bundle2 = new Bundle();
            }
            Bundle bundle4 = bundle2;
            C6234n9.m10936x(v6Var3, bundle4, true);
            if (v6Var4 != null) {
                String str2 = v6Var4.f8323a;
                if (str2 != null) {
                    bundle4.putString("_pn", str2);
                }
                String str3 = v6Var4.f8324b;
                if (str3 != null) {
                    bundle4.putString("_pc", str3);
                }
                bundle4.putLong("_pi", v6Var4.f8325c);
            }
            if (z3) {
                C6266q8 q8Var = this.f7899a.mo35190M().f8205e;
                long j5 = j4 - q8Var.f8157b;
                q8Var.f8157b = j4;
                if (j5 > 0) {
                    this.f7899a.mo35191N().mo35154v(bundle4, j5);
                }
            }
            if (!this.f7899a.mo35211z().mo34875D()) {
                bundle4.putLong("_mst", 1);
            }
            if (true != v6Var3.f8327e) {
                str = "auto";
            } else {
                str = "app";
            }
            String str4 = str;
            long a = this.f7899a.mo34922c().mo33547a();
            if (v6Var3.f8327e) {
                j3 = a;
                long j6 = v6Var3.f8328f;
                if (j6 != 0) {
                    j2 = j6;
                    this.f7899a.mo35186I().mo35258v(str4, "_vs", j2, bundle4);
                }
            } else {
                j3 = a;
            }
            j2 = j3;
            this.f7899a.mo35186I().mo35258v(str4, "_vs", j2, bundle4);
        }
        if (z3) {
            m10495q(this.f7678e, true, j4);
        }
        this.f7678e = v6Var3;
        if (v6Var3.f8327e) {
            this.f7683j = v6Var3;
        }
        this.f7899a.mo35189L().mo34837u(v6Var3);
    }

    /* access modifiers changed from: private */
    @WorkerThread
    /* renamed from: q */
    public final void m10495q(C6319v6 v6Var, boolean z, long j) {
        boolean z2;
        this.f7899a.mo35210y().mo34777n(this.f7899a.mo34922c().mo33548b());
        if (v6Var == null || !v6Var.f8326d) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (this.f7899a.mo35190M().f8205e.mo35267d(z2, z, j) && v6Var != null) {
            v6Var.f8326d = false;
        }
    }

    /* renamed from: x */
    static /* bridge */ /* synthetic */ void m10499x(C6111c7 c7Var, Bundle bundle, C6319v6 v6Var, C6319v6 v6Var2, long j) {
        bundle.remove("screen_name");
        bundle.remove("screen_class");
        c7Var.m10494p(v6Var, v6Var2, j, true, c7Var.f7899a.mo35191N().mo35155v0((String) null, "screen_view", bundle, (List<String>) null, false));
    }

    @MainThread
    /* renamed from: A */
    public final void mo34782A(Activity activity) {
        synchronized (this.f7685l) {
            if (activity == this.f7680g) {
                this.f7680g = null;
            }
        }
        if (this.f7899a.mo35211z().mo34875D()) {
            this.f7679f.remove(activity);
        }
    }

    @MainThread
    /* renamed from: B */
    public final void mo34783B(Activity activity) {
        synchronized (this.f7685l) {
            this.f7684k = false;
            this.f7681h = true;
        }
        long b = this.f7899a.mo34922c().mo33548b();
        if (!this.f7899a.mo35211z().mo34875D()) {
            this.f7676c = null;
            this.f7899a.mo34919a().mo35110z(new C6363z6(this, b));
            return;
        }
        C6319v6 H = m10492H(activity);
        this.f7677d = this.f7676c;
        this.f7676c = null;
        this.f7899a.mo34919a().mo35110z(new C6088a7(this, H, b));
    }

    @MainThread
    /* renamed from: C */
    public final void mo34784C(Activity activity) {
        synchronized (this.f7685l) {
            this.f7684k = true;
            if (activity != this.f7680g) {
                synchronized (this.f7685l) {
                    this.f7680g = activity;
                    this.f7681h = false;
                }
                if (this.f7899a.mo35211z().mo34875D()) {
                    this.f7682i = null;
                    this.f7899a.mo34919a().mo35110z(new C6100b7(this));
                }
            }
        }
        if (!this.f7899a.mo35211z().mo34875D()) {
            this.f7676c = this.f7682i;
            this.f7899a.mo34919a().mo35110z(new C6352y6(this));
            return;
        }
        m10493o(activity, m10492H(activity), false);
        C6106c2 y = this.f7899a.mo35210y();
        y.f7899a.mo34919a().mo35110z(new C6094b1(y, y.f7899a.mo34922c().mo33548b()));
    }

    @MainThread
    /* renamed from: D */
    public final void mo34785D(Activity activity, Bundle bundle) {
        C6319v6 v6Var;
        if (this.f7899a.mo35211z().mo34875D() && bundle != null && (v6Var = this.f7679f.get(activity)) != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("id", v6Var.f8325c);
            bundle2.putString(HintConstants.AUTOFILL_HINT_NAME, v6Var.f8323a);
            bundle2.putString("referrer_name", v6Var.f8324b);
            bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0088, code lost:
        if (r5.length() <= 100) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b4, code lost:
        if (r6.length() <= 100) goto L_0x00cf;
     */
    @java.lang.Deprecated
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo34786E(@androidx.annotation.NonNull android.app.Activity r4, @androidx.annotation.Size(max = 36, min = 1) java.lang.String r5, @androidx.annotation.Size(max = 36, min = 1) java.lang.String r6) {
        /*
            r3 = this;
            com.google.android.gms.measurement.internal.p4 r0 = r3.f7899a
            com.google.android.gms.measurement.internal.g r0 = r0.mo35211z()
            boolean r0 = r0.mo34875D()
            if (r0 != 0) goto L_0x001c
            com.google.android.gms.measurement.internal.p4 r4 = r3.f7899a
            com.google.android.gms.measurement.internal.l3 r4 = r4.mo34920b()
            com.google.android.gms.measurement.internal.j3 r4 = r4.mo35081x()
            java.lang.String r5 = "setCurrentScreen cannot be called while screen reporting is disabled."
            r4.mo35037a(r5)
            return
        L_0x001c:
            com.google.android.gms.measurement.internal.v6 r0 = r3.f7676c
            if (r0 != 0) goto L_0x0030
            com.google.android.gms.measurement.internal.p4 r4 = r3.f7899a
            com.google.android.gms.measurement.internal.l3 r4 = r4.mo34920b()
            com.google.android.gms.measurement.internal.j3 r4 = r4.mo35081x()
            java.lang.String r5 = "setCurrentScreen cannot be called while no activity active"
            r4.mo35037a(r5)
            return
        L_0x0030:
            java.util.Map<android.app.Activity, com.google.android.gms.measurement.internal.v6> r1 = r3.f7679f
            java.lang.Object r1 = r1.get(r4)
            if (r1 != 0) goto L_0x0048
            com.google.android.gms.measurement.internal.p4 r4 = r3.f7899a
            com.google.android.gms.measurement.internal.l3 r4 = r4.mo34920b()
            com.google.android.gms.measurement.internal.j3 r4 = r4.mo35081x()
            java.lang.String r5 = "setCurrentScreen must be called with an activity in the activity lifecycle"
            r4.mo35037a(r5)
            return
        L_0x0048:
            if (r6 != 0) goto L_0x0054
            java.lang.Class r6 = r4.getClass()
            java.lang.String r1 = "Activity"
            java.lang.String r6 = r3.mo34792u(r6, r1)
        L_0x0054:
            java.lang.String r1 = r0.f8324b
            boolean r1 = com.google.android.gms.measurement.internal.C6234n9.m10925Z(r1, r6)
            java.lang.String r0 = r0.f8323a
            boolean r0 = com.google.android.gms.measurement.internal.C6234n9.m10925Z(r0, r5)
            if (r1 == 0) goto L_0x0075
            if (r0 != 0) goto L_0x0065
            goto L_0x0075
        L_0x0065:
            com.google.android.gms.measurement.internal.p4 r4 = r3.f7899a
            com.google.android.gms.measurement.internal.l3 r4 = r4.mo34920b()
            com.google.android.gms.measurement.internal.j3 r4 = r4.mo35081x()
            java.lang.String r5 = "setCurrentScreen cannot be called with the same class and name"
            r4.mo35037a(r5)
            return
        L_0x0075:
            r0 = 100
            if (r5 == 0) goto L_0x00a3
            int r1 = r5.length()
            if (r1 <= 0) goto L_0x008b
            com.google.android.gms.measurement.internal.p4 r1 = r3.f7899a
            r1.mo35211z()
            int r1 = r5.length()
            if (r1 > r0) goto L_0x008b
            goto L_0x00a3
        L_0x008b:
            com.google.android.gms.measurement.internal.p4 r4 = r3.f7899a
            com.google.android.gms.measurement.internal.l3 r4 = r4.mo34920b()
            com.google.android.gms.measurement.internal.j3 r4 = r4.mo35081x()
            int r5 = r5.length()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "Invalid screen name length in setCurrentScreen. Length"
            r4.mo35038b(r6, r5)
            return
        L_0x00a3:
            if (r6 == 0) goto L_0x00cf
            int r1 = r6.length()
            if (r1 <= 0) goto L_0x00b7
            com.google.android.gms.measurement.internal.p4 r1 = r3.f7899a
            r1.mo35211z()
            int r1 = r6.length()
            if (r1 > r0) goto L_0x00b7
            goto L_0x00cf
        L_0x00b7:
            com.google.android.gms.measurement.internal.p4 r4 = r3.f7899a
            com.google.android.gms.measurement.internal.l3 r4 = r4.mo34920b()
            com.google.android.gms.measurement.internal.j3 r4 = r4.mo35081x()
            int r5 = r6.length()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "Invalid class name length in setCurrentScreen. Length"
            r4.mo35038b(r6, r5)
            return
        L_0x00cf:
            com.google.android.gms.measurement.internal.p4 r0 = r3.f7899a
            com.google.android.gms.measurement.internal.l3 r0 = r0.mo34920b()
            com.google.android.gms.measurement.internal.j3 r0 = r0.mo35079v()
            if (r5 != 0) goto L_0x00de
            java.lang.String r1 = "null"
            goto L_0x00df
        L_0x00de:
            r1 = r5
        L_0x00df:
            java.lang.String r2 = "Setting current screen to name, class"
            r0.mo35039c(r2, r1, r6)
            com.google.android.gms.measurement.internal.v6 r0 = new com.google.android.gms.measurement.internal.v6
            com.google.android.gms.measurement.internal.p4 r1 = r3.f7899a
            com.google.android.gms.measurement.internal.n9 r1 = r1.mo35191N()
            long r1 = r1.mo35149r0()
            r0.<init>(r5, r6, r1)
            java.util.Map<android.app.Activity, com.google.android.gms.measurement.internal.v6> r5 = r3.f7679f
            r5.put(r4, r0)
            r5 = 1
            r3.m10493o(r4, r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C6111c7.mo34786E(android.app.Activity, java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r2 > 100) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0063, code lost:
        if (r4 > 100) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c1, code lost:
        r0 = r12.f7899a.mo34920b().mo35079v();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00cb, code lost:
        if (r3 != null) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00cd, code lost:
        r1 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d0, code lost:
        r1 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d1, code lost:
        if (r4 != null) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d3, code lost:
        r2 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d6, code lost:
        r2 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d7, code lost:
        r0.mo35039c("Logging screen view with name, class", r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00de, code lost:
        if (r12.f7676c != null) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e0, code lost:
        r0 = r12.f7677d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e3, code lost:
        r0 = r12.f7676c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e5, code lost:
        r2 = new com.google.android.gms.measurement.internal.C6319v6(r3, r4, r12.f7899a.mo35191N().mo35149r0(), true, r14);
        r12.f7676c = r2;
        r12.f7677d = r0;
        r12.f7682i = r2;
        r12.f7899a.mo34919a().mo35110z(new com.google.android.gms.measurement.internal.C6330w6(r12, r13, r2, r0, r12.f7899a.mo34922c().mo33548b()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x011a, code lost:
        return;
     */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo34787F(android.os.Bundle r13, long r14) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.f7685l
            monitor-enter(r0)
            boolean r1 = r12.f7684k     // Catch:{ all -> 0x011b }
            if (r1 != 0) goto L_0x0018
            com.google.android.gms.measurement.internal.p4 r13 = r12.f7899a     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.l3 r13 = r13.mo34920b()     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.j3 r13 = r13.mo35081x()     // Catch:{ all -> 0x011b }
            java.lang.String r14 = "Cannot log screen view event when the app is in the background."
            r13.mo35037a(r14)     // Catch:{ all -> 0x011b }
            monitor-exit(r0)     // Catch:{ all -> 0x011b }
            return
        L_0x0018:
            java.lang.String r1 = "screen_name"
            java.lang.String r3 = r13.getString(r1)     // Catch:{ all -> 0x011b }
            r1 = 100
            if (r3 == 0) goto L_0x004c
            int r2 = r3.length()     // Catch:{ all -> 0x011b }
            if (r2 <= 0) goto L_0x0033
            int r2 = r3.length()     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.p4 r4 = r12.f7899a     // Catch:{ all -> 0x011b }
            r4.mo35211z()     // Catch:{ all -> 0x011b }
            if (r2 <= r1) goto L_0x004c
        L_0x0033:
            com.google.android.gms.measurement.internal.p4 r13 = r12.f7899a     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.l3 r13 = r13.mo34920b()     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.j3 r13 = r13.mo35081x()     // Catch:{ all -> 0x011b }
            java.lang.String r14 = "Invalid screen name length for screen view. Length"
            int r15 = r3.length()     // Catch:{ all -> 0x011b }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x011b }
            r13.mo35038b(r14, r15)     // Catch:{ all -> 0x011b }
            monitor-exit(r0)     // Catch:{ all -> 0x011b }
            return
        L_0x004c:
            java.lang.String r2 = "screen_class"
            java.lang.String r2 = r13.getString(r2)     // Catch:{ all -> 0x011b }
            if (r2 == 0) goto L_0x007e
            int r4 = r2.length()     // Catch:{ all -> 0x011b }
            if (r4 <= 0) goto L_0x0065
            int r4 = r2.length()     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.p4 r5 = r12.f7899a     // Catch:{ all -> 0x011b }
            r5.mo35211z()     // Catch:{ all -> 0x011b }
            if (r4 <= r1) goto L_0x007e
        L_0x0065:
            com.google.android.gms.measurement.internal.p4 r13 = r12.f7899a     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.l3 r13 = r13.mo34920b()     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.j3 r13 = r13.mo35081x()     // Catch:{ all -> 0x011b }
            java.lang.String r14 = "Invalid screen class length for screen view. Length"
            int r15 = r2.length()     // Catch:{ all -> 0x011b }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x011b }
            r13.mo35038b(r14, r15)     // Catch:{ all -> 0x011b }
            monitor-exit(r0)     // Catch:{ all -> 0x011b }
            return
        L_0x007e:
            if (r2 != 0) goto L_0x0093
            android.app.Activity r1 = r12.f7680g     // Catch:{ all -> 0x011b }
            if (r1 == 0) goto L_0x008f
            java.lang.Class r1 = r1.getClass()     // Catch:{ all -> 0x011b }
            java.lang.String r2 = "Activity"
            java.lang.String r1 = r12.mo34792u(r1, r2)     // Catch:{ all -> 0x011b }
            goto L_0x0091
        L_0x008f:
            java.lang.String r1 = "Activity"
        L_0x0091:
            r4 = r1
            goto L_0x0094
        L_0x0093:
            r4 = r2
        L_0x0094:
            com.google.android.gms.measurement.internal.v6 r1 = r12.f7676c     // Catch:{ all -> 0x011b }
            boolean r2 = r12.f7681h     // Catch:{ all -> 0x011b }
            if (r2 == 0) goto L_0x00c0
            if (r1 == 0) goto L_0x00c0
            r2 = 0
            r12.f7681h = r2     // Catch:{ all -> 0x011b }
            java.lang.String r2 = r1.f8324b     // Catch:{ all -> 0x011b }
            boolean r2 = com.google.android.gms.measurement.internal.C6234n9.m10925Z(r2, r4)     // Catch:{ all -> 0x011b }
            java.lang.String r1 = r1.f8323a     // Catch:{ all -> 0x011b }
            boolean r1 = com.google.android.gms.measurement.internal.C6234n9.m10925Z(r1, r3)     // Catch:{ all -> 0x011b }
            if (r2 == 0) goto L_0x00c0
            if (r1 == 0) goto L_0x00c0
            com.google.android.gms.measurement.internal.p4 r13 = r12.f7899a     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.l3 r13 = r13.mo34920b()     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.j3 r13 = r13.mo35081x()     // Catch:{ all -> 0x011b }
            java.lang.String r14 = "Ignoring call to log screen view event with duplicate parameters."
            r13.mo35037a(r14)     // Catch:{ all -> 0x011b }
            monitor-exit(r0)     // Catch:{ all -> 0x011b }
            return
        L_0x00c0:
            monitor-exit(r0)     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.p4 r0 = r12.f7899a
            com.google.android.gms.measurement.internal.l3 r0 = r0.mo34920b()
            com.google.android.gms.measurement.internal.j3 r0 = r0.mo35079v()
            if (r3 != 0) goto L_0x00d0
            java.lang.String r1 = "null"
            goto L_0x00d1
        L_0x00d0:
            r1 = r3
        L_0x00d1:
            if (r4 != 0) goto L_0x00d6
            java.lang.String r2 = "null"
            goto L_0x00d7
        L_0x00d6:
            r2 = r4
        L_0x00d7:
            java.lang.String r5 = "Logging screen view with name, class"
            r0.mo35039c(r5, r1, r2)
            com.google.android.gms.measurement.internal.v6 r0 = r12.f7676c
            if (r0 != 0) goto L_0x00e3
            com.google.android.gms.measurement.internal.v6 r0 = r12.f7677d
            goto L_0x00e5
        L_0x00e3:
            com.google.android.gms.measurement.internal.v6 r0 = r12.f7676c
        L_0x00e5:
            com.google.android.gms.measurement.internal.v6 r1 = new com.google.android.gms.measurement.internal.v6
            com.google.android.gms.measurement.internal.p4 r2 = r12.f7899a
            com.google.android.gms.measurement.internal.n9 r2 = r2.mo35191N()
            long r5 = r2.mo35149r0()
            r7 = 1
            r2 = r1
            r8 = r14
            r2.<init>(r3, r4, r5, r7, r8)
            r12.f7676c = r1
            r12.f7677d = r0
            r12.f7682i = r1
            com.google.android.gms.measurement.internal.p4 r14 = r12.f7899a
            y4.e r14 = r14.mo34922c()
            long r10 = r14.mo33548b()
            com.google.android.gms.measurement.internal.p4 r14 = r12.f7899a
            com.google.android.gms.measurement.internal.n4 r14 = r14.mo34919a()
            com.google.android.gms.measurement.internal.w6 r15 = new com.google.android.gms.measurement.internal.w6
            r5 = r15
            r6 = r12
            r7 = r13
            r8 = r1
            r9 = r0
            r5.<init>(r6, r7, r8, r9, r10)
            r14.mo35110z(r15)
            return
        L_0x011b:
            r13 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x011b }
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C6111c7.mo34787F(android.os.Bundle, long):void");
    }

    @WorkerThread
    /* renamed from: G */
    public final void mo34788G(String str, C6319v6 v6Var) {
        mo34778h();
        synchronized (this) {
            String str2 = this.f7687n;
            if (str2 == null || str2.equals(str) || v6Var != null) {
                this.f7687n = str;
                this.f7686m = v6Var;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final boolean mo34789n() {
        return false;
    }

    /* renamed from: s */
    public final C6319v6 mo34790s() {
        return this.f7676c;
    }

    @WorkerThread
    /* renamed from: t */
    public final C6319v6 mo34791t(boolean z) {
        mo35413i();
        mo34778h();
        if (!z) {
            return this.f7678e;
        }
        C6319v6 v6Var = this.f7678e;
        if (v6Var != null) {
            return v6Var;
        }
        return this.f7683j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final String mo34792u(Class<?> cls, String str) {
        String str2;
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return "Activity";
        }
        String[] split = canonicalName.split("\\.");
        int length = split.length;
        if (length > 0) {
            str2 = split[length - 1];
        } else {
            str2 = "";
        }
        int length2 = str2.length();
        this.f7899a.mo35211z();
        if (length2 <= 100) {
            return str2;
        }
        this.f7899a.mo35211z();
        return str2.substring(0, 100);
    }

    @MainThread
    /* renamed from: z */
    public final void mo34793z(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (this.f7899a.mo35211z().mo34875D() && bundle != null && (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) != null) {
            this.f7679f.put(activity, new C6319v6(bundle2.getString(HintConstants.AUTOFILL_HINT_NAME), bundle2.getString("referrer_name"), bundle2.getLong("id")));
        }
    }
}
