package p336ef;

import java.io.Serializable;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ef.m */
/* compiled from: Result.kt */
public final class C11907m<T> implements Serializable {

    /* renamed from: b */
    public static final C11908a f18600b = new C11908a((DefaultConstructorMarker) null);

    /* renamed from: ef.m$a */
    /* compiled from: Result.kt */
    public static final class C11908a {
        private C11908a() {
        }

        public /* synthetic */ C11908a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ef.m$b */
    /* compiled from: Result.kt */
    public static final class C11909b implements Serializable {

        /* renamed from: b */
        public final Throwable f18601b;

        public C11909b(Throwable th) {
            C12775o.m28639i(th, "exception");
            this.f18601b = th;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C11909b) || !C12775o.m28634d(this.f18601b, ((C11909b) obj).f18601b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f18601b.hashCode();
        }

        public String toString() {
            return "Failure(" + this.f18601b + ')';
        }
    }

    /* renamed from: b */
    public static final Throwable m25697b(Object obj) {
        if (obj instanceof C11909b) {
            return ((C11909b) obj).f18601b;
        }
        return null;
    }

    /* renamed from: c */
    public static final boolean m25698c(Object obj) {
        return obj instanceof C11909b;
    }

    /* renamed from: d */
    public static final boolean m25699d(Object obj) {
        return !(obj instanceof C11909b);
    }

    /* renamed from: a */
    public static <T> Object m25696a(Object obj) {
        return obj;
    }
}
