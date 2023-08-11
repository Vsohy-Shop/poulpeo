package p458xd;

import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: xd.p */
/* compiled from: Deadline */
public final class C13819p implements Comparable<C13819p> {

    /* renamed from: e */
    private static final C13821b f22283e = new C13821b();

    /* renamed from: f */
    private static final long f22284f;

    /* renamed from: g */
    private static final long f22285g;

    /* renamed from: h */
    private static final long f22286h = TimeUnit.SECONDS.toNanos(1);

    /* renamed from: b */
    private final C13822c f22287b;

    /* renamed from: c */
    private final long f22288c;

    /* renamed from: d */
    private volatile boolean f22289d;

    /* renamed from: xd.p$b */
    /* compiled from: Deadline */
    private static class C13821b extends C13822c {
        private C13821b() {
        }

        /* renamed from: a */
        public long mo53491a() {
            return System.nanoTime();
        }
    }

    /* renamed from: xd.p$c */
    /* compiled from: Deadline */
    public static abstract class C13822c {
        /* renamed from: a */
        public abstract long mo53491a();
    }

    static {
        long nanos = TimeUnit.DAYS.toNanos(36500);
        f22284f = nanos;
        f22285g = -nanos;
    }

    private C13819p(C13822c cVar, long j, boolean z) {
        this(cVar, cVar.mo53491a(), j, z);
    }

    /* renamed from: a */
    public static C13819p m31740a(long j, TimeUnit timeUnit) {
        return m31741b(j, timeUnit, f22283e);
    }

    /* renamed from: b */
    public static C13819p m31741b(long j, TimeUnit timeUnit, C13822c cVar) {
        m31742c(timeUnit, "units");
        return new C13819p(cVar, timeUnit.toNanos(j), true);
    }

    /* renamed from: c */
    private static <T> T m31742c(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: d */
    private void m31743d(C13819p pVar) {
        if (this.f22287b != pVar.f22287b) {
            throw new AssertionError("Tickers (" + this.f22287b + " and " + pVar.f22287b + ") don't match. Custom Ticker should only be used in tests!");
        }
    }

    /* renamed from: e */
    public int compareTo(C13819p pVar) {
        m31743d(pVar);
        int i = ((this.f22288c - pVar.f22288c) > 0 ? 1 : ((this.f22288c - pVar.f22288c) == 0 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        if (i > 0) {
            return 1;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C13819p)) {
            return false;
        }
        C13819p pVar = (C13819p) obj;
        C13822c cVar = this.f22287b;
        if (cVar != null ? cVar != pVar.f22287b : pVar.f22287b != null) {
            return false;
        }
        if (this.f22288c != pVar.f22288c) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public boolean mo53485f(C13819p pVar) {
        m31743d(pVar);
        if (this.f22288c - pVar.f22288c < 0) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public boolean mo53486g() {
        if (!this.f22289d) {
            if (this.f22288c - this.f22287b.mo53491a() > 0) {
                return false;
            }
            this.f22289d = true;
        }
        return true;
    }

    /* renamed from: h */
    public C13819p mo53487h(C13819p pVar) {
        m31743d(pVar);
        if (mo53485f(pVar)) {
            return this;
        }
        return pVar;
    }

    public int hashCode() {
        return Arrays.asList(new Object[]{this.f22287b, Long.valueOf(this.f22288c)}).hashCode();
    }

    /* renamed from: i */
    public long mo53489i(TimeUnit timeUnit) {
        long a = this.f22287b.mo53491a();
        if (!this.f22289d && this.f22288c - a <= 0) {
            this.f22289d = true;
        }
        return timeUnit.convert(this.f22288c - a, TimeUnit.NANOSECONDS);
    }

    public String toString() {
        long i = mo53489i(TimeUnit.NANOSECONDS);
        long abs = Math.abs(i);
        long j = f22286h;
        long j2 = abs / j;
        long abs2 = Math.abs(i) % j;
        StringBuilder sb = new StringBuilder();
        if (i < 0) {
            sb.append('-');
        }
        sb.append(j2);
        if (abs2 > 0) {
            sb.append(String.format(Locale.US, ".%09d", new Object[]{Long.valueOf(abs2)}));
        }
        sb.append("s from now");
        if (this.f22287b != f22283e) {
            sb.append(" (ticker=" + this.f22287b + ")");
        }
        return sb.toString();
    }

    private C13819p(C13822c cVar, long j, long j2, boolean z) {
        this.f22287b = cVar;
        long min = Math.min(f22284f, Math.max(f22285g, j2));
        this.f22288c = j + min;
        this.f22289d = z && min <= 0;
    }
}
