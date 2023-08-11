package com.google.android.gms.internal.gtm;

/* renamed from: com.google.android.gms.internal.gtm.p3 */
final class C5489p3 implements C5442m4 {

    /* renamed from: a */
    private final /* synthetic */ C5471o3 f6234a;

    C5489p3(C5471o3 o3Var) {
        this.f6234a = o3Var;
    }

    /* renamed from: a */
    public final void mo33355a(C5608x2 x2Var) {
        this.f6234a.m8280m(x2Var.mo33610e());
        long e = x2Var.mo33610e();
        StringBuilder sb = new StringBuilder(57);
        sb.append("Permanent failure dispatching hitId: ");
        sb.append(e);
        C5426l3.m8133c(sb.toString());
    }

    /* renamed from: b */
    public final void mo33356b(C5608x2 x2Var) {
        this.f6234a.m8280m(x2Var.mo33610e());
    }

    /* renamed from: c */
    public final void mo33357c(C5608x2 x2Var) {
        long f = x2Var.mo33611f();
        if (f == 0) {
            this.f6234a.m8277i(x2Var.mo33610e(), this.f6234a.f6190g.mo33547a());
        } else if (f + 14400000 < this.f6234a.f6190g.mo33547a()) {
            this.f6234a.m8280m(x2Var.mo33610e());
            long e = x2Var.mo33610e();
            StringBuilder sb = new StringBuilder(47);
            sb.append("Giving up on failed hitId: ");
            sb.append(e);
            C5426l3.m8133c(sb.toString());
        }
    }
}
