package com.google.android.gms.measurement.internal;

import androidx.annotation.WorkerThread;
import com.google.android.gms.internal.measurement.C5991uc;
import java.util.List;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.measurement.internal.d3 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
public final class C6118d3 extends C6349y3 {

    /* renamed from: c */
    private String f7696c;

    /* renamed from: d */
    private String f7697d;

    /* renamed from: e */
    private int f7698e;

    /* renamed from: f */
    private String f7699f;

    /* renamed from: g */
    private String f7700g;

    /* renamed from: h */
    private long f7701h;

    /* renamed from: i */
    private final long f7702i;

    /* renamed from: j */
    private List<String> f7703j;

    /* renamed from: k */
    private int f7704k;

    /* renamed from: l */
    private String f7705l;

    /* renamed from: m */
    private String f7706m;

    /* renamed from: n */
    private String f7707n;

    C6118d3(C6251p4 p4Var, long j) {
        super(p4Var);
        this.f7702i = j;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x018e A[Catch:{ IllegalStateException -> 0x0231 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0190 A[Catch:{ IllegalStateException -> 0x0231 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01a6 A[SYNTHETIC, Splitter:B:56:0x01a6] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01e6 A[Catch:{ IllegalStateException -> 0x0231 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0212 A[Catch:{ IllegalStateException -> 0x0231 }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x025b  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0294  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x02a1  */
    @androidx.annotation.WorkerThread
    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"appId", "appStore", "appName", "gmpAppId", "gaAppId"})
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo34805l() {
        /*
            r13 = this;
            com.google.android.gms.measurement.internal.p4 r0 = r13.f7899a
            android.content.Context r0 = r0.mo34927f()
            java.lang.String r0 = r0.getPackageName()
            com.google.android.gms.measurement.internal.p4 r1 = r13.f7899a
            android.content.Context r1 = r1.mo34927f()
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 0
            java.lang.String r4 = ""
            java.lang.String r5 = "unknown"
            java.lang.String r6 = "Unknown"
            if (r1 != 0) goto L_0x0035
            com.google.android.gms.measurement.internal.p4 r7 = r13.f7899a
            com.google.android.gms.measurement.internal.l3 r7 = r7.mo34920b()
            com.google.android.gms.measurement.internal.j3 r7 = r7.mo35075r()
            java.lang.String r8 = "PackageManager is null, app identity information might be inaccurate. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r0)
            r7.mo35038b(r8, r9)
        L_0x0032:
            r8 = r6
            goto L_0x009b
        L_0x0035:
            java.lang.String r5 = r1.getInstallerPackageName(r0)     // Catch:{ IllegalArgumentException -> 0x003a }
            goto L_0x004d
        L_0x003a:
            com.google.android.gms.measurement.internal.p4 r7 = r13.f7899a
            com.google.android.gms.measurement.internal.l3 r7 = r7.mo34920b()
            com.google.android.gms.measurement.internal.j3 r7 = r7.mo35075r()
            java.lang.String r8 = "Error retrieving app installer package name. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r0)
            r7.mo35038b(r8, r9)
        L_0x004d:
            if (r5 != 0) goto L_0x0052
            java.lang.String r5 = "manual_install"
            goto L_0x005b
        L_0x0052:
            java.lang.String r7 = "com.android.vending"
            boolean r7 = r7.equals(r5)
            if (r7 == 0) goto L_0x005b
            r5 = r4
        L_0x005b:
            com.google.android.gms.measurement.internal.p4 r7 = r13.f7899a     // Catch:{ NameNotFoundException -> 0x0085 }
            android.content.Context r7 = r7.mo34927f()     // Catch:{ NameNotFoundException -> 0x0085 }
            java.lang.String r7 = r7.getPackageName()     // Catch:{ NameNotFoundException -> 0x0085 }
            android.content.pm.PackageInfo r7 = r1.getPackageInfo(r7, r3)     // Catch:{ NameNotFoundException -> 0x0085 }
            if (r7 == 0) goto L_0x0032
            android.content.pm.ApplicationInfo r8 = r7.applicationInfo     // Catch:{ NameNotFoundException -> 0x0085 }
            java.lang.CharSequence r8 = r1.getApplicationLabel(r8)     // Catch:{ NameNotFoundException -> 0x0085 }
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch:{ NameNotFoundException -> 0x0085 }
            if (r9 != 0) goto L_0x007c
            java.lang.String r8 = r8.toString()     // Catch:{ NameNotFoundException -> 0x0085 }
            goto L_0x007d
        L_0x007c:
            r8 = r6
        L_0x007d:
            java.lang.String r6 = r7.versionName     // Catch:{ NameNotFoundException -> 0x0082 }
            int r2 = r7.versionCode     // Catch:{ NameNotFoundException -> 0x0082 }
            goto L_0x009b
        L_0x0082:
            r7 = r6
            r6 = r8
            goto L_0x0086
        L_0x0085:
            r7 = r6
        L_0x0086:
            com.google.android.gms.measurement.internal.p4 r8 = r13.f7899a
            com.google.android.gms.measurement.internal.l3 r8 = r8.mo34920b()
            com.google.android.gms.measurement.internal.j3 r8 = r8.mo35075r()
            java.lang.String r9 = "Error retrieving package info. appId, appName"
            java.lang.Object r10 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r0)
            r8.mo35039c(r9, r10, r6)
            r8 = r6
            r6 = r7
        L_0x009b:
            r13.f7696c = r0
            r13.f7699f = r5
            r13.f7697d = r6
            r13.f7698e = r2
            r13.f7700g = r8
            r5 = 0
            r13.f7701h = r5
            com.google.android.gms.measurement.internal.p4 r2 = r13.f7899a
            java.lang.String r2 = r2.mo35192O()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            r5 = 1
            if (r2 != 0) goto L_0x00c6
            com.google.android.gms.measurement.internal.p4 r2 = r13.f7899a
            java.lang.String r2 = r2.mo35193P()
            java.lang.String r6 = "am"
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L_0x00c6
            r2 = r5
            goto L_0x00c7
        L_0x00c6:
            r2 = r3
        L_0x00c7:
            com.google.android.gms.measurement.internal.p4 r6 = r13.f7899a
            int r6 = r6.mo35209x()
            switch(r6) {
                case 0: goto L_0x0151;
                case 1: goto L_0x0141;
                case 2: goto L_0x0131;
                case 3: goto L_0x0121;
                case 4: goto L_0x0111;
                case 5: goto L_0x0101;
                case 6: goto L_0x00f1;
                case 7: goto L_0x00e1;
                default: goto L_0x00d0;
            }
        L_0x00d0:
            com.google.android.gms.measurement.internal.p4 r7 = r13.f7899a
            com.google.android.gms.measurement.internal.l3 r7 = r7.mo34920b()
            com.google.android.gms.measurement.internal.j3 r7 = r7.mo35078u()
            java.lang.String r8 = "App measurement disabled due to denied storage consent"
            r7.mo35037a(r8)
            goto L_0x0160
        L_0x00e1:
            com.google.android.gms.measurement.internal.p4 r7 = r13.f7899a
            com.google.android.gms.measurement.internal.l3 r7 = r7.mo34920b()
            com.google.android.gms.measurement.internal.j3 r7 = r7.mo35078u()
            java.lang.String r8 = "App measurement disabled via the global data collection setting"
            r7.mo35037a(r8)
            goto L_0x0160
        L_0x00f1:
            com.google.android.gms.measurement.internal.p4 r7 = r13.f7899a
            com.google.android.gms.measurement.internal.l3 r7 = r7.mo34920b()
            com.google.android.gms.measurement.internal.j3 r7 = r7.mo35081x()
            java.lang.String r8 = "App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics"
            r7.mo35037a(r8)
            goto L_0x0160
        L_0x0101:
            com.google.android.gms.measurement.internal.p4 r7 = r13.f7899a
            com.google.android.gms.measurement.internal.l3 r7 = r7.mo34920b()
            com.google.android.gms.measurement.internal.j3 r7 = r7.mo35079v()
            java.lang.String r8 = "App measurement disabled via the init parameters"
            r7.mo35037a(r8)
            goto L_0x0160
        L_0x0111:
            com.google.android.gms.measurement.internal.p4 r7 = r13.f7899a
            com.google.android.gms.measurement.internal.l3 r7 = r7.mo34920b()
            com.google.android.gms.measurement.internal.j3 r7 = r7.mo35078u()
            java.lang.String r8 = "App measurement disabled via the manifest"
            r7.mo35037a(r8)
            goto L_0x0160
        L_0x0121:
            com.google.android.gms.measurement.internal.p4 r7 = r13.f7899a
            com.google.android.gms.measurement.internal.l3 r7 = r7.mo34920b()
            com.google.android.gms.measurement.internal.j3 r7 = r7.mo35078u()
            java.lang.String r8 = "App measurement disabled by setAnalyticsCollectionEnabled(false)"
            r7.mo35037a(r8)
            goto L_0x0160
        L_0x0131:
            com.google.android.gms.measurement.internal.p4 r7 = r13.f7899a
            com.google.android.gms.measurement.internal.l3 r7 = r7.mo34920b()
            com.google.android.gms.measurement.internal.j3 r7 = r7.mo35079v()
            java.lang.String r8 = "App measurement deactivated via the init parameters"
            r7.mo35037a(r8)
            goto L_0x0160
        L_0x0141:
            com.google.android.gms.measurement.internal.p4 r7 = r13.f7899a
            com.google.android.gms.measurement.internal.l3 r7 = r7.mo34920b()
            com.google.android.gms.measurement.internal.j3 r7 = r7.mo35078u()
            java.lang.String r8 = "App measurement deactivated via the manifest"
            r7.mo35037a(r8)
            goto L_0x0160
        L_0x0151:
            com.google.android.gms.measurement.internal.p4 r7 = r13.f7899a
            com.google.android.gms.measurement.internal.l3 r7 = r7.mo34920b()
            com.google.android.gms.measurement.internal.j3 r7 = r7.mo35079v()
            java.lang.String r8 = "App measurement collection enabled"
            r7.mo35037a(r8)
        L_0x0160:
            r13.f7705l = r4
            r13.f7706m = r4
            r13.f7707n = r4
            com.google.android.gms.measurement.internal.p4 r7 = r13.f7899a
            r7.mo34924d()
            if (r2 == 0) goto L_0x0175
            com.google.android.gms.measurement.internal.p4 r2 = r13.f7899a
            java.lang.String r2 = r2.mo35192O()
            r13.f7706m = r2
        L_0x0175:
            r2 = 0
            com.google.android.gms.measurement.internal.p4 r7 = r13.f7899a     // Catch:{ IllegalStateException -> 0x0231 }
            android.content.Context r7 = r7.mo34927f()     // Catch:{ IllegalStateException -> 0x0231 }
            com.google.android.gms.measurement.internal.p4 r8 = r13.f7899a     // Catch:{ IllegalStateException -> 0x0231 }
            java.lang.String r8 = r8.mo35195R()     // Catch:{ IllegalStateException -> 0x0231 }
            java.lang.String r9 = "google_app_id"
            java.lang.String r7 = p201q5.C9274u.m19050c(r7, r9, r8)     // Catch:{ IllegalStateException -> 0x0231 }
            boolean r8 = android.text.TextUtils.isEmpty(r7)     // Catch:{ IllegalStateException -> 0x0231 }
            if (r5 == r8) goto L_0x0190
            r8 = r7
            goto L_0x0191
        L_0x0190:
            r8 = r4
        L_0x0191:
            r13.f7705l = r8     // Catch:{ IllegalStateException -> 0x0231 }
            com.google.android.gms.internal.measurement.C5831kd.m9523b()     // Catch:{ IllegalStateException -> 0x0231 }
            com.google.android.gms.measurement.internal.p4 r8 = r13.f7899a     // Catch:{ IllegalStateException -> 0x0231 }
            com.google.android.gms.measurement.internal.g r8 = r8.mo35211z()     // Catch:{ IllegalStateException -> 0x0231 }
            com.google.android.gms.measurement.internal.z2<java.lang.Boolean> r9 = com.google.android.gms.measurement.internal.C6084a3.f7577e0     // Catch:{ IllegalStateException -> 0x0231 }
            boolean r8 = r8.mo34873B(r2, r9)     // Catch:{ IllegalStateException -> 0x0231 }
            java.lang.String r9 = "admob_app_id"
            if (r8 == 0) goto L_0x01e6
            com.google.android.gms.measurement.internal.p4 r8 = r13.f7899a     // Catch:{ IllegalStateException -> 0x0231 }
            android.content.Context r8 = r8.mo34927f()     // Catch:{ IllegalStateException -> 0x0231 }
            com.google.android.gms.measurement.internal.p4 r10 = r13.f7899a     // Catch:{ IllegalStateException -> 0x0231 }
            java.lang.String r10 = r10.mo35195R()     // Catch:{ IllegalStateException -> 0x0231 }
            p231t4.C9713p.m20275j(r8)     // Catch:{ IllegalStateException -> 0x0231 }
            android.content.res.Resources r11 = r8.getResources()     // Catch:{ IllegalStateException -> 0x0231 }
            boolean r12 = android.text.TextUtils.isEmpty(r10)     // Catch:{ IllegalStateException -> 0x0231 }
            if (r12 != 0) goto L_0x01c0
            goto L_0x01c4
        L_0x01c0:
            java.lang.String r10 = p201q5.C9264k.m19025a(r8)     // Catch:{ IllegalStateException -> 0x0231 }
        L_0x01c4:
            java.lang.String r8 = "ga_app_id"
            java.lang.String r8 = p201q5.C9264k.m19026b(r8, r11, r10)     // Catch:{ IllegalStateException -> 0x0231 }
            boolean r12 = android.text.TextUtils.isEmpty(r8)     // Catch:{ IllegalStateException -> 0x0231 }
            if (r5 == r12) goto L_0x01d1
            r4 = r8
        L_0x01d1:
            r13.f7707n = r4     // Catch:{ IllegalStateException -> 0x0231 }
            boolean r4 = android.text.TextUtils.isEmpty(r7)     // Catch:{ IllegalStateException -> 0x0231 }
            if (r4 == 0) goto L_0x01df
            boolean r4 = android.text.TextUtils.isEmpty(r8)     // Catch:{ IllegalStateException -> 0x0231 }
            if (r4 != 0) goto L_0x0210
        L_0x01df:
            java.lang.String r4 = p201q5.C9264k.m19026b(r9, r11, r10)     // Catch:{ IllegalStateException -> 0x0231 }
            r13.f7706m = r4     // Catch:{ IllegalStateException -> 0x0231 }
            goto L_0x0210
        L_0x01e6:
            boolean r4 = android.text.TextUtils.isEmpty(r7)     // Catch:{ IllegalStateException -> 0x0231 }
            if (r4 != 0) goto L_0x0210
            com.google.android.gms.measurement.internal.p4 r4 = r13.f7899a     // Catch:{ IllegalStateException -> 0x0231 }
            android.content.Context r4 = r4.mo34927f()     // Catch:{ IllegalStateException -> 0x0231 }
            com.google.android.gms.measurement.internal.p4 r5 = r13.f7899a     // Catch:{ IllegalStateException -> 0x0231 }
            java.lang.String r5 = r5.mo35195R()     // Catch:{ IllegalStateException -> 0x0231 }
            p231t4.C9713p.m20275j(r4)     // Catch:{ IllegalStateException -> 0x0231 }
            android.content.res.Resources r7 = r4.getResources()     // Catch:{ IllegalStateException -> 0x0231 }
            boolean r8 = android.text.TextUtils.isEmpty(r5)     // Catch:{ IllegalStateException -> 0x0231 }
            if (r8 != 0) goto L_0x0206
            goto L_0x020a
        L_0x0206:
            java.lang.String r5 = p201q5.C9264k.m19025a(r4)     // Catch:{ IllegalStateException -> 0x0231 }
        L_0x020a:
            java.lang.String r4 = p201q5.C9264k.m19026b(r9, r7, r5)     // Catch:{ IllegalStateException -> 0x0231 }
            r13.f7706m = r4     // Catch:{ IllegalStateException -> 0x0231 }
        L_0x0210:
            if (r6 != 0) goto L_0x0245
            com.google.android.gms.measurement.internal.p4 r4 = r13.f7899a     // Catch:{ IllegalStateException -> 0x0231 }
            com.google.android.gms.measurement.internal.l3 r4 = r4.mo34920b()     // Catch:{ IllegalStateException -> 0x0231 }
            com.google.android.gms.measurement.internal.j3 r4 = r4.mo35079v()     // Catch:{ IllegalStateException -> 0x0231 }
            java.lang.String r5 = "App measurement enabled for app package, google app id"
            java.lang.String r6 = r13.f7696c     // Catch:{ IllegalStateException -> 0x0231 }
            java.lang.String r7 = r13.f7705l     // Catch:{ IllegalStateException -> 0x0231 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ IllegalStateException -> 0x0231 }
            if (r7 == 0) goto L_0x022b
            java.lang.String r7 = r13.f7706m     // Catch:{ IllegalStateException -> 0x0231 }
            goto L_0x022d
        L_0x022b:
            java.lang.String r7 = r13.f7705l     // Catch:{ IllegalStateException -> 0x0231 }
        L_0x022d:
            r4.mo35039c(r5, r6, r7)     // Catch:{ IllegalStateException -> 0x0231 }
            goto L_0x0245
        L_0x0231:
            r4 = move-exception
            com.google.android.gms.measurement.internal.p4 r5 = r13.f7899a
            com.google.android.gms.measurement.internal.l3 r5 = r5.mo34920b()
            com.google.android.gms.measurement.internal.j3 r5 = r5.mo35075r()
            java.lang.String r6 = "Fetching Google App Id failed with exception. appId"
            java.lang.Object r0 = com.google.android.gms.measurement.internal.C6206l3.m10862z(r0)
            r5.mo35039c(r6, r0, r4)
        L_0x0245:
            r13.f7703j = r2
            com.google.android.gms.measurement.internal.p4 r0 = r13.f7899a
            r0.mo34924d()
            com.google.android.gms.measurement.internal.p4 r0 = r13.f7899a
            com.google.android.gms.measurement.internal.g r0 = r0.mo35211z()
            java.lang.String r2 = "analytics.safelisted_events"
            java.util.List r0 = r0.mo34894y(r2)
            if (r0 != 0) goto L_0x025b
            goto L_0x0290
        L_0x025b:
            int r2 = r0.size()
            if (r2 != 0) goto L_0x0271
            com.google.android.gms.measurement.internal.p4 r0 = r13.f7899a
            com.google.android.gms.measurement.internal.l3 r0 = r0.mo34920b()
            com.google.android.gms.measurement.internal.j3 r0 = r0.mo35081x()
            java.lang.String r2 = "Safelisted event list is empty. Ignoring"
            r0.mo35037a(r2)
            goto L_0x0292
        L_0x0271:
            java.util.Iterator r2 = r0.iterator()
        L_0x0275:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0290
            java.lang.Object r4 = r2.next()
            java.lang.String r4 = (java.lang.String) r4
            com.google.android.gms.measurement.internal.p4 r5 = r13.f7899a
            com.google.android.gms.measurement.internal.n9 r5 = r5.mo35191N()
            java.lang.String r6 = "safelisted event"
            boolean r4 = r5.mo35130P(r6, r4)
            if (r4 != 0) goto L_0x0275
            goto L_0x0292
        L_0x0290:
            r13.f7703j = r0
        L_0x0292:
            if (r1 == 0) goto L_0x02a1
            com.google.android.gms.measurement.internal.p4 r0 = r13.f7899a
            android.content.Context r0 = r0.mo34927f()
            boolean r0 = p023a5.C2204b.m1796a(r0)
            r13.f7704k = r0
            return
        L_0x02a1:
            r13.f7704k = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C6118d3.mo34805l():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final boolean mo34789n() {
        return true;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: o */
    public final int mo34806o() {
        mo35413i();
        return this.f7704k;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: p */
    public final int mo34807p() {
        mo35413i();
        return this.f7698e;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01d2  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01fa  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0201  */
    @androidx.annotation.WorkerThread
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.C6289s9 mo34808q(java.lang.String r35) {
        /*
            r34 = this;
            r1 = r34
            r34.mo34778h()
            com.google.android.gms.measurement.internal.s9 r31 = new com.google.android.gms.measurement.internal.s9
            java.lang.String r3 = r34.mo34810s()
            java.lang.String r4 = r34.mo34812u()
            r34.mo35413i()
            java.lang.String r5 = r1.f7697d
            r34.mo35413i()
            int r0 = r1.f7698e
            long r6 = (long) r0
            r34.mo35413i()
            java.lang.String r0 = r1.f7699f
            p231t4.C9713p.m20275j(r0)
            java.lang.String r8 = r1.f7699f
            com.google.android.gms.measurement.internal.p4 r0 = r1.f7899a
            com.google.android.gms.measurement.internal.g r0 = r0.mo35211z()
            r0.mo34886q()
            r34.mo35413i()
            r34.mo34778h()
            long r9 = r1.f7701h
            r11 = 0
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            r2 = 0
            if (r0 != 0) goto L_0x00d0
            com.google.android.gms.measurement.internal.p4 r0 = r1.f7899a
            com.google.android.gms.measurement.internal.n9 r9 = r0.mo35191N()
            com.google.android.gms.measurement.internal.p4 r0 = r1.f7899a
            android.content.Context r0 = r0.mo34927f()
            com.google.android.gms.measurement.internal.p4 r10 = r1.f7899a
            android.content.Context r10 = r10.mo34927f()
            java.lang.String r10 = r10.getPackageName()
            r9.mo34778h()
            p231t4.C9713p.m20275j(r0)
            p231t4.C9713p.m20271f(r10)
            android.content.pm.PackageManager r13 = r0.getPackageManager()
            java.security.MessageDigest r14 = com.google.android.gms.measurement.internal.C6234n9.m10934s()
            r15 = -1
            if (r14 != 0) goto L_0x0078
            com.google.android.gms.measurement.internal.p4 r0 = r9.f7899a
            com.google.android.gms.measurement.internal.l3 r0 = r0.mo34920b()
            com.google.android.gms.measurement.internal.j3 r0 = r0.mo35075r()
            java.lang.String r9 = "Could not get MD5 instance"
            r0.mo35037a(r9)
        L_0x0076:
            r9 = r15
            goto L_0x00ce
        L_0x0078:
            if (r13 == 0) goto L_0x00cd
            boolean r10 = r9.mo35135U(r0, r10)     // Catch:{ NameNotFoundException -> 0x00bd }
            if (r10 != 0) goto L_0x00bb
            a5.d r0 = p023a5.C2207e.m1805a(r0)     // Catch:{ NameNotFoundException -> 0x00bd }
            com.google.android.gms.measurement.internal.p4 r10 = r9.f7899a     // Catch:{ NameNotFoundException -> 0x00bd }
            android.content.Context r10 = r10.mo34927f()     // Catch:{ NameNotFoundException -> 0x00bd }
            java.lang.String r10 = r10.getPackageName()     // Catch:{ NameNotFoundException -> 0x00bd }
            r13 = 64
            android.content.pm.PackageInfo r0 = r0.mo23530e(r10, r13)     // Catch:{ NameNotFoundException -> 0x00bd }
            android.content.pm.Signature[] r0 = r0.signatures     // Catch:{ NameNotFoundException -> 0x00bd }
            if (r0 == 0) goto L_0x00ab
            int r10 = r0.length     // Catch:{ NameNotFoundException -> 0x00bd }
            if (r10 <= 0) goto L_0x00ab
            r0 = r0[r2]     // Catch:{ NameNotFoundException -> 0x00bd }
            byte[] r0 = r0.toByteArray()     // Catch:{ NameNotFoundException -> 0x00bd }
            byte[] r0 = r14.digest(r0)     // Catch:{ NameNotFoundException -> 0x00bd }
            long r9 = com.google.android.gms.measurement.internal.C6234n9.m10933q0(r0)     // Catch:{ NameNotFoundException -> 0x00bd }
            r15 = r9
            goto L_0x0076
        L_0x00ab:
            com.google.android.gms.measurement.internal.p4 r0 = r9.f7899a     // Catch:{ NameNotFoundException -> 0x00bd }
            com.google.android.gms.measurement.internal.l3 r0 = r0.mo34920b()     // Catch:{ NameNotFoundException -> 0x00bd }
            com.google.android.gms.measurement.internal.j3 r0 = r0.mo35080w()     // Catch:{ NameNotFoundException -> 0x00bd }
            java.lang.String r10 = "Could not get signatures"
            r0.mo35037a(r10)     // Catch:{ NameNotFoundException -> 0x00bd }
            goto L_0x0076
        L_0x00bb:
            r15 = r11
            goto L_0x0076
        L_0x00bd:
            r0 = move-exception
            com.google.android.gms.measurement.internal.p4 r9 = r9.f7899a
            com.google.android.gms.measurement.internal.l3 r9 = r9.mo34920b()
            com.google.android.gms.measurement.internal.j3 r9 = r9.mo35075r()
            java.lang.String r10 = "Package name not found"
            r9.mo35038b(r10, r0)
        L_0x00cd:
            r9 = r11
        L_0x00ce:
            r1.f7701h = r9
        L_0x00d0:
            r13 = r9
            com.google.android.gms.measurement.internal.p4 r0 = r1.f7899a
            boolean r0 = r0.mo35204o()
            com.google.android.gms.measurement.internal.p4 r9 = r1.f7899a
            com.google.android.gms.measurement.internal.z3 r9 = r9.mo35184F()
            boolean r9 = r9.f8446p
            r10 = 1
            r15 = r9 ^ 1
            r34.mo34778h()
            com.google.android.gms.measurement.internal.p4 r9 = r1.f7899a
            boolean r9 = r9.mo35204o()
            r11 = 0
            if (r9 != 0) goto L_0x00f2
        L_0x00ee:
            r20 = r11
            goto L_0x0178
        L_0x00f2:
            com.google.android.gms.internal.measurement.C5961se.m9891b()
            com.google.android.gms.measurement.internal.p4 r9 = r1.f7899a
            com.google.android.gms.measurement.internal.g r9 = r9.mo35211z()
            com.google.android.gms.measurement.internal.z2<java.lang.Boolean> r12 = com.google.android.gms.measurement.internal.C6084a3.f7581g0
            boolean r9 = r9.mo34873B(r11, r12)
            if (r9 == 0) goto L_0x0113
            com.google.android.gms.measurement.internal.p4 r9 = r1.f7899a
            com.google.android.gms.measurement.internal.l3 r9 = r9.mo34920b()
            com.google.android.gms.measurement.internal.j3 r9 = r9.mo35079v()
            java.lang.String r12 = "Disabled IID for tests."
            r9.mo35037a(r12)
            goto L_0x00ee
        L_0x0113:
            com.google.android.gms.measurement.internal.p4 r9 = r1.f7899a     // Catch:{ ClassNotFoundException -> 0x0176 }
            android.content.Context r9 = r9.mo34927f()     // Catch:{ ClassNotFoundException -> 0x0176 }
            java.lang.ClassLoader r9 = r9.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0176 }
            java.lang.String r12 = "com.google.firebase.analytics.FirebaseAnalytics"
            java.lang.Class r9 = r9.loadClass(r12)     // Catch:{ ClassNotFoundException -> 0x0176 }
            if (r9 != 0) goto L_0x0126
            goto L_0x00ee
        L_0x0126:
            java.lang.Class[] r12 = new java.lang.Class[r10]     // Catch:{ Exception -> 0x0167 }
            java.lang.Class<android.content.Context> r18 = android.content.Context.class
            r12[r2] = r18     // Catch:{ Exception -> 0x0167 }
            java.lang.String r11 = "getInstance"
            java.lang.reflect.Method r11 = r9.getDeclaredMethod(r11, r12)     // Catch:{ Exception -> 0x0167 }
            java.lang.Object[] r12 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x0167 }
            com.google.android.gms.measurement.internal.p4 r10 = r1.f7899a     // Catch:{ Exception -> 0x0167 }
            android.content.Context r10 = r10.mo34927f()     // Catch:{ Exception -> 0x0167 }
            r12[r2] = r10     // Catch:{ Exception -> 0x0167 }
            r10 = 0
            java.lang.Object r11 = r11.invoke(r10, r12)     // Catch:{ Exception -> 0x0167 }
            if (r11 != 0) goto L_0x0144
            goto L_0x0176
        L_0x0144:
            java.lang.String r10 = "getFirebaseInstanceId"
            java.lang.Class[] r12 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x0157 }
            java.lang.reflect.Method r9 = r9.getDeclaredMethod(r10, r12)     // Catch:{ Exception -> 0x0157 }
            java.lang.Object[] r10 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0157 }
            java.lang.Object r9 = r9.invoke(r11, r10)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x0157 }
            r20 = r9
            goto L_0x0178
        L_0x0157:
            com.google.android.gms.measurement.internal.p4 r9 = r1.f7899a
            com.google.android.gms.measurement.internal.l3 r9 = r9.mo34920b()
            com.google.android.gms.measurement.internal.j3 r9 = r9.mo35081x()
            java.lang.String r10 = "Failed to retrieve Firebase Instance Id"
            r9.mo35037a(r10)
            goto L_0x0176
        L_0x0167:
            com.google.android.gms.measurement.internal.p4 r9 = r1.f7899a
            com.google.android.gms.measurement.internal.l3 r9 = r9.mo34920b()
            com.google.android.gms.measurement.internal.j3 r9 = r9.mo35082y()
            java.lang.String r10 = "Failed to obtain Firebase Analytics instance"
            r9.mo35037a(r10)
        L_0x0176:
            r20 = 0
        L_0x0178:
            com.google.android.gms.measurement.internal.p4 r9 = r1.f7899a
            com.google.android.gms.measurement.internal.z3 r10 = r9.mo35184F()
            com.google.android.gms.measurement.internal.v3 r10 = r10.f8435e
            long r10 = r10.mo35384a()
            r16 = 0
            int r12 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r12 != 0) goto L_0x0190
            long r9 = r9.f8093G
            r12 = r3
            r21 = r9
            goto L_0x0199
        L_0x0190:
            r12 = r3
            long r2 = r9.f8093G
            long r2 = java.lang.Math.min(r2, r10)
            r21 = r2
        L_0x0199:
            r34.mo35413i()
            int r11 = r1.f7704k
            com.google.android.gms.measurement.internal.p4 r2 = r1.f7899a
            com.google.android.gms.measurement.internal.g r2 = r2.mo35211z()
            boolean r23 = r2.mo34872A()
            com.google.android.gms.measurement.internal.p4 r2 = r1.f7899a
            com.google.android.gms.measurement.internal.z3 r2 = r2.mo35184F()
            r2.mo34778h()
            android.content.SharedPreferences r2 = r2.mo35423o()
            java.lang.String r3 = "deferred_analytics_collection"
            r9 = 0
            boolean r24 = r2.getBoolean(r3, r9)
            r34.mo35413i()
            java.lang.String r3 = r1.f7706m
            com.google.android.gms.measurement.internal.p4 r2 = r1.f7899a
            com.google.android.gms.measurement.internal.g r2 = r2.mo35211z()
            java.lang.String r9 = "google_analytics_default_allow_ad_personalization_signals"
            java.lang.Boolean r2 = r2.mo34889t(r9)
            if (r2 != 0) goto L_0x01d2
            r25 = 0
            goto L_0x01de
        L_0x01d2:
            boolean r2 = r2.booleanValue()
            r9 = 1
            r2 = r2 ^ r9
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r25 = r2
        L_0x01de:
            long r9 = r1.f7702i
            java.util.List<java.lang.String> r2 = r1.f7703j
            com.google.android.gms.internal.measurement.C5831kd.m9523b()
            r16 = r2
            com.google.android.gms.measurement.internal.p4 r2 = r1.f7899a
            com.google.android.gms.measurement.internal.g r2 = r2.mo35211z()
            r19 = r3
            com.google.android.gms.measurement.internal.z2<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.C6084a3.f7577e0
            r26 = r9
            r9 = 0
            boolean r2 = r2.mo34873B(r9, r3)
            if (r2 == 0) goto L_0x0201
            java.lang.String r2 = r34.mo34811t()
            r29 = r2
            goto L_0x0203
        L_0x0201:
            r29 = r9
        L_0x0203:
            r9 = 46000(0xb3b0, double:2.2727E-319)
            r17 = 0
            com.google.android.gms.measurement.internal.p4 r2 = r1.f7899a
            com.google.android.gms.measurement.internal.z3 r2 = r2.mo35184F()
            q5.a r2 = r2.mo35425q()
            java.lang.String r30 = r2.mo43552i()
            r28 = r16
            r2 = r31
            r32 = r19
            r3 = r12
            r33 = r11
            r11 = r13
            r13 = r35
            r14 = r0
            r16 = r20
            r19 = r21
            r21 = r33
            r22 = r23
            r23 = r24
            r24 = r32
            r2.<init>((java.lang.String) r3, (java.lang.String) r4, (java.lang.String) r5, (long) r6, (java.lang.String) r8, (long) r9, (long) r11, (java.lang.String) r13, (boolean) r14, (boolean) r15, (java.lang.String) r16, (long) r17, (long) r19, (int) r21, (boolean) r22, (boolean) r23, (java.lang.String) r24, (java.lang.Boolean) r25, (long) r26, (java.util.List<java.lang.String>) r28, (java.lang.String) r29, (java.lang.String) r30)
            return r31
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C6118d3.mo34808q(java.lang.String):com.google.android.gms.measurement.internal.s9");
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: r */
    public final String mo34809r() {
        mo35413i();
        return this.f7706m;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: s */
    public final String mo34810s() {
        mo35413i();
        C9713p.m20275j(this.f7696c);
        return this.f7696c;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: t */
    public final String mo34811t() {
        mo35413i();
        C9713p.m20275j(this.f7707n);
        return this.f7707n;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: u */
    public final String mo34812u() {
        C5991uc.m10137b();
        if (this.f7899a.mo35211z().mo34873B((String) null, C6084a3.f7609u0)) {
            mo34778h();
        }
        mo35413i();
        C9713p.m20275j(this.f7705l);
        return this.f7705l;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: v */
    public final List<String> mo34813v() {
        return this.f7703j;
    }
}
