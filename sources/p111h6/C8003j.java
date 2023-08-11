package p111h6;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: h6.j */
/* compiled from: MoreObjects */
public final class C8003j {

    /* renamed from: h6.j$b */
    /* compiled from: MoreObjects */
    public static final class C8005b {

        /* renamed from: e */
        private static boolean f11236e;

        /* renamed from: a */
        private final String f11237a;

        /* renamed from: b */
        private final C8006a f11238b;

        /* renamed from: c */
        private C8006a f11239c;

        /* renamed from: d */
        private boolean f11240d;

        /* renamed from: h6.j$b$a */
        /* compiled from: MoreObjects */
        private static final class C8006a {

            /* renamed from: a */
            String f11241a;

            /* renamed from: b */
            Object f11242b;

            /* renamed from: c */
            C8006a f11243c;

            private C8006a() {
            }
        }

        /* renamed from: f */
        private C8006a m15724f() {
            C8006a aVar = new C8006a();
            this.f11239c.f11243c = aVar;
            this.f11239c = aVar;
            return aVar;
        }

        /* renamed from: g */
        private C8005b m15725g(Object obj) {
            m15724f().f11242b = obj;
            return this;
        }

        /* renamed from: h */
        private C8005b m15726h(String str, Object obj) {
            C8006a f = m15724f();
            f.f11242b = obj;
            f.f11241a = (String) C8012n.m15755n(str);
            return this;
        }

        /* renamed from: j */
        private static void m15727j() {
            if (!f11236e) {
                synchronized (C8005b.class) {
                    if (!f11236e) {
                        f11236e = true;
                        try {
                            C8001h.m15714c();
                        } catch (Throwable th) {
                            Logger.getLogger(C8005b.class.getName()).log(Level.WARNING, "Java 7 compatibility warning: See https://github.com/google/guava/issues/5269", new Exception("Guava will drop support for Java 7 in 2021. Please let us know if this will cause you problems: https://github.com/google/guava/issues/5269", th));
                        }
                    }
                }
            }
        }

        /* renamed from: a */
        public C8005b mo41837a(String str, double d) {
            return m15726h(str, String.valueOf(d));
        }

        /* renamed from: b */
        public C8005b mo41838b(String str, int i) {
            return m15726h(str, String.valueOf(i));
        }

        /* renamed from: c */
        public C8005b mo41839c(String str, long j) {
            return m15726h(str, String.valueOf(j));
        }

        /* renamed from: d */
        public C8005b mo41840d(String str, Object obj) {
            return m15726h(str, obj);
        }

        /* renamed from: e */
        public C8005b mo41841e(String str, boolean z) {
            return m15726h(str, String.valueOf(z));
        }

        /* renamed from: i */
        public C8005b mo41842i(Object obj) {
            return m15725g(obj);
        }

        /* renamed from: k */
        public C8005b mo41843k() {
            this.f11240d = true;
            return this;
        }

        public String toString() {
            boolean z = this.f11240d;
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.f11237a);
            sb.append('{');
            String str = "";
            for (C8006a aVar = this.f11238b.f11243c; aVar != null; aVar = aVar.f11243c) {
                Object obj = aVar.f11242b;
                if (!z || obj != null) {
                    sb.append(str);
                    String str2 = aVar.f11241a;
                    if (str2 != null) {
                        sb.append(str2);
                        sb.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String deepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append(deepToString, 1, deepToString.length() - 1);
                    }
                    str = ", ";
                }
            }
            sb.append('}');
            return sb.toString();
        }

        private C8005b(String str) {
            C8006a aVar = new C8006a();
            this.f11238b = aVar;
            this.f11239c = aVar;
            this.f11240d = false;
            m15727j();
            this.f11237a = (String) C8012n.m15755n(str);
        }
    }

    /* renamed from: a */
    public static <T> T m15721a(T t, T t2) {
        if (t != null) {
            return t;
        }
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException("Both parameters are null");
    }

    /* renamed from: b */
    public static C8005b m15722b(Class<?> cls) {
        return new C8005b(cls.getSimpleName());
    }

    /* renamed from: c */
    public static C8005b m15723c(Object obj) {
        return new C8005b(obj.getClass().getSimpleName());
    }
}
