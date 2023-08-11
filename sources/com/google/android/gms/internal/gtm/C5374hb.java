package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.gtm.hb */
final class C5374hb<T> {

    /* renamed from: a */
    private Status f6033a;

    /* renamed from: b */
    private T f6034b;

    /* renamed from: c */
    private long f6035c;

    public C5374hb(Status status, T t, long j) {
        this.f6033a = status;
        this.f6034b = t;
        this.f6035c = j;
    }

    /* renamed from: a */
    public final void mo33236a(Status status) {
        this.f6033a = status;
    }

    /* renamed from: b */
    public final long mo33237b() {
        return this.f6035c;
    }

    /* renamed from: c */
    public final void mo33238c(long j) {
        this.f6035c = j;
    }

    /* renamed from: d */
    public final void mo33239d(T t) {
        this.f6034b = t;
    }
}
