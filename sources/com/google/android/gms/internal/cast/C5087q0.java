package com.google.android.gms.internal.cast;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.cast.q0 */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
abstract class C5087q0 extends C5105r1 {

    /* renamed from: b */
    private final int f5479b;

    /* renamed from: c */
    private int f5480c;

    protected C5087q0(int i, int i2) {
        C5053o0.m7295b(i2, i, "index");
        this.f5479b = i;
        this.f5480c = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo32964a(int i);

    public final boolean hasNext() {
        if (this.f5480c < this.f5479b) {
            return true;
        }
        return false;
    }

    public final boolean hasPrevious() {
        if (this.f5480c > 0) {
            return true;
        }
        return false;
    }

    public final Object next() {
        if (hasNext()) {
            int i = this.f5480c;
            this.f5480c = i + 1;
            return mo32964a(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f5480c;
    }

    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f5480c - 1;
            this.f5480c = i;
            return mo32964a(i);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f5480c - 1;
    }
}
