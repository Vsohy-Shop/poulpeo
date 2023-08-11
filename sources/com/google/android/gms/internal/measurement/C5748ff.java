package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.measurement.ff */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
public final class C5748ff extends C5800j {

    /* renamed from: d */
    private final Callable<Object> f6950d;

    public C5748ff(String str, Callable<Object> callable) {
        super("internal.appMetadata");
        this.f6950d = callable;
    }

    /* renamed from: a */
    public final C5914q mo33875a(C6015w4 w4Var, List<C5914q> list) {
        try {
            return C6049y6.m10304b(this.f6950d.call());
        } catch (Exception unused) {
            return C5914q.f7289O;
        }
    }
}
