package p063d6;

import android.app.PendingIntent;
import android.os.Bundle;
import p037b6.C2900e;
import p099g6.C7790l;

/* renamed from: d6.j */
final class C7276j extends C7275i<C7267a> {
    C7276j(C7277k kVar, C7790l lVar) {
        super(kVar, new C2900e("OnRequestInstallCallback"), lVar);
    }

    /* renamed from: b */
    public final void mo28420b(Bundle bundle) {
        super.mo28420b(bundle);
        this.f10005b.mo41438e(C7267a.m14096b((PendingIntent) bundle.get("confirmation_intent")));
    }
}
