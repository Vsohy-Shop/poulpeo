package p471ze;

import java.io.Serializable;
import p341fe.C11961q;
import p397ne.C13016b;

/* renamed from: ze.i */
/* compiled from: NotificationLite */
public enum C14115i {
    COMPLETE;

    /* renamed from: ze.i$a */
    /* compiled from: NotificationLite */
    static final class C14116a implements Serializable {
        private static final long serialVersionUID = -8759979445933046293L;

        /* renamed from: b */
        final Throwable f23188b;

        C14116a(Throwable th) {
            this.f23188b = th;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C14116a) {
                return C13016b.m29389c(this.f23188b, ((C14116a) obj).f23188b);
            }
            return false;
        }

        public int hashCode() {
            return this.f23188b.hashCode();
        }

        public String toString() {
            return "NotificationLite.Error[" + this.f23188b + "]";
        }
    }

    /* renamed from: a */
    public static <T> boolean m32763a(Object obj, C11961q<? super T> qVar) {
        if (obj == COMPLETE) {
            qVar.mo46139b();
            return true;
        } else if (obj instanceof C14116a) {
            qVar.onError(((C14116a) obj).f23188b);
            return true;
        } else {
            qVar.mo46141d(obj);
            return false;
        }
    }

    /* renamed from: b */
    public static Object m32764b() {
        return COMPLETE;
    }

    /* renamed from: c */
    public static Object m32765c(Throwable th) {
        return new C14116a(th);
    }

    /* renamed from: d */
    public static Throwable m32766d(Object obj) {
        return ((C14116a) obj).f23188b;
    }

    /* renamed from: f */
    public static boolean m32768f(Object obj) {
        if (obj == COMPLETE) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "NotificationLite.Complete";
    }

    /* renamed from: e */
    public static <T> T m32767e(Object obj) {
        return obj;
    }

    /* renamed from: g */
    public static <T> Object m32769g(T t) {
        return t;
    }
}
