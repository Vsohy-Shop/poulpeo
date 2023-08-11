package com.google.android.gms.internal.cast;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.cast.qf */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class C5102qf extends AbstractList implements RandomAccess, C5117rd {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C5117rd f5492b;

    public C5102qf(C5117rd rdVar) {
        this.f5492b = rdVar;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((C5100qd) this.f5492b).get(i);
    }

    /* renamed from: i */
    public final Object mo32981i(int i) {
        return this.f5492b.mo32981i(i);
    }

    public final Iterator iterator() {
        return new C5085pf(this);
    }

    public final ListIterator listIterator(int i) {
        return new C5051nf(this, i);
    }

    public final int size() {
        return this.f5492b.size();
    }

    /* renamed from: y */
    public final List mo32984y() {
        return this.f5492b.mo32984y();
    }

    /* renamed from: c */
    public final C5117rd mo32977c() {
        return this;
    }
}
