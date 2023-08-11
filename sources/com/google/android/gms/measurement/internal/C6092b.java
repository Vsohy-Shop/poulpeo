package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Looper;

/* renamed from: com.google.android.gms.measurement.internal.b */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
public final class C6092b {
    C6092b(Context context) {
    }

    /* renamed from: a */
    public static final boolean m10462a() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        return false;
    }
}
