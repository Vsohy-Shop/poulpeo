package com.google.android.gms.internal.measurement;

import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.measurement.ab */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
final class C5659ab implements ListIterator<String> {

    /* renamed from: b */
    final ListIterator<String> f6768b;

    /* renamed from: c */
    final /* synthetic */ int f6769c;

    /* renamed from: d */
    final /* synthetic */ C5693cb f6770d;

    C5659ab(C5693cb cbVar, int i) {
        this.f6770d = cbVar;
        this.f6769c = i;
        this.f6768b = cbVar.f6833b.listIterator(i);
    }

    public final /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.f6768b.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f6768b.hasPrevious();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return this.f6768b.next();
    }

    public final int nextIndex() {
        return this.f6768b.nextIndex();
    }

    public final /* bridge */ /* synthetic */ Object previous() {
        return this.f6768b.previous();
    }

    public final int previousIndex() {
        return this.f6768b.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }
}
