package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.t */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
final class C5962t implements Iterator<C5914q> {

    /* renamed from: b */
    private int f7384b = 0;

    /* renamed from: c */
    final /* synthetic */ C5978u f7385c;

    C5962t(C5978u uVar) {
        this.f7385c = uVar;
    }

    public final boolean hasNext() {
        if (this.f7384b < this.f7385c.f7404b.length()) {
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        if (this.f7384b < this.f7385c.f7404b.length()) {
            String j = this.f7385c.f7404b;
            int i = this.f7384b;
            this.f7384b = i + 1;
            return new C5978u(String.valueOf(j.charAt(i)));
        }
        throw new NoSuchElementException();
    }
}
