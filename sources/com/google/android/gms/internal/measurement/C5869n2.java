package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.n2 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.0.0 */
abstract class C5869n2 implements Runnable {

    /* renamed from: b */
    final long f7144b;

    /* renamed from: c */
    final long f7145c;

    /* renamed from: d */
    final boolean f7146d;

    /* renamed from: e */
    final /* synthetic */ C6061z2 f7147e;

    C5869n2(C6061z2 z2Var, boolean z) {
        this.f7147e = z2Var;
        this.f7144b = z2Var.f7506b.mo33547a();
        this.f7145c = z2Var.f7506b.mo33548b();
        this.f7146d = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo33644a();

    public final void run() {
        if (this.f7147e.f7511g) {
            mo33645b();
            return;
        }
        try {
            mo33644a();
        } catch (Exception e) {
            this.f7147e.m10341m(e, false, this.f7146d);
            mo33645b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo33645b() {
    }
}
