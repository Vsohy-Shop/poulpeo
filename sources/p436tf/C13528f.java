package p436tf;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: tf.f */
/* compiled from: PrimitiveRanges.kt */
public final class C13528f extends C13525d implements C13523c<Integer> {

    /* renamed from: f */
    public static final C13529a f21774f = new C13529a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C13528f f21775g = new C13528f(1, 0);

    /* renamed from: tf.f$a */
    /* compiled from: PrimitiveRanges.kt */
    public static final class C13529a {
        private C13529a() {
        }

        public /* synthetic */ C13529a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C13528f mo53157a() {
            return C13528f.f21775g;
        }
    }

    public C13528f(int i, int i2) {
        super(i, i2, 1);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C13528f) {
            if (!isEmpty() || !((C13528f) obj).isEmpty()) {
                C13528f fVar = (C13528f) obj;
                if (!(mo53147j() == fVar.mo53147j() && mo53148k() == fVar.mo53148k())) {
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
        return (mo53147j() * 31) + mo53148k();
    }

    public boolean isEmpty() {
        if (mo53147j() > mo53148k()) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public boolean mo53154t(int i) {
        if (mo53147j() > i || i > mo53148k()) {
            return false;
        }
        return true;
    }

    public String toString() {
        return mo53147j() + ".." + mo53148k();
    }

    /* renamed from: u */
    public Integer getEndInclusive() {
        return Integer.valueOf(mo53148k());
    }

    /* renamed from: v */
    public Integer getStart() {
        return Integer.valueOf(mo53147j());
    }
}
