package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.x8 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
abstract class C6343x8 extends C6332w8 {

    /* renamed from: c */
    private boolean f8400c;

    C6343x8(C6157g9 g9Var) {
        super(g9Var);
        this.f8374b.mo34943q();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo35406i() {
        if (!mo35408k()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: j */
    public final void mo35407j() {
        if (!this.f8400c) {
            mo34749l();
            this.f8374b.mo34938l();
            this.f8400c = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final boolean mo35408k() {
        if (this.f8400c) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract boolean mo34749l();
}
