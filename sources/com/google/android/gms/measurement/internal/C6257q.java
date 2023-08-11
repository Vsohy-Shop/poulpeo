package com.google.android.gms.measurement.internal;

import java.util.Iterator;

/* renamed from: com.google.android.gms.measurement.internal.q */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
final class C6257q implements Iterator<String> {

    /* renamed from: b */
    final Iterator<String> f8130b;

    /* renamed from: c */
    final /* synthetic */ C6268r f8131c;

    C6257q(C6268r rVar) {
        this.f8131c = rVar;
        this.f8130b = rVar.f8162b.keySet().iterator();
    }

    /* renamed from: a */
    public final String next() {
        return this.f8130b.next();
    }

    public final boolean hasNext() {
        return this.f8130b.hasNext();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
