package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.bb */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
final class C5676bb implements Iterator<String> {

    /* renamed from: b */
    final Iterator<String> f6805b;

    /* renamed from: c */
    final /* synthetic */ C5693cb f6806c;

    C5676bb(C5693cb cbVar) {
        this.f6806c = cbVar;
        this.f6805b = cbVar.f6833b.iterator();
    }

    public final boolean hasNext() {
        return this.f6805b.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return this.f6805b.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
