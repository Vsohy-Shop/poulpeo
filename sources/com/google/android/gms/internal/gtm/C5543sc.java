package com.google.android.gms.internal.gtm;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.gtm.sc */
final class C5543sc implements Iterator<C5528rc<?>> {

    /* renamed from: b */
    private final /* synthetic */ Iterator f6312b;

    C5543sc(C5528rc rcVar, Iterator it) {
        this.f6312b = it;
    }

    public final boolean hasNext() {
        return this.f6312b.hasNext();
    }

    public final /* synthetic */ Object next() {
        return new C5315dd((String) this.f6312b.next());
    }

    public final void remove() {
        this.f6312b.remove();
    }
}
