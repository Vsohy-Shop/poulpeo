package com.google.android.gms.internal.measurement;

import android.os.Binder;

/* renamed from: com.google.android.gms.internal.measurement.a6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
public final /* synthetic */ class C5654a6 {
    /* renamed from: a */
    public static <V> V m8760a(C5671b6<V> b6Var) {
        long clearCallingIdentity;
        try {
            return b6Var.zza();
        } catch (SecurityException unused) {
            clearCallingIdentity = Binder.clearCallingIdentity();
            V zza = b6Var.zza();
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return zza;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }
}
