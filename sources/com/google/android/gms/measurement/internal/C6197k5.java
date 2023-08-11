package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.k5 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
abstract class C6197k5 extends C6186j5 {

    /* renamed from: b */
    private boolean f7919b;

    C6197k5(C6251p4 p4Var) {
        super(p4Var);
        this.f7899a.mo35198i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract boolean mo35061j();

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo35062k() {
        if (!mo35065n()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: l */
    public final void mo35063l() {
        if (this.f7919b) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!mo35061j()) {
            this.f7899a.mo35196g();
            this.f7919b = true;
        }
    }

    /* renamed from: m */
    public final void mo35064m() {
        if (!this.f7919b) {
            mo35060i();
            this.f7899a.mo35196g();
            this.f7919b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final boolean mo35065n() {
        if (this.f7919b) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo35060i() {
    }
}
