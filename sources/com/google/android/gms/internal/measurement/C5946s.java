package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.s */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
final class C5946s implements Iterator<C5914q> {

    /* renamed from: b */
    private int f7338b = 0;

    /* renamed from: c */
    final /* synthetic */ C5978u f7339c;

    C5946s(C5978u uVar) {
        this.f7339c = uVar;
    }

    public final boolean hasNext() {
        if (this.f7338b < this.f7339c.f7404b.length()) {
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        if (this.f7338b < this.f7339c.f7404b.length()) {
            int i = this.f7338b;
            this.f7338b = i + 1;
            return new C5978u(String.valueOf(i));
        }
        throw new NoSuchElementException();
    }
}
