package com.google.android.gms.internal.cast;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.cast.ac */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
final class C4823ac extends C4859cc {

    /* renamed from: b */
    private int f5117b = 0;

    /* renamed from: c */
    private final int f5118c;

    /* renamed from: d */
    final /* synthetic */ C4980jc f5119d;

    C4823ac(C4980jc jcVar) {
        this.f5119d = jcVar;
        this.f5118c = jcVar.mo32730j();
    }

    public final boolean hasNext() {
        if (this.f5117b < this.f5118c) {
            return true;
        }
        return false;
    }

    public final byte zza() {
        int i = this.f5117b;
        if (i < this.f5118c) {
            this.f5117b = i + 1;
            return this.f5119d.mo32729d(i);
        }
        throw new NoSuchElementException();
    }
}
