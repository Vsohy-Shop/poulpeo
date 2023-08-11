package com.google.android.gms.internal.gtm;

import android.os.RemoteException;
import androidx.annotation.WorkerThread;

/* renamed from: com.google.android.gms.internal.gtm.l2 */
final class C5425l2 implements Runnable {

    /* renamed from: b */
    private final C5564u2 f6102b;

    /* renamed from: c */
    private final /* synthetic */ C5349g2 f6103c;

    public C5425l2(C5349g2 g2Var, C5564u2 u2Var) {
        this.f6103c = g2Var;
        this.f6102b = u2Var;
    }

    @WorkerThread
    public final void run() {
        String str;
        String str2;
        if (this.f6103c.f6006m == 2) {
            String valueOf = String.valueOf(this.f6102b.mo33551e());
            if (valueOf.length() != 0) {
                str2 = "Evaluating tags for event ".concat(valueOf);
            } else {
                str2 = new String("Evaluating tags for event ");
            }
            C5426l3.m8133c(str2);
            this.f6103c.f6005l.mo33578g(this.f6102b);
        } else if (this.f6103c.f6006m == 1) {
            this.f6103c.f6007n.add(this.f6102b);
            String e = this.f6102b.mo33551e();
            StringBuilder sb = new StringBuilder(String.valueOf(e).length() + 30);
            sb.append("Added event ");
            sb.append(e);
            sb.append(" to pending queue.");
            C5426l3.m8133c(sb.toString());
        } else if (this.f6103c.f6006m == 3) {
            String e2 = this.f6102b.mo33551e();
            StringBuilder sb2 = new StringBuilder(String.valueOf(e2).length() + 61);
            sb2.append("Failed to evaluate tags for event ");
            sb2.append(e2);
            sb2.append(" (container failed to load)");
            C5426l3.m8133c(sb2.toString());
            if (this.f6102b.mo33554h()) {
                try {
                    this.f6103c.f6002i.mo35447z0("app", this.f6102b.mo33551e(), this.f6102b.mo33552f(), this.f6102b.mo33547a());
                    String e3 = this.f6102b.mo33551e();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(e3).length() + 38);
                    sb3.append("Logged passthrough event ");
                    sb3.append(e3);
                    sb3.append(" to Firebase.");
                    C5426l3.m8133c(sb3.toString());
                } catch (RemoteException e4) {
                    C5503q2.m8409b("Error logging event with measurement proxy:", e4, this.f6103c.f5994a);
                }
            } else {
                String valueOf2 = String.valueOf(this.f6102b.mo33551e());
                if (valueOf2.length() != 0) {
                    str = "Discarded non-passthrough event ".concat(valueOf2);
                } else {
                    str = new String("Discarded non-passthrough event ");
                }
                C5426l3.m8133c(str);
            }
        }
    }
}
