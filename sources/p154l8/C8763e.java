package p154l8;

import androidx.annotation.GuardedBy;
import com.google.firebase.installations.C6952h;
import java.util.concurrent.TimeUnit;

/* renamed from: l8.e */
/* compiled from: RequestLimiter */
class C8763e {

    /* renamed from: d */
    private static final long f12622d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e */
    private static final long f12623e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a */
    private final C6952h f12624a = C6952h.m12169c();
    @GuardedBy("this")

    /* renamed from: b */
    private long f12625b;
    @GuardedBy("this")

    /* renamed from: c */
    private int f12626c;

    C8763e() {
    }

    /* renamed from: a */
    private synchronized long m17756a(int i) {
        if (!m17757c(i)) {
            return f12622d;
        }
        return (long) Math.min(Math.pow(2.0d, (double) this.f12626c) + ((double) this.f12624a.mo39842e()), (double) f12623e);
    }

    /* renamed from: c */
    private static boolean m17757c(int i) {
        if (i == 429 || (i >= 500 && i < 600)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private static boolean m17758d(int i) {
        if ((i >= 200 && i < 300) || i == 401 || i == 404) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private synchronized void m17759e() {
        this.f12626c = 0;
    }

    /* renamed from: b */
    public synchronized boolean mo42920b() {
        boolean z;
        if (this.f12626c == 0 || this.f12624a.mo39840a() > this.f12625b) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: f */
    public synchronized void mo42921f(int i) {
        if (m17758d(i)) {
            m17759e();
            return;
        }
        this.f12626c++;
        this.f12625b = this.f12624a.mo39840a() + m17756a(i);
    }
}
