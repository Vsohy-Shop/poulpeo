package com.google.android.gms.measurement.internal;

import androidx.annotation.WorkerThread;

/* renamed from: com.google.android.gms.measurement.internal.y3 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
abstract class C6349y3 extends C6107c3 {

    /* renamed from: b */
    private boolean f8407b;

    C6349y3(C6251p4 p4Var) {
        super(p4Var);
        this.f7899a.mo35198i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo35413i() {
        if (!mo35416m()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: j */
    public final void mo35414j() {
        if (this.f8407b) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!mo34789n()) {
            this.f7899a.mo35196g();
            this.f8407b = true;
        }
    }

    /* renamed from: k */
    public final void mo35415k() {
        if (!this.f8407b) {
            mo34805l();
            this.f7899a.mo35196g();
            this.f8407b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final boolean mo35416m() {
        if (this.f8407b) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public abstract boolean mo34789n();

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: l */
    public void mo34805l() {
    }
}
