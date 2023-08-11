package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.e */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
final class C5715e implements Iterator<C5914q> {

    /* renamed from: b */
    private int f6865b = 0;

    /* renamed from: c */
    final /* synthetic */ C5732f f6866c;

    C5715e(C5732f fVar) {
        this.f6866c = fVar;
    }

    public final boolean hasNext() {
        if (this.f6865b < this.f6866c.mo33967t()) {
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        if (this.f6865b < this.f6866c.mo33967t()) {
            C5732f fVar = this.f6866c;
            int i = this.f6865b;
            this.f6865b = i + 1;
            return fVar.mo33969u(i);
        }
        int i2 = this.f6865b;
        StringBuilder sb = new StringBuilder(32);
        sb.append("Out of bounds index: ");
        sb.append(i2);
        throw new NoSuchElementException(sb.toString());
    }
}
