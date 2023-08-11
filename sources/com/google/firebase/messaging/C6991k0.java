package com.google.firebase.messaging;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.firebase.C6922c;

/* renamed from: com.google.firebase.messaging.k0 */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
class C6991k0 {

    /* renamed from: a */
    private final Context f9320a;

    /* renamed from: b */
    private String f9321b;

    /* renamed from: c */
    private String f9322c;

    /* renamed from: d */
    private int f9323d;

    /* renamed from: e */
    private int f9324e = 0;

    C6991k0(Context context) {
        this.f9320a = context;
    }

    /* renamed from: c */
    static String m12344c(C6922c cVar) {
        String d = cVar.mo39769k().mo39786d();
        if (d != null) {
            return d;
        }
        String c = cVar.mo39769k().mo39785c();
        if (!c.startsWith("1:")) {
            return c;
        }
        String[] split = c.split(":");
        if (split.length < 2) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    /* renamed from: f */
    private PackageInfo m12345f(String str) {
        try {
            return this.f9320a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("FirebaseMessaging", "Failed to find package ".concat(e.toString()));
            return null;
        }
    }

    /* renamed from: h */
    private synchronized void m12346h() {
        PackageInfo f = m12345f(this.f9320a.getPackageName());
        if (f != null) {
            this.f9321b = Integer.toString(f.versionCode);
            this.f9322c = f.versionName;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized String mo39937a() {
        if (this.f9321b == null) {
            m12346h();
        }
        return this.f9321b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized String mo39938b() {
        if (this.f9322c == null) {
            m12346h();
        }
        return this.f9322c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized int mo39939d() {
        PackageInfo f;
        if (this.f9323d == 0 && (f = m12345f("com.google.android.gms")) != null) {
            this.f9323d = f.versionCode;
        }
        return this.f9323d;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0078, code lost:
        return r2;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int mo39940e() {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.f9324e     // Catch:{ all -> 0x0079 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r5)
            return r0
        L_0x0007:
            android.content.Context r0 = r5.f9320a     // Catch:{ all -> 0x0079 }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ all -> 0x0079 }
            java.lang.String r1 = "com.google.android.c2dm.permission.SEND"
            java.lang.String r2 = "com.google.android.gms"
            int r1 = r0.checkPermission(r1, r2)     // Catch:{ all -> 0x0079 }
            r2 = -1
            r3 = 0
            if (r1 != r2) goto L_0x0022
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r1 = "Google Play services missing or without correct permission."
            android.util.Log.e(r0, r1)     // Catch:{ all -> 0x0079 }
            monitor-exit(r5)
            return r3
        L_0x0022:
            boolean r1 = p286y4.C10680n.m22704h()     // Catch:{ all -> 0x0079 }
            r2 = 1
            if (r1 != 0) goto L_0x0046
            android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x0079 }
            java.lang.String r4 = "com.google.android.c2dm.intent.REGISTER"
            r1.<init>(r4)     // Catch:{ all -> 0x0079 }
            java.lang.String r4 = "com.google.android.gms"
            r1.setPackage(r4)     // Catch:{ all -> 0x0079 }
            java.util.List r1 = r0.queryIntentServices(r1, r3)     // Catch:{ all -> 0x0079 }
            if (r1 == 0) goto L_0x0046
            int r1 = r1.size()     // Catch:{ all -> 0x0079 }
            if (r1 > 0) goto L_0x0042
            goto L_0x0046
        L_0x0042:
            r5.f9324e = r2     // Catch:{ all -> 0x0079 }
            monitor-exit(r5)
            return r2
        L_0x0046:
            android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x0079 }
            java.lang.String r4 = "com.google.iid.TOKEN_REQUEST"
            r1.<init>(r4)     // Catch:{ all -> 0x0079 }
            java.lang.String r4 = "com.google.android.gms"
            r1.setPackage(r4)     // Catch:{ all -> 0x0079 }
            java.util.List r0 = r0.queryBroadcastReceivers(r1, r3)     // Catch:{ all -> 0x0079 }
            r1 = 2
            if (r0 == 0) goto L_0x0064
            int r0 = r0.size()     // Catch:{ all -> 0x0079 }
            if (r0 > 0) goto L_0x0060
            goto L_0x0064
        L_0x0060:
            r5.f9324e = r1     // Catch:{ all -> 0x0079 }
            monitor-exit(r5)
            return r1
        L_0x0064:
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r3 = "Failed to resolve IID implementation package, falling back"
            android.util.Log.w(r0, r3)     // Catch:{ all -> 0x0079 }
            boolean r0 = p286y4.C10680n.m22704h()     // Catch:{ all -> 0x0079 }
            if (r0 == 0) goto L_0x0075
            r5.f9324e = r1     // Catch:{ all -> 0x0079 }
            r2 = r1
            goto L_0x0077
        L_0x0075:
            r5.f9324e = r2     // Catch:{ all -> 0x0079 }
        L_0x0077:
            monitor-exit(r5)
            return r2
        L_0x0079:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.C6991k0.mo39940e():int");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo39941g() {
        if (mo39940e() != 0) {
            return true;
        }
        return false;
    }
}
