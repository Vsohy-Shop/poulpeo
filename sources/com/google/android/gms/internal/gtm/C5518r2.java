package com.google.android.gms.internal.gtm;

import android.util.Log;

/* renamed from: com.google.android.gms.internal.gtm.r2 */
public final class C5518r2 implements C5441m3 {

    /* renamed from: a */
    private boolean f6272a = true;

    /* renamed from: b */
    private int f6273b = 5;

    /* renamed from: g */
    private final boolean m8449g(int i) {
        if (this.f6272a && Log.isLoggable("GoogleTagManager", i)) {
            return true;
        }
        if (this.f6272a || this.f6273b > i) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo33349a(String str) {
        if (m8449g(6)) {
            Log.e("GoogleTagManager", str);
        }
    }

    /* renamed from: b */
    public final void mo33350b(String str) {
        if (m8449g(2)) {
            Log.v("GoogleTagManager", str);
        }
    }

    /* renamed from: c */
    public final void mo33351c(String str) {
        if (m8449g(5)) {
            Log.w("GoogleTagManager", str);
        }
    }

    /* renamed from: d */
    public final void mo33352d(String str, Throwable th) {
        if (m8449g(6)) {
            Log.e("GoogleTagManager", str, th);
        }
    }

    /* renamed from: e */
    public final void mo33353e(String str) {
        if (m8449g(4)) {
            Log.i("GoogleTagManager", str);
        }
    }

    /* renamed from: f */
    public final void mo33354f(String str, Throwable th) {
        if (m8449g(5)) {
            Log.w("GoogleTagManager", str, th);
        }
    }
}
