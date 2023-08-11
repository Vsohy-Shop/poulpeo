package com.google.android.gms.common.api.internal;

import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.C4719a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C4742b;
import p190p4.C9056e;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.common.api.internal.e0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C4750e0<A extends C4742b<? extends C9056e, C4719a.C4721b>> extends C4760i0 {

    /* renamed from: b */
    protected final A f4973b;

    public C4750e0(int i, A a) {
        super(i);
        this.f4973b = (C4742b) C9713p.m20276k(a, "Null methods are not runnable.");
    }

    /* renamed from: a */
    public final void mo32491a(@NonNull Status status) {
        try {
            this.f4973b.mo32474t(status);
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    /* renamed from: b */
    public final void mo32492b(@NonNull Exception exc) {
        String simpleName = exc.getClass().getSimpleName();
        String localizedMessage = exc.getLocalizedMessage();
        StringBuilder sb = new StringBuilder(simpleName.length() + 2 + String.valueOf(localizedMessage).length());
        sb.append(simpleName);
        sb.append(": ");
        sb.append(localizedMessage);
        try {
            this.f4973b.mo32474t(new Status(10, sb.toString()));
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    /* renamed from: c */
    public final void mo32493c(C4777t<?> tVar) {
        try {
            this.f4973b.mo32473r(tVar.mo32565s());
        } catch (RuntimeException e) {
            mo32492b(e);
        }
    }

    /* renamed from: d */
    public final void mo32499d(@NonNull C4765l lVar, boolean z) {
        lVar.mo32527c(this.f4973b, z);
    }
}
