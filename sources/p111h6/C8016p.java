package p111h6;

import com.appboy.Constants;
import java.util.concurrent.TimeUnit;

/* renamed from: h6.p */
/* compiled from: Stopwatch */
public final class C8016p {

    /* renamed from: a */
    private final C8021t f11251a = C8021t.m15786b();

    /* renamed from: b */
    private boolean f11252b;

    /* renamed from: c */
    private long f11253c;

    /* renamed from: d */
    private long f11254d;

    /* renamed from: h6.p$a */
    /* compiled from: Stopwatch */
    static /* synthetic */ class C8017a {

        /* renamed from: a */
        static final /* synthetic */ int[] f11255a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                java.util.concurrent.TimeUnit[] r0 = java.util.concurrent.TimeUnit.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f11255a = r0
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f11255a     // Catch:{ NoSuchFieldError -> 0x001d }
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f11255a     // Catch:{ NoSuchFieldError -> 0x0028 }
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f11255a     // Catch:{ NoSuchFieldError -> 0x0033 }
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f11255a     // Catch:{ NoSuchFieldError -> 0x003e }
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MINUTES     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f11255a     // Catch:{ NoSuchFieldError -> 0x0049 }
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.HOURS     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f11255a     // Catch:{ NoSuchFieldError -> 0x0054 }
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.DAYS     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p111h6.C8016p.C8017a.<clinit>():void");
        }
    }

    C8016p() {
    }

    /* renamed from: a */
    private static String m15769a(TimeUnit timeUnit) {
        switch (C8017a.f11255a[timeUnit.ordinal()]) {
            case 1:
                return "ns";
            case 2:
                return "μs";
            case 3:
                return "ms";
            case 4:
                return Constants.APPBOY_PUSH_SUMMARY_TEXT_KEY;
            case 5:
                return "min";
            case 6:
                return "h";
            case 7:
                return Constants.APPBOY_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE;
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: b */
    private static TimeUnit m15770b(long j) {
        TimeUnit timeUnit = TimeUnit.DAYS;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        if (timeUnit.convert(j, timeUnit2) > 0) {
            return timeUnit;
        }
        TimeUnit timeUnit3 = TimeUnit.HOURS;
        if (timeUnit3.convert(j, timeUnit2) > 0) {
            return timeUnit3;
        }
        TimeUnit timeUnit4 = TimeUnit.MINUTES;
        if (timeUnit4.convert(j, timeUnit2) > 0) {
            return timeUnit4;
        }
        TimeUnit timeUnit5 = TimeUnit.SECONDS;
        if (timeUnit5.convert(j, timeUnit2) > 0) {
            return timeUnit5;
        }
        TimeUnit timeUnit6 = TimeUnit.MILLISECONDS;
        if (timeUnit6.convert(j, timeUnit2) > 0) {
            return timeUnit6;
        }
        TimeUnit timeUnit7 = TimeUnit.MICROSECONDS;
        if (timeUnit7.convert(j, timeUnit2) > 0) {
            return timeUnit7;
        }
        return timeUnit2;
    }

    /* renamed from: c */
    public static C8016p m15771c() {
        return new C8016p();
    }

    /* renamed from: e */
    private long m15772e() {
        if (this.f11252b) {
            return (this.f11251a.mo41852a() - this.f11254d) + this.f11253c;
        }
        return this.f11253c;
    }

    /* renamed from: d */
    public long mo41847d(TimeUnit timeUnit) {
        return timeUnit.convert(m15772e(), TimeUnit.NANOSECONDS);
    }

    /* renamed from: f */
    public C8016p mo41848f() {
        this.f11253c = 0;
        this.f11252b = false;
        return this;
    }

    /* renamed from: g */
    public C8016p mo41849g() {
        C8012n.m15762u(!this.f11252b, "This stopwatch is already running.");
        this.f11252b = true;
        this.f11254d = this.f11251a.mo41852a();
        return this;
    }

    public String toString() {
        long e = m15772e();
        TimeUnit b = m15770b(e);
        String b2 = C8009m.m15738b(((double) e) / ((double) TimeUnit.NANOSECONDS.convert(1, b)));
        String a = m15769a(b);
        StringBuilder sb = new StringBuilder(String.valueOf(b2).length() + 1 + String.valueOf(a).length());
        sb.append(b2);
        sb.append(" ");
        sb.append(a);
        return sb.toString();
    }
}
