package p446vd;

import android.util.Log;

/* renamed from: vd.n */
/* compiled from: RMNLogger */
public class C13633n {

    /* renamed from: a */
    public static boolean f21948a = true;

    /* renamed from: b */
    public static boolean f21949b = false;

    /* renamed from: a */
    public static void m31145a(Object obj, String str) {
        m31146b(obj, str, (Throwable) null);
    }

    /* renamed from: b */
    public static void m31146b(Object obj, String str, Throwable th) {
        if (f21948a) {
            String i = m31153i(obj);
            if (th == null) {
                Log.d(i, "" + str);
                return;
            }
            Log.d(i, "" + str, th);
        }
    }

    /* renamed from: c */
    public static void m31147c(Object obj, Throwable th) {
        m31146b(obj, "", th);
    }

    /* renamed from: d */
    public static void m31148d(String str) {
        m31145a(m31154j(), str);
    }

    /* renamed from: e */
    public static void m31149e(Object obj, String str) {
        m31150f(obj, str, (Throwable) null);
    }

    /* renamed from: f */
    public static void m31150f(Object obj, String str, Throwable th) {
        if (f21948a) {
            String i = m31153i(obj);
            if (th == null) {
                Log.e(i, "" + str);
                return;
            }
            Log.e(i, "" + str, th);
        }
    }

    /* renamed from: g */
    public static void m31151g(Object obj, Throwable th) {
        m31150f(obj, "", th);
    }

    /* renamed from: h */
    public static void m31152h(String str) {
        m31149e(m31154j(), str);
    }

    /* renamed from: i */
    private static String m31153i(Object obj) {
        Class<?> cls;
        if (!f21948a) {
            return "";
        }
        if (obj == null) {
            return "null";
        }
        if (obj instanceof String) {
            return obj.toString();
        }
        if (obj instanceof Class) {
            cls = (Class) obj;
        } else {
            cls = obj.getClass();
        }
        return "" + cls.getSimpleName();
    }

    /* renamed from: j */
    private static String m31154j() {
        String className;
        if (!f21948a) {
            return "";
        }
        int i = 0;
        for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
            i++;
            if (i > 2 && stackTraceElement != null && (className = stackTraceElement.getClassName()) != null && !className.equals(C13633n.class.getName())) {
                return className;
            }
        }
        return "";
    }

    /* renamed from: k */
    public static void m31155k(Object obj, String str) {
        m31156l(obj, str, (Throwable) null);
    }

    /* renamed from: l */
    public static void m31156l(Object obj, String str, Throwable th) {
        if (f21948a) {
            String i = m31153i(obj);
            if (th == null) {
                Log.i(i, "" + str);
                return;
            }
            Log.i(i, "" + str, th);
        }
    }

    /* renamed from: m */
    public static void m31157m(Object obj, Throwable th) {
        m31156l(obj, "", th);
    }

    /* renamed from: n */
    public static void m31158n(String str) {
        m31155k(m31154j(), str);
    }

    /* renamed from: o */
    public static void m31159o(Object obj, String str) {
        m31160p(obj, str, (Throwable) null);
    }

    /* renamed from: p */
    public static void m31160p(Object obj, String str, Throwable th) {
        String str2;
        if (f21948a) {
            String i = m31153i(obj);
            if (str != null) {
                int length = str.length();
                if (f21949b && length > 4000) {
                    int i2 = 0;
                    while (i2 < length) {
                        int i3 = i2 + 4000;
                        if (i3 < length) {
                            str2 = str.substring(i2, i3);
                        } else {
                            str2 = str.substring(i2, length);
                        }
                        if (th == null) {
                            Log.v(i, "" + str2);
                        } else {
                            Log.v(i, "" + str2, th);
                        }
                        i2 = i3;
                    }
                } else if (th == null) {
                    Log.v(i, "" + str);
                } else {
                    Log.v(i, "" + str, th);
                }
            } else if (th == null) {
                Log.v(i, "null");
            } else {
                Log.v(i, "null", th);
            }
        }
    }

    /* renamed from: q */
    public static void m31161q(Object obj, Throwable th) {
        m31160p(obj, "", th);
    }

    /* renamed from: r */
    public static void m31162r(String str) {
        m31159o(m31154j(), str);
    }

    /* renamed from: s */
    public static void m31163s(Object obj, String str) {
        m31164t(obj, str, (Throwable) null);
    }

    /* renamed from: t */
    public static void m31164t(Object obj, String str, Throwable th) {
        if (f21948a) {
            String i = m31153i(obj);
            if (th == null) {
                Log.w(i, "" + str);
                return;
            }
            Log.w(i, "" + str, th);
        }
    }

    /* renamed from: u */
    public static void m31165u(Object obj, Throwable th) {
        m31164t(obj, "", th);
    }

    /* renamed from: v */
    public static void m31166v(String str) {
        m31163s(m31154j(), str);
    }
}
