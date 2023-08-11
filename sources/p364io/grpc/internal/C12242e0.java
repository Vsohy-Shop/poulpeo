package p364io.grpc.internal;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import p111h6.C8012n;
import p364io.grpc.internal.C12338k;

/* renamed from: io.grpc.internal.e0 */
/* compiled from: ExponentialBackoffPolicy */
public final class C12242e0 implements C12338k {

    /* renamed from: a */
    private Random f19280a = new Random();

    /* renamed from: b */
    private long f19281b = TimeUnit.SECONDS.toNanos(1);

    /* renamed from: c */
    private long f19282c = TimeUnit.MINUTES.toNanos(2);

    /* renamed from: d */
    private double f19283d = 1.6d;

    /* renamed from: e */
    private double f19284e = 0.2d;

    /* renamed from: f */
    private long f19285f = this.f19281b;

    /* renamed from: io.grpc.internal.e0$a */
    /* compiled from: ExponentialBackoffPolicy */
    public static final class C12243a implements C12338k.C12339a {
        public C12338k get() {
            return new C12242e0();
        }
    }

    /* renamed from: b */
    private long m26796b(double d, double d2) {
        boolean z;
        if (d2 >= d) {
            z = true;
        } else {
            z = false;
        }
        C8012n.m15745d(z);
        return (long) ((this.f19280a.nextDouble() * (d2 - d)) + d);
    }

    /* renamed from: a */
    public long mo49802a() {
        long j = this.f19285f;
        double d = (double) j;
        this.f19285f = Math.min((long) (this.f19283d * d), this.f19282c);
        double d2 = this.f19284e;
        return j + m26796b((-d2) * d, d2 * d);
    }
}
