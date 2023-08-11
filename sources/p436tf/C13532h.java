package p436tf;

import java.util.NoSuchElementException;
import kotlin.collections.C12705m0;

/* renamed from: tf.h */
/* compiled from: ProgressionIterators.kt */
public final class C13532h extends C12705m0 {

    /* renamed from: b */
    private final long f21780b;

    /* renamed from: c */
    private final long f21781c;

    /* renamed from: d */
    private boolean f21782d;

    /* renamed from: e */
    private long f21783e;

    public C13532h(long j, long j2, long j3) {
        this.f21780b = j3;
        this.f21781c = j2;
        boolean z = true;
        if (j3 <= 0 ? j < j2 : j > j2) {
            z = false;
        }
        this.f21782d = z;
        this.f21783e = !z ? j2 : j;
    }

    public boolean hasNext() {
        return this.f21782d;
    }

    public long nextLong() {
        long j = this.f21783e;
        if (j != this.f21781c) {
            this.f21783e = this.f21780b + j;
        } else if (this.f21782d) {
            this.f21782d = false;
        } else {
            throw new NoSuchElementException();
        }
        return j;
    }
}
