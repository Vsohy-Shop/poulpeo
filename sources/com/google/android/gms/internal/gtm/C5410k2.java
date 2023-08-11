package com.google.android.gms.internal.gtm;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.k2 */
final class C5410k2 implements C5343fb, Runnable {

    /* renamed from: b */
    private final /* synthetic */ C5349g2 f6082b;

    private C5410k2(C5349g2 g2Var) {
        this.f6082b = g2Var;
    }

    /* renamed from: a */
    public final void mo33211a(C5464nb nbVar) {
        if (nbVar.getStatus() == Status.f4889g) {
            this.f6082b.f6000g.execute(new C5455n2(this.f6082b, nbVar));
        } else {
            this.f6082b.f6000g.execute(new C5395j2(this.f6082b, (C5365h2) null));
        }
    }

    @WorkerThread
    public final void run() {
        boolean z = true;
        if (this.f6082b.f6006m != 1) {
            z = false;
        }
        C9713p.m20278m(z);
        ArrayList arrayList = new ArrayList();
        boolean unused = this.f6082b.f6009p = false;
        if (C5549t3.m8514e().mo33534d(this.f6082b.f5995b)) {
            arrayList.add(0);
        } else {
            C5349g2 g2Var = this.f6082b;
            boolean unused2 = g2Var.f6009p = g2Var.f6004k.mo33450h();
            if (!this.f6082b.f6009p) {
                arrayList.add(0);
                arrayList.add(1);
            } else {
                arrayList.add(1);
                arrayList.add(0);
            }
            arrayList.add(2);
        }
        this.f6082b.f5999f.mo33193d(this.f6082b.f5995b, this.f6082b.f5997d, this.f6082b.f5996c, arrayList, this, this.f6082b.f6004k);
    }

    /* synthetic */ C5410k2(C5349g2 g2Var, C5365h2 h2Var) {
        this(g2Var);
    }
}
