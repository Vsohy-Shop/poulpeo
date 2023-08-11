package com.google.android.gms.internal.gtm;

import android.os.RemoteException;
import androidx.annotation.WorkerThread;
import java.util.List;

/* renamed from: com.google.android.gms.internal.gtm.j2 */
final class C5395j2 implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ C5349g2 f6059b;

    private C5395j2(C5349g2 g2Var) {
        this.f6059b = g2Var;
    }

    @WorkerThread
    public final void run() {
        int unused = this.f6059b.f6006m = 3;
        String k = this.f6059b.f5995b;
        StringBuilder sb = new StringBuilder(String.valueOf(k).length() + 26);
        sb.append("Container ");
        sb.append(k);
        sb.append(" loading failed.");
        C5426l3.m8134d(sb.toString());
        if (this.f6059b.f6007n != null) {
            for (C5564u2 u2Var : this.f6059b.f6007n) {
                if (u2Var.mo33554h()) {
                    try {
                        this.f6059b.f6002i.mo35447z0("app", u2Var.mo33551e(), u2Var.mo33552f(), u2Var.mo33547a());
                        String e = u2Var.mo33551e();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(e).length() + 50);
                        sb2.append("Logged event ");
                        sb2.append(e);
                        sb2.append(" to Firebase (marked as passthrough).");
                        C5426l3.m8133c(sb2.toString());
                    } catch (RemoteException e2) {
                        C5503q2.m8409b("Error logging event with measurement proxy:", e2, this.f6059b.f5994a);
                    }
                } else {
                    String e3 = u2Var.mo33551e();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(e3).length() + 45);
                    sb3.append("Discarded event ");
                    sb3.append(e3);
                    sb3.append(" (marked as non-passthrough).");
                    C5426l3.m8133c(sb3.toString());
                }
            }
            List unused2 = this.f6059b.f6007n = null;
        }
    }

    /* synthetic */ C5395j2(C5349g2 g2Var, C5365h2 h2Var) {
        this(g2Var);
    }
}
