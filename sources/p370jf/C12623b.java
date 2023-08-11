package p370jf;

import kotlin.jvm.internal.C12775o;
import p377kf.C12658a;
import p385lf.C12857a;

/* renamed from: jf.b */
/* compiled from: PlatformImplementations.kt */
public final class C12623b {

    /* renamed from: a */
    public static final C12621a f20272a;

    static {
        C12621a aVar;
        C12658a newInstance;
        C12857a newInstance2;
        int a = m28010a();
        Class<C12621a> cls = C12621a.class;
        if (a >= 65544 || a < 65536) {
            try {
                newInstance2 = C12857a.class.newInstance();
                C12775o.m28638h(newInstance2, "forName(\"kotlin.internal…entations\").newInstance()");
                if (newInstance2 != null) {
                    aVar = newInstance2;
                    f20272a = aVar;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
            } catch (ClassCastException e) {
                ClassLoader classLoader = newInstance2.getClass().getClassLoader();
                ClassLoader classLoader2 = cls.getClassLoader();
                if (!C12775o.m28634d(classLoader, classLoader2)) {
                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader + ", base type classloader: " + classLoader2, e);
                }
                throw e;
            } catch (ClassNotFoundException unused) {
                try {
                    Object newInstance3 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
                    C12775o.m28638h(newInstance3, "forName(\"kotlin.internal…entations\").newInstance()");
                    if (newInstance3 != null) {
                        try {
                            aVar = (C12621a) newInstance3;
                        } catch (ClassCastException e2) {
                            ClassLoader classLoader3 = newInstance3.getClass().getClassLoader();
                            ClassLoader classLoader4 = cls.getClassLoader();
                            if (!C12775o.m28634d(classLoader3, classLoader4)) {
                                throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader3 + ", base type classloader: " + classLoader4, e2);
                            }
                            throw e2;
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                    }
                } catch (ClassNotFoundException unused2) {
                }
            }
        }
        if (a >= 65543 || a < 65536) {
            try {
                newInstance = C12658a.class.newInstance();
                C12775o.m28638h(newInstance, "forName(\"kotlin.internal…entations\").newInstance()");
                if (newInstance != null) {
                    aVar = newInstance;
                    f20272a = aVar;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
            } catch (ClassCastException e3) {
                ClassLoader classLoader5 = newInstance.getClass().getClassLoader();
                ClassLoader classLoader6 = cls.getClassLoader();
                if (!C12775o.m28634d(classLoader5, classLoader6)) {
                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader5 + ", base type classloader: " + classLoader6, e3);
                }
                throw e3;
            } catch (ClassNotFoundException unused3) {
                try {
                    Object newInstance4 = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                    C12775o.m28638h(newInstance4, "forName(\"kotlin.internal…entations\").newInstance()");
                    if (newInstance4 != null) {
                        try {
                            aVar = (C12621a) newInstance4;
                        } catch (ClassCastException e4) {
                            ClassLoader classLoader7 = newInstance4.getClass().getClassLoader();
                            ClassLoader classLoader8 = cls.getClassLoader();
                            if (!C12775o.m28634d(classLoader7, classLoader8)) {
                                throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader7 + ", base type classloader: " + classLoader8, e4);
                            }
                            throw e4;
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                    }
                } catch (ClassNotFoundException unused4) {
                }
            }
        }
        aVar = new C12621a();
        f20272a = aVar;
    }

    /* renamed from: a */
    private static final int m28010a() {
        String property = System.getProperty("java.specification.version");
        if (property == null) {
            return 65542;
        }
        int V = C13755w.m31570V(property, '.', 0, false, 6, (Object) null);
        if (V < 0) {
            try {
                return Integer.parseInt(property) * 65536;
            } catch (NumberFormatException unused) {
                return 65542;
            }
        } else {
            int i = V + 1;
            int V2 = C13755w.m31570V(property, '.', i, false, 4, (Object) null);
            if (V2 < 0) {
                V2 = property.length();
            }
            String substring = property.substring(0, V);
            C12775o.m28638h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            String substring2 = property.substring(i, V2);
            C12775o.m28638h(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
            try {
                return (Integer.parseInt(substring) * 65536) + Integer.parseInt(substring2);
            } catch (NumberFormatException unused2) {
                return 65542;
            }
        }
    }
}
