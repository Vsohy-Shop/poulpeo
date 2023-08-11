package com.google.android.gms.measurement.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Size;
import androidx.annotation.WorkerThread;
import java.lang.reflect.InvocationTargetException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p023a5.C2207e;
import p231t4.C9713p;
import p286y4.C10681o;

/* renamed from: com.google.android.gms.measurement.internal.g */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
public final class C6147g extends C6186j5 {

    /* renamed from: b */
    private Boolean f7782b;

    /* renamed from: c */
    private C6136f f7783c = C6125e.f7734a;

    /* renamed from: d */
    private Boolean f7784d;

    C6147g(C6251p4 p4Var) {
        super(p4Var);
    }

    /* renamed from: I */
    public static final long m10588I() {
        return C6084a3.f7576e.mo35421a(null).longValue();
    }

    /* renamed from: i */
    public static final long m10589i() {
        return C6084a3.f7545E.mo35421a(null).longValue();
    }

    /* renamed from: j */
    private final String m10590j(String str, String str2) {
        Class<String> cls = String.class;
        try {
            String str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{cls, cls}).invoke((Object) null, new Object[]{str, ""});
            C9713p.m20275j(str3);
            return str3;
        } catch (ClassNotFoundException e) {
            this.f7899a.mo34920b().mo35075r().mo35038b("Could not find SystemProperties class", e);
            return "";
        } catch (NoSuchMethodException e2) {
            this.f7899a.mo34920b().mo35075r().mo35038b("Could not find SystemProperties.get() method", e2);
            return "";
        } catch (IllegalAccessException e3) {
            this.f7899a.mo34920b().mo35075r().mo35038b("Could not access SystemProperties.get()", e3);
            return "";
        } catch (InvocationTargetException e4) {
            this.f7899a.mo34920b().mo35075r().mo35038b("SystemProperties.get() threw an exception", e4);
            return "";
        }
    }

    /* renamed from: A */
    public final boolean mo34872A() {
        Boolean t = mo34889t("google_analytics_adid_collection_enabled");
        if (t == null || t.booleanValue()) {
            return true;
        }
        return false;
    }

    @WorkerThread
    /* renamed from: B */
    public final boolean mo34873B(String str, C6359z2<Boolean> z2Var) {
        boolean z;
        if (str == null) {
            return z2Var.mo35421a(null).booleanValue();
        }
        String e = this.f7783c.mo34844e(str, z2Var.mo35422b());
        if (TextUtils.isEmpty(e)) {
            return z2Var.mo35421a(null).booleanValue();
        }
        if (this.f7899a.mo35211z().mo34873B((String) null, C6084a3.f7544D0)) {
            z = "1".equals(e);
        } else {
            z = Boolean.parseBoolean(e);
        }
        return z2Var.mo35421a(Boolean.valueOf(z)).booleanValue();
    }

    /* renamed from: C */
    public final boolean mo34874C(String str) {
        return "1".equals(this.f7783c.mo34844e(str, "gaia_collection_enabled"));
    }

    /* renamed from: D */
    public final boolean mo34875D() {
        Boolean t = mo34889t("google_analytics_automatic_screen_reporting_enabled");
        if (t == null || t.booleanValue()) {
            return true;
        }
        return false;
    }

    /* renamed from: E */
    public final boolean mo34876E() {
        this.f7899a.mo34924d();
        Boolean t = mo34889t("firebase_analytics_collection_deactivated");
        if (t == null || !t.booleanValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: F */
    public final boolean mo34877F(String str) {
        return "1".equals(this.f7783c.mo34844e(str, "measurement.event_sampling_enabled"));
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: G */
    public final boolean mo34878G() {
        if (this.f7782b == null) {
            Boolean t = mo34889t("app_measurement_lite");
            this.f7782b = t;
            if (t == null) {
                this.f7782b = Boolean.FALSE;
            }
        }
        if (this.f7782b.booleanValue() || !this.f7899a.mo35208s()) {
            return true;
        }
        return false;
    }

    @EnsuresNonNull({"this.isMainProcess"})
    /* renamed from: H */
    public final boolean mo34879H() {
        if (this.f7784d == null) {
            synchronized (this) {
                if (this.f7784d == null) {
                    ApplicationInfo applicationInfo = this.f7899a.mo34927f().getApplicationInfo();
                    String a = C10681o.m22708a();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        boolean z = false;
                        if (str != null && str.equals(a)) {
                            z = true;
                        }
                        this.f7784d = Boolean.valueOf(z);
                    }
                    if (this.f7784d == null) {
                        this.f7784d = Boolean.TRUE;
                        this.f7899a.mo34920b().mo35075r().mo35037a("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.f7784d.booleanValue();
    }

    @WorkerThread
    /* renamed from: k */
    public final double mo34880k(String str, C6359z2<Double> z2Var) {
        if (str == null) {
            return z2Var.mo35421a(null).doubleValue();
        }
        String e = this.f7783c.mo34844e(str, z2Var.mo35422b());
        if (TextUtils.isEmpty(e)) {
            return z2Var.mo35421a(null).doubleValue();
        }
        try {
            return z2Var.mo35421a(Double.valueOf(Double.parseDouble(e))).doubleValue();
        } catch (NumberFormatException unused) {
            return z2Var.mo35421a(null).doubleValue();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final int mo34881l(@Size(min = 1) String str) {
        return mo34885p(str, C6084a3.f7550I, 500, 2000);
    }

    /* renamed from: m */
    public final int mo34882m() {
        C6234n9 N = this.f7899a.mo35191N();
        Boolean J = N.f7899a.mo35189L().mo34820J();
        if (N.mo35144o0() >= 201500) {
            return 100;
        }
        if (J == null || J.booleanValue()) {
            return 25;
        }
        return 100;
    }

    /* renamed from: n */
    public final int mo34883n(@Size(min = 1) String str) {
        return mo34885p(str, C6084a3.f7551J, 25, 100);
    }

    @WorkerThread
    /* renamed from: o */
    public final int mo34884o(String str, C6359z2<Integer> z2Var) {
        if (str == null) {
            return z2Var.mo35421a(null).intValue();
        }
        String e = this.f7783c.mo34844e(str, z2Var.mo35422b());
        if (TextUtils.isEmpty(e)) {
            return z2Var.mo35421a(null).intValue();
        }
        try {
            return z2Var.mo35421a(Integer.valueOf(Integer.parseInt(e))).intValue();
        } catch (NumberFormatException unused) {
            return z2Var.mo35421a(null).intValue();
        }
    }

    @WorkerThread
    /* renamed from: p */
    public final int mo34885p(String str, C6359z2<Integer> z2Var, int i, int i2) {
        return Math.max(Math.min(mo34884o(str, z2Var), i2), i);
    }

    /* renamed from: q */
    public final long mo34886q() {
        this.f7899a.mo34924d();
        return 46000;
    }

    @WorkerThread
    /* renamed from: r */
    public final long mo34887r(String str, C6359z2<Long> z2Var) {
        if (str == null) {
            return z2Var.mo35421a(null).longValue();
        }
        String e = this.f7783c.mo34844e(str, z2Var.mo35422b());
        if (TextUtils.isEmpty(e)) {
            return z2Var.mo35421a(null).longValue();
        }
        try {
            return z2Var.mo35421a(Long.valueOf(Long.parseLong(e))).longValue();
        } catch (NumberFormatException unused) {
            return z2Var.mo35421a(null).longValue();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final Bundle mo34888s() {
        try {
            if (this.f7899a.mo34927f().getPackageManager() == null) {
                this.f7899a.mo34920b().mo35075r().mo35037a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo c = C2207e.m1805a(this.f7899a.mo34927f()).mo23528c(this.f7899a.mo34927f().getPackageName(), 128);
            if (c != null) {
                return c.metaData;
            }
            this.f7899a.mo34920b().mo35075r().mo35037a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            this.f7899a.mo34920b().mo35075r().mo35038b("Failed to load metadata: Package name not found", e);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final Boolean mo34889t(@Size(min = 1) String str) {
        C9713p.m20271f(str);
        Bundle s = mo34888s();
        if (s == null) {
            this.f7899a.mo34920b().mo35075r().mo35037a("Failed to load metadata: Metadata bundle is null");
            return null;
        } else if (!s.containsKey(str)) {
            return null;
        } else {
            return Boolean.valueOf(s.getBoolean(str));
        }
    }

    /* renamed from: u */
    public final String mo34890u() {
        return m10590j("debug.firebase.analytics.app", "");
    }

    /* renamed from: v */
    public final String mo34891v() {
        return m10590j("debug.deferred.deeplink", "");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final String mo34892w() {
        this.f7899a.mo34924d();
        return "FA";
    }

    @WorkerThread
    /* renamed from: x */
    public final String mo34893x(String str, C6359z2<String> z2Var) {
        if (str == null) {
            return z2Var.mo35421a(null);
        }
        return z2Var.mo35421a(this.f7783c.mo34844e(str, z2Var.mo35422b()));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e A[SYNTHETIC, Splitter:B:8:0x002e] */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<java.lang.String> mo34894y(@androidx.annotation.Size(min = 1) java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r4 = "analytics.safelisted_events"
            p231t4.C9713p.m20271f(r4)
            android.os.Bundle r0 = r3.mo34888s()
            r1 = 0
            if (r0 != 0) goto L_0x001d
            com.google.android.gms.measurement.internal.p4 r4 = r3.f7899a
            com.google.android.gms.measurement.internal.l3 r4 = r4.mo34920b()
            com.google.android.gms.measurement.internal.j3 r4 = r4.mo35075r()
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            r4.mo35037a(r0)
        L_0x001b:
            r4 = r1
            goto L_0x002c
        L_0x001d:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L_0x0024
            goto L_0x001b
        L_0x0024:
            int r4 = r0.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L_0x002c:
            if (r4 == 0) goto L_0x0058
            com.google.android.gms.measurement.internal.p4 r0 = r3.f7899a     // Catch:{ NotFoundException -> 0x0048 }
            android.content.Context r0 = r0.mo34927f()     // Catch:{ NotFoundException -> 0x0048 }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ NotFoundException -> 0x0048 }
            int r4 = r4.intValue()     // Catch:{ NotFoundException -> 0x0048 }
            java.lang.String[] r4 = r0.getStringArray(r4)     // Catch:{ NotFoundException -> 0x0048 }
            if (r4 != 0) goto L_0x0043
            return r1
        L_0x0043:
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch:{ NotFoundException -> 0x0048 }
            return r4
        L_0x0048:
            r4 = move-exception
            com.google.android.gms.measurement.internal.p4 r0 = r3.f7899a
            com.google.android.gms.measurement.internal.l3 r0 = r0.mo34920b()
            com.google.android.gms.measurement.internal.j3 r0 = r0.mo35075r()
            java.lang.String r2 = "Failed to load string array from metadata: resource not found"
            r0.mo35038b(r2, r4)
        L_0x0058:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C6147g.mo34894y(java.lang.String):java.util.List");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final void mo34895z(C6136f fVar) {
        this.f7783c = fVar;
    }
}
