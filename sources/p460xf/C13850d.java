package p460xf;

import java.util.concurrent.TimeUnit;

/* renamed from: xf.d */
/* compiled from: DurationUnitJvm.kt */
public enum C13850d {
    NANOSECONDS(TimeUnit.NANOSECONDS),
    MICROSECONDS(TimeUnit.MICROSECONDS),
    MILLISECONDS(TimeUnit.MILLISECONDS),
    SECONDS(TimeUnit.SECONDS),
    MINUTES(TimeUnit.MINUTES),
    HOURS(TimeUnit.HOURS),
    DAYS(TimeUnit.DAYS);
    

    /* renamed from: b */
    private final TimeUnit f22369b;

    private C13850d(TimeUnit timeUnit) {
        this.f22369b = timeUnit;
    }

    /* renamed from: b */
    public final TimeUnit mo53533b() {
        return this.f22369b;
    }
}
