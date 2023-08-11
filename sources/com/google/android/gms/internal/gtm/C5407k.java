package com.google.android.gms.internal.gtm;

/* renamed from: com.google.android.gms.internal.gtm.k */
public abstract class C5407k extends C5392j {

    /* renamed from: c */
    private boolean f6074c;

    protected C5407k(C5437m mVar) {
        super(mVar);
    }

    /* renamed from: N0 */
    public final boolean mo33308N0() {
        if (this.f6074c) {
            return true;
        }
        return false;
    }

    /* renamed from: O0 */
    public final void mo33309O0() {
        mo33181P0();
        this.f6074c = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: P0 */
    public abstract void mo33181P0();

    /* access modifiers changed from: protected */
    /* renamed from: Q0 */
    public final void mo33310Q0() {
        if (!mo33308N0()) {
            throw new IllegalStateException("Not initialized");
        }
    }
}
