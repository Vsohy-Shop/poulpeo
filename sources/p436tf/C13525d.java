package p436tf;

import kotlin.collections.C12703l0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p370jf.C12624c;
import p412pf.C13212a;

/* renamed from: tf.d */
/* compiled from: Progressions.kt */
public class C13525d implements Iterable<Integer>, C13212a {

    /* renamed from: e */
    public static final C13526a f21766e = new C13526a((DefaultConstructorMarker) null);

    /* renamed from: b */
    private final int f21767b;

    /* renamed from: c */
    private final int f21768c;

    /* renamed from: d */
    private final int f21769d;

    /* renamed from: tf.d$a */
    /* compiled from: Progressions.kt */
    public static final class C13526a {
        private C13526a() {
        }

        public /* synthetic */ C13526a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C13525d mo53152a(int i, int i2, int i3) {
            return new C13525d(i, i2, i3);
        }
    }

    public C13525d(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i3 != Integer.MIN_VALUE) {
            this.f21767b = i;
            this.f21768c = C12624c.m28013c(i, i2, i3);
            this.f21769d = i3;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof C13525d) {
            if (!isEmpty() || !((C13525d) obj).isEmpty()) {
                C13525d dVar = (C13525d) obj;
                if (!(this.f21767b == dVar.f21767b && this.f21768c == dVar.f21768c && this.f21769d == dVar.f21769d)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f21767b * 31) + this.f21768c) * 31) + this.f21769d;
    }

    public boolean isEmpty() {
        if (this.f21769d > 0) {
            if (this.f21767b > this.f21768c) {
                return true;
            }
        } else if (this.f21767b < this.f21768c) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final int mo53147j() {
        return this.f21767b;
    }

    /* renamed from: k */
    public final int mo53148k() {
        return this.f21768c;
    }

    /* renamed from: q */
    public final int mo53149q() {
        return this.f21769d;
    }

    /* renamed from: r */
    public C12703l0 iterator() {
        return new C13527e(this.f21767b, this.f21768c, this.f21769d);
    }

    public String toString() {
        int i;
        StringBuilder sb;
        if (this.f21769d > 0) {
            sb = new StringBuilder();
            sb.append(this.f21767b);
            sb.append("..");
            sb.append(this.f21768c);
            sb.append(" step ");
            i = this.f21769d;
        } else {
            sb = new StringBuilder();
            sb.append(this.f21767b);
            sb.append(" downTo ");
            sb.append(this.f21768c);
            sb.append(" step ");
            i = -this.f21769d;
        }
        sb.append(i);
        return sb.toString();
    }
}
