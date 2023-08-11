package com.google.android.gms.internal.cast;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.cast.pf */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
final class C5085pf implements Iterator {

    /* renamed from: b */
    final Iterator f5475b;

    /* renamed from: c */
    final /* synthetic */ C5102qf f5476c;

    C5085pf(C5102qf qfVar) {
        this.f5476c = qfVar;
        this.f5475b = qfVar.f5492b.iterator();
    }

    public final boolean hasNext() {
        return this.f5475b.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f5475b.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
