package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.l */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
final class C5834l implements Iterator<C5914q> {

    /* renamed from: b */
    final /* synthetic */ Iterator f7040b;

    C5834l(Iterator it) {
        this.f7040b = it;
    }

    public final boolean hasNext() {
        return this.f7040b.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return new C5978u((String) this.f7040b.next());
    }
}
