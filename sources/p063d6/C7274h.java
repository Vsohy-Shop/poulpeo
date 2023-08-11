package p063d6;

import android.os.RemoteException;
import p024a6.C2208a;
import p037b6.C2902f;
import p099g6.C7790l;

/* renamed from: d6.h */
final class C7274h extends C2902f {

    /* renamed from: c */
    final /* synthetic */ C7790l f10002c;

    /* renamed from: d */
    final /* synthetic */ C7277k f10003d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C7274h(C7277k kVar, C7790l lVar, C7790l lVar2) {
        super(lVar);
        this.f10003d = kVar;
        this.f10002c = lVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo28426a() {
        try {
            this.f10003d.f10008a.mo28461f().mo28417k0(this.f10003d.f10009b, C2208a.m1807a(), new C7276j(this.f10003d, this.f10002c));
        } catch (RemoteException e) {
            C7277k.f10007c.mo28422d(e, "error requesting in-app review for %s", this.f10003d.f10009b);
            this.f10002c.mo41437d(new RuntimeException(e));
        }
    }
}
