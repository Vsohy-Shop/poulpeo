package p308ag;

import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ag.h */
/* compiled from: Channel.kt */
public final class C10899h<T> {

    /* renamed from: b */
    public static final C10901b f16818b = new C10901b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final C10902c f16819c = new C10902c();

    /* renamed from: a */
    private final Object f16820a;

    /* renamed from: ag.h$a */
    /* compiled from: Channel.kt */
    public static final class C10900a extends C10902c {

        /* renamed from: a */
        public final Throwable f16821a;

        public C10900a(Throwable th) {
            this.f16821a = th;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C10900a) || !C12775o.m28634d(this.f16821a, ((C10900a) obj).f16821a)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            Throwable th = this.f16821a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "Closed(" + this.f16821a + ')';
        }
    }

    /* renamed from: ag.h$b */
    /* compiled from: Channel.kt */
    public static final class C10901b {
        private C10901b() {
        }

        public /* synthetic */ C10901b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final <E> Object mo45918a(Throwable th) {
            return C10899h.m23422c(new C10900a(th));
        }

        /* renamed from: b */
        public final <E> Object mo45919b() {
            return C10899h.m23422c(C10899h.f16819c);
        }

        /* renamed from: c */
        public final <E> Object mo45920c(E e) {
            return C10899h.m23422c(e);
        }
    }

    /* renamed from: ag.h$c */
    /* compiled from: Channel.kt */
    public static class C10902c {
        public String toString() {
            return "Failed";
        }
    }

    private /* synthetic */ C10899h(Object obj) {
        this.f16820a = obj;
    }

    /* renamed from: b */
    public static final /* synthetic */ C10899h m23421b(Object obj) {
        return new C10899h(obj);
    }

    /* renamed from: d */
    public static boolean m23423d(Object obj, Object obj2) {
        if ((obj2 instanceof C10899h) && C12775o.m28634d(obj, ((C10899h) obj2).mo45913k())) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static final Throwable m23424e(Object obj) {
        C10900a aVar;
        if (obj instanceof C10900a) {
            aVar = (C10900a) obj;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            return aVar.f16821a;
        }
        return null;
    }

    /* renamed from: f */
    public static final T m23425f(Object obj) {
        if (!(obj instanceof C10902c)) {
            return obj;
        }
        return null;
    }

    /* renamed from: g */
    public static int m23426g(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: h */
    public static final boolean m23427h(Object obj) {
        return obj instanceof C10900a;
    }

    /* renamed from: i */
    public static final boolean m23428i(Object obj) {
        return !(obj instanceof C10902c);
    }

    /* renamed from: j */
    public static String m23429j(Object obj) {
        if (obj instanceof C10900a) {
            return ((C10900a) obj).toString();
        }
        return "Value(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m23423d(this.f16820a, obj);
    }

    public int hashCode() {
        return m23426g(this.f16820a);
    }

    /* renamed from: k */
    public final /* synthetic */ Object mo45913k() {
        return this.f16820a;
    }

    public String toString() {
        return m23429j(this.f16820a);
    }

    /* renamed from: c */
    public static <T> Object m23422c(Object obj) {
        return obj;
    }
}
