package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.annotation.WorkerThread;
import com.google.android.gms.internal.measurement.C5678bd;

/* renamed from: com.google.android.gms.measurement.internal.q8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
final class C6266q8 {

    /* renamed from: a */
    protected long f8156a;

    /* renamed from: b */
    protected long f8157b;

    /* renamed from: c */
    private final C6213m f8158c;

    /* renamed from: d */
    final /* synthetic */ C6288s8 f8159d;

    public C6266q8(C6288s8 s8Var) {
        this.f8159d = s8Var;
        this.f8158c = new C6255p8(this, s8Var.f7899a);
        long b = s8Var.f7899a.mo34922c().mo33548b();
        this.f8156a = b;
        this.f8157b = b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo35264a() {
        this.f8158c.mo35088b();
        this.f8156a = 0;
        this.f8157b = 0;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: b */
    public final void mo35265b(long j) {
        this.f8158c.mo35088b();
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: c */
    public final void mo35266c(long j) {
        this.f8159d.mo34778h();
        this.f8158c.mo35088b();
        this.f8156a = j;
        this.f8157b = j;
    }

    @WorkerThread
    /* renamed from: d */
    public final boolean mo35267d(boolean z, boolean z2, long j) {
        this.f8159d.mo34778h();
        this.f8159d.mo35413i();
        C5678bd.m8845b();
        if (!this.f8159d.f7899a.mo35211z().mo34873B((String) null, C6084a3.f7589k0)) {
            this.f8159d.f7899a.mo35184F().f8445o.mo35385b(this.f8159d.f7899a.mo34922c().mo33547a());
        } else if (this.f8159d.f7899a.mo35204o()) {
            this.f8159d.f7899a.mo35184F().f8445o.mo35385b(this.f8159d.f7899a.mo34922c().mo33547a());
        }
        long j2 = j - this.f8156a;
        if (z || j2 >= 1000) {
            if (!z2) {
                j2 = j - this.f8157b;
                this.f8157b = j;
            }
            this.f8159d.f7899a.mo34920b().mo35079v().mo35038b("Recording user engagement, ms", Long.valueOf(j2));
            Bundle bundle = new Bundle();
            bundle.putLong("_et", j2);
            C6234n9.m10936x(this.f8159d.f7899a.mo35188K().mo34791t(!this.f8159d.f7899a.mo35211z().mo34875D()), bundle, true);
            C6147g z3 = this.f8159d.f7899a.mo35211z();
            C6359z2<Boolean> z2Var = C6084a3.f7563V;
            if (!z3.mo34873B((String) null, z2Var) && z2) {
                bundle.putLong("_fr", 1);
            }
            if (!this.f8159d.f7899a.mo35211z().mo34873B((String) null, z2Var) || !z2) {
                this.f8159d.f7899a.mo35186I().mo35257u("auto", "_e", bundle);
            }
            this.f8156a = j;
            this.f8158c.mo35088b();
            this.f8158c.mo35090d(3600000);
            return true;
        }
        this.f8159d.f7899a.mo34920b().mo35079v().mo35038b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j2));
        return false;
    }
}
