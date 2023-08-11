package com.google.android.gms.internal.gtm;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.gtm.zc */
final class C5646zc implements Iterator<C5528rc<?>> {

    /* renamed from: b */
    private int f6762b = 0;

    /* renamed from: c */
    private final /* synthetic */ C5632yc f6763c;

    C5646zc(C5632yc ycVar) {
        this.f6763c = ycVar;
    }

    public final boolean hasNext() {
        for (int i = this.f6762b; i < this.f6763c.f6742b.size(); i++) {
            if (this.f6763c.f6742b.get(i) != null) {
                return true;
            }
        }
        return false;
    }

    public final /* synthetic */ Object next() {
        if (this.f6762b < this.f6763c.f6742b.size()) {
            for (int i = this.f6762b; i < this.f6763c.f6742b.size(); i++) {
                if (this.f6763c.f6742b.get(i) != null) {
                    this.f6762b = i;
                    int i2 = this.f6762b;
                    this.f6762b = i2 + 1;
                    return new C5589vc(Double.valueOf((double) i2));
                }
            }
            throw new NoSuchElementException();
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
