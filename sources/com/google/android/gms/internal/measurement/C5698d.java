package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.d */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
final class C5698d implements Iterator<C5914q> {

    /* renamed from: b */
    final /* synthetic */ Iterator f6841b;

    /* renamed from: c */
    final /* synthetic */ Iterator f6842c;

    C5698d(C5732f fVar, Iterator it, Iterator it2) {
        this.f6841b = it;
        this.f6842c = it2;
    }

    public final boolean hasNext() {
        if (this.f6841b.hasNext()) {
            return true;
        }
        return this.f6842c.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        if (this.f6841b.hasNext()) {
            return new C5978u(((Integer) this.f6841b.next()).toString());
        }
        if (this.f6842c.hasNext()) {
            return new C5978u((String) this.f6842c.next());
        }
        throw new NoSuchElementException();
    }
}
