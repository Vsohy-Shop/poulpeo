package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.f1 */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class C4901f1 {
    /* renamed from: a */
    static Object m6968a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("at index " + i);
    }

    /* renamed from: b */
    static Object[] m6969b(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            m6968a(objArr[i2], i2);
        }
        return objArr;
    }
}
