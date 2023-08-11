package com.google.android.gms.internal.gtm;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.m2 */
final class C5440m2 implements C5343fb, Runnable {

    /* renamed from: b */
    private final /* synthetic */ C5349g2 f6126b;

    private C5440m2(C5349g2 g2Var) {
        this.f6126b = g2Var;
    }

    /* renamed from: a */
    public final void mo33211a(C5464nb nbVar) {
        if (nbVar.getStatus() == Status.f4889g) {
            String k = this.f6126b.f5995b;
            StringBuilder sb = new StringBuilder(String.valueOf(k).length() + 47);
            sb.append("Refreshed container ");
            sb.append(k);
            sb.append(". Reinitializing runtime...");
            C5426l3.m8133c(sb.toString());
            this.f6126b.f6000g.execute(new C5455n2(this.f6126b, nbVar));
            return;
        }
        C5349g2 g2Var = this.f6126b;
        g2Var.m7973v(g2Var.f6004k.mo33446c());
    }

    @WorkerThread
    public final void run() {
        boolean z;
        if (this.f6126b.f6006m == 2) {
            z = true;
        } else {
            z = false;
        }
        C9713p.m20278m(z);
        if (!C5549t3.m8514e().mo33534d(this.f6126b.f5995b)) {
            String k = this.f6126b.f5995b;
            StringBuilder sb = new StringBuilder(String.valueOf(k).length() + 24);
            sb.append("Refreshing container ");
            sb.append(k);
            sb.append("...");
            C5426l3.m8133c(sb.toString());
            ArrayList arrayList = new ArrayList();
            arrayList.add(0);
            this.f6126b.f5999f.mo33193d(this.f6126b.f5995b, this.f6126b.f5997d, this.f6126b.f5996c, arrayList, this, this.f6126b.f6004k);
        }
    }

    /* synthetic */ C5440m2(C5349g2 g2Var, C5365h2 h2Var) {
        this(g2Var);
    }
}
