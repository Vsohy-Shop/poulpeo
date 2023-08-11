package com.google.android.gms.internal.gtm;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.gtm.ad */
final class C5270ad implements Iterator<C5528rc<?>> {

    /* renamed from: b */
    private final /* synthetic */ Iterator f5832b;

    /* renamed from: c */
    private final /* synthetic */ Iterator f5833c;

    C5270ad(C5632yc ycVar, Iterator it, Iterator it2) {
        this.f5832b = it;
        this.f5833c = it2;
    }

    public final boolean hasNext() {
        if (this.f5832b.hasNext() || this.f5833c.hasNext()) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ Object next() {
        if (this.f5832b.hasNext()) {
            return (C5528rc) this.f5832b.next();
        }
        return (C5528rc) this.f5833c.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
