package com.google.android.gms.ads.identifier;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.ads.identifier.b */
/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
final class C4611b extends Thread {

    /* renamed from: b */
    private final WeakReference<AdvertisingIdClient> f4427b;

    /* renamed from: c */
    private final long f4428c;

    /* renamed from: d */
    final CountDownLatch f4429d = new CountDownLatch(1);

    /* renamed from: e */
    boolean f4430e = false;

    public C4611b(AdvertisingIdClient advertisingIdClient, long j) {
        this.f4427b = new WeakReference<>(advertisingIdClient);
        this.f4428c = j;
        start();
    }

    /* renamed from: a */
    private final void m5902a() {
        AdvertisingIdClient advertisingIdClient = this.f4427b.get();
        if (advertisingIdClient != null) {
            advertisingIdClient.mo31833b();
            this.f4430e = true;
        }
    }

    public final void run() {
        try {
            if (!this.f4429d.await(this.f4428c, TimeUnit.MILLISECONDS)) {
                m5902a();
            }
        } catch (InterruptedException unused) {
            m5902a();
        }
    }
}
