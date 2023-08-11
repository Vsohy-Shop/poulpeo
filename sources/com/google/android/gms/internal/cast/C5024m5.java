package com.google.android.gms.internal.cast;

import p109h4.C7939i;
import p120i4.C8164s;

/* renamed from: com.google.android.gms.internal.cast.m5 */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
public final class C5024m5 extends C8164s {

    /* renamed from: a */
    final /* synthetic */ C5042n6 f5361a;

    public C5024m5(C5042n6 n6Var) {
        this.f5361a = n6Var;
    }

    /* renamed from: a */
    public final void mo32890a(int i, int i2) {
        C5042n6.f5395k.mo42754a("onTransferFailed with type = %d and reason = %d", Integer.valueOf(i), Integer.valueOf(i2));
        this.f5361a.m7273u();
        C5042n6 n6Var = this.f5361a;
        this.f5361a.f5396a.mo32841d(n6Var.f5397b.mo32954f(n6Var.f5402g, i, i2), 232);
        this.f5361a.f5405j = false;
    }

    /* renamed from: b */
    public final void mo32891b(int i, C7939i iVar) {
        C5042n6.f5395k.mo42754a("onTransferred with type = %d", Integer.valueOf(i));
        this.f5361a.m7273u();
        C5042n6 n6Var = this.f5361a;
        this.f5361a.f5396a.mo32841d(n6Var.f5397b.mo32955g(n6Var.f5402g, i), 231);
        this.f5361a.f5405j = false;
        this.f5361a.f5402g = null;
    }

    /* renamed from: c */
    public final void mo32892c(int i) {
        C5042n6.f5395k.mo42754a("onTransferring with type = %d", Integer.valueOf(i));
        this.f5361a.f5405j = true;
        this.f5361a.m7273u();
        C5042n6 n6Var = this.f5361a;
        this.f5361a.f5396a.mo32841d(n6Var.f5397b.mo32955g(n6Var.f5402g, i), 230);
    }
}
