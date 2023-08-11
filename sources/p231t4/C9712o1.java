package p231t4;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import androidx.core.p004os.EnvironmentCompat;

/* renamed from: t4.o1 */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
final class C9712o1 implements Handler.Callback {

    /* renamed from: b */
    final /* synthetic */ C9715p1 f14509b;

    /* synthetic */ C9712o1(C9715p1 p1Var, C9708n1 n1Var) {
        this.f14509b = p1Var;
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            synchronized (this.f14509b.f14515f) {
                C9701l1 l1Var = (C9701l1) message.obj;
                C9704m1 m1Var = (C9704m1) this.f14509b.f14515f.get(l1Var);
                if (m1Var != null && m1Var.mo44224i()) {
                    if (m1Var.mo44225j()) {
                        m1Var.mo44222g("GmsClientSupervisor");
                    }
                    this.f14509b.f14515f.remove(l1Var);
                }
            }
            return true;
        } else if (i != 1) {
            return false;
        } else {
            synchronized (this.f14509b.f14515f) {
                C9701l1 l1Var2 = (C9701l1) message.obj;
                C9704m1 m1Var2 = (C9704m1) this.f14509b.f14515f.get(l1Var2);
                if (m1Var2 != null && m1Var2.mo44216a() == 3) {
                    String valueOf = String.valueOf(l1Var2);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 47);
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(valueOf);
                    Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                    ComponentName b = m1Var2.mo44217b();
                    if (b == null) {
                        b = l1Var2.mo44209b();
                    }
                    if (b == null) {
                        String d = l1Var2.mo44211d();
                        C9713p.m20275j(d);
                        b = new ComponentName(d, EnvironmentCompat.MEDIA_UNKNOWN);
                    }
                    m1Var2.onServiceDisconnected(b);
                }
            }
            return true;
        }
    }
}
