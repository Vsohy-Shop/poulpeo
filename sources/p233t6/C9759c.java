package p233t6;

import android.os.Bundle;
import androidx.annotation.NonNull;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: t6.c */
/* compiled from: BlockingAnalyticsEventLogger */
public class C9759c implements C9758b, C9757a {

    /* renamed from: a */
    private final C9761e f14566a;

    /* renamed from: b */
    private final int f14567b;

    /* renamed from: c */
    private final TimeUnit f14568c;

    /* renamed from: d */
    private final Object f14569d = new Object();

    /* renamed from: e */
    private CountDownLatch f14570e;

    /* renamed from: f */
    private boolean f14571f = false;

    public C9759c(@NonNull C9761e eVar, int i, TimeUnit timeUnit) {
        this.f14566a = eVar;
        this.f14567b = i;
        this.f14568c = timeUnit;
    }

    /* renamed from: I */
    public void mo44285I(@NonNull String str, @NonNull Bundle bundle) {
        CountDownLatch countDownLatch = this.f14570e;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:9|10) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        p222s6.C9511f.m19696f().mo43967d("Interrupted while awaiting app exception callback from Analytics listener.");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x005f */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo43806a(@androidx.annotation.NonNull java.lang.String r6, @androidx.annotation.Nullable android.os.Bundle r7) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f14569d
            monitor-enter(r0)
            s6.f r1 = p222s6.C9511f.m19696f()     // Catch:{ all -> 0x006d }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x006d }
            r2.<init>()     // Catch:{ all -> 0x006d }
            java.lang.String r3 = "Logging event "
            r2.append(r3)     // Catch:{ all -> 0x006d }
            r2.append(r6)     // Catch:{ all -> 0x006d }
            java.lang.String r3 = " to Firebase Analytics with params "
            r2.append(r3)     // Catch:{ all -> 0x006d }
            r2.append(r7)     // Catch:{ all -> 0x006d }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x006d }
            r1.mo43971i(r2)     // Catch:{ all -> 0x006d }
            java.util.concurrent.CountDownLatch r1 = new java.util.concurrent.CountDownLatch     // Catch:{ all -> 0x006d }
            r2 = 1
            r1.<init>(r2)     // Catch:{ all -> 0x006d }
            r5.f14570e = r1     // Catch:{ all -> 0x006d }
            r1 = 0
            r5.f14571f = r1     // Catch:{ all -> 0x006d }
            t6.e r1 = r5.f14566a     // Catch:{ all -> 0x006d }
            r1.mo43806a(r6, r7)     // Catch:{ all -> 0x006d }
            s6.f r6 = p222s6.C9511f.m19696f()     // Catch:{ all -> 0x006d }
            java.lang.String r7 = "Awaiting app exception callback from Analytics..."
            r6.mo43971i(r7)     // Catch:{ all -> 0x006d }
            java.util.concurrent.CountDownLatch r6 = r5.f14570e     // Catch:{ InterruptedException -> 0x005f }
            int r7 = r5.f14567b     // Catch:{ InterruptedException -> 0x005f }
            long r3 = (long) r7     // Catch:{ InterruptedException -> 0x005f }
            java.util.concurrent.TimeUnit r7 = r5.f14568c     // Catch:{ InterruptedException -> 0x005f }
            boolean r6 = r6.await(r3, r7)     // Catch:{ InterruptedException -> 0x005f }
            if (r6 == 0) goto L_0x0055
            r5.f14571f = r2     // Catch:{ InterruptedException -> 0x005f }
            s6.f r6 = p222s6.C9511f.m19696f()     // Catch:{ InterruptedException -> 0x005f }
            java.lang.String r7 = "App exception callback received from Analytics listener."
            r6.mo43971i(r7)     // Catch:{ InterruptedException -> 0x005f }
            goto L_0x0068
        L_0x0055:
            s6.f r6 = p222s6.C9511f.m19696f()     // Catch:{ InterruptedException -> 0x005f }
            java.lang.String r7 = "Timeout exceeded while awaiting app exception callback from Analytics listener."
            r6.mo43973k(r7)     // Catch:{ InterruptedException -> 0x005f }
            goto L_0x0068
        L_0x005f:
            s6.f r6 = p222s6.C9511f.m19696f()     // Catch:{ all -> 0x006d }
            java.lang.String r7 = "Interrupted while awaiting app exception callback from Analytics listener."
            r6.mo43967d(r7)     // Catch:{ all -> 0x006d }
        L_0x0068:
            r6 = 0
            r5.f14570e = r6     // Catch:{ all -> 0x006d }
            monitor-exit(r0)     // Catch:{ all -> 0x006d }
            return
        L_0x006d:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x006d }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p233t6.C9759c.mo43806a(java.lang.String, android.os.Bundle):void");
    }
}
