package kotlin.jvm.internal;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import p336ef.C11895c;
import p404of.C13074a;
import p404of.C13075b;
import p404of.C13076c;
import p404of.C13077d;
import p404of.C13078e;
import p404of.C13079f;
import p404of.C13080g;
import p404of.C13081h;
import p404of.C13082i;
import p404of.C13083j;
import p404of.C13084k;
import p404of.C13085l;
import p404of.C13086m;
import p404of.C13087n;
import p404of.C13088o;
import p404of.C13089p;
import p404of.C13090q;
import p404of.C13091r;
import p404of.C13092s;
import p404of.C13093t;
import p404of.C13094u;
import p404of.C13095v;
import p412pf.C13212a;
import p412pf.C13213b;
import p412pf.C13214c;
import p412pf.C13215d;
import p412pf.C13216e;
import p412pf.C13218f;

/* renamed from: kotlin.jvm.internal.l0 */
/* compiled from: TypeIntrinsics */
public class C12772l0 {
    /* renamed from: a */
    public static Collection m28609a(Object obj) {
        if ((obj instanceof C13212a) && !(obj instanceof C13213b)) {
            m28626r(obj, "kotlin.collections.MutableCollection");
        }
        return m28615g(obj);
    }

    /* renamed from: b */
    public static Iterable m28610b(Object obj) {
        if ((obj instanceof C13212a) && !(obj instanceof C13214c)) {
            m28626r(obj, "kotlin.collections.MutableIterable");
        }
        return m28616h(obj);
    }

    /* renamed from: c */
    public static List m28611c(Object obj) {
        if ((obj instanceof C13212a) && !(obj instanceof C13215d)) {
            m28626r(obj, "kotlin.collections.MutableList");
        }
        return m28617i(obj);
    }

    /* renamed from: d */
    public static Map m28612d(Object obj) {
        if ((obj instanceof C13212a) && !(obj instanceof C13216e)) {
            m28626r(obj, "kotlin.collections.MutableMap");
        }
        return m28618j(obj);
    }

    /* renamed from: e */
    public static Set m28613e(Object obj) {
        if ((obj instanceof C13212a) && !(obj instanceof C13218f)) {
            m28626r(obj, "kotlin.collections.MutableSet");
        }
        return m28619k(obj);
    }

    /* renamed from: f */
    public static Object m28614f(Object obj, int i) {
        if (obj != null && !m28621m(obj, i)) {
            m28626r(obj, "kotlin.jvm.functions.Function" + i);
        }
        return obj;
    }

    /* renamed from: g */
    public static Collection m28615g(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e) {
            throw m28625q(e);
        }
    }

    /* renamed from: h */
    public static Iterable m28616h(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e) {
            throw m28625q(e);
        }
    }

    /* renamed from: i */
    public static List m28617i(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e) {
            throw m28625q(e);
        }
    }

    /* renamed from: j */
    public static Map m28618j(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e) {
            throw m28625q(e);
        }
    }

    /* renamed from: k */
    public static Set m28619k(Object obj) {
        try {
            return (Set) obj;
        } catch (ClassCastException e) {
            throw m28625q(e);
        }
    }

    /* renamed from: l */
    public static int m28620l(Object obj) {
        if (obj instanceof C12767j) {
            return ((C12767j) obj).getArity();
        }
        if (obj instanceof C13074a) {
            return 0;
        }
        if (obj instanceof Function1) {
            return 1;
        }
        if (obj instanceof C13088o) {
            return 2;
        }
        if (obj instanceof C13089p) {
            return 3;
        }
        if (obj instanceof C13090q) {
            return 4;
        }
        if (obj instanceof C13091r) {
            return 5;
        }
        if (obj instanceof C13092s) {
            return 6;
        }
        if (obj instanceof C13093t) {
            return 7;
        }
        if (obj instanceof C13094u) {
            return 8;
        }
        if (obj instanceof C13095v) {
            return 9;
        }
        if (obj instanceof C13075b) {
            return 10;
        }
        if (obj instanceof C13076c) {
            return 11;
        }
        if (obj instanceof C13077d) {
            return 12;
        }
        if (obj instanceof C13078e) {
            return 13;
        }
        if (obj instanceof C13079f) {
            return 14;
        }
        if (obj instanceof C13080g) {
            return 15;
        }
        if (obj instanceof C13081h) {
            return 16;
        }
        if (obj instanceof C13082i) {
            return 17;
        }
        if (obj instanceof C13083j) {
            return 18;
        }
        if (obj instanceof C13084k) {
            return 19;
        }
        if (obj instanceof C13085l) {
            return 20;
        }
        if (obj instanceof C13086m) {
            return 21;
        }
        if (obj instanceof C13087n) {
            return 22;
        }
        return -1;
    }

    /* renamed from: m */
    public static boolean m28621m(Object obj, int i) {
        if (!(obj instanceof C11895c) || m28620l(obj) != i) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    public static boolean m28622n(Object obj) {
        if (!(obj instanceof Map.Entry) || ((obj instanceof C13212a) && !(obj instanceof C13216e.C13217a))) {
            return false;
        }
        return true;
    }

    /* renamed from: o */
    public static boolean m28623o(Object obj) {
        if (!(obj instanceof Set) || ((obj instanceof C13212a) && !(obj instanceof C13218f))) {
            return false;
        }
        return true;
    }

    /* renamed from: p */
    private static <T extends Throwable> T m28624p(T t) {
        return C12775o.m28646p(t, C12772l0.class.getName());
    }

    /* renamed from: q */
    public static ClassCastException m28625q(ClassCastException classCastException) {
        throw ((ClassCastException) m28624p(classCastException));
    }

    /* renamed from: r */
    public static void m28626r(Object obj, String str) {
        String str2;
        if (obj == null) {
            str2 = "null";
        } else {
            str2 = obj.getClass().getName();
        }
        m28627s(str2 + " cannot be cast to " + str);
    }

    /* renamed from: s */
    public static void m28627s(String str) {
        throw m28625q(new ClassCastException(str));
    }
}
