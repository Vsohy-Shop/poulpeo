package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.C4718a;
import com.google.android.gms.common.C4785c;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.rmn.apiclient.impl.api.descriptors.APIResourceDescriptors;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import p086f5.C7599e;
import p086f5.C7600f;
import p180o4.C8970a;
import p231t4.C9713p;
import p275x4.C10393b;

/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
public class AdvertisingIdClient {
    @Nullable

    /* renamed from: a */
    C8970a f4417a;
    @Nullable

    /* renamed from: b */
    C7600f f4418b;

    /* renamed from: c */
    boolean f4419c;

    /* renamed from: d */
    final Object f4420d = new Object();
    @Nullable

    /* renamed from: e */
    C4611b f4421e;

    /* renamed from: f */
    private final Context f4422f;

    /* renamed from: g */
    final long f4423g;

    /* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
    public static final class Info {
        @Nullable

        /* renamed from: a */
        private final String f4424a;

        /* renamed from: b */
        private final boolean f4425b;

        @Deprecated
        public Info(@Nullable String str, boolean z) {
            this.f4424a = str;
            this.f4425b = z;
        }

        @Nullable
        public String getId() {
            return this.f4424a;
        }

        public boolean isLimitAdTrackingEnabled() {
            return this.f4425b;
        }

        @NonNull
        public String toString() {
            String str = this.f4424a;
            boolean z = this.f4425b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z);
            return sb.toString();
        }
    }

    public AdvertisingIdClient(@NonNull Context context, long j, boolean z, boolean z2) {
        Context applicationContext;
        C9713p.m20275j(context);
        if (z && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f4422f = context;
        this.f4419c = false;
        this.f4423g = j;
    }

    /* renamed from: e */
    private final Info m5897e(int i) {
        Info info;
        C9713p.m20274i("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.f4419c) {
                synchronized (this.f4420d) {
                    C4611b bVar = this.f4421e;
                    if (bVar == null || !bVar.f4430e) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    mo31834c(false);
                    if (!this.f4419c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (RemoteException e) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e);
                    throw new IOException("Remote exception");
                } catch (Exception e2) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e2);
                }
            }
            C9713p.m20275j(this.f4417a);
            C9713p.m20275j(this.f4418b);
            info = new Info(this.f4418b.mo41353x(), this.f4418b.mo41352n(true));
        }
        m5898f();
        return info;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:2|3|(3:5|6|7)|8|9|(1:11)|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0011 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0019  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m5898f() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f4420d
            monitor-enter(r0)
            com.google.android.gms.ads.identifier.b r1 = r5.f4421e     // Catch:{ all -> 0x0022 }
            if (r1 == 0) goto L_0x0011
            java.util.concurrent.CountDownLatch r1 = r1.f4429d     // Catch:{ all -> 0x0022 }
            r1.countDown()     // Catch:{ all -> 0x0022 }
            com.google.android.gms.ads.identifier.b r1 = r5.f4421e     // Catch:{ InterruptedException -> 0x0011 }
            r1.join()     // Catch:{ InterruptedException -> 0x0011 }
        L_0x0011:
            long r1 = r5.f4423g     // Catch:{ all -> 0x0022 }
            r3 = 0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x0020
            com.google.android.gms.ads.identifier.b r3 = new com.google.android.gms.ads.identifier.b     // Catch:{ all -> 0x0022 }
            r3.<init>(r5, r1)     // Catch:{ all -> 0x0022 }
            r5.f4421e = r3     // Catch:{ all -> 0x0022 }
        L_0x0020:
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            return
        L_0x0022:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.identifier.AdvertisingIdClient.m5898f():void");
    }

    @NonNull
    public static Info getAdvertisingIdInfo(@NonNull Context context) {
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1, true, false);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            advertisingIdClient.mo31834c(false);
            Info e = advertisingIdClient.m5897e(-1);
            advertisingIdClient.mo31835d(e, true, 0.0f, SystemClock.elapsedRealtime() - elapsedRealtime, "", (Throwable) null);
            advertisingIdClient.mo31833b();
            return e;
        } catch (Throwable th) {
            advertisingIdClient.mo31833b();
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0032, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo31833b() {
        /*
            r3 = this;
            java.lang.String r0 = "Calling this from your main thread can lead to deadlock"
            p231t4.C9713p.m20274i(r0)
            monitor-enter(r3)
            android.content.Context r0 = r3.f4422f     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x0031
            o4.a r0 = r3.f4417a     // Catch:{ all -> 0x0033 }
            if (r0 != 0) goto L_0x000f
            goto L_0x0031
        L_0x000f:
            boolean r0 = r3.f4419c     // Catch:{ all -> 0x001f }
            if (r0 == 0) goto L_0x0027
            x4.b r0 = p275x4.C10393b.m21775b()     // Catch:{ all -> 0x001f }
            android.content.Context r1 = r3.f4422f     // Catch:{ all -> 0x001f }
            o4.a r2 = r3.f4417a     // Catch:{ all -> 0x001f }
            r0.mo45088c(r1, r2)     // Catch:{ all -> 0x001f }
            goto L_0x0027
        L_0x001f:
            r0 = move-exception
            java.lang.String r1 = "AdvertisingIdClient"
            java.lang.String r2 = "AdvertisingIdClient unbindService failed."
            android.util.Log.i(r1, r2, r0)     // Catch:{ all -> 0x0033 }
        L_0x0027:
            r0 = 0
            r3.f4419c = r0     // Catch:{ all -> 0x0033 }
            r0 = 0
            r3.f4418b = r0     // Catch:{ all -> 0x0033 }
            r3.f4417a = r0     // Catch:{ all -> 0x0033 }
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            return
        L_0x0031:
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            return
        L_0x0033:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.identifier.AdvertisingIdClient.mo31833b():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo31834c(boolean z) {
        C9713p.m20274i("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f4419c) {
                mo31833b();
            }
            Context context = this.f4422f;
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                int h = C4718a.m6394f().mo32347h(context, C4785c.f5063a);
                if (h != 0) {
                    if (h != 2) {
                        throw new IOException("Google Play services not available");
                    }
                }
                C8970a aVar = new C8970a();
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                if (C10393b.m21775b().mo45087a(context, intent, aVar, 1)) {
                    this.f4417a = aVar;
                    this.f4418b = C7599e.m14959E(aVar.mo43138a(10000, TimeUnit.MILLISECONDS));
                    this.f4419c = true;
                    if (z) {
                        m5898f();
                    }
                } else {
                    throw new IOException("Connection failure");
                }
            } catch (PackageManager.NameNotFoundException unused) {
                throw new GooglePlayServicesNotAvailableException(9);
            } catch (InterruptedException unused2) {
                throw new IOException("Interrupted exception");
            } catch (Throwable th) {
                throw new IOException(th);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo31835d(@Nullable Info info, boolean z, float f, long j, String str, @Nullable Throwable th) {
        if (Math.random() > 0.0d) {
            return false;
        }
        HashMap hashMap = new HashMap();
        String str2 = "1";
        hashMap.put("app_context", str2);
        if (info != null) {
            if (true != info.isLimitAdTrackingEnabled()) {
                str2 = "0";
            }
            hashMap.put("limit_ad_tracking", str2);
            String id = info.getId();
            if (id != null) {
                hashMap.put("ad_id_size", Integer.toString(id.length()));
            }
        }
        if (th != null) {
            hashMap.put(MediaRouteProviderProtocol.SERVICE_DATA_ERROR, th.getClass().getName());
        }
        hashMap.put(APIResourceDescriptors.RESOURCE_TYPE_TAG, "AdvertisingIdClient");
        hashMap.put("time_spent", Long.toString(j));
        new C4610a(this, hashMap).start();
        return true;
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        mo31833b();
        super.finalize();
    }

    /* renamed from: a */
    public static void m5896a(boolean z) {
    }
}
