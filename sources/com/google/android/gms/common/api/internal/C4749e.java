package com.google.android.gms.common.api.internal;

import android.os.Looper;
import androidx.annotation.NonNull;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.common.api.internal.e */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class C4749e {
    @NonNull
    /* renamed from: a */
    public static <L> C4746d<L> m6546a(@NonNull L l, @NonNull Looper looper, @NonNull String str) {
        C9713p.m20276k(l, "Listener must not be null");
        C9713p.m20276k(looper, "Looper must not be null");
        C9713p.m20276k(str, "Listener type must not be null");
        return new C4746d<>(looper, l, str);
    }
}
