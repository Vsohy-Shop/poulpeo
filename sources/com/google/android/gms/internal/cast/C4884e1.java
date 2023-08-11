package com.google.android.gms.internal.cast;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.cast.e1 */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
final class C4884e1 extends C5088q1 {

    /* renamed from: b */
    boolean f5201b;

    /* renamed from: c */
    final /* synthetic */ Object f5202c;

    C4884e1(Object obj) {
        this.f5202c = obj;
    }

    public final boolean hasNext() {
        if (!this.f5201b) {
            return true;
        }
        return false;
    }

    public final Object next() {
        if (!this.f5201b) {
            this.f5201b = true;
            return this.f5202c;
        }
        throw new NoSuchElementException();
    }
}
