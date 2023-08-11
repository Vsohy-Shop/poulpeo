package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.concurrent.TimeUnit;
import p243u5.C9886a;

/* renamed from: com.google.firebase.messaging.g1 */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
final class C6979g1 {

    /* renamed from: a */
    private static final long f9304a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b */
    private static final Object f9305b = new Object();

    /* renamed from: c */
    private static C9886a f9306c;

    /* renamed from: a */
    private static void m12298a(Context context) {
        if (f9306c == null) {
            C9886a aVar = new C9886a(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            f9306c = aVar;
            aVar.mo44412d(true);
        }
    }

    /* renamed from: b */
    static void m12299b(@NonNull Intent intent) {
        synchronized (f9305b) {
            if (f9306c != null && m12300c(intent)) {
                m12301d(intent, false);
                f9306c.mo44411c();
            }
        }
    }

    @VisibleForTesting
    /* renamed from: c */
    static boolean m12300c(@NonNull Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }

    /* renamed from: d */
    private static void m12301d(@NonNull Intent intent, boolean z) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        return r3;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static android.content.ComponentName m12302e(@androidx.annotation.NonNull android.content.Context r3, @androidx.annotation.NonNull android.content.Intent r4) {
        /*
            java.lang.Object r0 = f9305b
            monitor-enter(r0)
            m12298a(r3)     // Catch:{ all -> 0x0022 }
            boolean r1 = m12300c(r4)     // Catch:{ all -> 0x0022 }
            r2 = 1
            m12301d(r4, r2)     // Catch:{ all -> 0x0022 }
            android.content.ComponentName r3 = r3.startService(r4)     // Catch:{ all -> 0x0022 }
            if (r3 != 0) goto L_0x0017
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            r3 = 0
            return r3
        L_0x0017:
            if (r1 != 0) goto L_0x0020
            u5.a r4 = f9306c     // Catch:{ all -> 0x0022 }
            long r1 = f9304a     // Catch:{ all -> 0x0022 }
            r4.mo44409a(r1)     // Catch:{ all -> 0x0022 }
        L_0x0020:
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            return r3
        L_0x0022:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.C6979g1.m12302e(android.content.Context, android.content.Intent):android.content.ComponentName");
    }
}
