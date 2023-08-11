package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.measurement.b1 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
public final class C5666b1 extends C5768h1 {

    /* renamed from: a */
    private final AtomicReference<Bundle> f6781a = new AtomicReference<>();

    /* renamed from: b */
    private boolean f6782b;

    /* renamed from: b3 */
    public static final <T> T m8783b3(Bundle bundle, Class<T> cls) {
        Object obj;
        if (bundle == null || (obj = bundle.get("r")) == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e) {
            Log.w("AM", String.format("Unexpected object type. Expected, Received: %s, %s", new Object[]{cls.getCanonicalName(), obj.getClass().getCanonicalName()}), e);
            throw e;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:5|6|7|8|9) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x000d */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle mo33689G(long r3) {
        /*
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<android.os.Bundle> r0 = r2.f6781a
            monitor-enter(r0)
            boolean r1 = r2.f6782b     // Catch:{ all -> 0x001a }
            if (r1 != 0) goto L_0x0010
            java.util.concurrent.atomic.AtomicReference<android.os.Bundle> r1 = r2.f6781a     // Catch:{ InterruptedException -> 0x000d }
            r1.wait(r3)     // Catch:{ InterruptedException -> 0x000d }
            goto L_0x0010
        L_0x000d:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            r3 = 0
            return r3
        L_0x0010:
            java.util.concurrent.atomic.AtomicReference<android.os.Bundle> r3 = r2.f6781a     // Catch:{ all -> 0x001a }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x001a }
            android.os.Bundle r3 = (android.os.Bundle) r3     // Catch:{ all -> 0x001a }
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return r3
        L_0x001a:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C5666b1.mo33689G(long):android.os.Bundle");
    }

    /* renamed from: J */
    public final String mo33690J(long j) {
        return (String) m8783b3(mo33689G(j), String.class);
    }

    /* renamed from: r */
    public final void mo33691r(Bundle bundle) {
        synchronized (this.f6781a) {
            try {
                this.f6781a.set(bundle);
                this.f6782b = true;
                this.f6781a.notify();
            } catch (Throwable th) {
                this.f6781a.notify();
                throw th;
            }
        }
    }
}
