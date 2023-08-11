package p336ef;

import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ef.u */
/* compiled from: UShort.kt */
public final class C11919u implements Comparable<C11919u> {

    /* renamed from: c */
    public static final C11920a f18616c = new C11920a((DefaultConstructorMarker) null);

    /* renamed from: b */
    private final short f18617b;

    /* renamed from: ef.u$a */
    /* compiled from: UShort.kt */
    public static final class C11920a {
        private C11920a() {
        }

        public /* synthetic */ C11920a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private /* synthetic */ C11919u(short s) {
        this.f18617b = s;
    }

    /* renamed from: a */
    public static final /* synthetic */ C11919u m25714a(short s) {
        return new C11919u(s);
    }

    /* renamed from: c */
    public static boolean m25716c(short s, Object obj) {
        if ((obj instanceof C11919u) && s == ((C11919u) obj).mo49136f()) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static String m25718e(short s) {
        return String.valueOf(s & 65535);
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return C12775o.m28641k(mo49136f() & 65535, ((C11919u) obj).mo49136f() & 65535);
    }

    public boolean equals(Object obj) {
        return m25716c(this.f18617b, obj);
    }

    /* renamed from: f */
    public final /* synthetic */ short mo49136f() {
        return this.f18617b;
    }

    public int hashCode() {
        return m25717d(this.f18617b);
    }

    public String toString() {
        return m25718e(this.f18617b);
    }

    /* renamed from: b */
    public static short m25715b(short s) {
        return s;
    }

    /* renamed from: d */
    public static int m25717d(short s) {
        return s;
    }
}
