package com.google.protobuf;

/* renamed from: com.google.protobuf.d */
/* compiled from: Android */
final class C7069d {

    /* renamed from: a */
    private static boolean f9538a;

    /* renamed from: b */
    private static final Class<?> f9539b = m12820a("libcore.io.Memory");

    /* renamed from: c */
    private static final boolean f9540c;

    static {
        boolean z;
        if (f9538a || m12820a("org.robolectric.Robolectric") == null) {
            z = false;
        } else {
            z = true;
        }
        f9540c = z;
    }

    /* renamed from: a */
    private static <T> Class<T> m12820a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    static Class<?> m12821b() {
        return f9539b;
    }

    /* renamed from: c */
    static boolean m12822c() {
        if (f9538a || (f9539b != null && !f9540c)) {
            return true;
        }
        return false;
    }
}
