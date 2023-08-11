package p170n4;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import p023a5.C2207e;

/* renamed from: n4.k */
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
public final class C8914k {

    /* renamed from: a */
    private final Context f12938a;

    /* renamed from: b */
    private int f12939b;

    /* renamed from: c */
    private int f12940c = 0;

    public C8914k(Context context) {
        this.f12938a = context;
    }

    /* renamed from: a */
    public final synchronized int mo43061a() {
        PackageInfo packageInfo;
        if (this.f12939b == 0) {
            try {
                packageInfo = C2207e.m1805a(this.f12938a).mo23530e("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(valueOf.length() + 23);
                sb.append("Failed to find package ");
                sb.append(valueOf);
                Log.w("Metadata", sb.toString());
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.f12939b = packageInfo.versionCode;
            }
        }
        return this.f12939b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x007e, code lost:
        return r2;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int mo43062b() {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.f12940c     // Catch:{ all -> 0x007f }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r5)
            return r0
        L_0x0007:
            android.content.Context r0 = r5.f12938a     // Catch:{ all -> 0x007f }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ all -> 0x007f }
            android.content.Context r1 = r5.f12938a     // Catch:{ all -> 0x007f }
            a5.d r1 = p023a5.C2207e.m1805a(r1)     // Catch:{ all -> 0x007f }
            java.lang.String r2 = "com.google.android.c2dm.permission.SEND"
            java.lang.String r3 = "com.google.android.gms"
            int r1 = r1.mo23527b(r2, r3)     // Catch:{ all -> 0x007f }
            r2 = -1
            r3 = 0
            if (r1 != r2) goto L_0x0028
            java.lang.String r0 = "Metadata"
            java.lang.String r1 = "Google Play services missing or without correct permission."
            android.util.Log.e(r0, r1)     // Catch:{ all -> 0x007f }
            monitor-exit(r5)
            return r3
        L_0x0028:
            boolean r1 = p286y4.C10680n.m22704h()     // Catch:{ all -> 0x007f }
            r2 = 1
            if (r1 != 0) goto L_0x004c
            android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x007f }
            java.lang.String r4 = "com.google.android.c2dm.intent.REGISTER"
            r1.<init>(r4)     // Catch:{ all -> 0x007f }
            java.lang.String r4 = "com.google.android.gms"
            r1.setPackage(r4)     // Catch:{ all -> 0x007f }
            java.util.List r1 = r0.queryIntentServices(r1, r3)     // Catch:{ all -> 0x007f }
            if (r1 == 0) goto L_0x004c
            int r1 = r1.size()     // Catch:{ all -> 0x007f }
            if (r1 > 0) goto L_0x0048
            goto L_0x004c
        L_0x0048:
            r5.f12940c = r2     // Catch:{ all -> 0x007f }
            monitor-exit(r5)
            return r2
        L_0x004c:
            android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x007f }
            java.lang.String r4 = "com.google.iid.TOKEN_REQUEST"
            r1.<init>(r4)     // Catch:{ all -> 0x007f }
            java.lang.String r4 = "com.google.android.gms"
            r1.setPackage(r4)     // Catch:{ all -> 0x007f }
            java.util.List r0 = r0.queryBroadcastReceivers(r1, r3)     // Catch:{ all -> 0x007f }
            r1 = 2
            if (r0 == 0) goto L_0x006a
            int r0 = r0.size()     // Catch:{ all -> 0x007f }
            if (r0 > 0) goto L_0x0066
            goto L_0x006a
        L_0x0066:
            r5.f12940c = r1     // Catch:{ all -> 0x007f }
            monitor-exit(r5)
            return r1
        L_0x006a:
            java.lang.String r0 = "Metadata"
            java.lang.String r3 = "Failed to resolve IID implementation package, falling back"
            android.util.Log.w(r0, r3)     // Catch:{ all -> 0x007f }
            boolean r0 = p286y4.C10680n.m22704h()     // Catch:{ all -> 0x007f }
            if (r0 == 0) goto L_0x007b
            r5.f12940c = r1     // Catch:{ all -> 0x007f }
            r2 = r1
            goto L_0x007d
        L_0x007b:
            r5.f12940c = r2     // Catch:{ all -> 0x007f }
        L_0x007d:
            monitor-exit(r5)
            return r2
        L_0x007f:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p170n4.C8914k.mo43062b():int");
    }
}
