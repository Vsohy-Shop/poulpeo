package com.google.android.gms.internal.gtm;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.gtm.ed */
final class C5330ed implements Iterator<C5528rc<?>> {

    /* renamed from: b */
    private int f5981b = 0;

    /* renamed from: c */
    private final /* synthetic */ C5315dd f5982c;

    C5330ed(C5315dd ddVar) {
        this.f5982c = ddVar;
    }

    public final boolean hasNext() {
        if (this.f5981b < this.f5982c.f5934b.length()) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ Object next() {
        if (this.f5981b < this.f5982c.f5934b.length()) {
            int i = this.f5981b;
            this.f5981b = i + 1;
            return new C5589vc(Double.valueOf((double) i));
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
