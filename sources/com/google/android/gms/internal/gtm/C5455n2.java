package com.google.android.gms.internal.gtm;

import androidx.annotation.WorkerThread;
import java.util.List;

/* renamed from: com.google.android.gms.internal.gtm.n2 */
final class C5455n2 implements Runnable {

    /* renamed from: b */
    private final C5464nb f6139b;

    /* renamed from: c */
    private final /* synthetic */ C5349g2 f6140c;

    C5455n2(C5349g2 g2Var, C5464nb nbVar) {
        this.f6140c = g2Var;
        this.f6139b = nbVar;
    }

    @WorkerThread
    public final void run() {
        boolean z;
        String str;
        String str2;
        C5299cc c = this.f6139b.mo33385c().mo33431c();
        C5420kc e = this.f6139b.mo33386e();
        if (this.f6140c.f6005l == null) {
            z = true;
        } else {
            z = false;
        }
        C5349g2 g2Var = this.f6140c;
        C5580v3 unused = g2Var.f6005l = g2Var.f5998e.mo33097a(c, e);
        int unused2 = this.f6140c.f6006m = 2;
        String k = this.f6140c.f5995b;
        StringBuilder sb = new StringBuilder(String.valueOf(k).length() + 48);
        sb.append("Container ");
        sb.append(k);
        sb.append(" loaded during runtime initialization.");
        C5426l3.m8133c(sb.toString());
        if (this.f6140c.f6007n != null) {
            for (C5564u2 u2Var : this.f6140c.f6007n) {
                String valueOf = String.valueOf(u2Var.mo33551e());
                if (valueOf.length() != 0) {
                    str2 = "Evaluating tags for pending event ".concat(valueOf);
                } else {
                    str2 = new String("Evaluating tags for pending event ");
                }
                C5426l3.m8133c(str2);
                this.f6140c.f6005l.mo33578g(u2Var);
            }
            List unused3 = this.f6140c.f6007n = null;
        }
        this.f6140c.f6005l.mo33577a();
        String valueOf2 = String.valueOf(this.f6140c.f5995b);
        if (valueOf2.length() != 0) {
            str = "Runtime initialized successfully for container ".concat(valueOf2);
        } else {
            str = new String("Runtime initialized successfully for container ");
        }
        C5426l3.m8133c(str);
        long d = this.f6139b.mo33385c().mo33432d() + this.f6140c.f6004k.mo33445b();
        if (!z || !this.f6140c.f6009p || this.f6139b.mo33384a() != 1 || d >= this.f6140c.f6003j.mo33547a()) {
            C5349g2 g2Var2 = this.f6140c;
            g2Var2.m7973v(Math.max(900000, d - g2Var2.f6003j.mo33547a()));
            return;
        }
        C5349g2 g2Var3 = this.f6140c;
        g2Var3.m7973v(g2Var3.f6004k.mo33449g());
    }
}
