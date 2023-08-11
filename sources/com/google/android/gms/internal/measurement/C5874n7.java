package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.n7 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
final class C5874n7 extends C5922q7 {

    /* renamed from: b */
    private int f7148b = 0;

    /* renamed from: c */
    private final int f7149c;

    /* renamed from: d */
    final /* synthetic */ C6018w7 f7150d;

    C5874n7(C6018w7 w7Var) {
        this.f7150d = w7Var;
        this.f7149c = w7Var.mo34319j();
    }

    public final boolean hasNext() {
        if (this.f7148b < this.f7149c) {
            return true;
        }
        return false;
    }

    public final byte zza() {
        int i = this.f7148b;
        if (i < this.f7149c) {
            this.f7148b = i + 1;
            return this.f7150d.mo34318d(i);
        }
        throw new NoSuchElementException();
    }
}
