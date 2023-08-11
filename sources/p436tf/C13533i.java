package p436tf;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: tf.i */
/* compiled from: PrimitiveRanges.kt */
public final class C13533i extends C13530g implements C13523c<Long> {

    /* renamed from: f */
    public static final C13534a f21784f = new C13534a((DefaultConstructorMarker) null);

    /* renamed from: g */
    private static final C13533i f21785g = new C13533i(1, 0);

    /* renamed from: tf.i$a */
    /* compiled from: PrimitiveRanges.kt */
    public static final class C13534a {
        private C13534a() {
        }

        public /* synthetic */ C13534a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C13533i(long j, long j2) {
        super(j, j2, 1);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C13533i) {
            if (!isEmpty() || !((C13533i) obj).isEmpty()) {
                C13533i iVar = (C13533i) obj;
                if (!(mo53159j() == iVar.mo53159j() && mo53160k() == iVar.mo53160k())) {
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
        return (int) ((((long) 31) * (mo53159j() ^ (mo53159j() >>> 32))) + (mo53160k() ^ (mo53160k() >>> 32)));
    }

    public boolean isEmpty() {
        if (mo53159j() > mo53160k()) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public boolean mo53165r(long j) {
        if (mo53159j() > j || j > mo53160k()) {
            return false;
        }
        return true;
    }

    /* renamed from: s */
    public Long getEndInclusive() {
        return Long.valueOf(mo53160k());
    }

    /* renamed from: t */
    public Long getStart() {
        return Long.valueOf(mo53159j());
    }

    public String toString() {
        return mo53159j() + ".." + mo53160k();
    }
}
