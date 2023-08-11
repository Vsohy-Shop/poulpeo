package com.google.android.gms.internal.cast;

import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.cast.nf */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
final class C5051nf implements ListIterator {

    /* renamed from: b */
    final ListIterator f5426b;

    /* renamed from: c */
    final /* synthetic */ int f5427c;

    /* renamed from: d */
    final /* synthetic */ C5102qf f5428d;

    C5051nf(C5102qf qfVar, int i) {
        this.f5428d = qfVar;
        this.f5427c = i;
        this.f5426b = qfVar.f5492b.listIterator(i);
    }

    public final /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.f5426b.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f5426b.hasPrevious();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f5426b.next();
    }

    public final int nextIndex() {
        return this.f5426b.nextIndex();
    }

    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.f5426b.previous();
    }

    public final int previousIndex() {
        return this.f5426b.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }
}
