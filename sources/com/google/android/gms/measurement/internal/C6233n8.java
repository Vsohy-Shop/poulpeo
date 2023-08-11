package com.google.android.gms.measurement.internal;

import androidx.annotation.WorkerThread;

/* renamed from: com.google.android.gms.measurement.internal.n8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
final class C6233n8 {

    /* renamed from: a */
    private C6222m8 f8027a;

    /* renamed from: b */
    final /* synthetic */ C6288s8 f8028b;

    C6233n8(C6288s8 s8Var) {
        this.f8028b = s8Var;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: a */
    public final void mo35113a(long j) {
        this.f8027a = new C6222m8(this, this.f8028b.f7899a.mo34922c().mo33547a(), j);
        this.f8028b.f8203c.postDelayed(this.f8027a, 2000);
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: b */
    public final void mo35114b() {
        this.f8028b.mo34778h();
        if (this.f8027a != null) {
            this.f8028b.f8203c.removeCallbacks(this.f8027a);
        }
        this.f8028b.f7899a.mo35184F().f8447q.mo35300a(false);
    }
}
