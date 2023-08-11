package p436tf;

import kotlin.collections.C12705m0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p370jf.C12624c;
import p412pf.C13212a;

/* renamed from: tf.g */
/* compiled from: Progressions.kt */
public class C13530g implements Iterable<Long>, C13212a {

    /* renamed from: e */
    public static final C13531a f21776e = new C13531a((DefaultConstructorMarker) null);

    /* renamed from: b */
    private final long f21777b;

    /* renamed from: c */
    private final long f21778c;

    /* renamed from: d */
    private final long f21779d;

    /* renamed from: tf.g$a */
    /* compiled from: Progressions.kt */
    public static final class C13531a {
        private C13531a() {
        }

        public /* synthetic */ C13531a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C13530g(long j, long j2, long j3) {
        if (j3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (j3 != Long.MIN_VALUE) {
            this.f21777b = j;
            this.f21778c = C12624c.m28014d(j, j2, j3);
            this.f21779d = j3;
        } else {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
    }

    /* renamed from: j */
    public final long mo53159j() {
        return this.f21777b;
    }

    /* renamed from: k */
    public final long mo53160k() {
        return this.f21778c;
    }

    /* renamed from: q */
    public C12705m0 iterator() {
        return new C13532h(this.f21777b, this.f21778c, this.f21779d);
    }
}
